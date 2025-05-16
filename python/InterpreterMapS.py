import nbimporter
from antlr4 import *
from MapSLexer import MapSLexer
from MapSParser import MapSParser
from MapSVisitor import MapSVisitor
from InterpreterContainers import *
from InterpreterMemory import *
from World import *
from ErrorListenerMapS import ErrorListenerMapS
import sys

class MapInterpreter(MapSVisitor):    
    def __init__(self, errorListener_: ErrorListenerMapS):
        self.memory = InterpreterMemory(errorListener_)
        self.errorListener = errorListener_      
        

    #region Zdefiniowane
    def visitListVariableDeclaration(self, ctx:MapSParser.ListVariableDeclarationContext):
        #print("visitListVariableDeclaration")
        identifier = ctx.IDENTIFIER().getText()
        idType = self.visit(ctx.type_())
        elements = self.visit(ctx.listExpression())        
        result = InterpreterList(idType, elements)
        self.memory.storeId(ctx, identifier, result, idType)
        return result

    def visitType(self, ctx:MapSParser.TypeContext):
        #print("visitType")         
        if ctx.getChildCount() == 3 and ctx.getChild(0).getText() == 'List<':
            inner_type = self.visit(ctx.getChild(1))
            return (list, inner_type)
        else:            
            type_name = ctx.getChild(0).getText()
            match type_name:
                case 'int':
                    return int
                case 'double':
                    return float
                case 'bool':
                    return bool
                case 'string':
                    return str
                case 'Point':
                    return InterpreterPoint
                case 'Height':
                    return InterpreterHeight
                case _:
                    return None        
                
    def visitListExpression(self, ctx:MapSParser.ListExpressionContext):
        #print("visitListExpression")
        result = []
        identifier = ctx.IDENTIFIER()
        if identifier is None:
            ctxList = ctx.listElementExpression()
            for ctxElement in ctxList:
                element = self.visit(ctxElement)
                result.append(element)
            return result
        else:
            return self.memory.accessId(ctx, identifier.getText())

    def visitDoubleExpr(self, ctx:MapSParser.DoubleExprContext):
        #print("visitDoubleExpr")
        return float(ctx.DOUBLE().getText())
        return self.visitChildren(ctx)
    
    def visitHeightDeclaration(self, ctx:MapSParser.HeightDeclarationContext):
        #print("visitHeightDeclaration")
        funcCall = ctx.functionCall()
        listExpression = ctx.listExpression()
        if funcCall is not None:
            print(f"[NOT IMPLEMENTED] visitHeightDeclaration -> functionCall")
            return None
        elif listExpression is not None:
            return self.visit(listExpression)
        return None
    
    def visitLandVariableDeclaration(self, ctx:MapSParser.LandVariableDeclarationContext):
        #print("visitLandVariableDeclaration")
        identifier = ctx.IDENTIFIER().getText()

        land = None
        displacement = None
        perimeter = None
        height = None
        perimeterFunc = None
        heightFunc = None

        pointExpression = ctx.pointExpression()
        if pointExpression is not None:
            displacement = self.visit(pointExpression)            
        expression = ctx.expression()        
        if expression is None:
            p = self.visit(ctx.perimeterDeclaration())
            h = self.visit(ctx.heightDeclaration())   
            if (type(p)==InterpreterList and p.innerType==InterpreterPoint):
                perimeter = p.get()
            else:
                perimeterFunc = p
            if(type(h)==InterpreterList and h.innerType==InterpreterHeight):
                height = h.get()
            else:
                heightFunc = h
            land = InterpreterLand(displacement, perimeter, height, perimeterFunc, heightFunc)
        else:
            if type(expression) == InterpreterLand: #expression = self.visit(expression) raczej
                land = expression        
        self.memory.storeId(ctx, identifier, land, InterpreterLand)
        self.memory.world().addLand(land)
        return land
    

    def visitShape(self, ctx:MapSParser.ShapeContext):
        #print("visitShape")
        listExpression = ctx.listExpression()
        if listExpression is None:            
            funcArg = self.visit(ctx.expression())
            funcName = ctx.getChild(0).getText()
            if "Circle" in funcName:
                print(f"[NOT IMPLEMENTED] visitShape -> Circle")
                return None
            elif "Square" in funcName:
                print(f"[NOT IMPLEMENTED] visitShape -> Square")
                return None
            elif "RandomLand" in funcName:
                print(f"[NOT IMPLEMENTED] visitShape -> RandomLand")
                return None            
            else:
                return None
        else:            
            return self.visit(listExpression)
        
    def visitHeightExpression(self, ctx:MapSParser.HeightExpressionContext):
        #print("visitHeightExpression")
        result = None
        point = self.visit(ctx.pointExpression())
        z = None
        steep = None
        ctxList = ctx.expression()            
        if len(ctxList)==2:
            z = self.visit(ctxList[0])
            steep = self.visit(ctxList[1])
        return InterpreterHeight(point, z, steep)

    
    def visitPointExpression(self, ctx:MapSParser.PointExpressionContext):
        #print("visitPointExpression")
        result = None
        identifier = ctx.IDENTIFIER()
        if identifier is None:            
            ctxList = ctx.expression()            
            x = self.visit(ctxList[0])
            y = self.visit(ctxList[1])
            if (type(x) is float or type(x) is int) and (type(y) is float or type(y) is int):
                result = InterpreterPoint(float(x),float(y))
            return result
        else:
            return self.memory.accessId(ctx, identifier.getText(), InterpreterPoint)
        return self.visitChildren(ctx)
    
    def visitAndExpr(self, ctx:MapSParser.AndExprContext):
        #print("visitAndExpr")
        left = self.visit(ctx.expression(0))
        if not isinstance(left, bool):
            self.errorListener.interpreterError(f"Invalid operand for 'and': {left} (expected boolean)", ctx)
        if isinstance(left, bool) and not left:
            return False
        right = self.visit(ctx.expression(1))
        if not isinstance(right, bool):
            self.errorListener.interpreterError(f"Invalid operand for 'and': {right} (expected boolean)", ctx)
        return left and right

    def visitOrExpr(self, ctx:MapSParser.OrExprContext):
        #print("visitOrExpr")
        left = self.visit(ctx.expression(0))
        if not isinstance(left, bool):
            self.errorListener.interpreterError(f"Invalid operand for 'or': {left} (expected boolean)", ctx)
        if isinstance(left, bool) and left:
            return True
        right = self.visit(ctx.expression(1))
        if not isinstance(right, bool):
            self.errorListener.interpreterError(f"Invalid operand for 'or': {left} (expected boolean)", ctx)
        return left or right

    def visitNotExpr(self, ctx:MapSParser.NotExprContext):
        operand = self.visit(ctx.expression())
        if not isinstance(operand, bool):
            self.errorListener.interpreterError(f"Invalid operand for 'not': {operand} (expected boolean)", ctx)
        return not operand
    
    def visitPrimitiveVariableDeclaration(self, ctx:MapSParser.PrimitiveVariableDeclarationContext):
        #print("visitPrimitiveVariableDeclaration")
        type_name = ctx.getChild(0).getText()
        match type_name:
            case 'int':
                type_name = int
            case 'double':
                type_name = float
            case 'bool':
                type_name = bool
            case 'string':
                type_name = str            
        identifier = ctx.IDENTIFIER().getText()
        exp = type_name(self.visit(ctx.expression()))
        self.memory.storeId(ctx, identifier, exp, type_name)
        return identifier
    
    def visitIntExpr(self, ctx:MapSParser.IntExprContext):
        #print("visitIntExpr")
        return int(ctx.INT().getText())       
    
    def visitStringExpr(self, ctx:MapSParser.StringExprContext):
        #print("visitStringExpr")
        value = ctx.STRING().getText()
        return str(value[1:-1])  
    
    def visitBoolExpr(self, ctx:MapSParser.BoolExprContext):
        #print("visitBoolExpr")
        value = ctx.BOOLEAN().getText()
        if value == 'true':
            return True
        elif value == 'false':
            return False
        return bool(ctx.BOOLEAN().getText())  
    
    def visitVarExpr(self, ctx:MapSParser.VarExprContext):
        #print("visitVarExpr")
        identifier = ctx.IDENTIFIER().getText()
        return self.memory.accessId(ctx, identifier)      

    def visitAssignment(self, ctx:MapSParser.AssignmentContext):
        #print("visitAssignment")
        if ctx.variableAssignment() is not None:
            self.visit(ctx.variableAssignment())
        elif ctx.pointFieldAssignment() is not None:
            self.visit(ctx.pointFieldAssignment())
        else:
            self.visit(ctx.listAssignment())                    
    
    def visitVariableAssignment(self, ctx:MapSParser.VariableAssignmentContext):
        #print("visitVariableAssignment")
        identifier = ctx.IDENTIFIER().getText()
        self.memory.assignValue(ctx, identifier, self.visit(ctx.expression()))
        return identifier  
    
     
    #endregion

    #region Pomijalne 
    def visitProgram(self, ctx:MapSParser.ProgramContext):
        #print("visitProgram")                
        return self.visitChildren(ctx)

    def visitStatement(self, ctx:MapSParser.StatementContext):
        #print("visitStatement")
        return self.visitChildren(ctx)

    def visitVariableDeclaration(self, ctx:MapSParser.VariableDeclarationContext):
        #print("visitVariableDeclaration")
        return self.visitChildren(ctx)                                                                    

    def visitListElementExpression(self, ctx:MapSParser.ListElementExpressionContext):
        #print("visitListElementExpression")
        return self.visitChildren(ctx)
    
    def visitPointVariableDeclaration(self, ctx:MapSParser.PointVariableDeclarationContext):
        #print("visitPointVariableDeclaration")
        return self.visitChildren(ctx)                    
            
    def visitPerimeterDeclaration(self, ctx:MapSParser.PerimeterDeclarationContext):
        #print("visitPerimeterDeclaration")
        return self.visitChildren(ctx)                
    #endregion Pomijalne 
    
    #------------------------------------
    #------Powyżej 1 Etap (03.04.25)-----
    #------------------------------------
    
    #region Niezdefiniowane
    def visitReturnStatement(self, ctx:MapSParser.ReturnStatementContext):
        print("visitReturnStatement")
        return self.visitChildren(ctx)  
       
          

    def visitHeightVariableDeclaration(self, ctx:MapSParser.HeightVariableDeclarationContext):
        print("visitHeightVariableDeclaration")
        return self.visitChildren(ctx)

    def visitLakeVariableDeclaration(self, ctx:MapSParser.LakeVariableDeclarationContext):
        print("visitLakeVariableDeclaration")
        return self.visitChildren(ctx)

    def visitRiverVariableDeclaration(self, ctx:MapSParser.RiverVariableDeclarationContext):
        print("visitRiverVariableDeclaration")
        return self.visitChildren(ctx)

    def visitFunctionDeclaration(self, ctx:MapSParser.FunctionDeclarationContext):
        print("visitFunctionDeclaration")
        return self.visitChildren(ctx)

    def visitParameters(self, ctx:MapSParser.ParametersContext):
        print("visitParameters")
        return self.visitChildren(ctx)

    def visitIfStatement(self, ctx:MapSParser.IfStatementContext):
        print("visitIfStatement")
        condition_value = self.visit(ctx.expression(0))
        if condition_value:
            for stmt_ctx in ctx.statement():
                result = self.visit(stmt_ctx)
                return result
        return None

    def visitRepeatFixedLoop(self, ctx:MapSParser.RepeatFixedLoopContext):
        print("visitRepeatFixedLoop")
        return self.visitChildren(ctx)

    def visitRepeatRangeLoop(self, ctx:MapSParser.RepeatRangeLoopContext):
        print("visitRepeatRangeLoop")
        return self.visitChildren(ctx)

    def visitWhileLoop(self, ctx:MapSParser.WhileLoopContext):
        print("visitWhileLoop")
        return self.visitChildren(ctx)

    def visitListAccessExpr(self, ctx:MapSParser.ListAccessExprContext):
        print("visitListAccessExpr")
        return self.visitChildren(ctx)    
    
    def visitAddSubExpr(self, ctx:MapSParser.AddSubExprContext):
        #print("visitAddSubExpr")
        left = self.visit(ctx.expression(0))
        right = self.visit(ctx.expression(1))

        if not ((sameType(left, 1) and sameType(right, 1)) or (sameType(left, 1.0) and sameType(right, 1.0))):
            self.errorListener.interpreterError(f"Cannot add/subtract types {type(left).__name__} and {type(right).__name__}", ctx)

        if ctx.getChild(1).getText() == '+':
            return left + right
        else:
            return left - right
    
    def visitUnaryMinusExpr(self, ctx:MapSParser.UnaryMinusExprContext):
        #print("visitUnaryMinusExpr")
        value = self.visit(ctx.expression())
        if not (sameType(value, 1) or sameType(value, 1.0)):
            self.errorListener.interpreterError(f"Cannot negate non-number type: {type(value).__name__}",ctx)
        return -value
    
    def visitMulDivExpr(self, ctx:MapSParser.MulDivExprContext):
        #print("visitMulDivExpr")
        left = self.visit(ctx.expression(0))
        right = self.visit(ctx.expression(1))

        if not ((sameType(left, 1) and sameType(right, 1)) or (sameType(left, 1.0) and sameType(right, 1.0))):
            self.errorListener.interpreterError(f"Cannot multiply/divide types: {type(left).__name__} and {type(right).__name__}", ctx)

        if ctx.getChild(1).getText() == '*':
            return left * right
        else:
            if right == 0:
                self.errorListener.interpreterError("Division by zero", ctx)
            else:
                if sameType(left, 1):
                    return int(left / right)
                return left / right
        return 0
            
    
    def visitSqrtExpr(self, ctx:MapSParser.SqrtExprContext):
        print("visitSqrtExpr")
        return self.visitChildren(ctx)

    def visitFuncCallExpr(self, ctx:MapSParser.FuncCallExprContext):
        print("visitFuncCallExpr")
        return self.visitChildren(ctx)

    def visitParenExpr(self, ctx:MapSParser.ParenExprContext):
        #print("visitParenExpr")
        return self.visit(ctx.expression())
    
    def visitPowExpr(self, ctx:MapSParser.PowExprContext):
        print("visitPowExpr")
        return self.visitChildren(ctx)

    def visitPointAccessExpr(self, ctx:MapSParser.PointAccessExprContext):
        print("visitPointAccessExpr")
        return self.visitChildren(ctx)

    def visitCompareExpr(self, ctx:MapSParser.CompareExprContext):
        #print("visitCompareExpr")
        left = self.visit(ctx.expression(0))
        right = self.visit(ctx.expression(1))

        if not sameType(left, right):
            self.errorListener.interpreterError(f"Cannot compare different types: {type(left).__name__}, {type(right).__name__}", ctx)

        comp = ctx.getChild(1).getText()
        if comp == '=' or comp == '!=':
            if not (sameType(left, True) or sameType(left, 1) or sameType(left, 1.0)):
                self.errorListener.interpreterError(f"Cannot compare {type(left).__name__} and {type(right).__name__}", ctx)
            if comp == '=':
                return left == right
            else:
                return left != right
        else:
            if not (sameType(left, 1) or sameType(left, 1.0)):
                self.errorListener.interpreterError(f"Cannot compare {type(left).__name__} and {type(right).__name__}", ctx)
            if comp == '>':
                return left > right
            elif comp == '<':
                return left < right
            elif comp == '>=':
                return left >= right
            elif comp == '<=':
                return left <= right
            
        

    def visitFunctionCall(self, ctx:MapSParser.FunctionCallContext):
        print("visitFunctionCall")
        return self.visitChildren(ctx)

    def visitPointAccess(self, ctx:MapSParser.PointAccessContext):
        print("visitPointAccess")
        return self.visitChildren(ctx)

    def visitListAccess(self, ctx:MapSParser.ListAccessContext):
        print("visitListAccess")
        return self.visitChildren(ctx)  

    def visitPointFieldAssignment(self, ctx:MapSParser.PointFieldAssignmentContext):
        print("visitPointFieldAssignment")
        return self.visitChildren(ctx)

    def visitListAdd(self, ctx:MapSParser.ListAddContext):
        print("visitListAdd")
        return self.visitChildren(ctx)

    def visitListUpdate(self, ctx:MapSParser.ListUpdateContext):
        print("visitListUpdate")
        return self.visitChildren(ctx)
    
    def visitPrintStatement(self, ctx:MapSParser.PrintStatementContext):
        if len(self.errorListener.interpreter_errors) > 0:
            return
        
        value = self.visit(ctx.expression())
        if sameType(value, True):
            print("true" if value else "false")
        else:
            print(value)
    
def sameType(value, other):
    if type(value) != type(other):
        return False        
    return True
    
    #endregion Niezdefiniowane

#region Main
def main():
    #filename = sys.argv[1]
    #input_stream = FileStream(filename)
    #input_stream = FileStream("input2.map")
    input_stream = FileStream("input.map")
    lexer = MapSLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = MapSParser(stream)

    error_listener = ErrorListenerMapS()
    lexer.removeErrorListeners()
    parser.removeErrorListeners()
    lexer.addErrorListener(error_listener)
    parser.addErrorListener(error_listener)

    tree = parser.program()  # Adjust according to your grammar's start rule

    if error_listener.syntax_errors:
        for err in error_listener.syntax_errors:
            print(f"{err}")
    else:
        interpreter = MapInterpreter(error_listener)
        interpreter.visit(tree)    
        if error_listener.interpreter_errors:
            for err in error_listener.interpreter_errors:
                print(f"{err}")
        else:
            draw_image_from_InterpreterWorld(interpreter.memory.world())


if __name__ == "__main__":
    main()
#endregion Main