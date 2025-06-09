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
		int _la;
		try {
			setState(184);
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
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(177);
					match(T__15);
					setState(178);
					expression(0);
					}
				}

				setState(181);
				match(T__2);
				}
				break;
			case T__55:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
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
			setState(186);
			match(T__20);
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(187);
				functionCall();
				}
				break;
			case 2:
				{
				setState(188);
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
			setState(191);
			match(T__21);
			setState(192);
			match(IDENTIFIER);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(193);
				match(T__8);
				setState(194);
				pointExpression();
				}
			}

			setState(197);
			match(T__14);
			setState(198);
			perimeterDeclaration();
			setState(199);
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
		enterRule(_localctx, 30, RULE_riverVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__22);
			setState(202);
			match(IDENTIFIER);
			setState(203);
			match(T__8);
			setState(204);
			listExpression();
			setState(205);
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
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(T__23);
				setState(208);
				match(IDENTIFIER);
				setState(209);
				match(T__24);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13792L) != 0)) {
					{
					setState(210);
					parameters();
					}
				}

				setState(213);
				match(T__2);
				setState(214);
				match(T__25);
				setState(215);
				type();
				setState(216);
				match(T__26);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2297117069470042636L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
					{
					{
					setState(217);
					statement();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				match(T__27);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(T__23);
				setState(226);
				match(IDENTIFIER);
				setState(227);
				match(T__24);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13792L) != 0)) {
					{
					setState(228);
					parameters();
					}
				}

				setState(231);
				match(T__2);
				setState(232);
				match(T__26);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2297117069470042636L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
					{
					{
					setState(233);
					statement();
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
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
			setState(242);
			type();
			setState(243);
			match(IDENTIFIER);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(244);
				match(T__15);
				setState(245);
				type();
				setState(246);
				match(IDENTIFIER);
				}
				}
				setState(252);
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
			setState(253);
			match(T__28);
			setState(254);
			match(T__24);
			setState(255);
			expression(0);
			setState(256);
			match(T__2);
			setState(257);
			match(T__29);
			setState(258);
			match(T__26);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2297117069470042636L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
				{
				{
				setState(259);
				statement();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			match(T__27);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(266);
				match(T__30);
				setState(267);
				match(T__24);
				setState(268);
				expression(0);
				setState(269);
				match(T__2);
				setState(270);
				match(T__29);
				setState(271);
				blockStatement();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(278);
				match(T__31);
				setState(279);
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
			setState(282);
			match(T__26);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2297117069470042636L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
				{
				{
				setState(283);
				statement();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
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
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new RepeatFixedLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(T__32);
				setState(292);
				match(T__14);
				setState(293);
				match(IDENTIFIER);
				setState(294);
				expression(0);
				setState(295);
				match(T__26);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2297117069470042636L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
					{
					{
					setState(296);
					statement();
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(302);
				match(T__27);
				}
				break;
			case 2:
				_localctx = new RepeatRangeLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(T__32);
				setState(305);
				match(T__14);
				setState(306);
				match(IDENTIFIER);
				setState(307);
				match(T__33);
				setState(308);
				expression(0);
				setState(309);
				match(T__34);
				setState(310);
				expression(0);
				setState(311);
				match(T__26);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2297117069470042636L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
					{
					{
					setState(312);
					statement();
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(318);
				match(T__27);
				}
				break;
			case 3:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				match(T__35);
				setState(321);
				match(T__24);
				setState(322);
				expression(0);
				setState(323);
				match(T__2);
				setState(324);
				match(T__29);
				setState(325);
				match(T__26);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2297117069470042636L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
					{
					{
					setState(326);
					statement();
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
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
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(337);
				match(T__24);
				setState(338);
				expression(0);
				setState(339);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				match(T__24);
				setState(342);
				type();
				setState(343);
				match(T__2);
				setState(344);
				expression(20);
				}
				break;
			case 3:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(346);
				match(T__36);
				setState(347);
				expression(19);
				}
				break;
			case 4:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				match(NOT);
				setState(349);
				expression(13);
				}
				break;
			case 5:
				{
				_localctx = new TrygExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(350);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222124650659840L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(351);
				match(T__24);
				setState(352);
				expression(0);
				setState(353);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(355);
				functionCall();
				}
				break;
			case 7:
				{
				_localctx = new ScopeAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(358); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(356);
					match(T__51);
					setState(357);
					match(T__52);
					}
					}
					setState(360); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__51 );
				setState(362);
				match(IDENTIFIER);
				}
				break;
			case 8:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(363);
				match(INT);
				}
				break;
			case 9:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(364);
				match(DOUBLE);
				}
				break;
			case 10:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(365);
				match(STRING);
				}
				break;
			case 11:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				match(BOOLEAN);
				}
				break;
			case 12:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(367);
				match(IDENTIFIER);
				}
				break;
			case 13:
				{
				_localctx = new PointAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(368);
				pointAccess();
				}
				break;
			case 14:
				{
				_localctx = new ListAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(369);
				listAccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(399);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(372);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(373);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==T__40) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(374);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(375);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(376);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__41) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(377);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new CompareExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(378);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(379);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 272678883690496L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(380);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(381);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(382);
						match(AND);
						setState(383);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(384);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(385);
						match(OR);
						setState(386);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new PowExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(387);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(388);
						match(T__37);
						setState(391);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__37:
							{
							setState(389);
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
							setState(390);
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
						setState(393);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(394);
						match(T__38);
						setState(397);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__38:
							{
							setState(395);
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
							setState(396);
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
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
			setState(404);
			match(IDENTIFIER);
			setState(405);
			match(T__24);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 4329587085313L) != 0)) {
				{
				setState(406);
				expression(0);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(407);
					match(T__15);
					setState(408);
					expression(0);
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(416);
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
			setState(418);
			match(IDENTIFIER);
			setState(419);
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
			setState(421);
			match(IDENTIFIER);
			setState(422);
			match(T__55);
			setState(423);
			expression(0);
			setState(424);
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
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(T__24);
				setState(427);
				expression(0);
				setState(428);
				match(T__15);
				setState(429);
				expression(0);
				setState(430);
				match(T__2);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
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
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(T__24);
				setState(436);
				pointExpression();
				setState(437);
				match(T__15);
				setState(438);
				expression(0);
				setState(439);
				match(T__15);
				setState(440);
				expression(0);
				setState(441);
				match(T__2);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
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
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(T__55);
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 4329587085313L) != 0)) {
					{
					setState(447);
					listElementExpression();
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(448);
						match(T__15);
						setState(449);
						listElementExpression();
						}
						}
						setState(454);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(457);
				match(T__56);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
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
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				pointExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
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
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(469);
				match(T__7);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(470);
				match(T__9);
				setState(471);
				type();
				setState(472);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(474);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(475);
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
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				variableAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				pointFieldAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
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
			setState(483);
			match(IDENTIFIER);
			setState(484);
			match(T__8);
			setState(485);
			expression(0);
			setState(486);
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
			setState(488);
			match(IDENTIFIER);
			setState(489);
			_la = _input.LA(1);
			if ( !(_la==T__53 || _la==T__54) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(490);
			match(T__8);
			setState(491);
			expression(0);
			setState(492);
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
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new ListAddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(IDENTIFIER);
				setState(495);
				match(T__57);
				setState(496);
				expression(0);
				setState(497);
				match(T__2);
				setState(498);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new ListUpdateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(IDENTIFIER);
				setState(501);
				match(T__55);
				setState(502);
				expression(0);
				setState(503);
				match(T__56);
				setState(504);
				match(T__8);
				setState(505);
				expression(0);
				setState(506);
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
		"\u0004\u0001E\u01ff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b4\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00b9\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u00be\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c4\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00d4\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00db\b\u0010\n\u0010\f\u0010\u00de"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00e6\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00eb\b\u0010\n\u0010\f\u0010\u00ee\t\u0010\u0001\u0010\u0003\u0010"+
		"\u00f1\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00f9\b\u0011\n\u0011\f\u0011\u00fc\t\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0105\b\u0012\n\u0012\f\u0012\u0108\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0112\b\u0012\n\u0012\f\u0012\u0115\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0119\b\u0012\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u011d\b\u0013\n\u0013\f\u0013\u0120\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u012a\b\u0014\n\u0014\f\u0014\u012d\t\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u013a\b\u0014\n"+
		"\u0014\f\u0014\u013d\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0148\b\u0014\n\u0014\f\u0014\u014b\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u014f\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0004\u0015\u0167\b\u0015\u000b\u0015\f\u0015\u0168\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0173\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0188\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u018e\b\u0015\u0005"+
		"\u0015\u0190\b\u0015\n\u0015\f\u0015\u0193\t\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u019a\b\u0016\n\u0016"+
		"\f\u0016\u019d\t\u0016\u0003\u0016\u019f\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01b2\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u01bd\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u01c3\b\u001b\n\u001b\f\u001b\u01c6"+
		"\t\u001b\u0003\u001b\u01c8\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u01cc\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01d1\b"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01dd"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01e2\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01fd"+
		"\b!\u0001!\u0000\u0001*\"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0006\u0001"+
		"\u0000\u0005\b\u0001\u000003\u0001\u0000()\u0002\u0000%%**\u0002\u0000"+
		"\u000b\u000b+/\u0001\u000067\u022c\u0000G\u0001\u0000\u0000\u0000\u0002"+
		"N\u0001\u0000\u0000\u0000\u0004Z\u0001\u0000\u0000\u0000\u0006\\\u0001"+
		"\u0000\u0000\u0000\bg\u0001\u0000\u0000\u0000\np\u0001\u0000\u0000\u0000"+
		"\fr\u0001\u0000\u0000\u0000\u000ex\u0001\u0000\u0000\u0000\u0010\u0080"+
		"\u0001\u0000\u0000\u0000\u0012\u0086\u0001\u0000\u0000\u0000\u0014\u009e"+
		"\u0001\u0000\u0000\u0000\u0016\u00a0\u0001\u0000\u0000\u0000\u0018\u00b8"+
		"\u0001\u0000\u0000\u0000\u001a\u00ba\u0001\u0000\u0000\u0000\u001c\u00bf"+
		"\u0001\u0000\u0000\u0000\u001e\u00c9\u0001\u0000\u0000\u0000 \u00f0\u0001"+
		"\u0000\u0000\u0000\"\u00f2\u0001\u0000\u0000\u0000$\u00fd\u0001\u0000"+
		"\u0000\u0000&\u011a\u0001\u0000\u0000\u0000(\u014e\u0001\u0000\u0000\u0000"+
		"*\u0172\u0001\u0000\u0000\u0000,\u0194\u0001\u0000\u0000\u0000.\u01a2"+
		"\u0001\u0000\u0000\u00000\u01a5\u0001\u0000\u0000\u00002\u01b1\u0001\u0000"+
		"\u0000\u00004\u01bc\u0001\u0000\u0000\u00006\u01cb\u0001\u0000\u0000\u0000"+
		"8\u01d0\u0001\u0000\u0000\u0000:\u01dc\u0001\u0000\u0000\u0000<\u01e1"+
		"\u0001\u0000\u0000\u0000>\u01e3\u0001\u0000\u0000\u0000@\u01e8\u0001\u0000"+
		"\u0000\u0000B\u01fc\u0001\u0000\u0000\u0000DF\u0003\u0002\u0001\u0000"+
		"ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000JK\u0005\u0000\u0000\u0001K\u0001\u0001\u0000\u0000\u0000"+
		"LO\u0003 \u0010\u0000MO\u0003\u0004\u0002\u0000NL\u0001\u0000\u0000\u0000"+
		"NM\u0001\u0000\u0000\u0000O\u0003\u0001\u0000\u0000\u0000P[\u0003\n\u0005"+
		"\u0000Q[\u0003$\u0012\u0000R[\u0003&\u0013\u0000S[\u0003(\u0014\u0000"+
		"T[\u0003<\u001e\u0000UV\u0003*\u0015\u0000VW\u0005\u0001\u0000\u0000W"+
		"[\u0001\u0000\u0000\u0000X[\u0003\b\u0004\u0000Y[\u0003\u0006\u0003\u0000"+
		"ZP\u0001\u0000\u0000\u0000ZQ\u0001\u0000\u0000\u0000ZR\u0001\u0000\u0000"+
		"\u0000ZS\u0001\u0000\u0000\u0000ZT\u0001\u0000\u0000\u0000ZU\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\u0005"+
		"\u0001\u0000\u0000\u0000\\]\u0005\u0002\u0000\u0000]^\u0003*\u0015\u0000"+
		"^_\u0005\u0003\u0000\u0000_`\u0005\u0001\u0000\u0000`\u0007\u0001\u0000"+
		"\u0000\u0000ab\u0005\u0004\u0000\u0000bc\u0003*\u0015\u0000cd\u0005\u0001"+
		"\u0000\u0000dh\u0001\u0000\u0000\u0000ef\u0005\u0004\u0000\u0000fh\u0005"+
		"\u0001\u0000\u0000ga\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"h\t\u0001\u0000\u0000\u0000iq\u0003\f\u0006\u0000jq\u0003\u000e\u0007"+
		"\u0000kq\u0003\u0010\b\u0000lq\u0003\u0012\t\u0000mq\u0003\u0014\n\u0000"+
		"nq\u0003\u001c\u000e\u0000oq\u0003\u001e\u000f\u0000pi\u0001\u0000\u0000"+
		"\u0000pj\u0001\u0000\u0000\u0000pk\u0001\u0000\u0000\u0000pl\u0001\u0000"+
		"\u0000\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001"+
		"\u0000\u0000\u0000q\u000b\u0001\u0000\u0000\u0000rs\u0007\u0000\u0000"+
		"\u0000st\u0005B\u0000\u0000tu\u0005\t\u0000\u0000uv\u0003*\u0015\u0000"+
		"vw\u0005\u0001\u0000\u0000w\r\u0001\u0000\u0000\u0000xy\u0005\n\u0000"+
		"\u0000yz\u0003:\u001d\u0000z{\u0005\u000b\u0000\u0000{|\u0005B\u0000\u0000"+
		"|}\u0005\t\u0000\u0000}~\u00036\u001b\u0000~\u007f\u0005\u0001\u0000\u0000"+
		"\u007f\u000f\u0001\u0000\u0000\u0000\u0080\u0081\u0005\f\u0000\u0000\u0081"+
		"\u0082\u0005B\u0000\u0000\u0082\u0083\u0005\t\u0000\u0000\u0083\u0084"+
		"\u00032\u0019\u0000\u0084\u0085\u0005\u0001\u0000\u0000\u0085\u0011\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005\r\u0000\u0000\u0087\u0088\u0005B"+
		"\u0000\u0000\u0088\u0089\u0005\t\u0000\u0000\u0089\u008a\u00034\u001a"+
		"\u0000\u008a\u008b\u0005\u0001\u0000\u0000\u008b\u0013\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u000e\u0000\u0000\u008d\u0090\u0005B\u0000\u0000"+
		"\u008e\u008f\u0005\t\u0000\u0000\u008f\u0091\u00032\u0019\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u000f\u0000\u0000\u0093"+
		"\u0094\u0003\u0016\u000b\u0000\u0094\u0095\u0005\u0010\u0000\u0000\u0095"+
		"\u0096\u0003\u001a\r\u0000\u0096\u0097\u0005\u0001\u0000\u0000\u0097\u009f"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u000e\u0000\u0000\u0099\u009a"+
		"\u0005B\u0000\u0000\u009a\u009b\u0005\t\u0000\u0000\u009b\u009c\u0003"+
		"*\u0015\u0000\u009c\u009d\u0005\u0001\u0000\u0000\u009d\u009f\u0001\u0000"+
		"\u0000\u0000\u009e\u008c\u0001\u0000\u0000\u0000\u009e\u0098\u0001\u0000"+
		"\u0000\u0000\u009f\u0015\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0011"+
		"\u0000\u0000\u00a1\u00a2\u0003\u0018\f\u0000\u00a2\u0017\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005\u0012\u0000\u0000\u00a4\u00a5\u0003*\u0015\u0000"+
		"\u00a5\u00a6\u0005\u0003\u0000\u0000\u00a6\u00b9\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0005\u0013\u0000\u0000\u00a8\u00a9\u0003*\u0015\u0000\u00a9"+
		"\u00aa\u0005\u0010\u0000\u0000\u00aa\u00ab\u0003*\u0015\u0000\u00ab\u00ac"+
		"\u0005\u0003\u0000\u0000\u00ac\u00b9\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0014\u0000\u0000\u00ae\u00af\u0003*\u0015\u0000\u00af\u00b0\u0005"+
		"\u0010\u0000\u0000\u00b0\u00b3\u0003*\u0015\u0000\u00b1\u00b2\u0005\u0010"+
		"\u0000\u0000\u00b2\u00b4\u0003*\u0015\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0005\u0003\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b9\u00036\u001b\u0000\u00b8\u00a3\u0001\u0000\u0000\u0000"+
		"\u00b8\u00a7\u0001\u0000\u0000\u0000\u00b8\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u0019\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bd\u0005\u0015\u0000\u0000\u00bb\u00be\u0003,\u0016\u0000\u00bc"+
		"\u00be\u00036\u001b\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u001b\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0005\u0016\u0000\u0000\u00c0\u00c3\u0005B\u0000\u0000\u00c1\u00c2\u0005"+
		"\t\u0000\u0000\u00c2\u00c4\u00032\u0019\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0005\u000f\u0000\u0000\u00c6\u00c7\u0003\u0016"+
		"\u000b\u0000\u00c7\u00c8\u0005\u0001\u0000\u0000\u00c8\u001d\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005\u0017\u0000\u0000\u00ca\u00cb\u0005B\u0000"+
		"\u0000\u00cb\u00cc\u0005\t\u0000\u0000\u00cc\u00cd\u00036\u001b\u0000"+
		"\u00cd\u00ce\u0005\u0001\u0000\u0000\u00ce\u001f\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0005\u0018\u0000\u0000\u00d0\u00d1\u0005B\u0000\u0000\u00d1"+
		"\u00d3\u0005\u0019\u0000\u0000\u00d2\u00d4\u0003\"\u0011\u0000\u00d3\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0003\u0000\u0000\u00d6\u00d7"+
		"\u0005\u001a\u0000\u0000\u00d7\u00d8\u0003:\u001d\u0000\u00d8\u00dc\u0005"+
		"\u001b\u0000\u0000\u00d9\u00db\u0003\u0004\u0002\u0000\u00da\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0001"+
		"\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"\u001c\u0000\u0000\u00e0\u00f1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		"\u0018\u0000\u0000\u00e2\u00e3\u0005B\u0000\u0000\u00e3\u00e5\u0005\u0019"+
		"\u0000\u0000\u00e4\u00e6\u0003\"\u0011\u0000\u00e5\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0005\u0003\u0000\u0000\u00e8\u00ec\u0005\u001b\u0000"+
		"\u0000\u00e9\u00eb\u0003\u0004\u0002\u0000\u00ea\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f1\u0005\u001c\u0000"+
		"\u0000\u00f0\u00cf\u0001\u0000\u0000\u0000\u00f0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00f1!\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003:\u001d\u0000\u00f3"+
		"\u00fa\u0005B\u0000\u0000\u00f4\u00f5\u0005\u0010\u0000\u0000\u00f5\u00f6"+
		"\u0003:\u001d\u0000\u00f6\u00f7\u0005B\u0000\u0000\u00f7\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fb#\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0005\u001d\u0000\u0000\u00fe\u00ff\u0005\u0019\u0000"+
		"\u0000\u00ff\u0100\u0003*\u0015\u0000\u0100\u0101\u0005\u0003\u0000\u0000"+
		"\u0101\u0102\u0005\u001e\u0000\u0000\u0102\u0106\u0005\u001b\u0000\u0000"+
		"\u0103\u0105\u0003\u0004\u0002\u0000\u0104\u0103\u0001\u0000\u0000\u0000"+
		"\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u0113\u0005\u001c\u0000\u0000"+
		"\u010a\u010b\u0005\u001f\u0000\u0000\u010b\u010c\u0005\u0019\u0000\u0000"+
		"\u010c\u010d\u0003*\u0015\u0000\u010d\u010e\u0005\u0003\u0000\u0000\u010e"+
		"\u010f\u0005\u001e\u0000\u0000\u010f\u0110\u0003&\u0013\u0000\u0110\u0112"+
		"\u0001\u0000\u0000\u0000\u0111\u010a\u0001\u0000\u0000\u0000\u0112\u0115"+
		"\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0001\u0000\u0000\u0000\u0114\u0118\u0001\u0000\u0000\u0000\u0115\u0113"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0005 \u0000\u0000\u0117\u0119\u0003"+
		"&\u0013\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119%\u0001\u0000\u0000\u0000\u011a\u011e\u0005\u001b\u0000"+
		"\u0000\u011b\u011d\u0003\u0004\u0002\u0000\u011c\u011b\u0001\u0000\u0000"+
		"\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000\u0000"+
		"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u001c\u0000"+
		"\u0000\u0122\'\u0001\u0000\u0000\u0000\u0123\u0124\u0005!\u0000\u0000"+
		"\u0124\u0125\u0005\u000f\u0000\u0000\u0125\u0126\u0005B\u0000\u0000\u0126"+
		"\u0127\u0003*\u0015\u0000\u0127\u012b\u0005\u001b\u0000\u0000\u0128\u012a"+
		"\u0003\u0004\u0002\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u012d"+
		"\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0001\u0000\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u012b"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u001c\u0000\u0000\u012f\u014f"+
		"\u0001\u0000\u0000\u0000\u0130\u0131\u0005!\u0000\u0000\u0131\u0132\u0005"+
		"\u000f\u0000\u0000\u0132\u0133\u0005B\u0000\u0000\u0133\u0134\u0005\""+
		"\u0000\u0000\u0134\u0135\u0003*\u0015\u0000\u0135\u0136\u0005#\u0000\u0000"+
		"\u0136\u0137\u0003*\u0015\u0000\u0137\u013b\u0005\u001b\u0000\u0000\u0138"+
		"\u013a\u0003\u0004\u0002\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a"+
		"\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0001\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d"+
		"\u013b\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u001c\u0000\u0000\u013f"+
		"\u014f\u0001\u0000\u0000\u0000\u0140\u0141\u0005$\u0000\u0000\u0141\u0142"+
		"\u0005\u0019\u0000\u0000\u0142\u0143\u0003*\u0015\u0000\u0143\u0144\u0005"+
		"\u0003\u0000\u0000\u0144\u0145\u0005\u001e\u0000\u0000\u0145\u0149\u0005"+
		"\u001b\u0000\u0000\u0146\u0148\u0003\u0004\u0002\u0000\u0147\u0146\u0001"+
		"\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014c\u0001"+
		"\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u014d\u0005"+
		"\u001c\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u0123\u0001"+
		"\u0000\u0000\u0000\u014e\u0130\u0001\u0000\u0000\u0000\u014e\u0140\u0001"+
		"\u0000\u0000\u0000\u014f)\u0001\u0000\u0000\u0000\u0150\u0151\u0006\u0015"+
		"\uffff\uffff\u0000\u0151\u0152\u0005\u0019\u0000\u0000\u0152\u0153\u0003"+
		"*\u0015\u0000\u0153\u0154\u0005\u0003\u0000\u0000\u0154\u0173\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0005\u0019\u0000\u0000\u0156\u0157\u0003:\u001d"+
		"\u0000\u0157\u0158\u0005\u0003\u0000\u0000\u0158\u0159\u0003*\u0015\u0014"+
		"\u0159\u0173\u0001\u0000\u0000\u0000\u015a\u015b\u0005%\u0000\u0000\u015b"+
		"\u0173\u0003*\u0015\u0013\u015c\u015d\u0005=\u0000\u0000\u015d\u0173\u0003"+
		"*\u0015\r\u015e\u015f\u0007\u0001\u0000\u0000\u015f\u0160\u0005\u0019"+
		"\u0000\u0000\u0160\u0161\u0003*\u0015\u0000\u0161\u0162\u0005\u0003\u0000"+
		"\u0000\u0162\u0173\u0001\u0000\u0000\u0000\u0163\u0173\u0003,\u0016\u0000"+
		"\u0164\u0165\u00054\u0000\u0000\u0165\u0167\u00055\u0000\u0000\u0166\u0164"+
		"\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0166"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0001\u0000\u0000\u0000\u016a\u0173\u0005B\u0000\u0000\u016b\u0173\u0005"+
		">\u0000\u0000\u016c\u0173\u0005?\u0000\u0000\u016d\u0173\u0005@\u0000"+
		"\u0000\u016e\u0173\u0005A\u0000\u0000\u016f\u0173\u0005B\u0000\u0000\u0170"+
		"\u0173\u0003.\u0017\u0000\u0171\u0173\u00030\u0018\u0000\u0172\u0150\u0001"+
		"\u0000\u0000\u0000\u0172\u0155\u0001\u0000\u0000\u0000\u0172\u015a\u0001"+
		"\u0000\u0000\u0000\u0172\u015c\u0001\u0000\u0000\u0000\u0172\u015e\u0001"+
		"\u0000\u0000\u0000\u0172\u0163\u0001\u0000\u0000\u0000\u0172\u0166\u0001"+
		"\u0000\u0000\u0000\u0172\u016b\u0001\u0000\u0000\u0000\u0172\u016c\u0001"+
		"\u0000\u0000\u0000\u0172\u016d\u0001\u0000\u0000\u0000\u0172\u016e\u0001"+
		"\u0000\u0000\u0000\u0172\u016f\u0001\u0000\u0000\u0000\u0172\u0170\u0001"+
		"\u0000\u0000\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173\u0191\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\n\u0010\u0000\u0000\u0175\u0176\u0007\u0002"+
		"\u0000\u0000\u0176\u0190\u0003*\u0015\u0011\u0177\u0178\n\u000f\u0000"+
		"\u0000\u0178\u0179\u0007\u0003\u0000\u0000\u0179\u0190\u0003*\u0015\u0010"+
		"\u017a\u017b\n\u000e\u0000\u0000\u017b\u017c\u0007\u0004\u0000\u0000\u017c"+
		"\u0190\u0003*\u0015\u000f\u017d\u017e\n\f\u0000\u0000\u017e\u017f\u0005"+
		";\u0000\u0000\u017f\u0190\u0003*\u0015\r\u0180\u0181\n\u000b\u0000\u0000"+
		"\u0181\u0182\u0005<\u0000\u0000\u0182\u0190\u0003*\u0015\f\u0183\u0184"+
		"\n\u0012\u0000\u0000\u0184\u0187\u0005&\u0000\u0000\u0185\u0188\u0005"+
		"&\u0000\u0000\u0186\u0188\u0003*\u0015\u0000\u0187\u0185\u0001\u0000\u0000"+
		"\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0188\u0190\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\n\u0011\u0000\u0000\u018a\u018d\u0005\'\u0000\u0000"+
		"\u018b\u018e\u0005\'\u0000\u0000\u018c\u018e\u0003*\u0015\u0000\u018d"+
		"\u018b\u0001\u0000\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018e"+
		"\u0190\u0001\u0000\u0000\u0000\u018f\u0174\u0001\u0000\u0000\u0000\u018f"+
		"\u0177\u0001\u0000\u0000\u0000\u018f\u017a\u0001\u0000\u0000\u0000\u018f"+
		"\u017d\u0001\u0000\u0000\u0000\u018f\u0180\u0001\u0000\u0000\u0000\u018f"+
		"\u0183\u0001\u0000\u0000\u0000\u018f\u0189\u0001\u0000\u0000\u0000\u0190"+
		"\u0193\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0001\u0000\u0000\u0000\u0192+\u0001\u0000\u0000\u0000\u0193\u0191"+
		"\u0001\u0000\u0000\u0000\u0194\u0195\u0005B\u0000\u0000\u0195\u019e\u0005"+
		"\u0019\u0000\u0000\u0196\u019b\u0003*\u0015\u0000\u0197\u0198\u0005\u0010"+
		"\u0000\u0000\u0198\u019a\u0003*\u0015\u0000\u0199\u0197\u0001\u0000\u0000"+
		"\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000"+
		"\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u0196\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0005\u0003\u0000\u0000\u01a1-\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a3\u0005B\u0000\u0000\u01a3\u01a4\u0007\u0005\u0000\u0000\u01a4"+
		"/\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005B\u0000\u0000\u01a6\u01a7\u0005"+
		"8\u0000\u0000\u01a7\u01a8\u0003*\u0015\u0000\u01a8\u01a9\u00059\u0000"+
		"\u0000\u01a91\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005\u0019\u0000\u0000"+
		"\u01ab\u01ac\u0003*\u0015\u0000\u01ac\u01ad\u0005\u0010\u0000\u0000\u01ad"+
		"\u01ae\u0003*\u0015\u0000\u01ae\u01af\u0005\u0003\u0000\u0000\u01af\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b2\u0005B\u0000\u0000\u01b1\u01aa\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b23\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\u0005\u0019\u0000\u0000\u01b4\u01b5\u00032\u0019"+
		"\u0000\u01b5\u01b6\u0005\u0010\u0000\u0000\u01b6\u01b7\u0003*\u0015\u0000"+
		"\u01b7\u01b8\u0005\u0010\u0000\u0000\u01b8\u01b9\u0003*\u0015\u0000\u01b9"+
		"\u01ba\u0005\u0003\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bd\u0005B\u0000\u0000\u01bc\u01b3\u0001\u0000\u0000\u0000\u01bc\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bd5\u0001\u0000\u0000\u0000\u01be\u01c7\u0005"+
		"8\u0000\u0000\u01bf\u01c4\u00038\u001c\u0000\u01c0\u01c1\u0005\u0010\u0000"+
		"\u0000\u01c1\u01c3\u00038\u001c\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c9\u01cc\u00059\u0000\u0000\u01ca\u01cc\u0005B\u0000\u0000\u01cb\u01be"+
		"\u0001\u0000\u0000\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cc7\u0001"+
		"\u0000\u0000\u0000\u01cd\u01d1\u0003*\u0015\u0000\u01ce\u01d1\u00032\u0019"+
		"\u0000\u01cf\u01d1\u00034\u001a\u0000\u01d0\u01cd\u0001\u0000\u0000\u0000"+
		"\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000"+
		"\u01d19\u0001\u0000\u0000\u0000\u01d2\u01dd\u0005\u0005\u0000\u0000\u01d3"+
		"\u01dd\u0005\u0006\u0000\u0000\u01d4\u01dd\u0005\u0007\u0000\u0000\u01d5"+
		"\u01dd\u0005\b\u0000\u0000\u01d6\u01d7\u0005\n\u0000\u0000\u01d7\u01d8"+
		"\u0003:\u001d\u0000\u01d8\u01d9\u0005\u000b\u0000\u0000\u01d9\u01dd\u0001"+
		"\u0000\u0000\u0000\u01da\u01dd\u0005\f\u0000\u0000\u01db\u01dd\u0005\r"+
		"\u0000\u0000\u01dc\u01d2\u0001\u0000\u0000\u0000\u01dc\u01d3\u0001\u0000"+
		"\u0000\u0000\u01dc\u01d4\u0001\u0000\u0000\u0000\u01dc\u01d5\u0001\u0000"+
		"\u0000\u0000\u01dc\u01d6\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000"+
		"\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd;\u0001\u0000\u0000"+
		"\u0000\u01de\u01e2\u0003>\u001f\u0000\u01df\u01e2\u0003@ \u0000\u01e0"+
		"\u01e2\u0003B!\u0000\u01e1\u01de\u0001\u0000\u0000\u0000\u01e1\u01df\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2=\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0005B\u0000\u0000\u01e4\u01e5\u0005\t\u0000"+
		"\u0000\u01e5\u01e6\u0003*\u0015\u0000\u01e6\u01e7\u0005\u0001\u0000\u0000"+
		"\u01e7?\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005B\u0000\u0000\u01e9\u01ea"+
		"\u0007\u0005\u0000\u0000\u01ea\u01eb\u0005\t\u0000\u0000\u01eb\u01ec\u0003"+
		"*\u0015\u0000\u01ec\u01ed\u0005\u0001\u0000\u0000\u01edA\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ef\u0005B\u0000\u0000\u01ef\u01f0\u0005:\u0000\u0000\u01f0"+
		"\u01f1\u0003*\u0015\u0000\u01f1\u01f2\u0005\u0003\u0000\u0000\u01f2\u01f3"+
		"\u0005\u0001\u0000\u0000\u01f3\u01fd\u0001\u0000\u0000\u0000\u01f4\u01f5"+
		"\u0005B\u0000\u0000\u01f5\u01f6\u00058\u0000\u0000\u01f6\u01f7\u0003*"+
		"\u0015\u0000\u01f7\u01f8\u00059\u0000\u0000\u01f8\u01f9\u0005\t\u0000"+
		"\u0000\u01f9\u01fa\u0003*\u0015\u0000\u01fa\u01fb\u0005\u0001\u0000\u0000"+
		"\u01fb\u01fd\u0001\u0000\u0000\u0000\u01fc\u01ee\u0001\u0000\u0000\u0000"+
		"\u01fc\u01f4\u0001\u0000\u0000\u0000\u01fdC\u0001\u0000\u0000\u0000*G"+
		"NZgp\u0090\u009e\u00b3\u00b8\u00bd\u00c3\u00d3\u00dc\u00e5\u00ec\u00f0"+
		"\u00fa\u0106\u0113\u0118\u011e\u012b\u013b\u0149\u014e\u0168\u0172\u0187"+
		"\u018d\u018f\u0191\u019b\u019e\u01b1\u01bc\u01c4\u01c7\u01cb\u01d0\u01dc"+
		"\u01e1\u01fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}