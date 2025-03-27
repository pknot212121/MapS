// Generated from f:/Studia2Rok/2ROK_KOMPILATORY/kompilatory/MapS.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MapSParser}.
 */
public interface MapSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MapSParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MapSParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MapSParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MapSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MapSParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(MapSParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(MapSParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#primitiveVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveVariableDeclaration(MapSParser.PrimitiveVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#primitiveVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveVariableDeclaration(MapSParser.PrimitiveVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#listVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListVariableDeclaration(MapSParser.ListVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#listVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListVariableDeclaration(MapSParser.ListVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#pointVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPointVariableDeclaration(MapSParser.PointVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#pointVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPointVariableDeclaration(MapSParser.PointVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#heightVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterHeightVariableDeclaration(MapSParser.HeightVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#heightVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitHeightVariableDeclaration(MapSParser.HeightVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#landVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLandVariableDeclaration(MapSParser.LandVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#landVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLandVariableDeclaration(MapSParser.LandVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#perimeterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPerimeterDeclaration(MapSParser.PerimeterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#perimeterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPerimeterDeclaration(MapSParser.PerimeterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(MapSParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(MapSParser.ShapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#heightDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterHeightDeclaration(MapSParser.HeightDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#heightDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitHeightDeclaration(MapSParser.HeightDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MapSParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MapSParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MapSParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MapSParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MapSParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MapSParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(MapSParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(MapSParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MapSParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MapSParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MapSParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MapSParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#pointAccess}.
	 * @param ctx the parse tree
	 */
	void enterPointAccess(MapSParser.PointAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#pointAccess}.
	 * @param ctx the parse tree
	 */
	void exitPointAccess(MapSParser.PointAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#listAccess}.
	 * @param ctx the parse tree
	 */
	void enterListAccess(MapSParser.ListAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#listAccess}.
	 * @param ctx the parse tree
	 */
	void exitListAccess(MapSParser.ListAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#pointExpression}.
	 * @param ctx the parse tree
	 */
	void enterPointExpression(MapSParser.PointExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#pointExpression}.
	 * @param ctx the parse tree
	 */
	void exitPointExpression(MapSParser.PointExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void enterListExpression(MapSParser.ListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void exitListExpression(MapSParser.ListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MapSParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MapSParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(MapSParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(MapSParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MapSParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MapSParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(MapSParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(MapSParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#pointFieldAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPointFieldAssignment(MapSParser.PointFieldAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#pointFieldAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPointFieldAssignment(MapSParser.PointFieldAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#listAssignment}.
	 * @param ctx the parse tree
	 */
	void enterListAssignment(MapSParser.ListAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#listAssignment}.
	 * @param ctx the parse tree
	 */
	void exitListAssignment(MapSParser.ListAssignmentContext ctx);
}