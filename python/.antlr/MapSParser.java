// Generated from f:/Studia2Rok/2ROK_KOMPILATORY/kompilatory/python/MapS.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MapSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		AND=53, OR=54, NOT=55, INT=56, DOUBLE=57, STRING=58, BOOLEAN=59, IDENTIFIER=60, 
		WHITESPACE=61, LINE_COMMENT=62, COMMENT=63;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_printStatement = 2, RULE_returnStatement = 3, 
		RULE_variableDeclaration = 4, RULE_primitiveVariableDeclaration = 5, RULE_listVariableDeclaration = 6, 
		RULE_pointVariableDeclaration = 7, RULE_heightVariableDeclaration = 8, 
		RULE_landVariableDeclaration = 9, RULE_perimeterDeclaration = 10, RULE_shape = 11, 
		RULE_heightDeclaration = 12, RULE_lakeVariableDeclaration = 13, RULE_riverVariableDeclaration = 14, 
		RULE_functionDeclaration = 15, RULE_parameters = 16, RULE_ifStatement = 17, 
		RULE_blockStatement = 18, RULE_loopStatement = 19, RULE_expression = 20, 
		RULE_functionCall = 21, RULE_pointAccess = 22, RULE_listAccess = 23, RULE_pointExpression = 24, 
		RULE_heightExpression = 25, RULE_listExpression = 26, RULE_listElementExpression = 27, 
		RULE_type = 28, RULE_assignment = 29, RULE_variableAssignment = 30, RULE_pointFieldAssignment = 31, 
		RULE_listAssignment = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "printStatement", "returnStatement", "variableDeclaration", 
			"primitiveVariableDeclaration", "listVariableDeclaration", "pointVariableDeclaration", 
			"heightVariableDeclaration", "landVariableDeclaration", "perimeterDeclaration", 
			"shape", "heightDeclaration", "lakeVariableDeclaration", "riverVariableDeclaration", 
			"functionDeclaration", "parameters", "ifStatement", "blockStatement", 
			"loopStatement", "expression", "functionCall", "pointAccess", "listAccess", 
			"pointExpression", "heightExpression", "listExpression", "listElementExpression", 
			"type", "assignment", "variableAssignment", "pointFieldAssignment", "listAssignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'print('", "')'", "'return'", "'int'", "'double'", "'bool'", 
			"'string'", "'is'", "'List<'", "'>'", "'Point'", "'('", "','", "'Height'", 
			"'Land'", "'with'", "'perimeter is'", "'Circle('", "'Square('", "'RandomLand('", 
			"'height is'", "'Lake'", "'River'", "'function'", "':'", "'{'", "'}'", 
			"'if'", "'do'", "'eif'", "'else do'", "'repeat'", "'from'", "'to'", "'while'", 
			"'-'", "'^'", "'?'", "'*'", "'/'", "'+'", "'<'", "'>='", "'<='", "'='", 
			"'!='", "'.x'", "'.y'", "'['", "']'", "'.add('", "'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "AND", "OR", "NOT", "INT", "DOUBLE", "STRING", 
			"BOOLEAN", "IDENTIFIER", "WHITESPACE", "LINE_COMMENT", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MapS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MapSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MapSParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814427673015796L) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				blockStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				loopStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				assignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				expression(0);
				setState(81);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				returnStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(84);
				printStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__1);
			setState(88);
			expression(0);
			setState(89);
			match(T__2);
			setState(90);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnStatement);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__3);
				setState(93);
				expression(0);
				setState(94);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(T__3);
				setState(97);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public PrimitiveVariableDeclarationContext primitiveVariableDeclaration() {
			return getRuleContext(PrimitiveVariableDeclarationContext.class,0);
		}
		public ListVariableDeclarationContext listVariableDeclaration() {
			return getRuleContext(ListVariableDeclarationContext.class,0);
		}
		public PointVariableDeclarationContext pointVariableDeclaration() {
			return getRuleContext(PointVariableDeclarationContext.class,0);
		}
		public HeightVariableDeclarationContext heightVariableDeclaration() {
			return getRuleContext(HeightVariableDeclarationContext.class,0);
		}
		public LandVariableDeclarationContext landVariableDeclaration() {
			return getRuleContext(LandVariableDeclarationContext.class,0);
		}
		public LakeVariableDeclarationContext lakeVariableDeclaration() {
			return getRuleContext(LakeVariableDeclarationContext.class,0);
		}
		public RiverVariableDeclarationContext riverVariableDeclaration() {
			return getRuleContext(RiverVariableDeclarationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDeclaration);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				primitiveVariableDeclaration();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				listVariableDeclaration();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				pointVariableDeclaration();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				heightVariableDeclaration();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				landVariableDeclaration();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				lakeVariableDeclaration();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				riverVariableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimitiveVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterPrimitiveVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitPrimitiveVariableDeclaration(this);
		}
	}

	public final PrimitiveVariableDeclarationContext primitiveVariableDeclaration() throws RecognitionException {
		PrimitiveVariableDeclarationContext _localctx = new PrimitiveVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_primitiveVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 480L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(110);
			match(IDENTIFIER);
			setState(111);
			match(T__8);
			setState(112);
			expression(0);
			setState(113);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListVariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public ListVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterListVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitListVariableDeclaration(this);
		}
	}

	public final ListVariableDeclarationContext listVariableDeclaration() throws RecognitionException {
		ListVariableDeclarationContext _localctx = new ListVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__9);
			setState(116);
			type();
			setState(117);
			match(T__10);
			setState(118);
			match(IDENTIFIER);
			setState(119);
			match(T__8);
			setState(120);
			listExpression();
			setState(121);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PointVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterPointVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitPointVariableDeclaration(this);
		}
	}

	public final PointVariableDeclarationContext pointVariableDeclaration() throws RecognitionException {
		PointVariableDeclarationContext _localctx = new PointVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pointVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__11);
			setState(124);
			match(IDENTIFIER);
			setState(125);
			match(T__8);
			setState(126);
			match(T__12);
			setState(127);
			expression(0);
			setState(128);
			match(T__13);
			setState(129);
			expression(0);
			setState(130);
			match(T__2);
			setState(131);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeightVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public PointExpressionContext pointExpression() {
			return getRuleContext(PointExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HeightVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heightVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterHeightVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitHeightVariableDeclaration(this);
		}
	}

	public final HeightVariableDeclarationContext heightVariableDeclaration() throws RecognitionException {
		HeightVariableDeclarationContext _localctx = new HeightVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_heightVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__14);
			setState(134);
			match(IDENTIFIER);
			setState(135);
			match(T__8);
			setState(136);
			match(T__12);
			setState(137);
			pointExpression();
			setState(138);
			match(T__13);
			setState(139);
			expression(0);
			setState(140);
			match(T__13);
			setState(141);
			expression(0);
			setState(142);
			match(T__2);
			setState(143);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LandVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public PerimeterDeclarationContext perimeterDeclaration() {
			return getRuleContext(PerimeterDeclarationContext.class,0);
		}
		public HeightDeclarationContext heightDeclaration() {
			return getRuleContext(HeightDeclarationContext.class,0);
		}
		public PointExpressionContext pointExpression() {
			return getRuleContext(PointExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LandVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_landVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterLandVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitLandVariableDeclaration(this);
		}
	}

	public final LandVariableDeclarationContext landVariableDeclaration() throws RecognitionException {
		LandVariableDeclarationContext _localctx = new LandVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_landVariableDeclaration);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__15);
				setState(146);
				match(IDENTIFIER);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(147);
					match(T__8);
					setState(148);
					pointExpression();
					}
				}

				setState(151);
				match(T__16);
				setState(152);
				perimeterDeclaration();
				setState(153);
				match(T__13);
				setState(154);
				heightDeclaration();
				setState(155);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(T__15);
				setState(158);
				match(IDENTIFIER);
				setState(159);
				match(T__8);
				setState(160);
				expression(0);
				setState(161);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PerimeterDeclarationContext extends ParserRuleContext {
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public PerimeterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perimeterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterPerimeterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitPerimeterDeclaration(this);
		}
	}

	public final PerimeterDeclarationContext perimeterDeclaration() throws RecognitionException {
		PerimeterDeclarationContext _localctx = new PerimeterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_perimeterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__17);
			setState(166);
			shape();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShapeContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitShape(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_shape);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(T__18);
				setState(169);
				expression(0);
				setState(170);
				match(T__2);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(T__19);
				setState(173);
				expression(0);
				setState(174);
				match(T__2);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(T__20);
				setState(177);
				expression(0);
				setState(178);
				match(T__13);
				setState(179);
				expression(0);
				setState(180);
				match(T__2);
				}
				break;
			case T__49:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				listExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeightDeclarationContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public HeightDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heightDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterHeightDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitHeightDeclaration(this);
		}
	}

	public final HeightDeclarationContext heightDeclaration() throws RecognitionException {
		HeightDeclarationContext _localctx = new HeightDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_heightDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__21);
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(186);
				functionCall();
				}
				break;
			case 2:
				{
				setState(187);
				listExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LakeVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public PerimeterDeclarationContext perimeterDeclaration() {
			return getRuleContext(PerimeterDeclarationContext.class,0);
		}
		public PointExpressionContext pointExpression() {
			return getRuleContext(PointExpressionContext.class,0);
		}
		public LakeVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lakeVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterLakeVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitLakeVariableDeclaration(this);
		}
	}

	public final LakeVariableDeclarationContext lakeVariableDeclaration() throws RecognitionException {
		LakeVariableDeclarationContext _localctx = new LakeVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lakeVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__22);
			setState(191);
			match(IDENTIFIER);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(192);
				match(T__8);
				setState(193);
				pointExpression();
				}
			}

			setState(196);
			match(T__16);
			setState(197);
			perimeterDeclaration();
			setState(198);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RiverVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public PointExpressionContext pointExpression() {
			return getRuleContext(PointExpressionContext.class,0);
		}
		public RiverVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_riverVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterRiverVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitRiverVariableDeclaration(this);
		}
	}

	public final RiverVariableDeclarationContext riverVariableDeclaration() throws RecognitionException {
		RiverVariableDeclarationContext _localctx = new RiverVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_riverVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__23);
			setState(201);
			match(IDENTIFIER);
			setState(202);
			match(T__8);
			setState(203);
			pointExpression();
			setState(204);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDeclaration);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__24);
				setState(207);
				match(IDENTIFIER);
				setState(208);
				match(T__12);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38368L) != 0)) {
					{
					setState(209);
					parameters();
					}
				}

				setState(212);
				match(T__2);
				setState(213);
				match(T__25);
				setState(214);
				type();
				setState(215);
				match(T__26);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814427673015796L) != 0)) {
					{
					{
					setState(216);
					statement();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				match(T__27);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(T__24);
				setState(225);
				match(IDENTIFIER);
				setState(226);
				match(T__12);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38368L) != 0)) {
					{
					setState(227);
					parameters();
					}
				}

				setState(230);
				match(T__2);
				setState(231);
				match(T__26);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814427673015796L) != 0)) {
					{
					{
					setState(232);
					statement();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				match(T__27);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MapSParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MapSParser.IDENTIFIER, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			type();
			setState(242);
			match(IDENTIFIER);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(243);
				match(T__13);
				setState(244);
				type();
				setState(245);
				match(IDENTIFIER);
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__28);
			setState(253);
			match(T__12);
			setState(254);
			expression(0);
			setState(255);
			match(T__2);
			setState(256);
			match(T__29);
			setState(257);
			match(T__26);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814427673015796L) != 0)) {
				{
				{
				setState(258);
				statement();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(T__27);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(265);
				match(T__30);
				setState(266);
				match(T__12);
				setState(267);
				expression(0);
				setState(268);
				match(T__2);
				setState(269);
				match(T__29);
				setState(270);
				blockStatement();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(277);
				match(T__31);
				setState(278);
				blockStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__26);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814427673015796L) != 0)) {
				{
				{
				setState(282);
				statement();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopStatementContext extends ParserRuleContext {
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
	 
		public LoopStatementContext() { }
		public void copyFrom(LoopStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepeatFixedLoopContext extends LoopStatementContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RepeatFixedLoopContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterRepeatFixedLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitRepeatFixedLoop(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepeatRangeLoopContext extends LoopStatementContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RepeatRangeLoopContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterRepeatRangeLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitRepeatRangeLoop(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends LoopStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitWhileLoop(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_loopStatement);
		int _la;
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new RepeatFixedLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(T__32);
				setState(291);
				match(T__16);
				setState(292);
				match(IDENTIFIER);
				setState(293);
				expression(0);
				setState(294);
				match(T__26);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814427673015796L) != 0)) {
					{
					{
					setState(295);
					statement();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(301);
				match(T__27);
				}
				break;
			case 2:
				_localctx = new RepeatRangeLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(T__32);
				setState(304);
				match(T__16);
				setState(305);
				match(IDENTIFIER);
				setState(306);
				match(T__33);
				setState(307);
				expression(0);
				setState(308);
				match(T__34);
				setState(309);
				expression(0);
				setState(310);
				match(T__26);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814427673015796L) != 0)) {
					{
					{
					setState(311);
					statement();
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(317);
				match(T__27);
				}
				break;
			case 3:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				match(T__35);
				setState(320);
				match(T__12);
				setState(321);
				expression(0);
				setState(322);
				match(T__2);
				setState(323);
				match(T__29);
				setState(324);
				match(T__26);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814427673015796L) != 0)) {
					{
					{
					setState(325);
					statement();
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(331);
				match(T__27);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListAccessExprContext extends ExpressionContext {
		public ListAccessContext listAccess() {
			return getRuleContext(ListAccessContext.class,0);
		}
		public ListAccessExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterListAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitListAccessExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleExprContext extends ExpressionContext {
		public TerminalNode DOUBLE() { return getToken(MapSParser.DOUBLE, 0); }
		public DoubleExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterDoubleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitDoubleExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(MapSParser.INT, 0); }
		public IntExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitIntExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitAddSubExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SqrtExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SqrtExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterSqrtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitSqrtExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(MapSParser.OR, 0); }
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitOrExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallExprContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterFuncCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitFuncCallExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitParenExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(MapSParser.STRING, 0); }
		public StringExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitStringExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarExprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public VarExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitVarExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(MapSParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitNotExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitUnaryMinusExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExprContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(MapSParser.BOOLEAN, 0); }
		public BoolExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitBoolExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PowExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitPowExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitMulDivExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PointAccessExprContext extends ExpressionContext {
		public PointAccessContext pointAccess() {
			return getRuleContext(PointAccessContext.class,0);
		}
		public PointAccessExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterPointAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitPointAccessExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompareExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitCompareExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MapSParser.AND, 0); }
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitAndExpr(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(336);
				match(T__12);
				setState(337);
				expression(0);
				setState(338);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340);
				match(T__36);
				setState(341);
				expression(17);
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(342);
				match(NOT);
				setState(343);
				expression(11);
				}
				break;
			case 4:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(344);
				functionCall();
				}
				break;
			case 5:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(345);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(346);
				match(DOUBLE);
				}
				break;
			case 7:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				match(BOOLEAN);
				}
				break;
			case 9:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(349);
				match(IDENTIFIER);
				}
				break;
			case 10:
				{
				_localctx = new PointAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(350);
				pointAccess();
				}
				break;
			case 11:
				{
				_localctx = new ListAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351);
				listAccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(375);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(354);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(355);
						match(T__37);
						setState(356);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new SqrtExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(357);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(358);
						match(T__38);
						setState(359);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(360);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(361);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==T__40) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(362);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(363);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(364);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__41) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(365);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new CompareExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(366);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(367);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 272678883690496L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(368);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(369);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(370);
						match(AND);
						setState(371);
						expression(11);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(372);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(373);
						match(OR);
						setState(374);
						expression(10);
						}
						break;
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(IDENTIFIER);
			setState(381);
			match(T__12);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814349633691648L) != 0)) {
				{
				setState(382);
				expression(0);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(383);
					match(T__13);
					setState(384);
					expression(0);
					}
					}
					setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(392);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointAccessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public PointAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterPointAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitPointAccess(this);
		}
	}

	public final PointAccessContext pointAccess() throws RecognitionException {
		PointAccessContext _localctx = new PointAccessContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pointAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(IDENTIFIER);
			setState(395);
			_la = _input.LA(1);
			if ( !(_la==T__47 || _la==T__48) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListAccessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterListAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitListAccess(this);
		}
	}

	public final ListAccessContext listAccess() throws RecognitionException {
		ListAccessContext _localctx = new ListAccessContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_listAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(IDENTIFIER);
			setState(398);
			match(T__49);
			setState(399);
			expression(0);
			setState(400);
			match(T__50);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public PointExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterPointExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitPointExpression(this);
		}
	}

	public final PointExpressionContext pointExpression() throws RecognitionException {
		PointExpressionContext _localctx = new PointExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pointExpression);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(T__12);
				setState(403);
				expression(0);
				setState(404);
				match(T__13);
				setState(405);
				expression(0);
				setState(406);
				match(T__2);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeightExpressionContext extends ParserRuleContext {
		public PointExpressionContext pointExpression() {
			return getRuleContext(PointExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HeightExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heightExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterHeightExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitHeightExpression(this);
		}
	}

	public final HeightExpressionContext heightExpression() throws RecognitionException {
		HeightExpressionContext _localctx = new HeightExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_heightExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(T__12);
			setState(412);
			pointExpression();
			setState(413);
			match(T__13);
			setState(414);
			expression(0);
			setState(415);
			match(T__13);
			setState(416);
			expression(0);
			setState(417);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListExpressionContext extends ParserRuleContext {
		public List<ListElementExpressionContext> listElementExpression() {
			return getRuleContexts(ListElementExpressionContext.class);
		}
		public ListElementExpressionContext listElementExpression(int i) {
			return getRuleContext(ListElementExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public ListExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitListExpression(this);
		}
	}

	public final ListExpressionContext listExpression() throws RecognitionException {
		ListExpressionContext _localctx = new ListExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listExpression);
		int _la;
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(T__49);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814349633691648L) != 0)) {
					{
					setState(420);
					listElementExpression();
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(421);
						match(T__13);
						setState(422);
						listElementExpression();
						}
						}
						setState(427);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(430);
				match(T__50);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListElementExpressionContext extends ParserRuleContext {
		public PointExpressionContext pointExpression() {
			return getRuleContext(PointExpressionContext.class,0);
		}
		public HeightExpressionContext heightExpression() {
			return getRuleContext(HeightExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListElementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterListElementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitListElementExpression(this);
		}
	}

	public final ListElementExpressionContext listElementExpression() throws RecognitionException {
		ListElementExpressionContext _localctx = new ListElementExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listElementExpression);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				pointExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				heightExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_type);
		try {
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				match(T__7);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				match(T__9);
				setState(444);
				type();
				setState(445);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(447);
				match(T__11);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(448);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public PointFieldAssignmentContext pointFieldAssignment() {
			return getRuleContext(PointFieldAssignmentContext.class,0);
		}
		public ListAssignmentContext listAssignment() {
			return getRuleContext(ListAssignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignment);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				variableAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				pointFieldAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				listAssignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitVariableAssignment(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(IDENTIFIER);
			setState(457);
			match(T__8);
			setState(458);
			expression(0);
			setState(459);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointFieldAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PointFieldAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointFieldAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterPointFieldAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitPointFieldAssignment(this);
		}
	}

	public final PointFieldAssignmentContext pointFieldAssignment() throws RecognitionException {
		PointFieldAssignmentContext _localctx = new PointFieldAssignmentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_pointFieldAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(IDENTIFIER);
			setState(462);
			_la = _input.LA(1);
			if ( !(_la==T__47 || _la==T__48) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(463);
			match(T__8);
			setState(464);
			expression(0);
			setState(465);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListAssignmentContext extends ParserRuleContext {
		public ListAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAssignment; }
	 
		public ListAssignmentContext() { }
		public void copyFrom(ListAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListAddContext extends ListAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListAddContext(ListAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterListAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitListAdd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListUpdateContext extends ListAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListUpdateContext(ListAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).enterListUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapSListener ) ((MapSListener)listener).exitListUpdate(this);
		}
	}

	public final ListAssignmentContext listAssignment() throws RecognitionException {
		ListAssignmentContext _localctx = new ListAssignmentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listAssignment);
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new ListAddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(IDENTIFIER);
				setState(468);
				match(T__51);
				setState(469);
				expression(0);
				setState(470);
				match(T__2);
				setState(471);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new ListUpdateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(IDENTIFIER);
				setState(474);
				match(T__49);
				setState(475);
				expression(0);
				setState(476);
				match(T__50);
				setState(477);
				match(T__8);
				setState(478);
				expression(0);
				setState(479);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001?\u01e4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0005\u0000D\b\u0000"+
		"\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001V\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003c\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004l\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0096\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a4"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00b8\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00bd\b\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00c3\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d3\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00da\b\u000f\n\u000f\f\u000f\u00dd\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00e5\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ea\b\u000f\n\u000f\f\u000f"+
		"\u00ed\t\u000f\u0001\u000f\u0003\u000f\u00f0\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00f8"+
		"\b\u0010\n\u0010\f\u0010\u00fb\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0104\b\u0011"+
		"\n\u0011\f\u0011\u0107\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0111"+
		"\b\u0011\n\u0011\f\u0011\u0114\t\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0118\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u011c\b\u0012\n\u0012"+
		"\f\u0012\u011f\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0129\b\u0013"+
		"\n\u0013\f\u0013\u012c\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0139\b\u0013\n\u0013\f\u0013\u013c\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0147\b\u0013\n\u0013"+
		"\f\u0013\u014a\t\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u014e\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0161\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0178\b\u0014"+
		"\n\u0014\f\u0014\u017b\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0182\b\u0015\n\u0015\f\u0015\u0185\t\u0015"+
		"\u0003\u0015\u0187\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u019a\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01a8\b\u001a\n\u001a"+
		"\f\u001a\u01ab\t\u001a\u0003\u001a\u01ad\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u01b1\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u01b6\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u01c2\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01c7\b"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u01e2\b \u0001 \u0000\u0001(!\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@\u0000\u0005\u0001\u0000\u0005\b\u0001\u0000()\u0002"+
		"\u0000%%**\u0002\u0000\u000b\u000b+/\u0001\u000001\u020a\u0000E\u0001"+
		"\u0000\u0000\u0000\u0002U\u0001\u0000\u0000\u0000\u0004W\u0001\u0000\u0000"+
		"\u0000\u0006b\u0001\u0000\u0000\u0000\bk\u0001\u0000\u0000\u0000\nm\u0001"+
		"\u0000\u0000\u0000\fs\u0001\u0000\u0000\u0000\u000e{\u0001\u0000\u0000"+
		"\u0000\u0010\u0085\u0001\u0000\u0000\u0000\u0012\u00a3\u0001\u0000\u0000"+
		"\u0000\u0014\u00a5\u0001\u0000\u0000\u0000\u0016\u00b7\u0001\u0000\u0000"+
		"\u0000\u0018\u00b9\u0001\u0000\u0000\u0000\u001a\u00be\u0001\u0000\u0000"+
		"\u0000\u001c\u00c8\u0001\u0000\u0000\u0000\u001e\u00ef\u0001\u0000\u0000"+
		"\u0000 \u00f1\u0001\u0000\u0000\u0000\"\u00fc\u0001\u0000\u0000\u0000"+
		"$\u0119\u0001\u0000\u0000\u0000&\u014d\u0001\u0000\u0000\u0000(\u0160"+
		"\u0001\u0000\u0000\u0000*\u017c\u0001\u0000\u0000\u0000,\u018a\u0001\u0000"+
		"\u0000\u0000.\u018d\u0001\u0000\u0000\u00000\u0199\u0001\u0000\u0000\u0000"+
		"2\u019b\u0001\u0000\u0000\u00004\u01b0\u0001\u0000\u0000\u00006\u01b5"+
		"\u0001\u0000\u0000\u00008\u01c1\u0001\u0000\u0000\u0000:\u01c6\u0001\u0000"+
		"\u0000\u0000<\u01c8\u0001\u0000\u0000\u0000>\u01cd\u0001\u0000\u0000\u0000"+
		"@\u01e1\u0001\u0000\u0000\u0000BD\u0003\u0002\u0001\u0000CB\u0001\u0000"+
		"\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"HI\u0005\u0000\u0000\u0001I\u0001\u0001\u0000\u0000\u0000JV\u0003\b\u0004"+
		"\u0000KV\u0003\u001e\u000f\u0000LV\u0003\"\u0011\u0000MV\u0003$\u0012"+
		"\u0000NV\u0003&\u0013\u0000OV\u0003:\u001d\u0000PQ\u0003(\u0014\u0000"+
		"QR\u0005\u0001\u0000\u0000RV\u0001\u0000\u0000\u0000SV\u0003\u0006\u0003"+
		"\u0000TV\u0003\u0004\u0002\u0000UJ\u0001\u0000\u0000\u0000UK\u0001\u0000"+
		"\u0000\u0000UL\u0001\u0000\u0000\u0000UM\u0001\u0000\u0000\u0000UN\u0001"+
		"\u0000\u0000\u0000UO\u0001\u0000\u0000\u0000UP\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000V\u0003\u0001\u0000"+
		"\u0000\u0000WX\u0005\u0002\u0000\u0000XY\u0003(\u0014\u0000YZ\u0005\u0003"+
		"\u0000\u0000Z[\u0005\u0001\u0000\u0000[\u0005\u0001\u0000\u0000\u0000"+
		"\\]\u0005\u0004\u0000\u0000]^\u0003(\u0014\u0000^_\u0005\u0001\u0000\u0000"+
		"_c\u0001\u0000\u0000\u0000`a\u0005\u0004\u0000\u0000ac\u0005\u0001\u0000"+
		"\u0000b\\\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000c\u0007\u0001"+
		"\u0000\u0000\u0000dl\u0003\n\u0005\u0000el\u0003\f\u0006\u0000fl\u0003"+
		"\u000e\u0007\u0000gl\u0003\u0010\b\u0000hl\u0003\u0012\t\u0000il\u0003"+
		"\u001a\r\u0000jl\u0003\u001c\u000e\u0000kd\u0001\u0000\u0000\u0000ke\u0001"+
		"\u0000\u0000\u0000kf\u0001\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000"+
		"kh\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000"+
		"\u0000l\t\u0001\u0000\u0000\u0000mn\u0007\u0000\u0000\u0000no\u0005<\u0000"+
		"\u0000op\u0005\t\u0000\u0000pq\u0003(\u0014\u0000qr\u0005\u0001\u0000"+
		"\u0000r\u000b\u0001\u0000\u0000\u0000st\u0005\n\u0000\u0000tu\u00038\u001c"+
		"\u0000uv\u0005\u000b\u0000\u0000vw\u0005<\u0000\u0000wx\u0005\t\u0000"+
		"\u0000xy\u00034\u001a\u0000yz\u0005\u0001\u0000\u0000z\r\u0001\u0000\u0000"+
		"\u0000{|\u0005\f\u0000\u0000|}\u0005<\u0000\u0000}~\u0005\t\u0000\u0000"+
		"~\u007f\u0005\r\u0000\u0000\u007f\u0080\u0003(\u0014\u0000\u0080\u0081"+
		"\u0005\u000e\u0000\u0000\u0081\u0082\u0003(\u0014\u0000\u0082\u0083\u0005"+
		"\u0003\u0000\u0000\u0083\u0084\u0005\u0001\u0000\u0000\u0084\u000f\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\u000f\u0000\u0000\u0086\u0087\u0005"+
		"<\u0000\u0000\u0087\u0088\u0005\t\u0000\u0000\u0088\u0089\u0005\r\u0000"+
		"\u0000\u0089\u008a\u00030\u0018\u0000\u008a\u008b\u0005\u000e\u0000\u0000"+
		"\u008b\u008c\u0003(\u0014\u0000\u008c\u008d\u0005\u000e\u0000\u0000\u008d"+
		"\u008e\u0003(\u0014\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0090"+
		"\u0005\u0001\u0000\u0000\u0090\u0011\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005\u0010\u0000\u0000\u0092\u0095\u0005<\u0000\u0000\u0093\u0094\u0005"+
		"\t\u0000\u0000\u0094\u0096\u00030\u0018\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\u0011\u0000\u0000\u0098\u0099\u0003\u0014"+
		"\n\u0000\u0099\u009a\u0005\u000e\u0000\u0000\u009a\u009b\u0003\u0018\f"+
		"\u0000\u009b\u009c\u0005\u0001\u0000\u0000\u009c\u00a4\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\u0010\u0000\u0000\u009e\u009f\u0005<\u0000\u0000"+
		"\u009f\u00a0\u0005\t\u0000\u0000\u00a0\u00a1\u0003(\u0014\u0000\u00a1"+
		"\u00a2\u0005\u0001\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3"+
		"\u0091\u0001\u0000\u0000\u0000\u00a3\u009d\u0001\u0000\u0000\u0000\u00a4"+
		"\u0013\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0012\u0000\u0000\u00a6"+
		"\u00a7\u0003\u0016\u000b\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0013\u0000\u0000\u00a9\u00aa\u0003(\u0014\u0000\u00aa\u00ab"+
		"\u0005\u0003\u0000\u0000\u00ab\u00b8\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005\u0014\u0000\u0000\u00ad\u00ae\u0003(\u0014\u0000\u00ae\u00af\u0005"+
		"\u0003\u0000\u0000\u00af\u00b8\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005"+
		"\u0015\u0000\u0000\u00b1\u00b2\u0003(\u0014\u0000\u00b2\u00b3\u0005\u000e"+
		"\u0000\u0000\u00b3\u00b4\u0003(\u0014\u0000\u00b4\u00b5\u0005\u0003\u0000"+
		"\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b8\u00034\u001a\u0000"+
		"\u00b7\u00a8\u0001\u0000\u0000\u0000\u00b7\u00ac\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b0\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b8\u0017\u0001\u0000\u0000\u0000\u00b9\u00bc\u0005\u0016\u0000\u0000"+
		"\u00ba\u00bd\u0003*\u0015\u0000\u00bb\u00bd\u00034\u001a\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u0019"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0017\u0000\u0000\u00bf\u00c2"+
		"\u0005<\u0000\u0000\u00c0\u00c1\u0005\t\u0000\u0000\u00c1\u00c3\u0003"+
		"0\u0018\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0011"+
		"\u0000\u0000\u00c5\u00c6\u0003\u0014\n\u0000\u00c6\u00c7\u0005\u0001\u0000"+
		"\u0000\u00c7\u001b\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0018\u0000"+
		"\u0000\u00c9\u00ca\u0005<\u0000\u0000\u00ca\u00cb\u0005\t\u0000\u0000"+
		"\u00cb\u00cc\u00030\u0018\u0000\u00cc\u00cd\u0005\u0001\u0000\u0000\u00cd"+
		"\u001d\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0019\u0000\u0000\u00cf"+
		"\u00d0\u0005<\u0000\u0000\u00d0\u00d2\u0005\r\u0000\u0000\u00d1\u00d3"+
		"\u0003 \u0010\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005"+
		"\u0003\u0000\u0000\u00d5\u00d6\u0005\u001a\u0000\u0000\u00d6\u00d7\u0003"+
		"8\u001c\u0000\u00d7\u00db\u0005\u001b\u0000\u0000\u00d8\u00da\u0003\u0002"+
		"\u0001\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005\u001c\u0000\u0000\u00df\u00f0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0005\u0019\u0000\u0000\u00e1\u00e2\u0005<\u0000"+
		"\u0000\u00e2\u00e4\u0005\r\u0000\u0000\u00e3\u00e5\u0003 \u0010\u0000"+
		"\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0003\u0000\u0000"+
		"\u00e7\u00eb\u0005\u001b\u0000\u0000\u00e8\u00ea\u0003\u0002\u0001\u0000"+
		"\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000"+
		"\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ee\u00f0\u0005\u001c\u0000\u0000\u00ef\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ef\u00e0\u0001\u0000\u0000\u0000\u00f0\u001f\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u00038\u001c\u0000\u00f2\u00f9\u0005<\u0000\u0000\u00f3\u00f4"+
		"\u0005\u000e\u0000\u0000\u00f4\u00f5\u00038\u001c\u0000\u00f5\u00f6\u0005"+
		"<\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa!\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u001d\u0000"+
		"\u0000\u00fd\u00fe\u0005\r\u0000\u0000\u00fe\u00ff\u0003(\u0014\u0000"+
		"\u00ff\u0100\u0005\u0003\u0000\u0000\u0100\u0101\u0005\u001e\u0000\u0000"+
		"\u0101\u0105\u0005\u001b\u0000\u0000\u0102\u0104\u0003\u0002\u0001\u0000"+
		"\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0108\u0112\u0005\u001c\u0000\u0000\u0109\u010a\u0005\u001f\u0000\u0000"+
		"\u010a\u010b\u0005\r\u0000\u0000\u010b\u010c\u0003(\u0014\u0000\u010c"+
		"\u010d\u0005\u0003\u0000\u0000\u010d\u010e\u0005\u001e\u0000\u0000\u010e"+
		"\u010f\u0003$\u0012\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u0109"+
		"\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0117"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0005 \u0000\u0000\u0116\u0118\u0003$\u0012\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118#\u0001\u0000\u0000"+
		"\u0000\u0119\u011d\u0005\u001b\u0000\u0000\u011a\u011c\u0003\u0002\u0001"+
		"\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000"+
		"\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000"+
		"\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0005\u001c\u0000\u0000\u0121%\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0005!\u0000\u0000\u0123\u0124\u0005\u0011\u0000\u0000\u0124"+
		"\u0125\u0005<\u0000\u0000\u0125\u0126\u0003(\u0014\u0000\u0126\u012a\u0005"+
		"\u001b\u0000\u0000\u0127\u0129\u0003\u0002\u0001\u0000\u0128\u0127\u0001"+
		"\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012d\u0001"+
		"\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u012e\u0005"+
		"\u001c\u0000\u0000\u012e\u014e\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		"!\u0000\u0000\u0130\u0131\u0005\u0011\u0000\u0000\u0131\u0132\u0005<\u0000"+
		"\u0000\u0132\u0133\u0005\"\u0000\u0000\u0133\u0134\u0003(\u0014\u0000"+
		"\u0134\u0135\u0005#\u0000\u0000\u0135\u0136\u0003(\u0014\u0000\u0136\u013a"+
		"\u0005\u001b\u0000\u0000\u0137\u0139\u0003\u0002\u0001\u0000\u0138\u0137"+
		"\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013d"+
		"\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0005\u001c\u0000\u0000\u013e\u014e\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005$\u0000\u0000\u0140\u0141\u0005\r\u0000\u0000\u0141\u0142\u0003"+
		"(\u0014\u0000\u0142\u0143\u0005\u0003\u0000\u0000\u0143\u0144\u0005\u001e"+
		"\u0000\u0000\u0144\u0148\u0005\u001b\u0000\u0000\u0145\u0147\u0003\u0002"+
		"\u0001\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000"+
		"\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0005\u001c\u0000\u0000\u014c\u014e\u0001\u0000"+
		"\u0000\u0000\u014d\u0122\u0001\u0000\u0000\u0000\u014d\u012f\u0001\u0000"+
		"\u0000\u0000\u014d\u013f\u0001\u0000\u0000\u0000\u014e\'\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0006\u0014\uffff\uffff\u0000\u0150\u0151\u0005\r\u0000"+
		"\u0000\u0151\u0152\u0003(\u0014\u0000\u0152\u0153\u0005\u0003\u0000\u0000"+
		"\u0153\u0161\u0001\u0000\u0000\u0000\u0154\u0155\u0005%\u0000\u0000\u0155"+
		"\u0161\u0003(\u0014\u0011\u0156\u0157\u00057\u0000\u0000\u0157\u0161\u0003"+
		"(\u0014\u000b\u0158\u0161\u0003*\u0015\u0000\u0159\u0161\u00058\u0000"+
		"\u0000\u015a\u0161\u00059\u0000\u0000\u015b\u0161\u0005:\u0000\u0000\u015c"+
		"\u0161\u0005;\u0000\u0000\u015d\u0161\u0005<\u0000\u0000\u015e\u0161\u0003"+
		",\u0016\u0000\u015f\u0161\u0003.\u0017\u0000\u0160\u014f\u0001\u0000\u0000"+
		"\u0000\u0160\u0154\u0001\u0000\u0000\u0000\u0160\u0156\u0001\u0000\u0000"+
		"\u0000\u0160\u0158\u0001\u0000\u0000\u0000\u0160\u0159\u0001\u0000\u0000"+
		"\u0000\u0160\u015a\u0001\u0000\u0000\u0000\u0160\u015b\u0001\u0000\u0000"+
		"\u0000\u0160\u015c\u0001\u0000\u0000\u0000\u0160\u015d\u0001\u0000\u0000"+
		"\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u015f\u0001\u0000\u0000"+
		"\u0000\u0161\u0179\u0001\u0000\u0000\u0000\u0162\u0163\n\u0010\u0000\u0000"+
		"\u0163\u0164\u0005&\u0000\u0000\u0164\u0178\u0003(\u0014\u0011\u0165\u0166"+
		"\n\u000f\u0000\u0000\u0166\u0167\u0005\'\u0000\u0000\u0167\u0178\u0003"+
		"(\u0014\u0010\u0168\u0169\n\u000e\u0000\u0000\u0169\u016a\u0007\u0001"+
		"\u0000\u0000\u016a\u0178\u0003(\u0014\u000f\u016b\u016c\n\r\u0000\u0000"+
		"\u016c\u016d\u0007\u0002\u0000\u0000\u016d\u0178\u0003(\u0014\u000e\u016e"+
		"\u016f\n\f\u0000\u0000\u016f\u0170\u0007\u0003\u0000\u0000\u0170\u0178"+
		"\u0003(\u0014\r\u0171\u0172\n\n\u0000\u0000\u0172\u0173\u00055\u0000\u0000"+
		"\u0173\u0178\u0003(\u0014\u000b\u0174\u0175\n\t\u0000\u0000\u0175\u0176"+
		"\u00056\u0000\u0000\u0176\u0178\u0003(\u0014\n\u0177\u0162\u0001\u0000"+
		"\u0000\u0000\u0177\u0165\u0001\u0000\u0000\u0000\u0177\u0168\u0001\u0000"+
		"\u0000\u0000\u0177\u016b\u0001\u0000\u0000\u0000\u0177\u016e\u0001\u0000"+
		"\u0000\u0000\u0177\u0171\u0001\u0000\u0000\u0000\u0177\u0174\u0001\u0000"+
		"\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a)\u0001\u0000\u0000"+
		"\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017d\u0005<\u0000\u0000"+
		"\u017d\u0186\u0005\r\u0000\u0000\u017e\u0183\u0003(\u0014\u0000\u017f"+
		"\u0180\u0005\u000e\u0000\u0000\u0180\u0182\u0003(\u0014\u0000\u0181\u017f"+
		"\u0001\u0000\u0000\u0000\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0181"+
		"\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0187"+
		"\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186\u017e"+
		"\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0188"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0005\u0003\u0000\u0000\u0189+\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\u0005<\u0000\u0000\u018b\u018c\u0007\u0004"+
		"\u0000\u0000\u018c-\u0001\u0000\u0000\u0000\u018d\u018e\u0005<\u0000\u0000"+
		"\u018e\u018f\u00052\u0000\u0000\u018f\u0190\u0003(\u0014\u0000\u0190\u0191"+
		"\u00053\u0000\u0000\u0191/\u0001\u0000\u0000\u0000\u0192\u0193\u0005\r"+
		"\u0000\u0000\u0193\u0194\u0003(\u0014\u0000\u0194\u0195\u0005\u000e\u0000"+
		"\u0000\u0195\u0196\u0003(\u0014\u0000\u0196\u0197\u0005\u0003\u0000\u0000"+
		"\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u019a\u0005<\u0000\u0000\u0199"+
		"\u0192\u0001\u0000\u0000\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u019a"+
		"1\u0001\u0000\u0000\u0000\u019b\u019c\u0005\r\u0000\u0000\u019c\u019d"+
		"\u00030\u0018\u0000\u019d\u019e\u0005\u000e\u0000\u0000\u019e\u019f\u0003"+
		"(\u0014\u0000\u019f\u01a0\u0005\u000e\u0000\u0000\u01a0\u01a1\u0003(\u0014"+
		"\u0000\u01a1\u01a2\u0005\u0003\u0000\u0000\u01a23\u0001\u0000\u0000\u0000"+
		"\u01a3\u01ac\u00052\u0000\u0000\u01a4\u01a9\u00036\u001b\u0000\u01a5\u01a6"+
		"\u0005\u000e\u0000\u0000\u01a6\u01a8\u00036\u001b\u0000\u01a7\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01a4\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001"+
		"\u0000\u0000\u0000\u01ae\u01b1\u00053\u0000\u0000\u01af\u01b1\u0005<\u0000"+
		"\u0000\u01b0\u01a3\u0001\u0000\u0000\u0000\u01b0\u01af\u0001\u0000\u0000"+
		"\u0000\u01b15\u0001\u0000\u0000\u0000\u01b2\u01b6\u00030\u0018\u0000\u01b3"+
		"\u01b6\u00032\u0019\u0000\u01b4\u01b6\u0003(\u0014\u0000\u01b5\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b67\u0001\u0000\u0000\u0000\u01b7\u01c2\u0005\u0005"+
		"\u0000\u0000\u01b8\u01c2\u0005\u0006\u0000\u0000\u01b9\u01c2\u0005\u0007"+
		"\u0000\u0000\u01ba\u01c2\u0005\b\u0000\u0000\u01bb\u01bc\u0005\n\u0000"+
		"\u0000\u01bc\u01bd\u00038\u001c\u0000\u01bd\u01be\u0005\u000b\u0000\u0000"+
		"\u01be\u01c2\u0001\u0000\u0000\u0000\u01bf\u01c2\u0005\f\u0000\u0000\u01c0"+
		"\u01c2\u0005\u000f\u0000\u0000\u01c1\u01b7\u0001\u0000\u0000\u0000\u01c1"+
		"\u01b8\u0001\u0000\u0000\u0000\u01c1\u01b9\u0001\u0000\u0000\u0000\u01c1"+
		"\u01ba\u0001\u0000\u0000\u0000\u01c1\u01bb\u0001\u0000\u0000\u0000\u01c1"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2"+
		"9\u0001\u0000\u0000\u0000\u01c3\u01c7\u0003<\u001e\u0000\u01c4\u01c7\u0003"+
		">\u001f\u0000\u01c5\u01c7\u0003@ \u0000\u01c6\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c7;\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005<\u0000\u0000\u01c9"+
		"\u01ca\u0005\t\u0000\u0000\u01ca\u01cb\u0003(\u0014\u0000\u01cb\u01cc"+
		"\u0005\u0001\u0000\u0000\u01cc=\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005"+
		"<\u0000\u0000\u01ce\u01cf\u0007\u0004\u0000\u0000\u01cf\u01d0\u0005\t"+
		"\u0000\u0000\u01d0\u01d1\u0003(\u0014\u0000\u01d1\u01d2\u0005\u0001\u0000"+
		"\u0000\u01d2?\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005<\u0000\u0000\u01d4"+
		"\u01d5\u00054\u0000\u0000\u01d5\u01d6\u0003(\u0014\u0000\u01d6\u01d7\u0005"+
		"\u0003\u0000\u0000\u01d7\u01d8\u0005\u0001\u0000\u0000\u01d8\u01e2\u0001"+
		"\u0000\u0000\u0000\u01d9\u01da\u0005<\u0000\u0000\u01da\u01db\u00052\u0000"+
		"\u0000\u01db\u01dc\u0003(\u0014\u0000\u01dc\u01dd\u00053\u0000\u0000\u01dd"+
		"\u01de\u0005\t\u0000\u0000\u01de\u01df\u0003(\u0014\u0000\u01df\u01e0"+
		"\u0005\u0001\u0000\u0000\u01e0\u01e2\u0001\u0000\u0000\u0000\u01e1\u01d3"+
		"\u0001\u0000\u0000\u0000\u01e1\u01d9\u0001\u0000\u0000\u0000\u01e2A\u0001"+
		"\u0000\u0000\u0000$EUbk\u0095\u00a3\u00b7\u00bc\u00c2\u00d2\u00db\u00e4"+
		"\u00eb\u00ef\u00f9\u0105\u0112\u0117\u011d\u012a\u013a\u0148\u014d\u0160"+
		"\u0177\u0179\u0183\u0186\u0199\u01a9\u01ac\u01b0\u01b5\u01c1\u01c6\u01e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}