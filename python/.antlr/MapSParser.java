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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, AND=59, OR=60, 
		NOT=61, INT=62, DOUBLE=63, STRING=64, BOOLEAN=65, IDENTIFIER=66, WHITESPACE=67, 
		LINE_COMMENT=68, COMMENT=69;
	public static final int
		RULE_program = 0, RULE_progStatement = 1, RULE_statement = 2, RULE_printStatement = 3, 
		RULE_returnStatement = 4, RULE_variableDeclaration = 5, RULE_primitiveVariableDeclaration = 6, 
		RULE_listVariableDeclaration = 7, RULE_pointVariableDeclaration = 8, RULE_heightVariableDeclaration = 9, 
		RULE_landVariableDeclaration = 10, RULE_perimeterDeclaration = 11, RULE_shape = 12, 
		RULE_heightDeclaration = 13, RULE_lakeVariableDeclaration = 14, RULE_riverVariableDeclaration = 15, 
		RULE_functionDeclaration = 16, RULE_parameters = 17, RULE_ifStatement = 18, 
		RULE_blockStatement = 19, RULE_loopStatement = 20, RULE_expression = 21, 
		RULE_functionCall = 22, RULE_pointAccess = 23, RULE_listAccess = 24, RULE_pointExpression = 25, 
		RULE_heightExpression = 26, RULE_listExpression = 27, RULE_listElementExpression = 28, 
		RULE_type = 29, RULE_assignment = 30, RULE_variableAssignment = 31, RULE_pointFieldAssignment = 32, 
		RULE_listAssignment = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "progStatement", "statement", "printStatement", "returnStatement", 
			"variableDeclaration", "primitiveVariableDeclaration", "listVariableDeclaration", 
			"pointVariableDeclaration", "heightVariableDeclaration", "landVariableDeclaration", 
			"perimeterDeclaration", "shape", "heightDeclaration", "lakeVariableDeclaration", 
			"riverVariableDeclaration", "functionDeclaration", "parameters", "ifStatement", 
			"blockStatement", "loopStatement", "expression", "functionCall", "pointAccess", 
			"listAccess", "pointExpression", "heightExpression", "listExpression", 
			"listElementExpression", "type", "assignment", "variableAssignment", 
			"pointFieldAssignment", "listAssignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'print('", "')'", "'return'", "'int'", "'double'", "'bool'", 
			"'string'", "'is'", "'List<'", "'>'", "'Point'", "'Height'", "'Land'", 
			"'with'", "','", "'perimeter is'", "'Circle('", "'Square('", "'RandomLand('", 
			"'height is'", "'Lake'", "'River'", "'function'", "'('", "':'", "'{'", 
			"'}'", "'if'", "'do'", "'eif'", "'else do'", "'repeat'", "'from'", "'to'", 
			"'while'", "'-'", "'^'", "'?'", "'*'", "'/'", "'+'", "'<'", "'>='", "'<='", 
			"'='", "'!='", "'sin'", "'cos'", "'tg'", "'ctg'", "'parent'", "'::'", 
			"'.x'", "'.y'", "'['", "']'", "'.add('", "'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "AND", 
			"OR", "NOT", "INT", "DOUBLE", "STRING", "BOOLEAN", "IDENTIFIER", "WHITESPACE", 
			"LINE_COMMENT", "COMMENT"
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
		public List<ProgStatementContext> progStatement() {
			return getRuleContexts(ProgStatementContext.class);
		}
		public ProgStatementContext progStatement(int i) {
			return getRuleContext(ProgStatementContext.class,i);
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
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2297117069453265420L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
				{
				{
				setState(68);
				progStatement();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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
	public static class ProgStatementContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ProgStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progStatement; }
	}

	public final ProgStatementContext progStatement() throws RecognitionException {
		ProgStatementContext _localctx = new ProgStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_progStatement);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				functionDeclaration();
				}
				break;
			case T__1:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__9:
			case T__11:
			case T__12:
			case T__13:
			case T__21:
			case T__22:
			case T__24:
			case T__26:
			case T__28:
			case T__32:
			case T__35:
			case T__36:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case NOT:
			case INT:
			case DOUBLE:
			case STRING:
			case BOOLEAN:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				statement();
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
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				blockStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				loopStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				expression(0);
				setState(86);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				returnStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
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
		enterRule(_localctx, 6, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__1);
			setState(93);
			expression(0);
			setState(94);
			match(T__2);
			setState(95);
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
		enterRule(_localctx, 8, RULE_returnStatement);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__3);
				setState(98);
				expression(0);
				setState(99);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T__3);
				setState(102);
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
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaration);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				primitiveVariableDeclaration();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				listVariableDeclaration();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				pointVariableDeclaration();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				heightVariableDeclaration();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				landVariableDeclaration();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				lakeVariableDeclaration();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
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
		enterRule(_localctx, 12, RULE_primitiveVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 480L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(115);
			match(IDENTIFIER);
			setState(116);
			match(T__8);
			setState(117);
			expression(0);
			setState(118);
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
		enterRule(_localctx, 14, RULE_listVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__9);
			setState(121);
			type();
			setState(122);
			match(T__10);
			setState(123);
			match(IDENTIFIER);
			setState(124);
			match(T__8);
			setState(125);
			listExpression();
			setState(126);
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
		public PointExpressionContext pointExpression() {
			return getRuleContext(PointExpressionContext.class,0);
		}
		public PointVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointVariableDeclaration; }
	}

	public final PointVariableDeclarationContext pointVariableDeclaration() throws RecognitionException {
		PointVariableDeclarationContext _localctx = new PointVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pointVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__11);
			setState(129);
			match(IDENTIFIER);
			setState(130);
			match(T__8);
			setState(131);
			pointExpression();
			setState(132);
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
		public HeightExpressionContext heightExpression() {
			return getRuleContext(HeightExpressionContext.class,0);
		}
		public HeightVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heightVariableDeclaration; }
	}

	public final HeightVariableDeclarationContext heightVariableDeclaration() throws RecognitionException {
		HeightVariableDeclarationContext _localctx = new HeightVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_heightVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__12);
			setState(135);
			match(IDENTIFIER);
			setState(136);
			match(T__8);
			setState(137);
			heightExpression();
			setState(138);
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
		enterRule(_localctx, 20, RULE_landVariableDeclaration);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(T__13);
				setState(141);
				match(IDENTIFIER);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(142);
					match(T__8);
					setState(143);
					pointExpression();
					}
				}

				setState(146);
				match(T__14);
				setState(147);
				perimeterDeclaration();
				setState(148);
				match(T__15);
				setState(149);
				heightDeclaration();
				setState(150);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(T__13);
				setState(153);
				match(IDENTIFIER);
				setState(154);
				match(T__8);
				setState(155);
				expression(0);
				setState(156);
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
		enterRule(_localctx, 22, RULE_perimeterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__16);
			setState(161);
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
		enterRule(_localctx, 24, RULE_shape);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__17);
				setState(164);
				expression(0);
				setState(165);
				match(T__2);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__18);
				setState(168);
				expression(0);
				setState(169);
				match(T__15);
				setState(170);
				expression(0);
				setState(171);
				match(T__2);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(T__19);
				setState(174);
				expression(0);
				setState(175);
				match(T__15);
				setState(176);
				expression(0);
				setState(177);
				match(T__2);
				}
				break;
			case T__55:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
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
		enterRule(_localctx, 26, RULE_heightDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__20);
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(183);
				functionCall();
				}
				break;
			case 2:
				{
				setState(184);
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
		enterRule(_localctx, 28, RULE_lakeVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__21);
			setState(188);
			match(IDENTIFIER);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(189);
				match(T__8);
				setState(190);
				pointExpression();
				}
			}

			setState(193);
			match(T__14);
			setState(194);
			perimeterDeclaration();
			setState(195);
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
	}

	public final RiverVariableDeclarationContext riverVariableDeclaration() throws RecognitionException {
		RiverVariableDeclarationContext _localctx = new RiverVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_riverVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__22);
			setState(198);
			match(IDENTIFIER);
			setState(199);
			match(T__8);
			setState(200);
			pointExpression();
			setState(201);
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
		enterRule(_localctx, 32, RULE_functionDeclaration);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(T__23);
				setState(204);
				match(IDENTIFIER);
				setState(205);
				match(T__24);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13792L) != 0)) {
					{
					setState(206);
					parameters();
					}
				}

				setState(209);
				match(T__2);
				setState(210);
				match(T__25);
				setState(211);
				type();
				setState(212);
				match(T__26);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2297117069470042636L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
					{
					{
					setState(213);
					statement();
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(T__27);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(T__23);
				setState(222);
				match(IDENTIFIER);
				setState(223);
				match(T__24);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13792L) != 0)) {
					{
					setState(224);
					parameters();
					}
				}

				setState(227);
				match(T__2);
				setState(228);
				match(T__26);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2297117069470042636L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
					{
					{
					setState(229);
					statement();
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
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
		enterRule(_localctx, 34, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			type();
			setState(239);
			match(IDENTIFIER);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(240);
				match(T__15);
				setState(241);
				type();
				setState(242);
				match(IDENTIFIER);
				}
				}
				setState(248);
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
		enterRule(_localctx, 36, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__28);
			setState(250);
			match(T__24);
			setState(251);
			expression(0);
			setState(252);
			match(T__2);
			setState(253);
			match(T__29);
			setState(254);
			match(T__26);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2297117069470042636L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
				{
				{
				setState(255);
				statement();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(T__27);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(262);
				match(T__30);
				setState(263);
				match(T__24);
				setState(264);
				expression(0);
				setState(265);
				match(T__2);
				setState(266);
				match(T__29);
				setState(267);
				blockStatement();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(274);
				match(T__31);
				setState(275);
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
		enterRule(_localctx, 38, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__26);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2297117069470042636L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
				{
				{
				setState(279);
				statement();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
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
		enterRule(_localctx, 40, RULE_loopStatement);
		int _la;
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new RepeatFixedLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(T__32);
				setState(288);
				match(T__14);
				setState(289);
				match(IDENTIFIER);
				setState(290);
				expression(0);
				setState(291);
				match(T__26);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2297117069470042636L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
					{
					{
					setState(292);
					statement();
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(298);
				match(T__27);
				}
				break;
			case 2:
				_localctx = new RepeatRangeLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(T__32);
				setState(301);
				match(T__14);
				setState(302);
				match(IDENTIFIER);
				setState(303);
				match(T__33);
				setState(304);
				expression(0);
				setState(305);
				match(T__34);
				setState(306);
				expression(0);
				setState(307);
				match(T__26);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2297117069470042636L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
					{
					{
					setState(308);
					statement();
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
				match(T__27);
				}
				break;
			case 3:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(T__35);
				setState(317);
				match(T__24);
				setState(318);
				expression(0);
				setState(319);
				match(T__2);
				setState(320);
				match(T__29);
				setState(321);
				match(T__26);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2297117069470042636L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
					{
					{
					setState(322);
					statement();
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(328);
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
	public static class CastExprContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class TrygExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TrygExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScopeAccessExprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public ScopeAccessExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(333);
				match(T__24);
				setState(334);
				expression(0);
				setState(335);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				match(T__24);
				setState(338);
				type();
				setState(339);
				match(T__2);
				setState(340);
				expression(20);
				}
				break;
			case 3:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(342);
				match(T__36);
				setState(343);
				expression(19);
				}
				break;
			case 4:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(344);
				match(NOT);
				setState(345);
				expression(13);
				}
				break;
			case 5:
				{
				_localctx = new TrygExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(346);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222124650659840L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(347);
				match(T__24);
				setState(348);
				expression(0);
				setState(349);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351);
				functionCall();
				}
				break;
			case 7:
				{
				_localctx = new ScopeAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(352);
					match(T__51);
					setState(353);
					match(T__52);
					}
					}
					setState(356); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__51 );
				setState(358);
				match(IDENTIFIER);
				}
				break;
			case 8:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359);
				match(INT);
				}
				break;
			case 9:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(360);
				match(DOUBLE);
				}
				break;
			case 10:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361);
				match(STRING);
				}
				break;
			case 11:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(362);
				match(BOOLEAN);
				}
				break;
			case 12:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(363);
				match(IDENTIFIER);
				}
				break;
			case 13:
				{
				_localctx = new PointAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(364);
				pointAccess();
				}
				break;
			case 14:
				{
				_localctx = new ListAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(365);
				listAccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(395);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(368);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(369);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==T__40) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(370);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(371);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(372);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__41) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(373);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new CompareExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(374);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(375);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 272678883690496L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(376);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(377);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(378);
						match(AND);
						setState(379);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(380);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(381);
						match(OR);
						setState(382);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new PowExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(383);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(384);
						match(T__37);
						setState(387);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__37:
							{
							setState(385);
							match(T__37);
							}
							break;
						case T__24:
						case T__36:
						case T__47:
						case T__48:
						case T__49:
						case T__50:
						case T__51:
						case NOT:
						case INT:
						case DOUBLE:
						case STRING:
						case BOOLEAN:
						case IDENTIFIER:
							{
							setState(386);
							expression(0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 7:
						{
						_localctx = new SqrtExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(389);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(390);
						match(T__38);
						setState(393);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__38:
							{
							setState(391);
							match(T__38);
							}
							break;
						case T__24:
						case T__36:
						case T__47:
						case T__48:
						case T__49:
						case T__50:
						case T__51:
						case NOT:
						case INT:
						case DOUBLE:
						case STRING:
						case BOOLEAN:
						case IDENTIFIER:
							{
							setState(392);
							expression(0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 44, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(IDENTIFIER);
			setState(401);
			match(T__24);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 4329587085313L) != 0)) {
				{
				setState(402);
				expression(0);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(403);
					match(T__15);
					setState(404);
					expression(0);
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(412);
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
		enterRule(_localctx, 46, RULE_pointAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(IDENTIFIER);
			setState(415);
			_la = _input.LA(1);
			if ( !(_la==T__53 || _la==T__54) ) {
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
		enterRule(_localctx, 48, RULE_listAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(IDENTIFIER);
			setState(418);
			match(T__55);
			setState(419);
			expression(0);
			setState(420);
			match(T__56);
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
		enterRule(_localctx, 50, RULE_pointExpression);
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(T__24);
				setState(423);
				expression(0);
				setState(424);
				match(T__15);
				setState(425);
				expression(0);
				setState(426);
				match(T__2);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
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
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public HeightExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heightExpression; }
	}

	public final HeightExpressionContext heightExpression() throws RecognitionException {
		HeightExpressionContext _localctx = new HeightExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_heightExpression);
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(T__24);
				setState(432);
				pointExpression();
				setState(433);
				match(T__15);
				setState(434);
				expression(0);
				setState(435);
				match(T__15);
				setState(436);
				expression(0);
				setState(437);
				match(T__2);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
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
		enterRule(_localctx, 54, RULE_listExpression);
		int _la;
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				match(T__55);
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 4329587085313L) != 0)) {
					{
					setState(443);
					listElementExpression();
					setState(448);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(444);
						match(T__15);
						setState(445);
						listElementExpression();
						}
						}
						setState(450);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(453);
				match(T__56);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PointExpressionContext pointExpression() {
			return getRuleContext(PointExpressionContext.class,0);
		}
		public HeightExpressionContext heightExpression() {
			return getRuleContext(HeightExpressionContext.class,0);
		}
		public ListElementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElementExpression; }
	}

	public final ListElementExpressionContext listElementExpression() throws RecognitionException {
		ListElementExpressionContext _localctx = new ListElementExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_listElementExpression);
		try {
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				pointExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				heightExpression();
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
		enterRule(_localctx, 58, RULE_type);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
				match(T__7);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(466);
				match(T__9);
				setState(467);
				type();
				setState(468);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(470);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(471);
				match(T__12);
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
		enterRule(_localctx, 60, RULE_assignment);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				variableAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				pointFieldAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
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
		enterRule(_localctx, 62, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(IDENTIFIER);
			setState(480);
			match(T__8);
			setState(481);
			expression(0);
			setState(482);
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
		enterRule(_localctx, 64, RULE_pointFieldAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(IDENTIFIER);
			setState(485);
			_la = _input.LA(1);
			if ( !(_la==T__53 || _la==T__54) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(486);
			match(T__8);
			setState(487);
			expression(0);
			setState(488);
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
		enterRule(_localctx, 66, RULE_listAssignment);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new ListAddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(IDENTIFIER);
				setState(491);
				match(T__57);
				setState(492);
				expression(0);
				setState(493);
				match(T__2);
				setState(494);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new ListUpdateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(IDENTIFIER);
				setState(497);
				match(T__55);
				setState(498);
				expression(0);
				setState(499);
				match(T__56);
				setState(500);
				match(T__8);
				setState(501);
				expression(0);
				setState(502);
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
		case 21:
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
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001E\u01fb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0005"+
		"\u0000F\b\u0000\n\u0000\f\u0000I\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u0001O\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002[\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005q\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0091\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u009f\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b5\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00ba\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00c0\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d0"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00d7\b\u0010\n\u0010\f\u0010\u00da\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e2\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e7\b\u0010\n\u0010"+
		"\f\u0010\u00ea\t\u0010\u0001\u0010\u0003\u0010\u00ed\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00f5\b\u0011\n\u0011\f\u0011\u00f8\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0101"+
		"\b\u0012\n\u0012\f\u0012\u0104\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u010e\b\u0012\n\u0012\f\u0012\u0111\t\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0115\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u0119\b\u0013"+
		"\n\u0013\f\u0013\u011c\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0126"+
		"\b\u0014\n\u0014\f\u0014\u0129\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0136\b\u0014\n\u0014\f\u0014\u0139"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0144\b\u0014\n"+
		"\u0014\f\u0014\u0147\t\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u014b"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u0163"+
		"\b\u0015\u000b\u0015\f\u0015\u0164\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u016f\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0184\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u018a\b\u0015\u0005\u0015\u018c\b"+
		"\u0015\n\u0015\f\u0015\u018f\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u0196\b\u0016\n\u0016\f\u0016\u0199"+
		"\t\u0016\u0003\u0016\u019b\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u01ae\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u01b9\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u01bf\b\u001b\n\u001b\f\u001b\u01c2\t\u001b\u0003"+
		"\u001b\u01c4\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01c8\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01cd\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01d9\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u01de\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01f9\b!\u0001!\u0000\u0001"+
		"*\"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0006\u0001\u0000\u0005\b"+
		"\u0001\u000003\u0001\u0000()\u0002\u0000%%**\u0002\u0000\u000b\u000b+"+
		"/\u0001\u000067\u0227\u0000G\u0001\u0000\u0000\u0000\u0002N\u0001\u0000"+
		"\u0000\u0000\u0004Z\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000"+
		"\u0000\bg\u0001\u0000\u0000\u0000\np\u0001\u0000\u0000\u0000\fr\u0001"+
		"\u0000\u0000\u0000\u000ex\u0001\u0000\u0000\u0000\u0010\u0080\u0001\u0000"+
		"\u0000\u0000\u0012\u0086\u0001\u0000\u0000\u0000\u0014\u009e\u0001\u0000"+
		"\u0000\u0000\u0016\u00a0\u0001\u0000\u0000\u0000\u0018\u00b4\u0001\u0000"+
		"\u0000\u0000\u001a\u00b6\u0001\u0000\u0000\u0000\u001c\u00bb\u0001\u0000"+
		"\u0000\u0000\u001e\u00c5\u0001\u0000\u0000\u0000 \u00ec\u0001\u0000\u0000"+
		"\u0000\"\u00ee\u0001\u0000\u0000\u0000$\u00f9\u0001\u0000\u0000\u0000"+
		"&\u0116\u0001\u0000\u0000\u0000(\u014a\u0001\u0000\u0000\u0000*\u016e"+
		"\u0001\u0000\u0000\u0000,\u0190\u0001\u0000\u0000\u0000.\u019e\u0001\u0000"+
		"\u0000\u00000\u01a1\u0001\u0000\u0000\u00002\u01ad\u0001\u0000\u0000\u0000"+
		"4\u01b8\u0001\u0000\u0000\u00006\u01c7\u0001\u0000\u0000\u00008\u01cc"+
		"\u0001\u0000\u0000\u0000:\u01d8\u0001\u0000\u0000\u0000<\u01dd\u0001\u0000"+
		"\u0000\u0000>\u01df\u0001\u0000\u0000\u0000@\u01e4\u0001\u0000\u0000\u0000"+
		"B\u01f8\u0001\u0000\u0000\u0000DF\u0003\u0002\u0001\u0000ED\u0001\u0000"+
		"\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"JK\u0005\u0000\u0000\u0001K\u0001\u0001\u0000\u0000\u0000LO\u0003 \u0010"+
		"\u0000MO\u0003\u0004\u0002\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000"+
		"\u0000\u0000O\u0003\u0001\u0000\u0000\u0000P[\u0003\n\u0005\u0000Q[\u0003"+
		"$\u0012\u0000R[\u0003&\u0013\u0000S[\u0003(\u0014\u0000T[\u0003<\u001e"+
		"\u0000UV\u0003*\u0015\u0000VW\u0005\u0001\u0000\u0000W[\u0001\u0000\u0000"+
		"\u0000X[\u0003\b\u0004\u0000Y[\u0003\u0006\u0003\u0000ZP\u0001\u0000\u0000"+
		"\u0000ZQ\u0001\u0000\u0000\u0000ZR\u0001\u0000\u0000\u0000ZS\u0001\u0000"+
		"\u0000\u0000ZT\u0001\u0000\u0000\u0000ZU\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\u0005\u0001\u0000\u0000"+
		"\u0000\\]\u0005\u0002\u0000\u0000]^\u0003*\u0015\u0000^_\u0005\u0003\u0000"+
		"\u0000_`\u0005\u0001\u0000\u0000`\u0007\u0001\u0000\u0000\u0000ab\u0005"+
		"\u0004\u0000\u0000bc\u0003*\u0015\u0000cd\u0005\u0001\u0000\u0000dh\u0001"+
		"\u0000\u0000\u0000ef\u0005\u0004\u0000\u0000fh\u0005\u0001\u0000\u0000"+
		"ga\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000h\t\u0001\u0000\u0000"+
		"\u0000iq\u0003\f\u0006\u0000jq\u0003\u000e\u0007\u0000kq\u0003\u0010\b"+
		"\u0000lq\u0003\u0012\t\u0000mq\u0003\u0014\n\u0000nq\u0003\u001c\u000e"+
		"\u0000oq\u0003\u001e\u000f\u0000pi\u0001\u0000\u0000\u0000pj\u0001\u0000"+
		"\u0000\u0000pk\u0001\u0000\u0000\u0000pl\u0001\u0000\u0000\u0000pm\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000"+
		"q\u000b\u0001\u0000\u0000\u0000rs\u0007\u0000\u0000\u0000st\u0005B\u0000"+
		"\u0000tu\u0005\t\u0000\u0000uv\u0003*\u0015\u0000vw\u0005\u0001\u0000"+
		"\u0000w\r\u0001\u0000\u0000\u0000xy\u0005\n\u0000\u0000yz\u0003:\u001d"+
		"\u0000z{\u0005\u000b\u0000\u0000{|\u0005B\u0000\u0000|}\u0005\t\u0000"+
		"\u0000}~\u00036\u001b\u0000~\u007f\u0005\u0001\u0000\u0000\u007f\u000f"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0005\f\u0000\u0000\u0081\u0082\u0005"+
		"B\u0000\u0000\u0082\u0083\u0005\t\u0000\u0000\u0083\u0084\u00032\u0019"+
		"\u0000\u0084\u0085\u0005\u0001\u0000\u0000\u0085\u0011\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\r\u0000\u0000\u0087\u0088\u0005B\u0000\u0000"+
		"\u0088\u0089\u0005\t\u0000\u0000\u0089\u008a\u00034\u001a\u0000\u008a"+
		"\u008b\u0005\u0001\u0000\u0000\u008b\u0013\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0005\u000e\u0000\u0000\u008d\u0090\u0005B\u0000\u0000\u008e\u008f"+
		"\u0005\t\u0000\u0000\u008f\u0091\u00032\u0019\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\u000f\u0000\u0000\u0093\u0094\u0003"+
		"\u0016\u000b\u0000\u0094\u0095\u0005\u0010\u0000\u0000\u0095\u0096\u0003"+
		"\u001a\r\u0000\u0096\u0097\u0005\u0001\u0000\u0000\u0097\u009f\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0005\u000e\u0000\u0000\u0099\u009a\u0005B\u0000"+
		"\u0000\u009a\u009b\u0005\t\u0000\u0000\u009b\u009c\u0003*\u0015\u0000"+
		"\u009c\u009d\u0005\u0001\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000"+
		"\u009e\u008c\u0001\u0000\u0000\u0000\u009e\u0098\u0001\u0000\u0000\u0000"+
		"\u009f\u0015\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0011\u0000\u0000"+
		"\u00a1\u00a2\u0003\u0018\f\u0000\u00a2\u0017\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0005\u0012\u0000\u0000\u00a4\u00a5\u0003*\u0015\u0000\u00a5\u00a6"+
		"\u0005\u0003\u0000\u0000\u00a6\u00b5\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005\u0013\u0000\u0000\u00a8\u00a9\u0003*\u0015\u0000\u00a9\u00aa\u0005"+
		"\u0010\u0000\u0000\u00aa\u00ab\u0003*\u0015\u0000\u00ab\u00ac\u0005\u0003"+
		"\u0000\u0000\u00ac\u00b5\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0014"+
		"\u0000\u0000\u00ae\u00af\u0003*\u0015\u0000\u00af\u00b0\u0005\u0010\u0000"+
		"\u0000\u00b0\u00b1\u0003*\u0015\u0000\u00b1\u00b2\u0005\u0003\u0000\u0000"+
		"\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b5\u00036\u001b\u0000\u00b4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00b4\u00a7\u0001\u0000\u0000\u0000\u00b4"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u0019\u0001\u0000\u0000\u0000\u00b6\u00b9\u0005\u0015\u0000\u0000\u00b7"+
		"\u00ba\u0003,\u0016\u0000\u00b8\u00ba\u00036\u001b\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u001b\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0005\u0016\u0000\u0000\u00bc\u00bf\u0005"+
		"B\u0000\u0000\u00bd\u00be\u0005\t\u0000\u0000\u00be\u00c0\u00032\u0019"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u000f\u0000"+
		"\u0000\u00c2\u00c3\u0003\u0016\u000b\u0000\u00c3\u00c4\u0005\u0001\u0000"+
		"\u0000\u00c4\u001d\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0017\u0000"+
		"\u0000\u00c6\u00c7\u0005B\u0000\u0000\u00c7\u00c8\u0005\t\u0000\u0000"+
		"\u00c8\u00c9\u00032\u0019\u0000\u00c9\u00ca\u0005\u0001\u0000\u0000\u00ca"+
		"\u001f\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0018\u0000\u0000\u00cc"+
		"\u00cd\u0005B\u0000\u0000\u00cd\u00cf\u0005\u0019\u0000\u0000\u00ce\u00d0"+
		"\u0003\"\u0011\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		"\u0003\u0000\u0000\u00d2\u00d3\u0005\u001a\u0000\u0000\u00d3\u00d4\u0003"+
		":\u001d\u0000\u00d4\u00d8\u0005\u001b\u0000\u0000\u00d5\u00d7\u0003\u0004"+
		"\u0002\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0005\u001c\u0000\u0000\u00dc\u00ed\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0005\u0018\u0000\u0000\u00de\u00df\u0005B\u0000"+
		"\u0000\u00df\u00e1\u0005\u0019\u0000\u0000\u00e0\u00e2\u0003\"\u0011\u0000"+
		"\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000"+
		"\u00e4\u00e8\u0005\u001b\u0000\u0000\u00e5\u00e7\u0003\u0004\u0002\u0000"+
		"\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ed\u0005\u001c\u0000\u0000\u00ec\u00cb\u0001\u0000\u0000\u0000"+
		"\u00ec\u00dd\u0001\u0000\u0000\u0000\u00ed!\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0003:\u001d\u0000\u00ef\u00f6\u0005B\u0000\u0000\u00f0\u00f1\u0005"+
		"\u0010\u0000\u0000\u00f1\u00f2\u0003:\u001d\u0000\u00f2\u00f3\u0005B\u0000"+
		"\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7#\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u001d\u0000\u0000"+
		"\u00fa\u00fb\u0005\u0019\u0000\u0000\u00fb\u00fc\u0003*\u0015\u0000\u00fc"+
		"\u00fd\u0005\u0003\u0000\u0000\u00fd\u00fe\u0005\u001e\u0000\u0000\u00fe"+
		"\u0102\u0005\u001b\u0000\u0000\u00ff\u0101\u0003\u0004\u0002\u0000\u0100"+
		"\u00ff\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102"+
		"\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103"+
		"\u0105\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105"+
		"\u010f\u0005\u001c\u0000\u0000\u0106\u0107\u0005\u001f\u0000\u0000\u0107"+
		"\u0108\u0005\u0019\u0000\u0000\u0108\u0109\u0003*\u0015\u0000\u0109\u010a"+
		"\u0005\u0003\u0000\u0000\u010a\u010b\u0005\u001e\u0000\u0000\u010b\u010c"+
		"\u0003&\u0013\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u0106\u0001"+
		"\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0114\u0001"+
		"\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0005"+
		" \u0000\u0000\u0113\u0115\u0003&\u0013\u0000\u0114\u0112\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115%\u0001\u0000\u0000\u0000"+
		"\u0116\u011a\u0005\u001b\u0000\u0000\u0117\u0119\u0003\u0004\u0002\u0000"+
		"\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000"+
		"\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0005\u001c\u0000\u0000\u011e\'\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0005!\u0000\u0000\u0120\u0121\u0005\u000f\u0000\u0000\u0121\u0122"+
		"\u0005B\u0000\u0000\u0122\u0123\u0003*\u0015\u0000\u0123\u0127\u0005\u001b"+
		"\u0000\u0000\u0124\u0126\u0003\u0004\u0002\u0000\u0125\u0124\u0001\u0000"+
		"\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000"+
		"\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u001c"+
		"\u0000\u0000\u012b\u014b\u0001\u0000\u0000\u0000\u012c\u012d\u0005!\u0000"+
		"\u0000\u012d\u012e\u0005\u000f\u0000\u0000\u012e\u012f\u0005B\u0000\u0000"+
		"\u012f\u0130\u0005\"\u0000\u0000\u0130\u0131\u0003*\u0015\u0000\u0131"+
		"\u0132\u0005#\u0000\u0000\u0132\u0133\u0003*\u0015\u0000\u0133\u0137\u0005"+
		"\u001b\u0000\u0000\u0134\u0136\u0003\u0004\u0002\u0000\u0135\u0134\u0001"+
		"\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013a\u0001"+
		"\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013b\u0005"+
		"\u001c\u0000\u0000\u013b\u014b\u0001\u0000\u0000\u0000\u013c\u013d\u0005"+
		"$\u0000\u0000\u013d\u013e\u0005\u0019\u0000\u0000\u013e\u013f\u0003*\u0015"+
		"\u0000\u013f\u0140\u0005\u0003\u0000\u0000\u0140\u0141\u0005\u001e\u0000"+
		"\u0000\u0141\u0145\u0005\u001b\u0000\u0000\u0142\u0144\u0003\u0004\u0002"+
		"\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000"+
		"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000"+
		"\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0005\u001c\u0000\u0000\u0149\u014b\u0001\u0000\u0000"+
		"\u0000\u014a\u011f\u0001\u0000\u0000\u0000\u014a\u012c\u0001\u0000\u0000"+
		"\u0000\u014a\u013c\u0001\u0000\u0000\u0000\u014b)\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0006\u0015\uffff\uffff\u0000\u014d\u014e\u0005\u0019\u0000"+
		"\u0000\u014e\u014f\u0003*\u0015\u0000\u014f\u0150\u0005\u0003\u0000\u0000"+
		"\u0150\u016f\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u0019\u0000\u0000"+
		"\u0152\u0153\u0003:\u001d\u0000\u0153\u0154\u0005\u0003\u0000\u0000\u0154"+
		"\u0155\u0003*\u0015\u0014\u0155\u016f\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0005%\u0000\u0000\u0157\u016f\u0003*\u0015\u0013\u0158\u0159\u0005="+
		"\u0000\u0000\u0159\u016f\u0003*\u0015\r\u015a\u015b\u0007\u0001\u0000"+
		"\u0000\u015b\u015c\u0005\u0019\u0000\u0000\u015c\u015d\u0003*\u0015\u0000"+
		"\u015d\u015e\u0005\u0003\u0000\u0000\u015e\u016f\u0001\u0000\u0000\u0000"+
		"\u015f\u016f\u0003,\u0016\u0000\u0160\u0161\u00054\u0000\u0000\u0161\u0163"+
		"\u00055\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163\u0164\u0001"+
		"\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u016f\u0005"+
		"B\u0000\u0000\u0167\u016f\u0005>\u0000\u0000\u0168\u016f\u0005?\u0000"+
		"\u0000\u0169\u016f\u0005@\u0000\u0000\u016a\u016f\u0005A\u0000\u0000\u016b"+
		"\u016f\u0005B\u0000\u0000\u016c\u016f\u0003.\u0017\u0000\u016d\u016f\u0003"+
		"0\u0018\u0000\u016e\u014c\u0001\u0000\u0000\u0000\u016e\u0151\u0001\u0000"+
		"\u0000\u0000\u016e\u0156\u0001\u0000\u0000\u0000\u016e\u0158\u0001\u0000"+
		"\u0000\u0000\u016e\u015a\u0001\u0000\u0000\u0000\u016e\u015f\u0001\u0000"+
		"\u0000\u0000\u016e\u0162\u0001\u0000\u0000\u0000\u016e\u0167\u0001\u0000"+
		"\u0000\u0000\u016e\u0168\u0001\u0000\u0000\u0000\u016e\u0169\u0001\u0000"+
		"\u0000\u0000\u016e\u016a\u0001\u0000\u0000\u0000\u016e\u016b\u0001\u0000"+
		"\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016d\u0001\u0000"+
		"\u0000\u0000\u016f\u018d\u0001\u0000\u0000\u0000\u0170\u0171\n\u0010\u0000"+
		"\u0000\u0171\u0172\u0007\u0002\u0000\u0000\u0172\u018c\u0003*\u0015\u0011"+
		"\u0173\u0174\n\u000f\u0000\u0000\u0174\u0175\u0007\u0003\u0000\u0000\u0175"+
		"\u018c\u0003*\u0015\u0010\u0176\u0177\n\u000e\u0000\u0000\u0177\u0178"+
		"\u0007\u0004\u0000\u0000\u0178\u018c\u0003*\u0015\u000f\u0179\u017a\n"+
		"\f\u0000\u0000\u017a\u017b\u0005;\u0000\u0000\u017b\u018c\u0003*\u0015"+
		"\r\u017c\u017d\n\u000b\u0000\u0000\u017d\u017e\u0005<\u0000\u0000\u017e"+
		"\u018c\u0003*\u0015\f\u017f\u0180\n\u0012\u0000\u0000\u0180\u0183\u0005"+
		"&\u0000\u0000\u0181\u0184\u0005&\u0000\u0000\u0182\u0184\u0003*\u0015"+
		"\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0182\u0001\u0000\u0000"+
		"\u0000\u0184\u018c\u0001\u0000\u0000\u0000\u0185\u0186\n\u0011\u0000\u0000"+
		"\u0186\u0189\u0005\'\u0000\u0000\u0187\u018a\u0005\'\u0000\u0000\u0188"+
		"\u018a\u0003*\u0015\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u0188"+
		"\u0001\u0000\u0000\u0000\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0170"+
		"\u0001\u0000\u0000\u0000\u018b\u0173\u0001\u0000\u0000\u0000\u018b\u0176"+
		"\u0001\u0000\u0000\u0000\u018b\u0179\u0001\u0000\u0000\u0000\u018b\u017c"+
		"\u0001\u0000\u0000\u0000\u018b\u017f\u0001\u0000\u0000\u0000\u018b\u0185"+
		"\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018b"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e+\u0001"+
		"\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u0190\u0191\u0005"+
		"B\u0000\u0000\u0191\u019a\u0005\u0019\u0000\u0000\u0192\u0197\u0003*\u0015"+
		"\u0000\u0193\u0194\u0005\u0010\u0000\u0000\u0194\u0196\u0003*\u0015\u0000"+
		"\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000"+
		"\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000"+
		"\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000"+
		"\u019a\u0192\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0005\u0003\u0000\u0000"+
		"\u019d-\u0001\u0000\u0000\u0000\u019e\u019f\u0005B\u0000\u0000\u019f\u01a0"+
		"\u0007\u0005\u0000\u0000\u01a0/\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005"+
		"B\u0000\u0000\u01a2\u01a3\u00058\u0000\u0000\u01a3\u01a4\u0003*\u0015"+
		"\u0000\u01a4\u01a5\u00059\u0000\u0000\u01a51\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a7\u0005\u0019\u0000\u0000\u01a7\u01a8\u0003*\u0015\u0000\u01a8\u01a9"+
		"\u0005\u0010\u0000\u0000\u01a9\u01aa\u0003*\u0015\u0000\u01aa\u01ab\u0005"+
		"\u0003\u0000\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac\u01ae\u0005"+
		"B\u0000\u0000\u01ad\u01a6\u0001\u0000\u0000\u0000\u01ad\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ae3\u0001\u0000\u0000\u0000\u01af\u01b0\u0005\u0019\u0000"+
		"\u0000\u01b0\u01b1\u00032\u0019\u0000\u01b1\u01b2\u0005\u0010\u0000\u0000"+
		"\u01b2\u01b3\u0003*\u0015\u0000\u01b3\u01b4\u0005\u0010\u0000\u0000\u01b4"+
		"\u01b5\u0003*\u0015\u0000\u01b5\u01b6\u0005\u0003\u0000\u0000\u01b6\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b9\u0005B\u0000\u0000\u01b8\u01af\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b95\u0001\u0000"+
		"\u0000\u0000\u01ba\u01c3\u00058\u0000\u0000\u01bb\u01c0\u00038\u001c\u0000"+
		"\u01bc\u01bd\u0005\u0010\u0000\u0000\u01bd\u01bf\u00038\u001c\u0000\u01be"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0"+
		"\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c3"+
		"\u01bb\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c8\u00059\u0000\u0000\u01c6\u01c8"+
		"\u0005B\u0000\u0000\u01c7\u01ba\u0001\u0000\u0000\u0000\u01c7\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c87\u0001\u0000\u0000\u0000\u01c9\u01cd\u0003*\u0015"+
		"\u0000\u01ca\u01cd\u00032\u0019\u0000\u01cb\u01cd\u00034\u001a\u0000\u01cc"+
		"\u01c9\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cd9\u0001\u0000\u0000\u0000\u01ce\u01d9"+
		"\u0005\u0005\u0000\u0000\u01cf\u01d9\u0005\u0006\u0000\u0000\u01d0\u01d9"+
		"\u0005\u0007\u0000\u0000\u01d1\u01d9\u0005\b\u0000\u0000\u01d2\u01d3\u0005"+
		"\n\u0000\u0000\u01d3\u01d4\u0003:\u001d\u0000\u01d4\u01d5\u0005\u000b"+
		"\u0000\u0000\u01d5\u01d9\u0001\u0000\u0000\u0000\u01d6\u01d9\u0005\f\u0000"+
		"\u0000\u01d7\u01d9\u0005\r\u0000\u0000\u01d8\u01ce\u0001\u0000\u0000\u0000"+
		"\u01d8\u01cf\u0001\u0000\u0000\u0000\u01d8\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d1\u0001\u0000\u0000\u0000\u01d8\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000"+
		"\u01d9;\u0001\u0000\u0000\u0000\u01da\u01de\u0003>\u001f\u0000\u01db\u01de"+
		"\u0003@ \u0000\u01dc\u01de\u0003B!\u0000\u01dd\u01da\u0001\u0000\u0000"+
		"\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000"+
		"\u0000\u01de=\u0001\u0000\u0000\u0000\u01df\u01e0\u0005B\u0000\u0000\u01e0"+
		"\u01e1\u0005\t\u0000\u0000\u01e1\u01e2\u0003*\u0015\u0000\u01e2\u01e3"+
		"\u0005\u0001\u0000\u0000\u01e3?\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005"+
		"B\u0000\u0000\u01e5\u01e6\u0007\u0005\u0000\u0000\u01e6\u01e7\u0005\t"+
		"\u0000\u0000\u01e7\u01e8\u0003*\u0015\u0000\u01e8\u01e9\u0005\u0001\u0000"+
		"\u0000\u01e9A\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005B\u0000\u0000\u01eb"+
		"\u01ec\u0005:\u0000\u0000\u01ec\u01ed\u0003*\u0015\u0000\u01ed\u01ee\u0005"+
		"\u0003\u0000\u0000\u01ee\u01ef\u0005\u0001\u0000\u0000\u01ef\u01f9\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\u0005B\u0000\u0000\u01f1\u01f2\u00058\u0000"+
		"\u0000\u01f2\u01f3\u0003*\u0015\u0000\u01f3\u01f4\u00059\u0000\u0000\u01f4"+
		"\u01f5\u0005\t\u0000\u0000\u01f5\u01f6\u0003*\u0015\u0000\u01f6\u01f7"+
		"\u0005\u0001\u0000\u0000\u01f7\u01f9\u0001\u0000\u0000\u0000\u01f8\u01ea"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f0\u0001\u0000\u0000\u0000\u01f9C\u0001"+
		"\u0000\u0000\u0000)GNZgp\u0090\u009e\u00b4\u00b9\u00bf\u00cf\u00d8\u00e1"+
		"\u00e8\u00ec\u00f6\u0102\u010f\u0114\u011a\u0127\u0137\u0145\u014a\u0164"+
		"\u016e\u0183\u0189\u018b\u018d\u0197\u019a\u01ad\u01b8\u01c0\u01c3\u01c7"+
		"\u01cc\u01d8\u01dd\u01f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}