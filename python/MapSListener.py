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


    # Enter a parse tree produced by MapSParser#statement.
    def enterStatement(self, ctx:MapSParser.StatementContext):
        pass

    # Exit a parse tree produced by MapSParser#statement.
    def exitStatement(self, ctx:MapSParser.StatementContext):
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


    # Enter a parse tree produced by MapSParser#loopStatement.
    def enterLoopStatement(self, ctx:MapSParser.LoopStatementContext):
        pass

    # Exit a parse tree produced by MapSParser#loopStatement.
    def exitLoopStatement(self, ctx:MapSParser.LoopStatementContext):
        pass


    # Enter a parse tree produced by MapSParser#expression.
    def enterExpression(self, ctx:MapSParser.ExpressionContext):
        pass

    # Exit a parse tree produced by MapSParser#expression.
    def exitExpression(self, ctx:MapSParser.ExpressionContext):
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


    # Enter a parse tree produced by MapSParser#listExpression.
    def enterListExpression(self, ctx:MapSParser.ListExpressionContext):
        pass

    # Exit a parse tree produced by MapSParser#listExpression.
    def exitListExpression(self, ctx:MapSParser.ListExpressionContext):
        pass


    # Enter a parse tree produced by MapSParser#type.
    def enterType(self, ctx:MapSParser.TypeContext):
        pass

    # Exit a parse tree produced by MapSParser#type.
    def exitType(self, ctx:MapSParser.TypeContext):
        pass


    # Enter a parse tree produced by MapSParser#operator.
    def enterOperator(self, ctx:MapSParser.OperatorContext):
        pass

    # Exit a parse tree produced by MapSParser#operator.
    def exitOperator(self, ctx:MapSParser.OperatorContext):
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


    # Enter a parse tree produced by MapSParser#listAssignment.
    def enterListAssignment(self, ctx:MapSParser.ListAssignmentContext):
        pass

    # Exit a parse tree produced by MapSParser#listAssignment.
    def exitListAssignment(self, ctx:MapSParser.ListAssignmentContext):
        pass



del MapSParser