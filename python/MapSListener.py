# Generated from MapS.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .MapSParser import MapSParser
else:
    from MapSParser import MapSParser

# This class defines a complete listener for a parse tree produced by MapSParser.
class MapSListener(ParseTreeListener):

    # Enter a parse tree produced by MapSParser#program.
    def enterProgram(self, ctx:MapSParser.ProgramContext):
        pass

    # Exit a parse tree produced by MapSParser#program.
    def exitProgram(self, ctx:MapSParser.ProgramContext):
        pass


    # Enter a parse tree produced by MapSParser#progStatement.
    def enterProgStatement(self, ctx:MapSParser.ProgStatementContext):
        pass

    # Exit a parse tree produced by MapSParser#progStatement.
    def exitProgStatement(self, ctx:MapSParser.ProgStatementContext):
        pass


    # Enter a parse tree produced by MapSParser#statement.
    def enterStatement(self, ctx:MapSParser.StatementContext):
        pass

    # Exit a parse tree produced by MapSParser#statement.
    def exitStatement(self, ctx:MapSParser.StatementContext):
        pass


    # Enter a parse tree produced by MapSParser#printStatement.
    def enterPrintStatement(self, ctx:MapSParser.PrintStatementContext):
        pass

    # Exit a parse tree produced by MapSParser#printStatement.
    def exitPrintStatement(self, ctx:MapSParser.PrintStatementContext):
        pass


    # Enter a parse tree produced by MapSParser#returnStatement.
    def enterReturnStatement(self, ctx:MapSParser.ReturnStatementContext):
        pass

    # Exit a parse tree produced by MapSParser#returnStatement.
    def exitReturnStatement(self, ctx:MapSParser.ReturnStatementContext):
        pass


    # Enter a parse tree produced by MapSParser#variableDeclaration.
    def enterVariableDeclaration(self, ctx:MapSParser.VariableDeclarationContext):
        pass

    # Exit a parse tree produced by MapSParser#variableDeclaration.
    def exitVariableDeclaration(self, ctx:MapSParser.VariableDeclarationContext):
        pass


    # Enter a parse tree produced by MapSParser#primitiveVariableDeclaration.
    def enterPrimitiveVariableDeclaration(self, ctx:MapSParser.PrimitiveVariableDeclarationContext):
        pass

    # Exit a parse tree produced by MapSParser#primitiveVariableDeclaration.
    def exitPrimitiveVariableDeclaration(self, ctx:MapSParser.PrimitiveVariableDeclarationContext):
        pass


    # Enter a parse tree produced by MapSParser#listVariableDeclaration.
    def enterListVariableDeclaration(self, ctx:MapSParser.ListVariableDeclarationContext):
        pass

    # Exit a parse tree produced by MapSParser#listVariableDeclaration.
    def exitListVariableDeclaration(self, ctx:MapSParser.ListVariableDeclarationContext):
        pass


    # Enter a parse tree produced by MapSParser#pointVariableDeclaration.
    def enterPointVariableDeclaration(self, ctx:MapSParser.PointVariableDeclarationContext):
        pass

    # Exit a parse tree produced by MapSParser#pointVariableDeclaration.
    def exitPointVariableDeclaration(self, ctx:MapSParser.PointVariableDeclarationContext):
        pass


    # Enter a parse tree produced by MapSParser#heightVariableDeclaration.
    def enterHeightVariableDeclaration(self, ctx:MapSParser.HeightVariableDeclarationContext):
        pass

    # Exit a parse tree produced by MapSParser#heightVariableDeclaration.
    def exitHeightVariableDeclaration(self, ctx:MapSParser.HeightVariableDeclarationContext):
        pass


    # Enter a parse tree produced by MapSParser#landVariableDeclaration.
    def enterLandVariableDeclaration(self, ctx:MapSParser.LandVariableDeclarationContext):
        pass

    # Exit a parse tree produced by MapSParser#landVariableDeclaration.
    def exitLandVariableDeclaration(self, ctx:MapSParser.LandVariableDeclarationContext):
        pass


    # Enter a parse tree produced by MapSParser#perimeterDeclaration.
    def enterPerimeterDeclaration(self, ctx:MapSParser.PerimeterDeclarationContext):
        pass

    # Exit a parse tree produced by MapSParser#perimeterDeclaration.
    def exitPerimeterDeclaration(self, ctx:MapSParser.PerimeterDeclarationContext):
        pass


    # Enter a parse tree produced by MapSParser#shape.
    def enterShape(self, ctx:MapSParser.ShapeContext):
        pass

    # Exit a parse tree produced by MapSParser#shape.
    def exitShape(self, ctx:MapSParser.ShapeContext):
        pass


    # Enter a parse tree produced by MapSParser#heightDeclaration.
    def enterHeightDeclaration(self, ctx:MapSParser.HeightDeclarationContext):
        pass

    # Exit a parse tree produced by MapSParser#heightDeclaration.
    def exitHeightDeclaration(self, ctx:MapSParser.HeightDeclarationContext):
        pass


    # Enter a parse tree produced by MapSParser#lakeVariableDeclaration.
    def enterLakeVariableDeclaration(self, ctx:MapSParser.LakeVariableDeclarationContext):
        pass

    # Exit a parse tree produced by MapSParser#lakeVariableDeclaration.
    def exitLakeVariableDeclaration(self, ctx:MapSParser.LakeVariableDeclarationContext):
        pass


    # Enter a parse tree produced by MapSParser#riverVariableDeclaration.
    def enterRiverVariableDeclaration(self, ctx:MapSParser.RiverVariableDeclarationContext):
        pass

    # Exit a parse tree produced by MapSParser#riverVariableDeclaration.
    def exitRiverVariableDeclaration(self, ctx:MapSParser.RiverVariableDeclarationContext):
        pass


    # Enter a parse tree produced by MapSParser#direction.
    def enterDirection(self, ctx:MapSParser.DirectionContext):
        pass

    # Exit a parse tree produced by MapSParser#direction.
    def exitDirection(self, ctx:MapSParser.DirectionContext):
        pass


    # Enter a parse tree produced by MapSParser#functionDeclaration.
    def enterFunctionDeclaration(self, ctx:MapSParser.FunctionDeclarationContext):
        pass

    # Exit a parse tree produced by MapSParser#functionDeclaration.
    def exitFunctionDeclaration(self, ctx:MapSParser.FunctionDeclarationContext):
        pass


    # Enter a parse tree produced by MapSParser#parameters.
    def enterParameters(self, ctx:MapSParser.ParametersContext):
        pass

    # Exit a parse tree produced by MapSParser#parameters.
    def exitParameters(self, ctx:MapSParser.ParametersContext):
        pass


    # Enter a parse tree produced by MapSParser#ifStatement.
    def enterIfStatement(self, ctx:MapSParser.IfStatementContext):
        pass

    # Exit a parse tree produced by MapSParser#ifStatement.
    def exitIfStatement(self, ctx:MapSParser.IfStatementContext):
        pass


    # Enter a parse tree produced by MapSParser#blockStatement.
    def enterBlockStatement(self, ctx:MapSParser.BlockStatementContext):
        pass

    # Exit a parse tree produced by MapSParser#blockStatement.
    def exitBlockStatement(self, ctx:MapSParser.BlockStatementContext):
        pass


    # Enter a parse tree produced by MapSParser#RepeatFixedLoop.
    def enterRepeatFixedLoop(self, ctx:MapSParser.RepeatFixedLoopContext):
        pass

    # Exit a parse tree produced by MapSParser#RepeatFixedLoop.
    def exitRepeatFixedLoop(self, ctx:MapSParser.RepeatFixedLoopContext):
        pass


    # Enter a parse tree produced by MapSParser#RepeatRangeLoop.
    def enterRepeatRangeLoop(self, ctx:MapSParser.RepeatRangeLoopContext):
        pass

    # Exit a parse tree produced by MapSParser#RepeatRangeLoop.
    def exitRepeatRangeLoop(self, ctx:MapSParser.RepeatRangeLoopContext):
        pass


    # Enter a parse tree produced by MapSParser#WhileLoop.
    def enterWhileLoop(self, ctx:MapSParser.WhileLoopContext):
        pass

    # Exit a parse tree produced by MapSParser#WhileLoop.
    def exitWhileLoop(self, ctx:MapSParser.WhileLoopContext):
        pass


    # Enter a parse tree produced by MapSParser#listAccessExpr.
    def enterListAccessExpr(self, ctx:MapSParser.ListAccessExprContext):
        pass

    # Exit a parse tree produced by MapSParser#listAccessExpr.
    def exitListAccessExpr(self, ctx:MapSParser.ListAccessExprContext):
        pass


    # Enter a parse tree produced by MapSParser#doubleExpr.
    def enterDoubleExpr(self, ctx:MapSParser.DoubleExprContext):
        pass

    # Exit a parse tree produced by MapSParser#doubleExpr.
    def exitDoubleExpr(self, ctx:MapSParser.DoubleExprContext):
        pass


    # Enter a parse tree produced by MapSParser#intExpr.
    def enterIntExpr(self, ctx:MapSParser.IntExprContext):
        pass

    # Exit a parse tree produced by MapSParser#intExpr.
    def exitIntExpr(self, ctx:MapSParser.IntExprContext):
        pass


    # Enter a parse tree produced by MapSParser#addSubExpr.
    def enterAddSubExpr(self, ctx:MapSParser.AddSubExprContext):
        pass

    # Exit a parse tree produced by MapSParser#addSubExpr.
    def exitAddSubExpr(self, ctx:MapSParser.AddSubExprContext):
        pass


    # Enter a parse tree produced by MapSParser#castExpr.
    def enterCastExpr(self, ctx:MapSParser.CastExprContext):
        pass

    # Exit a parse tree produced by MapSParser#castExpr.
    def exitCastExpr(self, ctx:MapSParser.CastExprContext):
        pass


    # Enter a parse tree produced by MapSParser#sqrtExpr.
    def enterSqrtExpr(self, ctx:MapSParser.SqrtExprContext):
        pass

    # Exit a parse tree produced by MapSParser#sqrtExpr.
    def exitSqrtExpr(self, ctx:MapSParser.SqrtExprContext):
        pass


    # Enter a parse tree produced by MapSParser#orExpr.
    def enterOrExpr(self, ctx:MapSParser.OrExprContext):
        pass

    # Exit a parse tree produced by MapSParser#orExpr.
    def exitOrExpr(self, ctx:MapSParser.OrExprContext):
        pass


    # Enter a parse tree produced by MapSParser#funcCallExpr.
    def enterFuncCallExpr(self, ctx:MapSParser.FuncCallExprContext):
        pass

    # Exit a parse tree produced by MapSParser#funcCallExpr.
    def exitFuncCallExpr(self, ctx:MapSParser.FuncCallExprContext):
        pass


    # Enter a parse tree produced by MapSParser#parenExpr.
    def enterParenExpr(self, ctx:MapSParser.ParenExprContext):
        pass

    # Exit a parse tree produced by MapSParser#parenExpr.
    def exitParenExpr(self, ctx:MapSParser.ParenExprContext):
        pass


    # Enter a parse tree produced by MapSParser#stringExpr.
    def enterStringExpr(self, ctx:MapSParser.StringExprContext):
        pass

    # Exit a parse tree produced by MapSParser#stringExpr.
    def exitStringExpr(self, ctx:MapSParser.StringExprContext):
        pass


    # Enter a parse tree produced by MapSParser#varExpr.
    def enterVarExpr(self, ctx:MapSParser.VarExprContext):
        pass

    # Exit a parse tree produced by MapSParser#varExpr.
    def exitVarExpr(self, ctx:MapSParser.VarExprContext):
        pass


    # Enter a parse tree produced by MapSParser#notExpr.
    def enterNotExpr(self, ctx:MapSParser.NotExprContext):
        pass

    # Exit a parse tree produced by MapSParser#notExpr.
    def exitNotExpr(self, ctx:MapSParser.NotExprContext):
        pass


    # Enter a parse tree produced by MapSParser#unaryMinusExpr.
    def enterUnaryMinusExpr(self, ctx:MapSParser.UnaryMinusExprContext):
        pass

    # Exit a parse tree produced by MapSParser#unaryMinusExpr.
    def exitUnaryMinusExpr(self, ctx:MapSParser.UnaryMinusExprContext):
        pass


    # Enter a parse tree produced by MapSParser#trygExpr.
    def enterTrygExpr(self, ctx:MapSParser.TrygExprContext):
        pass

    # Exit a parse tree produced by MapSParser#trygExpr.
    def exitTrygExpr(self, ctx:MapSParser.TrygExprContext):
        pass


    # Enter a parse tree produced by MapSParser#scopeAccessExpr.
    def enterScopeAccessExpr(self, ctx:MapSParser.ScopeAccessExprContext):
        pass

    # Exit a parse tree produced by MapSParser#scopeAccessExpr.
    def exitScopeAccessExpr(self, ctx:MapSParser.ScopeAccessExprContext):
        pass


    # Enter a parse tree produced by MapSParser#boolExpr.
    def enterBoolExpr(self, ctx:MapSParser.BoolExprContext):
        pass

    # Exit a parse tree produced by MapSParser#boolExpr.
    def exitBoolExpr(self, ctx:MapSParser.BoolExprContext):
        pass


    # Enter a parse tree produced by MapSParser#powExpr.
    def enterPowExpr(self, ctx:MapSParser.PowExprContext):
        pass

    # Exit a parse tree produced by MapSParser#powExpr.
    def exitPowExpr(self, ctx:MapSParser.PowExprContext):
        pass


    # Enter a parse tree produced by MapSParser#mulDivExpr.
    def enterMulDivExpr(self, ctx:MapSParser.MulDivExprContext):
        pass

    # Exit a parse tree produced by MapSParser#mulDivExpr.
    def exitMulDivExpr(self, ctx:MapSParser.MulDivExprContext):
        pass


    # Enter a parse tree produced by MapSParser#pointAccessExpr.
    def enterPointAccessExpr(self, ctx:MapSParser.PointAccessExprContext):
        pass

    # Exit a parse tree produced by MapSParser#pointAccessExpr.
    def exitPointAccessExpr(self, ctx:MapSParser.PointAccessExprContext):
        pass


    # Enter a parse tree produced by MapSParser#compareExpr.
    def enterCompareExpr(self, ctx:MapSParser.CompareExprContext):
        pass

    # Exit a parse tree produced by MapSParser#compareExpr.
    def exitCompareExpr(self, ctx:MapSParser.CompareExprContext):
        pass


    # Enter a parse tree produced by MapSParser#andExpr.
    def enterAndExpr(self, ctx:MapSParser.AndExprContext):
        pass

    # Exit a parse tree produced by MapSParser#andExpr.
    def exitAndExpr(self, ctx:MapSParser.AndExprContext):
        pass


    # Enter a parse tree produced by MapSParser#functionCall.
    def enterFunctionCall(self, ctx:MapSParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by MapSParser#functionCall.
    def exitFunctionCall(self, ctx:MapSParser.FunctionCallContext):
        pass


    # Enter a parse tree produced by MapSParser#pointAccess.
    def enterPointAccess(self, ctx:MapSParser.PointAccessContext):
        pass

    # Exit a parse tree produced by MapSParser#pointAccess.
    def exitPointAccess(self, ctx:MapSParser.PointAccessContext):
        pass


    # Enter a parse tree produced by MapSParser#listAccess.
    def enterListAccess(self, ctx:MapSParser.ListAccessContext):
        pass

    # Exit a parse tree produced by MapSParser#listAccess.
    def exitListAccess(self, ctx:MapSParser.ListAccessContext):
        pass


    # Enter a parse tree produced by MapSParser#pointExpression.
    def enterPointExpression(self, ctx:MapSParser.PointExpressionContext):
        pass

    # Exit a parse tree produced by MapSParser#pointExpression.
    def exitPointExpression(self, ctx:MapSParser.PointExpressionContext):
        pass


    # Enter a parse tree produced by MapSParser#heightExpression.
    def enterHeightExpression(self, ctx:MapSParser.HeightExpressionContext):
        pass

    # Exit a parse tree produced by MapSParser#heightExpression.
    def exitHeightExpression(self, ctx:MapSParser.HeightExpressionContext):
        pass


    # Enter a parse tree produced by MapSParser#listExpression.
    def enterListExpression(self, ctx:MapSParser.ListExpressionContext):
        pass

    # Exit a parse tree produced by MapSParser#listExpression.
    def exitListExpression(self, ctx:MapSParser.ListExpressionContext):
        pass


    # Enter a parse tree produced by MapSParser#listElementExpression.
    def enterListElementExpression(self, ctx:MapSParser.ListElementExpressionContext):
        pass

    # Exit a parse tree produced by MapSParser#listElementExpression.
    def exitListElementExpression(self, ctx:MapSParser.ListElementExpressionContext):
        pass


    # Enter a parse tree produced by MapSParser#type.
    def enterType(self, ctx:MapSParser.TypeContext):
        pass

    # Exit a parse tree produced by MapSParser#type.
    def exitType(self, ctx:MapSParser.TypeContext):
        pass


    # Enter a parse tree produced by MapSParser#assignment.
    def enterAssignment(self, ctx:MapSParser.AssignmentContext):
        pass

    # Exit a parse tree produced by MapSParser#assignment.
    def exitAssignment(self, ctx:MapSParser.AssignmentContext):
        pass


    # Enter a parse tree produced by MapSParser#variableAssignment.
    def enterVariableAssignment(self, ctx:MapSParser.VariableAssignmentContext):
        pass

    # Exit a parse tree produced by MapSParser#variableAssignment.
    def exitVariableAssignment(self, ctx:MapSParser.VariableAssignmentContext):
        pass


    # Enter a parse tree produced by MapSParser#pointFieldAssignment.
    def enterPointFieldAssignment(self, ctx:MapSParser.PointFieldAssignmentContext):
        pass

    # Exit a parse tree produced by MapSParser#pointFieldAssignment.
    def exitPointFieldAssignment(self, ctx:MapSParser.PointFieldAssignmentContext):
        pass


    # Enter a parse tree produced by MapSParser#ListAdd.
    def enterListAdd(self, ctx:MapSParser.ListAddContext):
        pass

    # Exit a parse tree produced by MapSParser#ListAdd.
    def exitListAdd(self, ctx:MapSParser.ListAddContext):
        pass


    # Enter a parse tree produced by MapSParser#ListUpdate.
    def enterListUpdate(self, ctx:MapSParser.ListUpdateContext):
        pass

    # Exit a parse tree produced by MapSParser#ListUpdate.
    def exitListUpdate(self, ctx:MapSParser.ListUpdateContext):
        pass



del MapSParser