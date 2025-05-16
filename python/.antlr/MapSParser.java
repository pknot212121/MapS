// Generated from d:/MapS/python/MapS.g4 by ANTLR 4.13.1
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
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__3);
			setState(93);
			expression(0);
			setState(94);
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
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDeclaration);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				primitiveVariableDeclaration();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				listVariableDeclaration();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				pointVariableDeclaration();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				heightVariableDeclaration();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				landVariableDeclaration();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				lakeVariableDeclaration();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
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
	}

	public final PrimitiveVariableDeclarationContext primitiveVariableDeclaration() throws RecognitionException {
		PrimitiveVariableDeclarationContext _localctx = new PrimitiveVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_primitiveVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 480L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
			match(IDENTIFIER);
			setState(107);
			match(T__8);
			setState(108);
			expression(0);
			setState(109);
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
	}

	public final ListVariableDeclarationContext listVariableDeclaration() throws RecognitionException {
		ListVariableDeclarationContext _localctx = new ListVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__9);
			setState(112);
			type();
			setState(113);
			match(T__10);
			setState(114);
			match(IDENTIFIER);
			setState(115);
			match(T__8);
			setState(116);
			listExpression();
			setState(117);
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
	}

	public final PointVariableDeclarationContext pointVariableDeclaration() throws RecognitionException {
		PointVariableDeclarationContext _localctx = new PointVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pointVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__11);
			setState(120);
			match(IDENTIFIER);
			setState(121);
			match(T__8);
			setState(122);
			match(T__12);
			setState(123);
			expression(0);
			setState(124);
			match(T__13);
			setState(125);
			expression(0);
			setState(126);
			match(T__2);
			setState(127);
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
	}

	public final HeightVariableDeclarationContext heightVariableDeclaration() throws RecognitionException {
		HeightVariableDeclarationContext _localctx = new HeightVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_heightVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__14);
			setState(130);
			match(IDENTIFIER);
			setState(131);
			match(T__8);
			setState(132);
			match(T__12);
			setState(133);
			pointExpression();
			setState(134);
			match(T__13);
			setState(135);
			expression(0);
			setState(136);
			match(T__13);
			setState(137);
			expression(0);
			setState(138);
			match(T__2);
			setState(139);
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
	}

	public final LandVariableDeclarationContext landVariableDeclaration() throws RecognitionException {
		LandVariableDeclarationContext _localctx = new LandVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_landVariableDeclaration);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__15);
				setState(142);
				match(IDENTIFIER);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(143);
					match(T__8);
					setState(144);
					pointExpression();
					}
				}

				setState(147);
				match(T__16);
				setState(148);
				perimeterDeclaration();
				setState(149);
				match(T__13);
				setState(150);
				heightDeclaration();
				setState(151);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__15);
				setState(154);
				match(IDENTIFIER);
				setState(155);
				match(T__8);
				setState(156);
				expression(0);
				setState(157);
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
	}

	public final PerimeterDeclarationContext perimeterDeclaration() throws RecognitionException {
		PerimeterDeclarationContext _localctx = new PerimeterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_perimeterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__17);
			setState(162);
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
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_shape);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(T__18);
				setState(165);
				expression(0);
				setState(166);
				match(T__2);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(T__19);
				setState(169);
				expression(0);
				setState(170);
				match(T__2);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(T__20);
				setState(173);
				expression(0);
				setState(174);
				match(T__13);
				setState(175);
				expression(0);
				setState(176);
				match(T__2);
				}
				break;
			case T__49:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
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
	}

	public final HeightDeclarationContext heightDeclaration() throws RecognitionException {
		HeightDeclarationContext _localctx = new HeightDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_heightDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__21);
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(182);
				functionCall();
				}
				break;
			case 2:
				{
				setState(183);
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
	}

	public final LakeVariableDeclarationContext lakeVariableDeclaration() throws RecognitionException {
		LakeVariableDeclarationContext _localctx = new LakeVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lakeVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__22);
			setState(187);
			match(IDENTIFIER);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(188);
				match(T__8);
				setState(189);
				pointExpression();
				}
			}

			setState(192);
			match(T__16);
			setState(193);
			perimeterDeclaration();
			setState(194);
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
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public RiverVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_riverVariableDeclaration; }
	}

	public final RiverVariableDeclarationContext riverVariableDeclaration() throws RecognitionException {
		RiverVariableDeclarationContext _localctx = new RiverVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_riverVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__23);
			setState(197);
			match(IDENTIFIER);
			setState(198);
			match(T__8);
			setState(199);
			listExpression();
			setState(200);
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
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDeclaration);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(T__24);
				setState(203);
				match(IDENTIFIER);
				setState(204);
				match(T__12);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38368L) != 0)) {
					{
					setState(205);
					parameters();
					}
				}

				setState(208);
				match(T__2);
				setState(209);
				match(T__25);
				setState(210);
				type();
				setState(211);
				match(T__26);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814427673015796L) != 0)) {
					{
					{
					setState(212);
					statement();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218);
				match(T__27);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(T__24);
				setState(221);
				match(IDENTIFIER);
				setState(222);
				match(T__12);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38368L) != 0)) {
					{
					setState(223);
					parameters();
					}
				}

				setState(226);
				match(T__2);
				setState(227);
				match(T__26);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814427673015796L) != 0)) {
					{
					{
					setState(228);
					statement();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
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
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			type();
			setState(238);
			match(IDENTIFIER);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(239);
				match(T__13);
				setState(240);
				type();
				setState(241);
				match(IDENTIFIER);
				}
				}
				setState(247);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__28);
			setState(249);
			match(T__12);
			setState(250);
			expression(0);
			setState(251);
			match(T__2);
			setState(252);
			match(T__29);
			setState(253);
			match(T__26);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814427673015796L) != 0)) {
				{
				{
				setState(254);
				statement();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(T__27);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(261);
				match(T__30);
				setState(262);
				match(T__12);
				setState(263);
				expression(0);
				setState(264);
				match(T__2);
				setState(265);
				match(T__29);
				setState(266);
				blockStatement();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(273);
				match(T__31);
				setState(274);
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
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__26);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814427673015796L) != 0)) {
				{
				{
				setState(278);
				statement();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
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
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_loopStatement);
		int _la;
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new RepeatFixedLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(T__32);
				setState(287);
				match(T__16);
				setState(288);
				match(IDENTIFIER);
				setState(289);
				expression(0);
				setState(290);
				match(T__26);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814427673015796L) != 0)) {
					{
					{
					setState(291);
					statement();
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(297);
				match(T__27);
				}
				break;
			case 2:
				_localctx = new RepeatRangeLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(T__32);
				setState(300);
				match(T__16);
				setState(301);
				match(IDENTIFIER);
				setState(302);
				match(T__33);
				setState(303);
				expression(0);
				setState(304);
				match(T__34);
				setState(305);
				expression(0);
				setState(306);
				match(T__26);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814427673015796L) != 0)) {
					{
					{
					setState(307);
					statement();
					}
					}
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(313);
				match(T__27);
				}
				break;
			case 3:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(T__35);
				setState(316);
				match(T__12);
				setState(317);
				expression(0);
				setState(318);
				match(T__2);
				setState(319);
				match(T__29);
				setState(320);
				match(T__26);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814427673015796L) != 0)) {
					{
					{
					setState(321);
					statement();
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(327);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleExprContext extends ExpressionContext {
		public TerminalNode DOUBLE() { return getToken(MapSParser.DOUBLE, 0); }
		public DoubleExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(MapSParser.INT, 0); }
		public IntExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallExprContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(MapSParser.STRING, 0); }
		public StringExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarExprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public VarExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(MapSParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExprContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(MapSParser.BOOLEAN, 0); }
		public BoolExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PointAccessExprContext extends ExpressionContext {
		public PointAccessContext pointAccess() {
			return getRuleContext(PointAccessContext.class,0);
		}
		public PointAccessExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(332);
				match(T__12);
				setState(333);
				expression(0);
				setState(334);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				match(T__36);
				setState(337);
				expression(17);
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				match(NOT);
				setState(339);
				expression(11);
				}
				break;
			case 4:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340);
				functionCall();
				}
				break;
			case 5:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(342);
				match(DOUBLE);
				}
				break;
			case 7:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(343);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(344);
				match(BOOLEAN);
				}
				break;
			case 9:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(345);
				match(IDENTIFIER);
				}
				break;
			case 10:
				{
				_localctx = new PointAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(346);
				pointAccess();
				}
				break;
			case 11:
				{
				_localctx = new ListAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347);
				listAccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(350);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(351);
						match(T__37);
						setState(352);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new SqrtExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(353);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(354);
						match(T__38);
						setState(355);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(356);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(357);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==T__40) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(358);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(359);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(360);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__41) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(361);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new CompareExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(362);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(363);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 272678883690496L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(364);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(365);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(366);
						match(AND);
						setState(367);
						expression(11);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(368);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(369);
						match(OR);
						setState(370);
						expression(10);
						}
						break;
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(IDENTIFIER);
			setState(377);
			match(T__12);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814349633691648L) != 0)) {
				{
				setState(378);
				expression(0);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(379);
					match(T__13);
					setState(380);
					expression(0);
					}
					}
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(388);
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
	}

	public final PointAccessContext pointAccess() throws RecognitionException {
		PointAccessContext _localctx = new PointAccessContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pointAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(IDENTIFIER);
			setState(391);
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
	}

	public final ListAccessContext listAccess() throws RecognitionException {
		ListAccessContext _localctx = new ListAccessContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_listAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(IDENTIFIER);
			setState(394);
			match(T__49);
			setState(395);
			expression(0);
			setState(396);
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
	}

	public final PointExpressionContext pointExpression() throws RecognitionException {
		PointExpressionContext _localctx = new PointExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pointExpression);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(T__12);
				setState(399);
				expression(0);
				setState(400);
				match(T__13);
				setState(401);
				expression(0);
				setState(402);
				match(T__2);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
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
	}

	public final HeightExpressionContext heightExpression() throws RecognitionException {
		HeightExpressionContext _localctx = new HeightExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_heightExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(T__12);
			setState(408);
			pointExpression();
			setState(409);
			match(T__13);
			setState(410);
			expression(0);
			setState(411);
			match(T__13);
			setState(412);
			expression(0);
			setState(413);
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
	}

	public final ListExpressionContext listExpression() throws RecognitionException {
		ListExpressionContext _localctx = new ListExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listExpression);
		int _la;
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(T__49);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814349633691648L) != 0)) {
					{
					setState(416);
					listElementExpression();
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(417);
						match(T__13);
						setState(418);
						listElementExpression();
						}
						}
						setState(423);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(426);
				match(T__50);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
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
	}

	public final ListElementExpressionContext listElementExpression() throws RecognitionException {
		ListElementExpressionContext _localctx = new ListElementExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listElementExpression);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				pointExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				heightExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_type);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				match(T__7);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(439);
				match(T__9);
				setState(440);
				type();
				setState(441);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(443);
				match(T__11);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(444);
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignment);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				variableAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				pointFieldAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
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
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(IDENTIFIER);
			setState(453);
			match(T__8);
			setState(454);
			expression(0);
			setState(455);
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
	}

	public final PointFieldAssignmentContext pointFieldAssignment() throws RecognitionException {
		PointFieldAssignmentContext _localctx = new PointFieldAssignmentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_pointFieldAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(IDENTIFIER);
			setState(458);
			_la = _input.LA(1);
			if ( !(_la==T__47 || _la==T__48) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(459);
			match(T__8);
			setState(460);
			expression(0);
			setState(461);
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
	}

	public final ListAssignmentContext listAssignment() throws RecognitionException {
		ListAssignmentContext _localctx = new ListAssignmentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listAssignment);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new ListAddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(IDENTIFIER);
				setState(464);
				match(T__51);
				setState(465);
				expression(0);
				setState(466);
				match(T__2);
				setState(467);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new ListUpdateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(IDENTIFIER);
				setState(470);
				match(T__49);
				setState(471);
				expression(0);
				setState(472);
				match(T__50);
				setState(473);
				match(T__8);
				setState(474);
				expression(0);
				setState(475);
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
		"\u0004\u0001?\u01e0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0092\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00a0\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00b4\b\u000b\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00b9\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00bf\b\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00cf\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00d6\b\u000f\n\u000f\f\u000f\u00d9\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00e1\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e6"+
		"\b\u000f\n\u000f\f\u000f\u00e9\t\u000f\u0001\u000f\u0003\u000f\u00ec\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00f4\b\u0010\n\u0010\f\u0010\u00f7\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u0100\b\u0011\n\u0011\f\u0011\u0103\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u010d\b\u0011\n\u0011\f\u0011\u0110\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0114\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u0118\b\u0012\n\u0012\f\u0012\u011b\t\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u0125\b\u0013\n\u0013\f\u0013\u0128\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0135\b\u0013\n\u0013"+
		"\f\u0013\u0138\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u0143\b\u0013\n\u0013\f\u0013\u0146\t\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u014a\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u015d\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0174\b\u0014\n\u0014\f\u0014\u0177\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u017e\b\u0015\n\u0015"+
		"\f\u0015\u0181\t\u0015\u0003\u0015\u0183\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0196\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u01a4\b\u001a\n\u001a\f\u001a\u01a7\t\u001a\u0003\u001a\u01a9\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u01ad\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u01b2\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01be\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01c3\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01de\b \u0001 \u0000\u0001"+
		"(!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@\u0000\u0005\u0001\u0000\u0005\b\u0001\u0000"+
		"()\u0002\u0000%%**\u0002\u0000\u000b\u000b+/\u0001\u000001\u0205\u0000"+
		"E\u0001\u0000\u0000\u0000\u0002U\u0001\u0000\u0000\u0000\u0004W\u0001"+
		"\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000\u0000\bg\u0001\u0000\u0000"+
		"\u0000\ni\u0001\u0000\u0000\u0000\fo\u0001\u0000\u0000\u0000\u000ew\u0001"+
		"\u0000\u0000\u0000\u0010\u0081\u0001\u0000\u0000\u0000\u0012\u009f\u0001"+
		"\u0000\u0000\u0000\u0014\u00a1\u0001\u0000\u0000\u0000\u0016\u00b3\u0001"+
		"\u0000\u0000\u0000\u0018\u00b5\u0001\u0000\u0000\u0000\u001a\u00ba\u0001"+
		"\u0000\u0000\u0000\u001c\u00c4\u0001\u0000\u0000\u0000\u001e\u00eb\u0001"+
		"\u0000\u0000\u0000 \u00ed\u0001\u0000\u0000\u0000\"\u00f8\u0001\u0000"+
		"\u0000\u0000$\u0115\u0001\u0000\u0000\u0000&\u0149\u0001\u0000\u0000\u0000"+
		"(\u015c\u0001\u0000\u0000\u0000*\u0178\u0001\u0000\u0000\u0000,\u0186"+
		"\u0001\u0000\u0000\u0000.\u0189\u0001\u0000\u0000\u00000\u0195\u0001\u0000"+
		"\u0000\u00002\u0197\u0001\u0000\u0000\u00004\u01ac\u0001\u0000\u0000\u0000"+
		"6\u01b1\u0001\u0000\u0000\u00008\u01bd\u0001\u0000\u0000\u0000:\u01c2"+
		"\u0001\u0000\u0000\u0000<\u01c4\u0001\u0000\u0000\u0000>\u01c9\u0001\u0000"+
		"\u0000\u0000@\u01dd\u0001\u0000\u0000\u0000BD\u0003\u0002\u0001\u0000"+
		"CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000HI\u0005\u0000\u0000\u0001I\u0001\u0001\u0000\u0000\u0000"+
		"JV\u0003\b\u0004\u0000KV\u0003\u001e\u000f\u0000LV\u0003\"\u0011\u0000"+
		"MV\u0003$\u0012\u0000NV\u0003&\u0013\u0000OV\u0003:\u001d\u0000PQ\u0003"+
		"(\u0014\u0000QR\u0005\u0001\u0000\u0000RV\u0001\u0000\u0000\u0000SV\u0003"+
		"\u0006\u0003\u0000TV\u0003\u0004\u0002\u0000UJ\u0001\u0000\u0000\u0000"+
		"UK\u0001\u0000\u0000\u0000UL\u0001\u0000\u0000\u0000UM\u0001\u0000\u0000"+
		"\u0000UN\u0001\u0000\u0000\u0000UO\u0001\u0000\u0000\u0000UP\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000V\u0003"+
		"\u0001\u0000\u0000\u0000WX\u0005\u0002\u0000\u0000XY\u0003(\u0014\u0000"+
		"YZ\u0005\u0003\u0000\u0000Z[\u0005\u0001\u0000\u0000[\u0005\u0001\u0000"+
		"\u0000\u0000\\]\u0005\u0004\u0000\u0000]^\u0003(\u0014\u0000^_\u0005\u0001"+
		"\u0000\u0000_\u0007\u0001\u0000\u0000\u0000`h\u0003\n\u0005\u0000ah\u0003"+
		"\f\u0006\u0000bh\u0003\u000e\u0007\u0000ch\u0003\u0010\b\u0000dh\u0003"+
		"\u0012\t\u0000eh\u0003\u001a\r\u0000fh\u0003\u001c\u000e\u0000g`\u0001"+
		"\u0000\u0000\u0000ga\u0001\u0000\u0000\u0000gb\u0001\u0000\u0000\u0000"+
		"gc\u0001\u0000\u0000\u0000gd\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gf\u0001\u0000\u0000\u0000h\t\u0001\u0000\u0000\u0000ij\u0007\u0000"+
		"\u0000\u0000jk\u0005<\u0000\u0000kl\u0005\t\u0000\u0000lm\u0003(\u0014"+
		"\u0000mn\u0005\u0001\u0000\u0000n\u000b\u0001\u0000\u0000\u0000op\u0005"+
		"\n\u0000\u0000pq\u00038\u001c\u0000qr\u0005\u000b\u0000\u0000rs\u0005"+
		"<\u0000\u0000st\u0005\t\u0000\u0000tu\u00034\u001a\u0000uv\u0005\u0001"+
		"\u0000\u0000v\r\u0001\u0000\u0000\u0000wx\u0005\f\u0000\u0000xy\u0005"+
		"<\u0000\u0000yz\u0005\t\u0000\u0000z{\u0005\r\u0000\u0000{|\u0003(\u0014"+
		"\u0000|}\u0005\u000e\u0000\u0000}~\u0003(\u0014\u0000~\u007f\u0005\u0003"+
		"\u0000\u0000\u007f\u0080\u0005\u0001\u0000\u0000\u0080\u000f\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005\u000f\u0000\u0000\u0082\u0083\u0005<\u0000"+
		"\u0000\u0083\u0084\u0005\t\u0000\u0000\u0084\u0085\u0005\r\u0000\u0000"+
		"\u0085\u0086\u00030\u0018\u0000\u0086\u0087\u0005\u000e\u0000\u0000\u0087"+
		"\u0088\u0003(\u0014\u0000\u0088\u0089\u0005\u000e\u0000\u0000\u0089\u008a"+
		"\u0003(\u0014\u0000\u008a\u008b\u0005\u0003\u0000\u0000\u008b\u008c\u0005"+
		"\u0001\u0000\u0000\u008c\u0011\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"\u0010\u0000\u0000\u008e\u0091\u0005<\u0000\u0000\u008f\u0090\u0005\t"+
		"\u0000\u0000\u0090\u0092\u00030\u0018\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005\u0011\u0000\u0000\u0094\u0095\u0003\u0014\n\u0000"+
		"\u0095\u0096\u0005\u000e\u0000\u0000\u0096\u0097\u0003\u0018\f\u0000\u0097"+
		"\u0098\u0005\u0001\u0000\u0000\u0098\u00a0\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005\u0010\u0000\u0000\u009a\u009b\u0005<\u0000\u0000\u009b\u009c"+
		"\u0005\t\u0000\u0000\u009c\u009d\u0003(\u0014\u0000\u009d\u009e\u0005"+
		"\u0001\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u008d\u0001"+
		"\u0000\u0000\u0000\u009f\u0099\u0001\u0000\u0000\u0000\u00a0\u0013\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005\u0012\u0000\u0000\u00a2\u00a3\u0003"+
		"\u0016\u000b\u0000\u00a3\u0015\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005"+
		"\u0013\u0000\u0000\u00a5\u00a6\u0003(\u0014\u0000\u00a6\u00a7\u0005\u0003"+
		"\u0000\u0000\u00a7\u00b4\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0014"+
		"\u0000\u0000\u00a9\u00aa\u0003(\u0014\u0000\u00aa\u00ab\u0005\u0003\u0000"+
		"\u0000\u00ab\u00b4\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0015\u0000"+
		"\u0000\u00ad\u00ae\u0003(\u0014\u0000\u00ae\u00af\u0005\u000e\u0000\u0000"+
		"\u00af\u00b0\u0003(\u0014\u0000\u00b0\u00b1\u0005\u0003\u0000\u0000\u00b1"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b4\u00034\u001a\u0000\u00b3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00b3\u00a8\u0001\u0000\u0000\u0000\u00b3\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u0017"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b8\u0005\u0016\u0000\u0000\u00b6\u00b9"+
		"\u0003*\u0015\u0000\u00b7\u00b9\u00034\u001a\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u0019\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\u0017\u0000\u0000\u00bb\u00be\u0005<\u0000"+
		"\u0000\u00bc\u00bd\u0005\t\u0000\u0000\u00bd\u00bf\u00030\u0018\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0011\u0000\u0000"+
		"\u00c1\u00c2\u0003\u0014\n\u0000\u00c2\u00c3\u0005\u0001\u0000\u0000\u00c3"+
		"\u001b\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0018\u0000\u0000\u00c5"+
		"\u00c6\u0005<\u0000\u0000\u00c6\u00c7\u0005\t\u0000\u0000\u00c7\u00c8"+
		"\u00034\u001a\u0000\u00c8\u00c9\u0005\u0001\u0000\u0000\u00c9\u001d\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0005\u0019\u0000\u0000\u00cb\u00cc\u0005"+
		"<\u0000\u0000\u00cc\u00ce\u0005\r\u0000\u0000\u00cd\u00cf\u0003 \u0010"+
		"\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0003\u0000"+
		"\u0000\u00d1\u00d2\u0005\u001a\u0000\u0000\u00d2\u00d3\u00038\u001c\u0000"+
		"\u00d3\u00d7\u0005\u001b\u0000\u0000\u00d4\u00d6\u0003\u0002\u0001\u0000"+
		"\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0005\u001c\u0000\u0000\u00db\u00ec\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0005\u0019\u0000\u0000\u00dd\u00de\u0005<\u0000\u0000\u00de"+
		"\u00e0\u0005\r\u0000\u0000\u00df\u00e1\u0003 \u0010\u0000\u00e0\u00df"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0003\u0000\u0000\u00e3\u00e7"+
		"\u0005\u001b\u0000\u0000\u00e4\u00e6\u0003\u0002\u0001\u0000\u00e5\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ec"+
		"\u0005\u001c\u0000\u0000\u00eb\u00ca\u0001\u0000\u0000\u0000\u00eb\u00dc"+
		"\u0001\u0000\u0000\u0000\u00ec\u001f\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u00038\u001c\u0000\u00ee\u00f5\u0005<\u0000\u0000\u00ef\u00f0\u0005\u000e"+
		"\u0000\u0000\u00f0\u00f1\u00038\u001c\u0000\u00f1\u00f2\u0005<\u0000\u0000"+
		"\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6!\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u001d\u0000\u0000\u00f9"+
		"\u00fa\u0005\r\u0000\u0000\u00fa\u00fb\u0003(\u0014\u0000\u00fb\u00fc"+
		"\u0005\u0003\u0000\u0000\u00fc\u00fd\u0005\u001e\u0000\u0000\u00fd\u0101"+
		"\u0005\u001b\u0000\u0000\u00fe\u0100\u0003\u0002\u0001\u0000\u00ff\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104"+
		"\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u010e"+
		"\u0005\u001c\u0000\u0000\u0105\u0106\u0005\u001f\u0000\u0000\u0106\u0107"+
		"\u0005\r\u0000\u0000\u0107\u0108\u0003(\u0014\u0000\u0108\u0109\u0005"+
		"\u0003\u0000\u0000\u0109\u010a\u0005\u001e\u0000\u0000\u010a\u010b\u0003"+
		"$\u0012\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u0105\u0001\u0000"+
		"\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0113\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0112\u0005 \u0000"+
		"\u0000\u0112\u0114\u0003$\u0012\u0000\u0113\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114#\u0001\u0000\u0000\u0000\u0115"+
		"\u0119\u0005\u001b\u0000\u0000\u0116\u0118\u0003\u0002\u0001\u0000\u0117"+
		"\u0116\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119"+
		"\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"\u011c\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005\u001c\u0000\u0000\u011d%\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0005!\u0000\u0000\u011f\u0120\u0005\u0011\u0000\u0000\u0120\u0121\u0005"+
		"<\u0000\u0000\u0121\u0122\u0003(\u0014\u0000\u0122\u0126\u0005\u001b\u0000"+
		"\u0000\u0123\u0125\u0003\u0002\u0001\u0000\u0124\u0123\u0001\u0000\u0000"+
		"\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000\u0000"+
		"\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u001c\u0000"+
		"\u0000\u012a\u014a\u0001\u0000\u0000\u0000\u012b\u012c\u0005!\u0000\u0000"+
		"\u012c\u012d\u0005\u0011\u0000\u0000\u012d\u012e\u0005<\u0000\u0000\u012e"+
		"\u012f\u0005\"\u0000\u0000\u012f\u0130\u0003(\u0014\u0000\u0130\u0131"+
		"\u0005#\u0000\u0000\u0131\u0132\u0003(\u0014\u0000\u0132\u0136\u0005\u001b"+
		"\u0000\u0000\u0133\u0135\u0003\u0002\u0001\u0000\u0134\u0133\u0001\u0000"+
		"\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000"+
		"\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013a\u0005\u001c"+
		"\u0000\u0000\u013a\u014a\u0001\u0000\u0000\u0000\u013b\u013c\u0005$\u0000"+
		"\u0000\u013c\u013d\u0005\r\u0000\u0000\u013d\u013e\u0003(\u0014\u0000"+
		"\u013e\u013f\u0005\u0003\u0000\u0000\u013f\u0140\u0005\u001e\u0000\u0000"+
		"\u0140\u0144\u0005\u001b\u0000\u0000\u0141\u0143\u0003\u0002\u0001\u0000"+
		"\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000"+
		"\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"+
		"\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0005\u001c\u0000\u0000\u0148\u014a\u0001\u0000\u0000\u0000"+
		"\u0149\u011e\u0001\u0000\u0000\u0000\u0149\u012b\u0001\u0000\u0000\u0000"+
		"\u0149\u013b\u0001\u0000\u0000\u0000\u014a\'\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0006\u0014\uffff\uffff\u0000\u014c\u014d\u0005\r\u0000\u0000\u014d"+
		"\u014e\u0003(\u0014\u0000\u014e\u014f\u0005\u0003\u0000\u0000\u014f\u015d"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0005%\u0000\u0000\u0151\u015d\u0003"+
		"(\u0014\u0011\u0152\u0153\u00057\u0000\u0000\u0153\u015d\u0003(\u0014"+
		"\u000b\u0154\u015d\u0003*\u0015\u0000\u0155\u015d\u00058\u0000\u0000\u0156"+
		"\u015d\u00059\u0000\u0000\u0157\u015d\u0005:\u0000\u0000\u0158\u015d\u0005"+
		";\u0000\u0000\u0159\u015d\u0005<\u0000\u0000\u015a\u015d\u0003,\u0016"+
		"\u0000\u015b\u015d\u0003.\u0017\u0000\u015c\u014b\u0001\u0000\u0000\u0000"+
		"\u015c\u0150\u0001\u0000\u0000\u0000\u015c\u0152\u0001\u0000\u0000\u0000"+
		"\u015c\u0154\u0001\u0000\u0000\u0000\u015c\u0155\u0001\u0000\u0000\u0000"+
		"\u015c\u0156\u0001\u0000\u0000\u0000\u015c\u0157\u0001\u0000\u0000\u0000"+
		"\u015c\u0158\u0001\u0000\u0000\u0000\u015c\u0159\u0001\u0000\u0000\u0000"+
		"\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015b\u0001\u0000\u0000\u0000"+
		"\u015d\u0175\u0001\u0000\u0000\u0000\u015e\u015f\n\u0010\u0000\u0000\u015f"+
		"\u0160\u0005&\u0000\u0000\u0160\u0174\u0003(\u0014\u0011\u0161\u0162\n"+
		"\u000f\u0000\u0000\u0162\u0163\u0005\'\u0000\u0000\u0163\u0174\u0003("+
		"\u0014\u0010\u0164\u0165\n\u000e\u0000\u0000\u0165\u0166\u0007\u0001\u0000"+
		"\u0000\u0166\u0174\u0003(\u0014\u000f\u0167\u0168\n\r\u0000\u0000\u0168"+
		"\u0169\u0007\u0002\u0000\u0000\u0169\u0174\u0003(\u0014\u000e\u016a\u016b"+
		"\n\f\u0000\u0000\u016b\u016c\u0007\u0003\u0000\u0000\u016c\u0174\u0003"+
		"(\u0014\r\u016d\u016e\n\n\u0000\u0000\u016e\u016f\u00055\u0000\u0000\u016f"+
		"\u0174\u0003(\u0014\u000b\u0170\u0171\n\t\u0000\u0000\u0171\u0172\u0005"+
		"6\u0000\u0000\u0172\u0174\u0003(\u0014\n\u0173\u015e\u0001\u0000\u0000"+
		"\u0000\u0173\u0161\u0001\u0000\u0000\u0000\u0173\u0164\u0001\u0000\u0000"+
		"\u0000\u0173\u0167\u0001\u0000\u0000\u0000\u0173\u016a\u0001\u0000\u0000"+
		"\u0000\u0173\u016d\u0001\u0000\u0000\u0000\u0173\u0170\u0001\u0000\u0000"+
		"\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176)\u0001\u0000\u0000\u0000"+
		"\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u0179\u0005<\u0000\u0000\u0179"+
		"\u0182\u0005\r\u0000\u0000\u017a\u017f\u0003(\u0014\u0000\u017b\u017c"+
		"\u0005\u000e\u0000\u0000\u017c\u017e\u0003(\u0014\u0000\u017d\u017b\u0001"+
		"\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0183\u0001"+
		"\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182\u017a\u0001"+
		"\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0184\u0001"+
		"\u0000\u0000\u0000\u0184\u0185\u0005\u0003\u0000\u0000\u0185+\u0001\u0000"+
		"\u0000\u0000\u0186\u0187\u0005<\u0000\u0000\u0187\u0188\u0007\u0004\u0000"+
		"\u0000\u0188-\u0001\u0000\u0000\u0000\u0189\u018a\u0005<\u0000\u0000\u018a"+
		"\u018b\u00052\u0000\u0000\u018b\u018c\u0003(\u0014\u0000\u018c\u018d\u0005"+
		"3\u0000\u0000\u018d/\u0001\u0000\u0000\u0000\u018e\u018f\u0005\r\u0000"+
		"\u0000\u018f\u0190\u0003(\u0014\u0000\u0190\u0191\u0005\u000e\u0000\u0000"+
		"\u0191\u0192\u0003(\u0014\u0000\u0192\u0193\u0005\u0003\u0000\u0000\u0193"+
		"\u0196\u0001\u0000\u0000\u0000\u0194\u0196\u0005<\u0000\u0000\u0195\u018e"+
		"\u0001\u0000\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u01961\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0005\r\u0000\u0000\u0198\u0199\u00030"+
		"\u0018\u0000\u0199\u019a\u0005\u000e\u0000\u0000\u019a\u019b\u0003(\u0014"+
		"\u0000\u019b\u019c\u0005\u000e\u0000\u0000\u019c\u019d\u0003(\u0014\u0000"+
		"\u019d\u019e\u0005\u0003\u0000\u0000\u019e3\u0001\u0000\u0000\u0000\u019f"+
		"\u01a8\u00052\u0000\u0000\u01a0\u01a5\u00036\u001b\u0000\u01a1\u01a2\u0005"+
		"\u000e\u0000\u0000\u01a2\u01a4\u00036\u001b\u0000\u01a3\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ad\u00053\u0000\u0000\u01ab\u01ad\u0005<\u0000\u0000"+
		"\u01ac\u019f\u0001\u0000\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ad5\u0001\u0000\u0000\u0000\u01ae\u01b2\u00030\u0018\u0000\u01af\u01b2"+
		"\u00032\u0019\u0000\u01b0\u01b2\u0003(\u0014\u0000\u01b1\u01ae\u0001\u0000"+
		"\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b27\u0001\u0000\u0000\u0000\u01b3\u01be\u0005\u0005\u0000"+
		"\u0000\u01b4\u01be\u0005\u0006\u0000\u0000\u01b5\u01be\u0005\u0007\u0000"+
		"\u0000\u01b6\u01be\u0005\b\u0000\u0000\u01b7\u01b8\u0005\n\u0000\u0000"+
		"\u01b8\u01b9\u00038\u001c\u0000\u01b9\u01ba\u0005\u000b\u0000\u0000\u01ba"+
		"\u01be\u0001\u0000\u0000\u0000\u01bb\u01be\u0005\f\u0000\u0000\u01bc\u01be"+
		"\u0005\u000f\u0000\u0000\u01bd\u01b3\u0001\u0000\u0000\u0000\u01bd\u01b4"+
		"\u0001\u0000\u0000\u0000\u01bd\u01b5\u0001\u0000\u0000\u0000\u01bd\u01b6"+
		"\u0001\u0000\u0000\u0000\u01bd\u01b7\u0001\u0000\u0000\u0000\u01bd\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be9\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c3\u0003<\u001e\u0000\u01c0\u01c3\u0003>\u001f"+
		"\u0000\u01c1\u01c3\u0003@ \u0000\u01c2\u01bf\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c3"+
		";\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005<\u0000\u0000\u01c5\u01c6\u0005"+
		"\t\u0000\u0000\u01c6\u01c7\u0003(\u0014\u0000\u01c7\u01c8\u0005\u0001"+
		"\u0000\u0000\u01c8=\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005<\u0000\u0000"+
		"\u01ca\u01cb\u0007\u0004\u0000\u0000\u01cb\u01cc\u0005\t\u0000\u0000\u01cc"+
		"\u01cd\u0003(\u0014\u0000\u01cd\u01ce\u0005\u0001\u0000\u0000\u01ce?\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d0\u0005<\u0000\u0000\u01d0\u01d1\u00054\u0000"+
		"\u0000\u01d1\u01d2\u0003(\u0014\u0000\u01d2\u01d3\u0005\u0003\u0000\u0000"+
		"\u01d3\u01d4\u0005\u0001\u0000\u0000\u01d4\u01de\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d6\u0005<\u0000\u0000\u01d6\u01d7\u00052\u0000\u0000\u01d7\u01d8"+
		"\u0003(\u0014\u0000\u01d8\u01d9\u00053\u0000\u0000\u01d9\u01da\u0005\t"+
		"\u0000\u0000\u01da\u01db\u0003(\u0014\u0000\u01db\u01dc\u0005\u0001\u0000"+
		"\u0000\u01dc\u01de\u0001\u0000\u0000\u0000\u01dd\u01cf\u0001\u0000\u0000"+
		"\u0000\u01dd\u01d5\u0001\u0000\u0000\u0000\u01deA\u0001\u0000\u0000\u0000"+
		"#EUg\u0091\u009f\u00b3\u00b8\u00be\u00ce\u00d7\u00e0\u00e7\u00eb\u00f5"+
		"\u0101\u010e\u0113\u0119\u0126\u0136\u0144\u0149\u015c\u0173\u0175\u017f"+
		"\u0182\u0195\u01a5\u01a8\u01ac\u01b1\u01bd\u01c2\u01dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}