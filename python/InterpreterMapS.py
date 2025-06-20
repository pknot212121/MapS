#import nbimporter
from antlr4 import *
from MapSLexer import MapSLexer
from MapSParser import MapSParser
from MapSVisitor import MapSVisitor
from InterpreterContainers import *
from InterpreterMemory import *
from World import *
from ErrorListenerMapS import ErrorListenerMapS
import sys
import math

class MapInterpreter(MapSVisitor):    
    def __init__(self, errorListener_: ErrorListenerMapS):
        self.memory = InterpreterMemory(errorListener_)
        self.errorListener = errorListener_  
        self.in_function = 0 
        

    #region Zdefiniowane
    def visitListVariableDeclaration(self, ctx:MapSParser.ListVariableDeclarationContext):
        #print("visitListVariableDeclaration")
        identifier = ctx.IDENTIFIER().getText()
        idType = self.visit(ctx.type_())
        elements = self.visit(ctx.listExpression())
        if type(idType) is tuple:
            self.errorListener.interpreterError(f"Can't create a list of lists", ctx) # trzeba zmienić gramatyke
            return
        for element in elements:
            if type(element) is not idType:
                self.errorListener.interpreterError(f"Can't add {type(element).__name__} to list of {idType.__name__}", ctx)
                return
        result = InterpreterList(idType, elements)
        self.memory.storeId(ctx, identifier, result, InterpreterList)
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

    
    
    def visitHeightDeclaration(self, ctx:MapSParser.HeightDeclarationContext):
        #print("visitHeightDeclaration")
        funcCall = ctx.functionCall()
        listExpression = ctx.listExpression()
        if funcCall is not None:
            #print(f"visitHeightDeclaration -> functionCall")
            name = funcCall.IDENTIFIER().getText()
            if name not in self.memory.functions:
                self.errorListener.interpreterError(f"Function '{name}' not defined", funcCall)
                return
            func = self.memory.functions.get(name)
            if func.return_type not in (int, float):
                self.errorListener.interpreterError(f"Height function '{name}' must return int or double.", funcCall)
                return

            params = func.params
            if len(params) == 2 and params[0][0] in (int, float) and params[1][0] in (int, float):
                return self.make_height_function(ctx, name, False)
            elif len(params) == 1 and params[0][0] is InterpreterPoint:
                return self.make_height_function(ctx, name, True)
            else:
                self.errorListener.interpreterError(f"Height function '{name}' must take two numeric parameters or a Point.", funcCall)
            
        elif listExpression is not None:
            listHeight = self.visit(listExpression)
            if type(listHeight) is not InterpreterList or listHeight.innerType is not InterpreterHeight:
                self.errorListener.interpreterError(f"Land height has to be a list of Height", ctx)
                return
            return listHeight
        return None
    

    def make_height_function(self, ctx, function_name: str, argPoint: bool):
        def height_func(x, y):
            return self.callFunctionByName(ctx, function_name, [x, y])
        def height_func_point(x, y):
            return self.callFunctionByName(ctx, function_name, [InterpreterPoint(float(x),float(y))])
        if argPoint:
            return height_func_point
        return height_func

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
            expressions = ctx.expression()            
            funcArg = self.visit(expressions[0])
            if type(funcArg) is not int:
                self.errorListener.interpreterError("Perimeter function argument has to be int", ctx)
            funcName = ctx.getChild(0).getText()
            if "Circle" in funcName:
                circle = InterpreterCircle(funcArg)
                per = Perimeter.from_intcircle(circle)
                intpoints = per.to_intpoints()
                intlist = InterpreterList(InterpreterPoint,intpoints)
                return intlist
            elif "Square" in funcName:
                funcArg2 = self.visit(expressions[1])
                if type(funcArg2) is not int:
                    self.errorListener.interpreterError("Perimeter function argument has to be int", ctx)
                square = InterpreterSquare(funcArg,funcArg2)
                per = Perimeter.from_intsquare(square)
                intpoints = per.to_intpoints()
                intlist = InterpreterList(InterpreterPoint,intpoints)
                return intlist
            elif "RandomLand" in funcName:
                funcArg2 = self.visit(expressions[1])
                if(len(expressions)>2):
                    funcArg3 = self.visit(expressions[2])
                else: funcArg3 = None
                if type(funcArg2) not in (int, float):
                    self.errorListener.interpreterError("Second RandomLand argument has to be int or double", ctx)
                per = Perimeter.from_random_land(funcArg,funcArg2,funcArg3)
                intpoints = per.to_intpoints()
                intlist = InterpreterList(InterpreterPoint,intpoints)         
                return intlist
            else:
                return None
        else:      
            listPerimeter = self.visit(listExpression)
            if type(listPerimeter) is not InterpreterList or listPerimeter.innerType is not InterpreterPoint:
                self.errorListener.interpreterError(f"Land perimeter has to be a list of Point", ctx)
                return
            return listPerimeter      
        
    def visitHeightExpression(self, ctx:MapSParser.HeightExpressionContext):
        #print("visitHeightExpression")
        result = None
        identifier = ctx.IDENTIFIER()
        if identifier is None:  
            point = self.visit(ctx.pointExpression())
            z = None
            steep = None
            ctxList = ctx.expression()            
            if len(ctxList)==2:
                z = self.visit(ctxList[0])
                steep = self.visit(ctxList[1])
                if type(z) not in (int, float) or type(steep) not in (int, float):
                    self.errorListener.interpreterError(f"Invalid Height declaration: expected int or float", ctx)
            return InterpreterHeight(point, z, steep)
        else:
            return self.memory.accessId(ctx, identifier.getText(), InterpreterHeight)

    
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
            else:
                self.errorListener.interpreterError(f"Invalid Point coordinates: expected int or float", ctx)
            return result
        else:
            return self.memory.accessId(ctx, identifier.getText(), InterpreterPoint)
    
    
    
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
        exp = self.visit(ctx.expression())
        self.memory.storeId(ctx, identifier, exp, type_name)
        return identifier
    
    def visitIntExpr(self, ctx:MapSParser.IntExprContext):
        #print("visitIntExpr")
        return int(ctx.INT().getText())       
    
    def visitDoubleExpr(self, ctx:MapSParser.DoubleExprContext):
        #print("visitDoubleExpr")
        return float(ctx.DOUBLE().getText())
        return self.visitChildren(ctx)

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
        identifier = ctx.IDENTIFIER().getText()
        self.memory.storeId(ctx, identifier, self.visit(ctx.pointExpression()), InterpreterPoint)
        return identifier                  
            
    def visitPerimeterDeclaration(self, ctx:MapSParser.PerimeterDeclarationContext):
        #print("visitPerimeterDeclaration")
        return self.visitChildren(ctx)                
    #endregion Pomijalne 
    
    #------------------------------------
    #------Powyżej 1 Etap (03.04.25)-----
    #------------------------------------
    

    def visitHeightVariableDeclaration(self, ctx:MapSParser.HeightVariableDeclarationContext):
        #print("visitHeightVariableDeclaration")
        identifier = ctx.IDENTIFIER().getText()
        self.memory.storeId(ctx, identifier, self.visit(ctx.heightExpression()), InterpreterHeight)

    def visitLakeVariableDeclaration(self, ctx:MapSParser.LakeVariableDeclarationContext):
        #print("visitLakeVariableDeclaration")
        identifier = ctx.IDENTIFIER().getText()

        lake = None
        displacement = None
        perimeter = None
        perimeterFunc = None

        pointExpression = ctx.pointExpression()
        if pointExpression is not None:
            displacement = self.visit(pointExpression)            
        
        p = self.visit(ctx.perimeterDeclaration())  
        if (type(p)==InterpreterList and p.innerType==InterpreterPoint):
            perimeter = p.get() 
        else:
            perimeterFunc = p
        lake = InterpreterLake(displacement, perimeter, perimeterFunc)       
        self.memory.storeId(ctx, identifier, lake, InterpreterLake)
        self.memory.world().addLake(lake)
        return lake

    def visitRiverVariableDeclaration(self, ctx:MapSParser.RiverVariableDeclarationContext):
        #print("visitRiverVariableDeclaration")
        identifier = ctx.IDENTIFIER().getText()
        listExpression = ctx.listExpression()
        if(listExpression == None):
            pointExpression = ctx.pointExpression()
            if pointExpression is not None:
                source = self.visit(pointExpression)
            else:
                self.errorListener.interpreterError(f"Every river needs a source.", ctx)
                return
            if (ctx.direction() != None):
                directionString = ctx.direction().getText()
            else:
                self.errorListener.interpreterError(f"Specify the direction: for example north.", ctx)
                return
            intExpression = ctx.expression()
            if intExpression is not None:
                length = self.visit(intExpression)
                print(length)
                river = InterpreterRiver(None,source,directionString,length)
            else:
                river = InterpreterRiver(None,source,directionString)
        else:
            listt = self.visit(listExpression)
            listPerimeter = InterpreterList(InterpreterPoint,listt)
            # print(listPerimeter)
            if type(listPerimeter) is not InterpreterList:
                self.errorListener.interpreterError(f"River points have to make a list.", ctx)
                return
            if listPerimeter.innerType is not InterpreterPoint:
                self.errorListener.interpreterError(f"The list does not consist of points.", ctx)
                return
            if len(listt)<3:
                self.errorListener.interpreterError(f"River has to have at least 3 points.", ctx)
                return
            river = InterpreterRiver(listPerimeter)
        self.memory.storeId(ctx, identifier, river, InterpreterRiver)
        self.memory.world().addRiver(river)
        return river

    #region Function if loop

    def visitReturnStatement(self, ctx:MapSParser.ReturnStatementContext):
        #print("visitReturnStatement")
        if not self.in_function:
             self.errorListener.interpreterError(f"'return' used outside of function", ctx)
             return
        
        if ctx.expression() is not None:
            value = self.visit(ctx.expression())
        else:
            value = None
        raise self.ReturnException(value)

    class ReturnException(Exception):
        def __init__(self, value):
            self.value = value

    def visitFunctionDeclaration(self, ctx:MapSParser.FunctionDeclarationContext):
        #print("visitFunctionDeclaration")
        name = ctx.IDENTIFIER().getText()
        if ctx.parameters() is not None:
            params = self.visit(ctx.parameters())
        else:
            params = []
        if ctx.type_() is not None:
            returnType = self.visit(ctx.type_())
        else:
            returnType = None
        body = ctx.statement()

        if name  in self.memory.functions:
            line = self.memory.functions.get(name).ctx.start.line
            self.errorListener.interpreterError(f"Function '{name}' already defined.\n"
                                                 +f"Previous definition of {name} at line {line}.", ctx)
            return
        
        self.memory.functions[name] = InterpreterFunction(params, returnType, body, ctx)

    def visitParameters(self, ctx:MapSParser.ParametersContext):
        #print("visitParameters")
        parameters = []
        names = set()

        types = ctx.type_()
        idents = ctx.IDENTIFIER()

        for param_type_ctx, param_name_ctx in zip(types, idents):
            param_type = self.visit(param_type_ctx)
            param_name = param_name_ctx.getText()

            if param_name in names:
                self.errorListener.interpreterError(
                    f"Param name '{param_name}' can't be used twice in one function declaration.", ctx)
                return []

            names.add(param_name)
            parameters.append((param_type, param_name))
        
        return parameters

    def visitFunctionCall(self, ctx:MapSParser.FunctionCallContext):
        #print("visitFunctionCall")
        func_name = ctx.IDENTIFIER().getText()
        if func_name not in self.memory.functions:
            self.errorListener.interpreterError(f"Function '{func_name}' not defined", ctx)
            return

        func_ctx = self.memory.functions.get(func_name)
        
        self.in_function += 1
        params = func_ctx.params
        args = ctx.expression()
        if len(args) != len(params):
            self.errorListener.interpreterError(f"Function '{func_name}' expects {len(params)} arguments", ctx)
            self.in_function -= 1
            return
        
        arg_vals = []
        for arg in args:
            arg_vals.append( self.visit(arg))

        scopes = len(self.memory.scopes)
        self.memory.pushScope(is_function_scope=True)
        for param, arg_val in zip(params, arg_vals):
            if type(param[0]) is tuple:
                self.memory.storeId(ctx, param[1], arg_val, InterpreterList)
            else:
                self.memory.storeId(ctx, param[1], arg_val, param[0])

        result = None
        try:
            for stmt_node in func_ctx.body:
                self.visit(stmt_node)
        except self.ReturnException as e:
            result = e.value
        except RecursionError:
                self.errorListener.interpreterError("Recursion limit reached (possibly infinite recursion)", ctx)
                return None
        finally:
            self.in_function -= 1
            while len(self.memory.scopes) != scopes:
                self.memory.popScope()
        
        return_type = func_ctx.return_type
        if return_type is None:
            if result is not None:
                self.errorListener.interpreterError("'return' with a value, in function returning void", ctx)
            return None
        
        if return_type is not type(result):
            if not(return_type is float and type(result) is int):
                if type(return_type) is tuple:
                    if  type(result) is InterpreterList and result.innerType is return_type[1]:
                        return result
                    else:
                        self.errorListener.interpreterError(
                            f"returning {type(result).__name__} from a function with return type List<{return_type[1].__name__}>", ctx)
                self.errorListener.interpreterError(
                    f"returning {type(result).__name__} from a function with return type {return_type.__name__}", ctx)
                return None
        return result
    
    def callFunctionByName(self, ctx, name, args):
        func_ctx = self.memory.functions.get(name)
        params = func_ctx.params
        if len(args) != len(params):
            self.errorListener.interpreterError(f"Function '{name}' expects {len(params)} arguments", ctx)
            return
        
        scopes = len(self.memory.scopes)
        self.memory.pushScope() 
        self.in_function += 1

        try:
            for (param_type, param_name), arg_val in zip(params, args):
                self.memory.storeId(ctx, param_name, arg_val, param_type)
            result = None
            for stmt_node in func_ctx.body:
                self.visit(stmt_node)
        except self.ReturnException as e:
            result = e.value
        except RecursionError:
                self.errorListener.interpreterError("Recursion limit reached (possibly infinite recursion)", ctx)
                return None
        finally:
            self.in_function -= 1
            while len(self.memory.scopes) != scopes:
                self.memory.popScope()

        return_type = func_ctx.return_type
        if return_type is not type(result):
            if not (return_type is float and type(result) is int):
                self.errorListener.interpreterError(
                    f"Returning {type(result).__name__} from function declared to return {return_type.__name__}", ctx)
                return None
        return result

    def visitIfStatement(self, ctx:MapSParser.IfStatementContext):
        #print("visitIfStatement")
        # IF-y
        if self.visit(ctx.expression(0)):
            self.memory.pushScope()
            for stmt_node in ctx.statement():
                self.visit(stmt_node)
            self.memory.popScope()
            return
        # EIF-y
        eif_expression_index = 1
        eif_block_index = 0      
        while eif_expression_index < len(ctx.expression()) and \
            eif_block_index < len(ctx.blockStatement()):
            if self.visit(ctx.expression(eif_expression_index)):
                self.visit(ctx.blockStatement(eif_block_index))
                return
            eif_expression_index += 1
            eif_block_index += 1
        # ELSE-y
        if eif_block_index < len(ctx.blockStatement()):
            self.visit(ctx.blockStatement(eif_block_index))
        return None
    
    def visitBlockStatement(self, ctx:MapSParser.BlockStatementContext):
        #print(f"Odwiedzam BlockStatement: {ctx.getText()}")
        self.memory.pushScope()
        for stmt_node in ctx.statement():
            self.visit(stmt_node)
        self.memory.popScope()
        return None

    def visitRepeatFixedLoop(self, ctx:MapSParser.RepeatFixedLoopContext):
        #print("visitRepeatFixedLoop")
        identifier = ctx.IDENTIFIER().getText()
        if identifier is None:
            self.errorListener.interpreterError("Repeat loop requires identifier", ctx)
            return        
        #self.memory.storeId(ctx, identifier, 0, int)

        expression = self.visit(ctx.expression())
        if expression is None or type(expression) is not int:
            self.errorListener.interpreterError(f"Repeat loop requires integer expression, not {type(expression).__name__}", ctx)
            return
        
        for i in range(expression):
            self.memory.pushScope() 
            self.memory.storeId(ctx, identifier, i, int)
            for stmt_node in ctx.statement():
                self.visit(stmt_node)
            self.memory.popScope()

        #self.memory.releaseId(ctx, identifier)
        #return self.visitChildren(ctx)

    def visitRepeatRangeLoop(self, ctx:MapSParser.RepeatRangeLoopContext):
        #print("visitRepeatRangeLoop")
        identifier = ctx.IDENTIFIER().getText()
        if identifier is None:
            self.errorListener.interpreterError("Repeat loop requires identifier", ctx)
            return        
        #self.memory.storeId(ctx, identifier, 0, int)

        start = self.visit(ctx.expression(0))
        end = self.visit(ctx.expression(1))
        if start is None or end is None or type(start) is not int or type(end) is not int:
            self.errorListener.interpreterError(f"Repeat loop requires integer expression, not {type(start).__name__} and {type(end).__name__}", ctx)
            return
        
        step = 1
        if start > end:
            step = -1
        elif start == end:
            return
        
        for i in range(start, end, step):
            self.memory.pushScope()
            self.memory.storeId(ctx, identifier, i, int)
            for stmt_node in ctx.statement():
                self.visit(stmt_node)
            self.memory.popScope()
            
        #return self.visitChildren(ctx)

    def visitWhileLoop(self, ctx:MapSParser.WhileLoopContext):
        #print("visitWhileLoop")
        condition = self.visit(ctx.expression())
        if condition is None or type(condition) is not bool:
            self.errorListener.interpreterError(f"While loop requires boolean expression, not {type(condition).__name__}", ctx)
            return
        
        while condition:
            self.memory.pushScope()
            for stmt_node in ctx.statement():
                self.visit(stmt_node)
            self.memory.popScope()
            condition = self.visit(ctx.expression())
            if condition is None or type(condition) is not bool:
                self.errorListener.interpreterError(f"While loop requires boolean expression, not {type(condition).__name__}", ctx)
                return
        #return self.visitChildren(ctx)

    #region Expression   

    def visitScopeAccessExpr(self, ctx: MapSParser.ScopeAccessExprContext):
        tokens = [child.getText() for child in ctx.children if child.getText() != '::']
        if not tokens or tokens[0] != 'parent':
            self.errorListener.interpreterError("Invalid scoped access expression.", ctx)
            return None
        
        steps_up = len(tokens) - 1
        var_name = tokens[-1]
        if steps_up >= len(self.memory.scopes):
            self.errorListener.interpreterError(f"No such parent scope ({steps_up} levels up).", ctx)
            return None
        return self.memory.accessId(ctx, var_name, idType=None, levels_up=steps_up)

    def visitCastExpr(self, ctx:MapSParser.CastExprContext):
        t = self.visit(ctx.type_())
        try:
            value = t(self.visit(ctx.expression()))
            return value
        except (ValueError, TypeError):
            self.errorListener.interpreterError(f"Cannot cast to {t.__name__} from {type(self.visit(ctx.expression())).__name__}", ctx)
            return None        
    
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

    def visitAddSubExpr(self, ctx:MapSParser.AddSubExprContext):
        #print("visitAddSubExpr")
        left = self.visit(ctx.expression(0))
        right = self.visit(ctx.expression(1))

        if not isinstance(left, (int, float)) or not isinstance(right, (int, float)) or isinstance(left, bool) or isinstance(right, bool):
            self.errorListener.interpreterError(f"Cannot add/subtract types {type(left).__name__} and {type(right).__name__}", ctx)

        if ctx.getChild(1).getText() == '+':
            return left + right
        else:
            return left - right
    
    def visitUnaryMinusExpr(self, ctx:MapSParser.UnaryMinusExprContext):
        #print("visitUnaryMinusExpr")
        value = self.visit(ctx.expression())
        if not isinstance(value, (int, float)) or isinstance(value, bool):
            self.errorListener.interpreterError(f"Cannot negate non-number type: {type(value).__name__}",ctx)
        return -value
    
    def visitMulDivExpr(self, ctx:MapSParser.MulDivExprContext):
        #print("visitMulDivExpr")
        left = self.visit(ctx.expression(0))
        right = self.visit(ctx.expression(1))

        if not isinstance(left, (int, float)) or not isinstance(right, (int, float)) or isinstance(left, bool) or isinstance(right, bool):
            self.errorListener.interpreterError(f"Cannot multiply/divide types: {type(left).__name__} and {type(right).__name__}", ctx)

        if ctx.getChild(1).getText() == '*':
            return left * right
        else:
            if right == 0:
                self.errorListener.interpreterError("Division by zero", ctx)
            else:
                if isinstance(left, int) and isinstance(right, int):
                    return left // right
                return left / right
        return 0
            
    
    def visitSqrtExpr(self, ctx:MapSParser.SqrtExprContext):
        #print("visitSqrtExpr")
        left = self.visit(ctx.expression(0))
        if ctx.expression(1) is None:
            right = 2
        else:
            right = self.visit(ctx.expression(1))

        if not (type(left) in (int, float) and type(right) in (int, float)):
            self.errorListener.interpreterError(f"Sqrt (^) only supports numbers, not: {type(left).__name__} and {type(right).__name__}", ctx)
            return None

        if right == 0:
            self.errorListener.interpreterError("Root degree cannot be zero", ctx)
            return None

        return math.pow(left, 1 / right)
    
    def visitParenExpr(self, ctx:MapSParser.ParenExprContext):
        #print("visitParenExpr")
        return self.visit(ctx.expression())
    
    def visitPowExpr(self, ctx:MapSParser.PowExprContext):
        #print("visitPowExpr")
        left = self.visit(ctx.expression(0))
        if ctx.expression(1) is None:
            right = 2
        else:
            right = self.visit(ctx.expression(1))

        if not (type(left) in (int, float) and type(right) in (int, float)):
            self.errorListener.interpreterError(f"Pow (^) only supports numbers, not: {type(left).__name__} and {type(right).__name__}", ctx)
            return None

        if isinstance(left, int) and isinstance(right, int):
                    return int(math.pow(left, right))

        return math.pow(left, right)


    def visitCompareExpr(self, ctx:MapSParser.CompareExprContext):
        #print("visitCompareExpr")
        left = self.visit(ctx.expression(0))
        right = self.visit(ctx.expression(1))

        if not ((type(left) in (int, float) and type(right) in (int, float)) or (type(left) is bool and type(right) is bool)):
            self.errorListener.interpreterError(f"Cannot compare types: {type(left).__name__}, {type(right).__name__}", ctx)

        comp = ctx.getChild(1).getText()
        if comp == '=' or comp == '!=':
            if not isinstance(left, (int, float)) or not isinstance(right, (int, float)):
                self.errorListener.interpreterError(f"Cannot compare {type(left).__name__} and {type(right).__name__}", ctx)
            if comp == '=':
                return left == right
            else:
                return left != right
        else:
            if isinstance(left, bool):
                self.errorListener.interpreterError(f"Cannot compare {type(left).__name__} and {type(right).__name__}", ctx)
            if comp == '>':
                return left > right
            elif comp == '<':
                return left < right
            elif comp == '>=':
                return left >= right
            elif comp == '<=':
                return left <= right
            
    def visitTrygExpr(self, ctx):
        func_name = ctx.getChild(0).getText()
        arg = self.visit(ctx.expression())

        if type(arg) not in (int, float): 
            self.errorListener.interpreterError(f"Argument of {func_name} must be numeric.", ctx)
            return None

        if func_name == 'sin':
            return math.sin(arg)
        elif func_name == 'cos':
            return math.cos(arg)
        elif func_name == 'tg':
            return math.tan(arg)
        elif func_name == 'ctg':
            return 1 / math.tan(arg) if arg != 0 else float('inf')
    def visitPointAccessExpr(self, ctx:MapSParser.PointAccessExprContext):
        #print("visitPointAccessExpr")
        return self.visitChildren(ctx)

    def visitPointAccess(self, ctx:MapSParser.PointAccessContext):
        #print("visitPointAccess")
        identifier = ctx.IDENTIFIER().getText()
        point = self.memory.accessId(ctx, identifier, InterpreterPoint)
        XorY = ctx.getChild(1).getText()
        if XorY == ".x":
            return point.x
        return point.y


    def visitListAccessExpr(self, ctx:MapSParser.ListAccessExprContext):
        #print("visitListAccessExpr")
        return self.visitChildren(ctx) 

    def visitListAccess(self, ctx:MapSParser.ListAccessContext):
        #print("visitListAccess")
        list_name = ctx.IDENTIFIER().getText()
        index = self.visit(ctx.expression())

        if type(index) is not int:
            self.errorListener.interpreterError("List index must be an integer.", ctx)
            return None

        lst = self.memory.accessId(ctx, list_name, InterpreterList)
        if lst is None:
            return None
        
        elements = lst.get()
        try:
            return elements[index]
        except IndexError:
            self.errorListener.interpreterError(f"List index {index} out of bounds for '{list_name}'.", ctx)
            return None

    def visitPointFieldAssignment(self, ctx:MapSParser.PointFieldAssignmentContext):
        #print("visitPointFieldAssignment")
        var_name = ctx.IDENTIFIER().getText()
        point = self.memory.accessId(ctx, var_name, InterpreterPoint)
        if point is None:
            return

        field = ctx.getChild(1).getText()  # '.x' or '.y'
        value = self.visit(ctx.expression())

        if type(value) not in (int, float):
            self.errorListener.interpreterError(f"Cannot assign non-numeric value to {var_name}{field}.", ctx)
            return

        if field == '.x':
            point.x = float(value)
        elif field == '.y':
            point.y = float(value)
        else:
            self.errorListener.interpreterError(f"Unknown point field '{field}'", ctx)

    def visitListAdd(self, ctx:MapSParser.ListAddContext):
        #print("visitListAdd")
        list_name = ctx.IDENTIFIER().getText()
        item = self.visit(ctx.expression())
        lst = self.memory.accessId(ctx, list_name, InterpreterList)
        if lst is None:
            return None
        if lst.innerType is not type(item):
            if lst.innerType is float and type(item) is int:
                lst.elements.append(float(item))
                return
            else:
                self.errorListener.interpreterError(f"Cannot add {type(item).__name__} to list of {lst.innerType.__name__}.", ctx)
                return
        lst.elements.append(item)

    def visitListUpdate(self, ctx:MapSParser.ListUpdateContext):
        #print("visitListUpdate")
        list_name = ctx.IDENTIFIER().getText()
        index = self.visit(ctx.expression(0))
        new_value = self.visit(ctx.expression(1))

        if type(index) is not int:
            self.errorListener.interpreterError("List index must be an integer.", ctx)
            return

        lst = self.memory.accessId(ctx, list_name, InterpreterList)
        if lst is None:
            return
        
        if lst.innerType is not type(new_value):
            if lst.innerType is float and type(new_value) is int:
                new_value = float(new_value)
            else:
                self.errorListener.interpreterError(f"Cannot add {type(new_value).__name__} to list of {lst.innerType.__name__}.", ctx)
        try:
            lst.elements[index] = new_value
        except IndexError:
            self.errorListener.interpreterError(f"Index {index} out of range for list '{list_name}'", ctx)
        return self.visitChildren(ctx)


    def visitPrintStatement(self, ctx:MapSParser.PrintStatementContext):
        
        value = self.visit(ctx.expression())
        if type(value) is InterpreterList:
            for element in value.elements:
                printValue(element)
        else:
            printValue(value)
    
def printValue(value):
    if isinstance(value, bool):
        print("true" if value else "false")
    elif type(value) in (str, int, float):
        print(value)
    elif type(value) is InterpreterPoint:
        print(f"({value.x}, {value.y})")
    elif type(value) is InterpreterHeight:
        print(f"(({value.place.x}, {value.place.y}), {value.z}, {value.steep})")
            
    
    

#region Main
def main():
    filename = sys.argv[1]
    input_stream = FileStream(filename)
    #input_stream = FileStream("input4.map")
    #input_stream = FileStream("input.map")
    #input_stream = FileStream("input3.map")
    # input_stream = FileStream("booleantest.map")

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