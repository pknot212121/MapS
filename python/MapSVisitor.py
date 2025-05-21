# Generated from MapS.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .MapSParser import MapSParser
else:
    from MapSParser import MapSParser

# This class defines a complete generic visitor for a parse tree produced by MapSParser.

class MapSVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MapSParser#program.
    def visitProgram(self, ctx:MapSParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#statement.
    def visitStatement(self, ctx:MapSParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#printStatement.
    def visitPrintStatement(self, ctx:MapSParser.PrintStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#returnStatement.
    def visitReturnStatement(self, ctx:MapSParser.ReturnStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#variableDeclaration.
    def visitVariableDeclaration(self, ctx:MapSParser.VariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#primitiveVariableDeclaration.
    def visitPrimitiveVariableDeclaration(self, ctx:MapSParser.PrimitiveVariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#listVariableDeclaration.
    def visitListVariableDeclaration(self, ctx:MapSParser.ListVariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#pointVariableDeclaration.
    def visitPointVariableDeclaration(self, ctx:MapSParser.PointVariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#heightVariableDeclaration.
    def visitHeightVariableDeclaration(self, ctx:MapSParser.HeightVariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#landVariableDeclaration.
    def visitLandVariableDeclaration(self, ctx:MapSParser.LandVariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#perimeterDeclaration.
    def visitPerimeterDeclaration(self, ctx:MapSParser.PerimeterDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#shape.
    def visitShape(self, ctx:MapSParser.ShapeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#heightDeclaration.
    def visitHeightDeclaration(self, ctx:MapSParser.HeightDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#lakeVariableDeclaration.
    def visitLakeVariableDeclaration(self, ctx:MapSParser.LakeVariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#riverVariableDeclaration.
    def visitRiverVariableDeclaration(self, ctx:MapSParser.RiverVariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#functionDeclaration.
    def visitFunctionDeclaration(self, ctx:MapSParser.FunctionDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#parameters.
    def visitParameters(self, ctx:MapSParser.ParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#ifStatement.
    def visitIfStatement(self, ctx:MapSParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#blockStatement.
    def visitBlockStatement(self, ctx:MapSParser.BlockStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#RepeatFixedLoop.
    def visitRepeatFixedLoop(self, ctx:MapSParser.RepeatFixedLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#RepeatRangeLoop.
    def visitRepeatRangeLoop(self, ctx:MapSParser.RepeatRangeLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#WhileLoop.
    def visitWhileLoop(self, ctx:MapSParser.WhileLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#listAccessExpr.
    def visitListAccessExpr(self, ctx:MapSParser.ListAccessExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#doubleExpr.
    def visitDoubleExpr(self, ctx:MapSParser.DoubleExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#intExpr.
    def visitIntExpr(self, ctx:MapSParser.IntExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#addSubExpr.
    def visitAddSubExpr(self, ctx:MapSParser.AddSubExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#sqrtExpr.
    def visitSqrtExpr(self, ctx:MapSParser.SqrtExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#orExpr.
    def visitOrExpr(self, ctx:MapSParser.OrExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#funcCallExpr.
    def visitFuncCallExpr(self, ctx:MapSParser.FuncCallExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#parenExpr.
    def visitParenExpr(self, ctx:MapSParser.ParenExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#stringExpr.
    def visitStringExpr(self, ctx:MapSParser.StringExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#varExpr.
    def visitVarExpr(self, ctx:MapSParser.VarExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#notExpr.
    def visitNotExpr(self, ctx:MapSParser.NotExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#unaryMinusExpr.
    def visitUnaryMinusExpr(self, ctx:MapSParser.UnaryMinusExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#trygExpr.
    def visitTrygExpr(self, ctx:MapSParser.TrygExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#boolExpr.
    def visitBoolExpr(self, ctx:MapSParser.BoolExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#powExpr.
    def visitPowExpr(self, ctx:MapSParser.PowExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#mulDivExpr.
    def visitMulDivExpr(self, ctx:MapSParser.MulDivExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#pointAccessExpr.
    def visitPointAccessExpr(self, ctx:MapSParser.PointAccessExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#compareExpr.
    def visitCompareExpr(self, ctx:MapSParser.CompareExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#andExpr.
    def visitAndExpr(self, ctx:MapSParser.AndExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#functionCall.
    def visitFunctionCall(self, ctx:MapSParser.FunctionCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#pointAccess.
    def visitPointAccess(self, ctx:MapSParser.PointAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#listAccess.
    def visitListAccess(self, ctx:MapSParser.ListAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#pointExpression.
    def visitPointExpression(self, ctx:MapSParser.PointExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#heightExpression.
    def visitHeightExpression(self, ctx:MapSParser.HeightExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#listExpression.
    def visitListExpression(self, ctx:MapSParser.ListExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#listElementExpression.
    def visitListElementExpression(self, ctx:MapSParser.ListElementExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#type.
    def visitType(self, ctx:MapSParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#assignment.
    def visitAssignment(self, ctx:MapSParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#variableAssignment.
    def visitVariableAssignment(self, ctx:MapSParser.VariableAssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#pointFieldAssignment.
    def visitPointFieldAssignment(self, ctx:MapSParser.PointFieldAssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#ListAdd.
    def visitListAdd(self, ctx:MapSParser.ListAddContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#ListUpdate.
    def visitListUpdate(self, ctx:MapSParser.ListUpdateContext):
        return self.visitChildren(ctx)



del MapSParser