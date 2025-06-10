// Generated from f:/Studia2Rok/2ROK_KOMPILATORY/kompilatory/python/MapS.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link MapSParser#progStatement}.
	 * @param ctx the parse tree
	 */
	void enterProgStatement(MapSParser.ProgStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#progStatement}.
	 * @param ctx the parse tree
	 */
	void exitProgStatement(MapSParser.ProgStatementContext ctx);
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
	 * Enter a parse tree produced by {@link MapSParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MapSParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MapSParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MapSParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MapSParser.ReturnStatementContext ctx);
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
	 * Enter a parse tree produced by {@link MapSParser#lakeVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLakeVariableDeclaration(MapSParser.LakeVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#lakeVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLakeVariableDeclaration(MapSParser.LakeVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#riverVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRiverVariableDeclaration(MapSParser.RiverVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#riverVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRiverVariableDeclaration(MapSParser.RiverVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapSParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(MapSParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(MapSParser.DirectionContext ctx);
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
	 * Enter a parse tree produced by {@link MapSParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(MapSParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(MapSParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatFixedLoop}
	 * labeled alternative in {@link MapSParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatFixedLoop(MapSParser.RepeatFixedLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatFixedLoop}
	 * labeled alternative in {@link MapSParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatFixedLoop(MapSParser.RepeatFixedLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatRangeLoop}
	 * labeled alternative in {@link MapSParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatRangeLoop(MapSParser.RepeatRangeLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatRangeLoop}
	 * labeled alternative in {@link MapSParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatRangeLoop(MapSParser.RepeatRangeLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link MapSParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(MapSParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link MapSParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(MapSParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listAccessExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListAccessExpr(MapSParser.ListAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listAccessExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListAccessExpr(MapSParser.ListAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDoubleExpr(MapSParser.DoubleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDoubleExpr(MapSParser.DoubleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(MapSParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(MapSParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(MapSParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(MapSParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(MapSParser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(MapSParser.CastExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqrtExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSqrtExpr(MapSParser.SqrtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqrtExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSqrtExpr(MapSParser.SqrtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(MapSParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(MapSParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(MapSParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(MapSParser.FuncCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(MapSParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(MapSParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(MapSParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(MapSParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(MapSParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(MapSParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(MapSParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(MapSParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(MapSParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(MapSParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trygExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrygExpr(MapSParser.TrygExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trygExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrygExpr(MapSParser.TrygExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scopeAccessExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterScopeAccessExpr(MapSParser.ScopeAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scopeAccessExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitScopeAccessExpr(MapSParser.ScopeAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(MapSParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(MapSParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(MapSParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(MapSParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(MapSParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(MapSParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pointAccessExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPointAccessExpr(MapSParser.PointAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pointAccessExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPointAccessExpr(MapSParser.PointAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(MapSParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(MapSParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MapSParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MapSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MapSParser.AndExprContext ctx);
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
	 * Enter a parse tree produced by {@link MapSParser#heightExpression}.
	 * @param ctx the parse tree
	 */
	void enterHeightExpression(MapSParser.HeightExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#heightExpression}.
	 * @param ctx the parse tree
	 */
	void exitHeightExpression(MapSParser.HeightExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link MapSParser#listElementExpression}.
	 * @param ctx the parse tree
	 */
	void enterListElementExpression(MapSParser.ListElementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapSParser#listElementExpression}.
	 * @param ctx the parse tree
	 */
	void exitListElementExpression(MapSParser.ListElementExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code ListAdd}
	 * labeled alternative in {@link MapSParser#listAssignment}.
	 * @param ctx the parse tree
	 */
	void enterListAdd(MapSParser.ListAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListAdd}
	 * labeled alternative in {@link MapSParser#listAssignment}.
	 * @param ctx the parse tree
	 */
	void exitListAdd(MapSParser.ListAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListUpdate}
	 * labeled alternative in {@link MapSParser#listAssignment}.
	 * @param ctx the parse tree
	 */
	void enterListUpdate(MapSParser.ListUpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListUpdate}
	 * labeled alternative in {@link MapSParser#listAssignment}.
	 * @param ctx the parse tree
	 */
	void exitListUpdate(MapSParser.ListUpdateContext ctx);
}