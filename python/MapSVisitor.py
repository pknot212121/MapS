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


    # Visit a parse tree produced by MapSParser#functionDeclaration.
    def visitFunctionDeclaration(self, ctx:MapSParser.FunctionDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#parameters.
    def visitParameters(self, ctx:MapSParser.ParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#ifStatement.
    def visitIfStatement(self, ctx:MapSParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#loopStatement.
    def visitLoopStatement(self, ctx:MapSParser.LoopStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#expression.
    def visitExpression(self, ctx:MapSParser.ExpressionContext):
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


    # Visit a parse tree produced by MapSParser#listExpression.
    def visitListExpression(self, ctx:MapSParser.ListExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#type.
    def visitType(self, ctx:MapSParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MapSParser#operator.
    def visitOperator(self, ctx:MapSParser.OperatorContext):
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


    # Visit a parse tree produced by MapSParser#listAssignment.
    def visitListAssignment(self, ctx:MapSParser.ListAssignmentContext):
        return self.visitChildren(ctx)



del MapSParser