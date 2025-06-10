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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		AND=60, OR=61, NOT=62, INT=63, DOUBLE=64, STRING=65, BOOLEAN=66, EAST=67, 
		NORTH=68, WEST=69, SOUTH=70, SOUTH_EAST=71, SOUTH_WEST=72, NORTH_EAST=73, 
		NORTH_WEST=74, IDENTIFIER=75, WHITESPACE=76, LINE_COMMENT=77, COMMENT=78;
	public static final int
		RULE_program = 0, RULE_progStatement = 1, RULE_statement = 2, RULE_printStatement = 3, 
		RULE_returnStatement = 4, RULE_variableDeclaration = 5, RULE_primitiveVariableDeclaration = 6, 
		RULE_listVariableDeclaration = 7, RULE_pointVariableDeclaration = 8, RULE_heightVariableDeclaration = 9, 
		RULE_landVariableDeclaration = 10, RULE_perimeterDeclaration = 11, RULE_shape = 12, 
		RULE_heightDeclaration = 13, RULE_lakeVariableDeclaration = 14, RULE_riverVariableDeclaration = 15, 
		RULE_direction = 16, RULE_functionDeclaration = 17, RULE_parameters = 18, 
		RULE_ifStatement = 19, RULE_blockStatement = 20, RULE_loopStatement = 21, 
		RULE_expression = 22, RULE_functionCall = 23, RULE_pointAccess = 24, RULE_listAccess = 25, 
		RULE_pointExpression = 26, RULE_heightExpression = 27, RULE_listExpression = 28, 
		RULE_listElementExpression = 29, RULE_type = 30, RULE_assignment = 31, 
		RULE_variableAssignment = 32, RULE_pointFieldAssignment = 33, RULE_listAssignment = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "progStatement", "statement", "printStatement", "returnStatement", 
			"variableDeclaration", "primitiveVariableDeclaration", "listVariableDeclaration", 
			"pointVariableDeclaration", "heightVariableDeclaration", "landVariableDeclaration", 
			"perimeterDeclaration", "shape", "heightDeclaration", "lakeVariableDeclaration", 
			"riverVariableDeclaration", "direction", "functionDeclaration", "parameters", 
			"ifStatement", "blockStatement", "loopStatement", "expression", "functionCall", 
			"pointAccess", "listAccess", "pointExpression", "heightExpression", "listExpression", 
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
			"'height is'", "'Lake'", "'River'", "'to'", "'for'", "'function'", "'('", 
			"':'", "'{'", "'}'", "'if'", "'do'", "'eif'", "'else do'", "'repeat'", 
			"'from'", "'while'", "'-'", "'^'", "'?'", "'*'", "'/'", "'+'", "'<'", 
			"'>='", "'<='", "'='", "'!='", "'sin'", "'cos'", "'tg'", "'ctg'", "'parent'", 
			"'::'", "'.x'", "'.y'", "'['", "']'", "'.add('", "'and'", "'or'", "'not'", 
			null, null, null, null, "'east'", "'north'", "'west'", "'south'", "'south-east'", 
			"'south-west'", "'north-east'", "'north-west'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"AND", "OR", "NOT", "INT", "DOUBLE", "STRING", "BOOLEAN", "EAST", "NORTH", 
			"WEST", "SOUTH", "SOUTH_EAST", "SOUTH_WEST", "NORTH_EAST", "NORTH_WEST", 
			"IDENTIFIER", "WHITESPACE", "LINE_COMMENT", "COMMENT"
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
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4594234120296434188L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2055L) != 0)) {
				{
				{
				setState(70);
				progStatement();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
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
			case T__26:
			case T__28:
			case T__30:
			case T__34:
			case T__36:
			case T__37:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case NOT:
			case INT:
			case DOUBLE:
			case STRING:
			case BOOLEAN:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				blockStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				loopStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				expression(0);
				setState(88);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				returnStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(91);
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
			setState(94);
			match(T__1);
			setState(95);
			expression(0);
			setState(96);
			match(T__2);
			setState(97);
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__3);
				setState(100);
				expression(0);
				setState(101);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__3);
				setState(104);
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
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				primitiveVariableDeclaration();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				listVariableDeclaration();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				pointVariableDeclaration();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				heightVariableDeclaration();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				landVariableDeclaration();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				lakeVariableDeclaration();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 7);
				{
				setState(113);
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
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 480L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(117);
			match(IDENTIFIER);
			setState(118);
			match(T__8);
			setState(119);
			expression(0);
			setState(120);
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
			setState(122);
			match(T__9);
			setState(123);
			type();
			setState(124);
			match(T__10);
			setState(125);
			match(IDENTIFIER);
			setState(126);
			match(T__8);
			setState(127);
			listExpression();
			setState(128);
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
			setState(130);
			match(T__11);
			setState(131);
			match(IDENTIFIER);
			setState(132);
			match(T__8);
			setState(133);
			pointExpression();
			setState(134);
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
			setState(136);
			match(T__12);
			setState(137);
			match(IDENTIFIER);
			setState(138);
			match(T__8);
			setState(139);
			heightExpression();
			setState(140);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__13);
				setState(143);
				match(IDENTIFIER);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(144);
					match(T__8);
					setState(145);
					pointExpression();
					}
				}

				setState(148);
				match(T__14);
				setState(149);
				perimeterDeclaration();
				setState(150);
				match(T__15);
				setState(151);
				heightDeclaration();
				setState(152);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(T__13);
				setState(155);
				match(IDENTIFIER);
				setState(156);
				match(T__8);
				setState(157);
				expression(0);
				setState(158);
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
			setState(162);
			match(T__16);
			setState(163);
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
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__17);
				setState(166);
				expression(0);
				setState(167);
				match(T__2);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__18);
				setState(170);
				expression(0);
				setState(171);
				match(T__15);
				setState(172);
				expression(0);
				setState(173);
				match(T__2);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(T__19);
				setState(176);
				expression(0);
				setState(177);
				match(T__15);
				setState(178);
				expression(0);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(179);
					match(T__15);
					setState(180);
					expression(0);
					}
				}

				setState(183);
				match(T__2);
				}
				break;
			case T__56:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
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
			setState(188);
			match(T__20);
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(189);
				functionCall();
				}
				break;
			case 2:
				{
				setState(190);
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
			setState(193);
			match(T__21);
			setState(194);
			match(IDENTIFIER);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(195);
				match(T__8);
				setState(196);
				pointExpression();
				}
			}

			setState(199);
			match(T__14);
			setState(200);
			perimeterDeclaration();
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
	public static class RiverVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MapSParser.IDENTIFIER, 0); }
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public PointExpressionContext pointExpression() {
			return getRuleContext(PointExpressionContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RiverVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_riverVariableDeclaration; }
	}

	public final RiverVariableDeclarationContext riverVariableDeclaration() throws RecognitionException {
		RiverVariableDeclarationContext _localctx = new RiverVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_riverVariableDeclaration);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(T__22);
				setState(204);
				match(IDENTIFIER);
				setState(205);
				match(T__8);
				setState(206);
				listExpression();
				setState(207);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__22);
				setState(210);
				match(IDENTIFIER);
				setState(211);
				match(T__8);
				setState(212);
				pointExpression();
				setState(213);
				match(T__23);
				setState(214);
				direction();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(215);
					match(T__24);
					setState(216);
					expression(0);
					}
				}

				setState(219);
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
	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode EAST() { return getToken(MapSParser.EAST, 0); }
		public TerminalNode NORTH() { return getToken(MapSParser.NORTH, 0); }
		public TerminalNode WEST() { return getToken(MapSParser.WEST, 0); }
		public TerminalNode SOUTH() { return getToken(MapSParser.SOUTH, 0); }
		public TerminalNode SOUTH_EAST() { return getToken(MapSParser.SOUTH_EAST, 0); }
		public TerminalNode SOUTH_WEST() { return getToken(MapSParser.SOUTH_WEST, 0); }
		public TerminalNode NORTH_EAST() { return getToken(MapSParser.NORTH_EAST, 0); }
		public TerminalNode NORTH_WEST() { return getToken(MapSParser.NORTH_WEST, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 255L) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_functionDeclaration);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(T__25);
				setState(226);
				match(IDENTIFIER);
				setState(227);
				match(T__26);
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
				match(T__27);
				setState(233);
				type();
				setState(234);
				match(T__28);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4594234120363543052L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2055L) != 0)) {
					{
					{
					setState(235);
					statement();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				match(T__29);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(T__25);
				setState(244);
				match(IDENTIFIER);
				setState(245);
				match(T__26);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13792L) != 0)) {
					{
					setState(246);
					parameters();
					}
				}

				setState(249);
				match(T__2);
				setState(250);
				match(T__28);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4594234120363543052L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2055L) != 0)) {
					{
					{
					setState(251);
					statement();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(T__29);
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
		enterRule(_localctx, 36, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			type();
			setState(261);
			match(IDENTIFIER);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(262);
				match(T__15);
				setState(263);
				type();
				setState(264);
				match(IDENTIFIER);
				}
				}
				setState(270);
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
		enterRule(_localctx, 38, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__30);
			setState(272);
			match(T__26);
			setState(273);
			expression(0);
			setState(274);
			match(T__2);
			setState(275);
			match(T__31);
			setState(276);
			match(T__28);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4594234120363543052L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2055L) != 0)) {
				{
				{
				setState(277);
				statement();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(T__29);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(284);
				match(T__32);
				setState(285);
				match(T__26);
				setState(286);
				expression(0);
				setState(287);
				match(T__2);
				setState(288);
				match(T__31);
				setState(289);
				blockStatement();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(296);
				match(T__33);
				setState(297);
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
		enterRule(_localctx, 40, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__28);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4594234120363543052L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2055L) != 0)) {
				{
				{
				setState(301);
				statement();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(T__29);
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
		enterRule(_localctx, 42, RULE_loopStatement);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new RepeatFixedLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(T__34);
				setState(310);
				match(T__14);
				setState(311);
				match(IDENTIFIER);
				setState(312);
				expression(0);
				setState(313);
				match(T__28);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4594234120363543052L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2055L) != 0)) {
					{
					{
					setState(314);
					statement();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(320);
				match(T__29);
				}
				break;
			case 2:
				_localctx = new RepeatRangeLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(T__34);
				setState(323);
				match(T__14);
				setState(324);
				match(IDENTIFIER);
				setState(325);
				match(T__35);
				setState(326);
				expression(0);
				setState(327);
				match(T__23);
				setState(328);
				expression(0);
				setState(329);
				match(T__28);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4594234120363543052L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2055L) != 0)) {
					{
					{
					setState(330);
					statement();
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336);
				match(T__29);
				}
				break;
			case 3:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(T__36);
				setState(339);
				match(T__26);
				setState(340);
				expression(0);
				setState(341);
				match(T__2);
				setState(342);
				match(T__31);
				setState(343);
				match(T__28);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4594234120363543052L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2055L) != 0)) {
					{
					{
					setState(344);
					statement();
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(350);
				match(T__29);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(355);
				match(T__26);
				setState(356);
				expression(0);
				setState(357);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359);
				match(T__26);
				setState(360);
				type();
				setState(361);
				match(T__2);
				setState(362);
				expression(20);
				}
				break;
			case 3:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(364);
				match(T__37);
				setState(365);
				expression(19);
				}
				break;
			case 4:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				match(NOT);
				setState(367);
				expression(13);
				}
				break;
			case 5:
				{
				_localctx = new TrygExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(368);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8444249301319680L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(369);
				match(T__26);
				setState(370);
				expression(0);
				setState(371);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(373);
				functionCall();
				}
				break;
			case 7:
				{
				_localctx = new ScopeAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(376); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(374);
					match(T__52);
					setState(375);
					match(T__53);
					}
					}
					setState(378); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__52 );
				setState(380);
				match(IDENTIFIER);
				}
				break;
			case 8:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(381);
				match(INT);
				}
				break;
			case 9:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(382);
				match(DOUBLE);
				}
				break;
			case 10:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(383);
				match(STRING);
				}
				break;
			case 11:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(384);
				match(BOOLEAN);
				}
				break;
			case 12:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(385);
				match(IDENTIFIER);
				}
				break;
			case 13:
				{
				_localctx = new PointAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(386);
				pointAccess();
				}
				break;
			case 14:
				{
				_localctx = new ListAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(387);
				listAccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(417);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(390);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(391);
						_la = _input.LA(1);
						if ( !(_la==T__40 || _la==T__41) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(392);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(393);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(394);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__42) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(395);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new CompareExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(396);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(397);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 545357767378944L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(398);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(399);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(400);
						match(AND);
						setState(401);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(402);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(403);
						match(OR);
						setState(404);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new PowExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(405);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(406);
						match(T__38);
						setState(409);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__38:
							{
							setState(407);
							match(T__38);
							}
							break;
						case T__26:
						case T__37:
						case T__48:
						case T__49:
						case T__50:
						case T__51:
						case T__52:
						case NOT:
						case INT:
						case DOUBLE:
						case STRING:
						case BOOLEAN:
						case IDENTIFIER:
							{
							setState(408);
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
						setState(411);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(412);
						match(T__39);
						setState(415);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__39:
							{
							setState(413);
							match(T__39);
							}
							break;
						case T__26:
						case T__37:
						case T__48:
						case T__49:
						case T__50:
						case T__51:
						case T__52:
						case NOT:
						case INT:
						case DOUBLE:
						case STRING:
						case BOOLEAN:
						case IDENTIFIER:
							{
							setState(414);
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
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 46, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(IDENTIFIER);
			setState(423);
			match(T__26);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & 282540258625537L) != 0)) {
				{
				setState(424);
				expression(0);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(425);
					match(T__15);
					setState(426);
					expression(0);
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(434);
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
		enterRule(_localctx, 48, RULE_pointAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(IDENTIFIER);
			setState(437);
			_la = _input.LA(1);
			if ( !(_la==T__54 || _la==T__55) ) {
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
		enterRule(_localctx, 50, RULE_listAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(IDENTIFIER);
			setState(440);
			match(T__56);
			setState(441);
			expression(0);
			setState(442);
			match(T__57);
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
		enterRule(_localctx, 52, RULE_pointExpression);
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(T__26);
				setState(445);
				expression(0);
				setState(446);
				match(T__15);
				setState(447);
				expression(0);
				setState(448);
				match(T__2);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
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
		enterRule(_localctx, 54, RULE_heightExpression);
		try {
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(T__26);
				setState(454);
				pointExpression();
				setState(455);
				match(T__15);
				setState(456);
				expression(0);
				setState(457);
				match(T__15);
				setState(458);
				expression(0);
				setState(459);
				match(T__2);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
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
		enterRule(_localctx, 56, RULE_listExpression);
		int _la;
		try {
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__56:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(T__56);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & 282540258625537L) != 0)) {
					{
					setState(465);
					listElementExpression();
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(466);
						match(T__15);
						setState(467);
						listElementExpression();
						}
						}
						setState(472);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(475);
				match(T__57);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
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
		enterRule(_localctx, 58, RULE_listElementExpression);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				pointExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
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
		enterRule(_localctx, 60, RULE_type);
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				match(T__7);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(488);
				match(T__9);
				setState(489);
				type();
				setState(490);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(492);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(493);
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
		enterRule(_localctx, 62, RULE_assignment);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				variableAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				pointFieldAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
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
		enterRule(_localctx, 64, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(IDENTIFIER);
			setState(502);
			match(T__8);
			setState(503);
			expression(0);
			setState(504);
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
		enterRule(_localctx, 66, RULE_pointFieldAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(IDENTIFIER);
			setState(507);
			_la = _input.LA(1);
			if ( !(_la==T__54 || _la==T__55) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(508);
			match(T__8);
			setState(509);
			expression(0);
			setState(510);
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
		enterRule(_localctx, 68, RULE_listAssignment);
		try {
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new ListAddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(IDENTIFIER);
				setState(513);
				match(T__58);
				setState(514);
				expression(0);
				setState(515);
				match(T__2);
				setState(516);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new ListUpdateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(IDENTIFIER);
				setState(519);
				match(T__56);
				setState(520);
				expression(0);
				setState(521);
				match(T__57);
				setState(522);
				match(T__8);
				setState(523);
				expression(0);
				setState(524);
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
		case 22:
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
		"\u0004\u0001N\u0211\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0003\u0001Q\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002]\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004j\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005s\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0093\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00a1\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b6\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00bb\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u00c0"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c6"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00da\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00de"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00e6\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u00ed\b\u0011\n\u0011\f\u0011\u00f0\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00f8\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00fd\b\u0011\n\u0011\f\u0011\u0100\t\u0011\u0001\u0011\u0003\u0011\u0103"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u010b\b\u0012\n\u0012\f\u0012\u010e\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0117\b\u0013\n\u0013\f\u0013\u011a\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u0124\b\u0013\n\u0013\f\u0013\u0127\t\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u012b\b\u0013\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u012f\b\u0014\n\u0014\f\u0014\u0132\t\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u013c\b\u0015\n\u0015\f\u0015\u013f\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u014c\b\u0015\n\u0015"+
		"\f\u0015\u014f\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u015a\b\u0015\n\u0015\f\u0015\u015d\t\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0161\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0004"+
		"\u0016\u0179\b\u0016\u000b\u0016\f\u0016\u017a\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0185\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u019a\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01a0\b\u0016\u0005\u0016"+
		"\u01a2\b\u0016\n\u0016\f\u0016\u01a5\t\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01ac\b\u0017\n\u0017\f\u0017"+
		"\u01af\t\u0017\u0003\u0017\u01b1\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01c4\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01cf\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u01d5\b\u001c\n\u001c\f\u001c\u01d8\t\u001c"+
		"\u0003\u001c\u01da\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01de\b"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01e3\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01ef\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01f4\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u020f\b\"\u0001\"\u0000\u0001"+
		",#\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BD\u0000\u0007\u0001\u0000\u0005\b\u0001"+
		"\u0000CJ\u0001\u000014\u0001\u0000)*\u0002\u0000&&++\u0002\u0000\u000b"+
		"\u000b,0\u0001\u000078\u023f\u0000I\u0001\u0000\u0000\u0000\u0002P\u0001"+
		"\u0000\u0000\u0000\u0004\\\u0001\u0000\u0000\u0000\u0006^\u0001\u0000"+
		"\u0000\u0000\bi\u0001\u0000\u0000\u0000\nr\u0001\u0000\u0000\u0000\ft"+
		"\u0001\u0000\u0000\u0000\u000ez\u0001\u0000\u0000\u0000\u0010\u0082\u0001"+
		"\u0000\u0000\u0000\u0012\u0088\u0001\u0000\u0000\u0000\u0014\u00a0\u0001"+
		"\u0000\u0000\u0000\u0016\u00a2\u0001\u0000\u0000\u0000\u0018\u00ba\u0001"+
		"\u0000\u0000\u0000\u001a\u00bc\u0001\u0000\u0000\u0000\u001c\u00c1\u0001"+
		"\u0000\u0000\u0000\u001e\u00dd\u0001\u0000\u0000\u0000 \u00df\u0001\u0000"+
		"\u0000\u0000\"\u0102\u0001\u0000\u0000\u0000$\u0104\u0001\u0000\u0000"+
		"\u0000&\u010f\u0001\u0000\u0000\u0000(\u012c\u0001\u0000\u0000\u0000*"+
		"\u0160\u0001\u0000\u0000\u0000,\u0184\u0001\u0000\u0000\u0000.\u01a6\u0001"+
		"\u0000\u0000\u00000\u01b4\u0001\u0000\u0000\u00002\u01b7\u0001\u0000\u0000"+
		"\u00004\u01c3\u0001\u0000\u0000\u00006\u01ce\u0001\u0000\u0000\u00008"+
		"\u01dd\u0001\u0000\u0000\u0000:\u01e2\u0001\u0000\u0000\u0000<\u01ee\u0001"+
		"\u0000\u0000\u0000>\u01f3\u0001\u0000\u0000\u0000@\u01f5\u0001\u0000\u0000"+
		"\u0000B\u01fa\u0001\u0000\u0000\u0000D\u020e\u0001\u0000\u0000\u0000F"+
		"H\u0003\u0002\u0001\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005\u0000\u0000\u0001M\u0001"+
		"\u0001\u0000\u0000\u0000NQ\u0003\"\u0011\u0000OQ\u0003\u0004\u0002\u0000"+
		"PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\u0003\u0001\u0000"+
		"\u0000\u0000R]\u0003\n\u0005\u0000S]\u0003&\u0013\u0000T]\u0003(\u0014"+
		"\u0000U]\u0003*\u0015\u0000V]\u0003>\u001f\u0000WX\u0003,\u0016\u0000"+
		"XY\u0005\u0001\u0000\u0000Y]\u0001\u0000\u0000\u0000Z]\u0003\b\u0004\u0000"+
		"[]\u0003\u0006\u0003\u0000\\R\u0001\u0000\u0000\u0000\\S\u0001\u0000\u0000"+
		"\u0000\\T\u0001\u0000\u0000\u0000\\U\u0001\u0000\u0000\u0000\\V\u0001"+
		"\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\[\u0001\u0000\u0000\u0000]\u0005\u0001\u0000\u0000\u0000^_\u0005\u0002"+
		"\u0000\u0000_`\u0003,\u0016\u0000`a\u0005\u0003\u0000\u0000ab\u0005\u0001"+
		"\u0000\u0000b\u0007\u0001\u0000\u0000\u0000cd\u0005\u0004\u0000\u0000"+
		"de\u0003,\u0016\u0000ef\u0005\u0001\u0000\u0000fj\u0001\u0000\u0000\u0000"+
		"gh\u0005\u0004\u0000\u0000hj\u0005\u0001\u0000\u0000ic\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000j\t\u0001\u0000\u0000\u0000ks\u0003\f"+
		"\u0006\u0000ls\u0003\u000e\u0007\u0000ms\u0003\u0010\b\u0000ns\u0003\u0012"+
		"\t\u0000os\u0003\u0014\n\u0000ps\u0003\u001c\u000e\u0000qs\u0003\u001e"+
		"\u000f\u0000rk\u0001\u0000\u0000\u0000rl\u0001\u0000\u0000\u0000rm\u0001"+
		"\u0000\u0000\u0000rn\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u000b\u0001\u0000"+
		"\u0000\u0000tu\u0007\u0000\u0000\u0000uv\u0005K\u0000\u0000vw\u0005\t"+
		"\u0000\u0000wx\u0003,\u0016\u0000xy\u0005\u0001\u0000\u0000y\r\u0001\u0000"+
		"\u0000\u0000z{\u0005\n\u0000\u0000{|\u0003<\u001e\u0000|}\u0005\u000b"+
		"\u0000\u0000}~\u0005K\u0000\u0000~\u007f\u0005\t\u0000\u0000\u007f\u0080"+
		"\u00038\u001c\u0000\u0080\u0081\u0005\u0001\u0000\u0000\u0081\u000f\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005\f\u0000\u0000\u0083\u0084\u0005K"+
		"\u0000\u0000\u0084\u0085\u0005\t\u0000\u0000\u0085\u0086\u00034\u001a"+
		"\u0000\u0086\u0087\u0005\u0001\u0000\u0000\u0087\u0011\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005\r\u0000\u0000\u0089\u008a\u0005K\u0000\u0000"+
		"\u008a\u008b\u0005\t\u0000\u0000\u008b\u008c\u00036\u001b\u0000\u008c"+
		"\u008d\u0005\u0001\u0000\u0000\u008d\u0013\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005\u000e\u0000\u0000\u008f\u0092\u0005K\u0000\u0000\u0090\u0091"+
		"\u0005\t\u0000\u0000\u0091\u0093\u00034\u001a\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\u000f\u0000\u0000\u0095\u0096\u0003"+
		"\u0016\u000b\u0000\u0096\u0097\u0005\u0010\u0000\u0000\u0097\u0098\u0003"+
		"\u001a\r\u0000\u0098\u0099\u0005\u0001\u0000\u0000\u0099\u00a1\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005\u000e\u0000\u0000\u009b\u009c\u0005K\u0000"+
		"\u0000\u009c\u009d\u0005\t\u0000\u0000\u009d\u009e\u0003,\u0016\u0000"+
		"\u009e\u009f\u0005\u0001\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a0\u008e\u0001\u0000\u0000\u0000\u00a0\u009a\u0001\u0000\u0000\u0000"+
		"\u00a1\u0015\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0011\u0000\u0000"+
		"\u00a3\u00a4\u0003\u0018\f\u0000\u00a4\u0017\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\u0012\u0000\u0000\u00a6\u00a7\u0003,\u0016\u0000\u00a7\u00a8"+
		"\u0005\u0003\u0000\u0000\u00a8\u00bb\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0013\u0000\u0000\u00aa\u00ab\u0003,\u0016\u0000\u00ab\u00ac\u0005"+
		"\u0010\u0000\u0000\u00ac\u00ad\u0003,\u0016\u0000\u00ad\u00ae\u0005\u0003"+
		"\u0000\u0000\u00ae\u00bb\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0014"+
		"\u0000\u0000\u00b0\u00b1\u0003,\u0016\u0000\u00b1\u00b2\u0005\u0010\u0000"+
		"\u0000\u00b2\u00b5\u0003,\u0016\u0000\u00b3\u00b4\u0005\u0010\u0000\u0000"+
		"\u00b4\u00b6\u0003,\u0016\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005\u0003\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bb\u00038\u001c\u0000\u00ba\u00a5\u0001\u0000\u0000\u0000\u00ba\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ba\u00af\u0001\u0000\u0000\u0000\u00ba\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bb\u0019\u0001\u0000\u0000\u0000\u00bc\u00bf"+
		"\u0005\u0015\u0000\u0000\u00bd\u00c0\u0003.\u0017\u0000\u00be\u00c0\u0003"+
		"8\u001c\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u001b\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0016"+
		"\u0000\u0000\u00c2\u00c5\u0005K\u0000\u0000\u00c3\u00c4\u0005\t\u0000"+
		"\u0000\u00c4\u00c6\u00034\u001a\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0005\u000f\u0000\u0000\u00c8\u00c9\u0003\u0016\u000b\u0000"+
		"\u00c9\u00ca\u0005\u0001\u0000\u0000\u00ca\u001d\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0005\u0017\u0000\u0000\u00cc\u00cd\u0005K\u0000\u0000\u00cd"+
		"\u00ce\u0005\t\u0000\u0000\u00ce\u00cf\u00038\u001c\u0000\u00cf\u00d0"+
		"\u0005\u0001\u0000\u0000\u00d0\u00de\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0005\u0017\u0000\u0000\u00d2\u00d3\u0005K\u0000\u0000\u00d3\u00d4\u0005"+
		"\t\u0000\u0000\u00d4\u00d5\u00034\u001a\u0000\u00d5\u00d6\u0005\u0018"+
		"\u0000\u0000\u00d6\u00d9\u0003 \u0010\u0000\u00d7\u00d8\u0005\u0019\u0000"+
		"\u0000\u00d8\u00da\u0003,\u0016\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0005\u0001\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000"+
		"\u00dd\u00cb\u0001\u0000\u0000\u0000\u00dd\u00d1\u0001\u0000\u0000\u0000"+
		"\u00de\u001f\u0001\u0000\u0000\u0000\u00df\u00e0\u0007\u0001\u0000\u0000"+
		"\u00e0!\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u001a\u0000\u0000\u00e2"+
		"\u00e3\u0005K\u0000\u0000\u00e3\u00e5\u0005\u001b\u0000\u0000\u00e4\u00e6"+
		"\u0003$\u0012\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		"\u0003\u0000\u0000\u00e8\u00e9\u0005\u001c\u0000\u0000\u00e9\u00ea\u0003"+
		"<\u001e\u0000\u00ea\u00ee\u0005\u001d\u0000\u0000\u00eb\u00ed\u0003\u0004"+
		"\u0002\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0005\u001e\u0000\u0000\u00f2\u0103\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0005\u001a\u0000\u0000\u00f4\u00f5\u0005K\u0000"+
		"\u0000\u00f5\u00f7\u0005\u001b\u0000\u0000\u00f6\u00f8\u0003$\u0012\u0000"+
		"\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0003\u0000\u0000"+
		"\u00fa\u00fe\u0005\u001d\u0000\u0000\u00fb\u00fd\u0003\u0004\u0002\u0000"+
		"\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000"+
		"\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0101\u0103\u0005\u001e\u0000\u0000\u0102\u00e1\u0001\u0000\u0000\u0000"+
		"\u0102\u00f3\u0001\u0000\u0000\u0000\u0103#\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0003<\u001e\u0000\u0105\u010c\u0005K\u0000\u0000\u0106\u0107\u0005"+
		"\u0010\u0000\u0000\u0107\u0108\u0003<\u001e\u0000\u0108\u0109\u0005K\u0000"+
		"\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0106\u0001\u0000\u0000"+
		"\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d%\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u001f\u0000\u0000"+
		"\u0110\u0111\u0005\u001b\u0000\u0000\u0111\u0112\u0003,\u0016\u0000\u0112"+
		"\u0113\u0005\u0003\u0000\u0000\u0113\u0114\u0005 \u0000\u0000\u0114\u0118"+
		"\u0005\u001d\u0000\u0000\u0115\u0117\u0003\u0004\u0002\u0000\u0116\u0115"+
		"\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116"+
		"\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011b"+
		"\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u0125"+
		"\u0005\u001e\u0000\u0000\u011c\u011d\u0005!\u0000\u0000\u011d\u011e\u0005"+
		"\u001b\u0000\u0000\u011e\u011f\u0003,\u0016\u0000\u011f\u0120\u0005\u0003"+
		"\u0000\u0000\u0120\u0121\u0005 \u0000\u0000\u0121\u0122\u0003(\u0014\u0000"+
		"\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u011c\u0001\u0000\u0000\u0000"+
		"\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u012a\u0001\u0000\u0000\u0000"+
		"\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u0129\u0005\"\u0000\u0000\u0129"+
		"\u012b\u0003(\u0014\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0001\u0000\u0000\u0000\u012b\'\u0001\u0000\u0000\u0000\u012c\u0130\u0005"+
		"\u001d\u0000\u0000\u012d\u012f\u0003\u0004\u0002\u0000\u012e\u012d\u0001"+
		"\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0001"+
		"\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0134\u0005"+
		"\u001e\u0000\u0000\u0134)\u0001\u0000\u0000\u0000\u0135\u0136\u0005#\u0000"+
		"\u0000\u0136\u0137\u0005\u000f\u0000\u0000\u0137\u0138\u0005K\u0000\u0000"+
		"\u0138\u0139\u0003,\u0016\u0000\u0139\u013d\u0005\u001d\u0000\u0000\u013a"+
		"\u013c\u0003\u0004\u0002\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013c"+
		"\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f"+
		"\u013d\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u001e\u0000\u0000\u0141"+
		"\u0161\u0001\u0000\u0000\u0000\u0142\u0143\u0005#\u0000\u0000\u0143\u0144"+
		"\u0005\u000f\u0000\u0000\u0144\u0145\u0005K\u0000\u0000\u0145\u0146\u0005"+
		"$\u0000\u0000\u0146\u0147\u0003,\u0016\u0000\u0147\u0148\u0005\u0018\u0000"+
		"\u0000\u0148\u0149\u0003,\u0016\u0000\u0149\u014d\u0005\u001d\u0000\u0000"+
		"\u014a\u014c\u0003\u0004\u0002\u0000\u014b\u014a\u0001\u0000\u0000\u0000"+
		"\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000"+
		"\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u001e\u0000\u0000"+
		"\u0151\u0161\u0001\u0000\u0000\u0000\u0152\u0153\u0005%\u0000\u0000\u0153"+
		"\u0154\u0005\u001b\u0000\u0000\u0154\u0155\u0003,\u0016\u0000\u0155\u0156"+
		"\u0005\u0003\u0000\u0000\u0156\u0157\u0005 \u0000\u0000\u0157\u015b\u0005"+
		"\u001d\u0000\u0000\u0158\u015a\u0003\u0004\u0002\u0000\u0159\u0158\u0001"+
		"\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0001"+
		"\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u015f\u0005"+
		"\u001e\u0000\u0000\u015f\u0161\u0001\u0000\u0000\u0000\u0160\u0135\u0001"+
		"\u0000\u0000\u0000\u0160\u0142\u0001\u0000\u0000\u0000\u0160\u0152\u0001"+
		"\u0000\u0000\u0000\u0161+\u0001\u0000\u0000\u0000\u0162\u0163\u0006\u0016"+
		"\uffff\uffff\u0000\u0163\u0164\u0005\u001b\u0000\u0000\u0164\u0165\u0003"+
		",\u0016\u0000\u0165\u0166\u0005\u0003\u0000\u0000\u0166\u0185\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0005\u001b\u0000\u0000\u0168\u0169\u0003<\u001e"+
		"\u0000\u0169\u016a\u0005\u0003\u0000\u0000\u016a\u016b\u0003,\u0016\u0014"+
		"\u016b\u0185\u0001\u0000\u0000\u0000\u016c\u016d\u0005&\u0000\u0000\u016d"+
		"\u0185\u0003,\u0016\u0013\u016e\u016f\u0005>\u0000\u0000\u016f\u0185\u0003"+
		",\u0016\r\u0170\u0171\u0007\u0002\u0000\u0000\u0171\u0172\u0005\u001b"+
		"\u0000\u0000\u0172\u0173\u0003,\u0016\u0000\u0173\u0174\u0005\u0003\u0000"+
		"\u0000\u0174\u0185\u0001\u0000\u0000\u0000\u0175\u0185\u0003.\u0017\u0000"+
		"\u0176\u0177\u00055\u0000\u0000\u0177\u0179\u00056\u0000\u0000\u0178\u0176"+
		"\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u0178"+
		"\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0001\u0000\u0000\u0000\u017c\u0185\u0005K\u0000\u0000\u017d\u0185\u0005"+
		"?\u0000\u0000\u017e\u0185\u0005@\u0000\u0000\u017f\u0185\u0005A\u0000"+
		"\u0000\u0180\u0185\u0005B\u0000\u0000\u0181\u0185\u0005K\u0000\u0000\u0182"+
		"\u0185\u00030\u0018\u0000\u0183\u0185\u00032\u0019\u0000\u0184\u0162\u0001"+
		"\u0000\u0000\u0000\u0184\u0167\u0001\u0000\u0000\u0000\u0184\u016c\u0001"+
		"\u0000\u0000\u0000\u0184\u016e\u0001\u0000\u0000\u0000\u0184\u0170\u0001"+
		"\u0000\u0000\u0000\u0184\u0175\u0001\u0000\u0000\u0000\u0184\u0178\u0001"+
		"\u0000\u0000\u0000\u0184\u017d\u0001\u0000\u0000\u0000\u0184\u017e\u0001"+
		"\u0000\u0000\u0000\u0184\u017f\u0001\u0000\u0000\u0000\u0184\u0180\u0001"+
		"\u0000\u0000\u0000\u0184\u0181\u0001\u0000\u0000\u0000\u0184\u0182\u0001"+
		"\u0000\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185\u01a3\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\n\u0010\u0000\u0000\u0187\u0188\u0007\u0003"+
		"\u0000\u0000\u0188\u01a2\u0003,\u0016\u0011\u0189\u018a\n\u000f\u0000"+
		"\u0000\u018a\u018b\u0007\u0004\u0000\u0000\u018b\u01a2\u0003,\u0016\u0010"+
		"\u018c\u018d\n\u000e\u0000\u0000\u018d\u018e\u0007\u0005\u0000\u0000\u018e"+
		"\u01a2\u0003,\u0016\u000f\u018f\u0190\n\f\u0000\u0000\u0190\u0191\u0005"+
		"<\u0000\u0000\u0191\u01a2\u0003,\u0016\r\u0192\u0193\n\u000b\u0000\u0000"+
		"\u0193\u0194\u0005=\u0000\u0000\u0194\u01a2\u0003,\u0016\f\u0195\u0196"+
		"\n\u0012\u0000\u0000\u0196\u0199\u0005\'\u0000\u0000\u0197\u019a\u0005"+
		"\'\u0000\u0000\u0198\u019a\u0003,\u0016\u0000\u0199\u0197\u0001\u0000"+
		"\u0000\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u019a\u01a2\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\n\u0011\u0000\u0000\u019c\u019f\u0005(\u0000"+
		"\u0000\u019d\u01a0\u0005(\u0000\u0000\u019e\u01a0\u0003,\u0016\u0000\u019f"+
		"\u019d\u0001\u0000\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a1\u0186\u0001\u0000\u0000\u0000\u01a1"+
		"\u0189\u0001\u0000\u0000\u0000\u01a1\u018c\u0001\u0000\u0000\u0000\u01a1"+
		"\u018f\u0001\u0000\u0000\u0000\u01a1\u0192\u0001\u0000\u0000\u0000\u01a1"+
		"\u0195\u0001\u0000\u0000\u0000\u01a1\u019b\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a4-\u0001\u0000\u0000\u0000\u01a5\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005K\u0000\u0000\u01a7\u01b0\u0005"+
		"\u001b\u0000\u0000\u01a8\u01ad\u0003,\u0016\u0000\u01a9\u01aa\u0005\u0010"+
		"\u0000\u0000\u01aa\u01ac\u0003,\u0016\u0000\u01ab\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000"+
		"\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01a8\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0005\u0003\u0000\u0000\u01b3/\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0005K\u0000\u0000\u01b5\u01b6\u0007\u0006\u0000\u0000\u01b6"+
		"1\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005K\u0000\u0000\u01b8\u01b9\u0005"+
		"9\u0000\u0000\u01b9\u01ba\u0003,\u0016\u0000\u01ba\u01bb\u0005:\u0000"+
		"\u0000\u01bb3\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005\u001b\u0000\u0000"+
		"\u01bd\u01be\u0003,\u0016\u0000\u01be\u01bf\u0005\u0010\u0000\u0000\u01bf"+
		"\u01c0\u0003,\u0016\u0000\u01c0\u01c1\u0005\u0003\u0000\u0000\u01c1\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c4\u0005K\u0000\u0000\u01c3\u01bc\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c45\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u0005\u001b\u0000\u0000\u01c6\u01c7\u00034\u001a"+
		"\u0000\u01c7\u01c8\u0005\u0010\u0000\u0000\u01c8\u01c9\u0003,\u0016\u0000"+
		"\u01c9\u01ca\u0005\u0010\u0000\u0000\u01ca\u01cb\u0003,\u0016\u0000\u01cb"+
		"\u01cc\u0005\u0003\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd"+
		"\u01cf\u0005K\u0000\u0000\u01ce\u01c5\u0001\u0000\u0000\u0000\u01ce\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cf7\u0001\u0000\u0000\u0000\u01d0\u01d9\u0005"+
		"9\u0000\u0000\u01d1\u01d6\u0003:\u001d\u0000\u01d2\u01d3\u0005\u0010\u0000"+
		"\u0000\u01d3\u01d5\u0003:\u001d\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000"+
		"\u01db\u01de\u0005:\u0000\u0000\u01dc\u01de\u0005K\u0000\u0000\u01dd\u01d0"+
		"\u0001\u0000\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01de9\u0001"+
		"\u0000\u0000\u0000\u01df\u01e3\u0003,\u0016\u0000\u01e0\u01e3\u00034\u001a"+
		"\u0000\u01e1\u01e3\u00036\u001b\u0000\u01e2\u01df\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e3;\u0001\u0000\u0000\u0000\u01e4\u01ef\u0005\u0005\u0000\u0000\u01e5"+
		"\u01ef\u0005\u0006\u0000\u0000\u01e6\u01ef\u0005\u0007\u0000\u0000\u01e7"+
		"\u01ef\u0005\b\u0000\u0000\u01e8\u01e9\u0005\n\u0000\u0000\u01e9\u01ea"+
		"\u0003<\u001e\u0000\u01ea\u01eb\u0005\u000b\u0000\u0000\u01eb\u01ef\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ef\u0005\f\u0000\u0000\u01ed\u01ef\u0005\r"+
		"\u0000\u0000\u01ee\u01e4\u0001\u0000\u0000\u0000\u01ee\u01e5\u0001\u0000"+
		"\u0000\u0000\u01ee\u01e6\u0001\u0000\u0000\u0000\u01ee\u01e7\u0001\u0000"+
		"\u0000\u0000\u01ee\u01e8\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ef=\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f4\u0003@ \u0000\u01f1\u01f4\u0003B!\u0000\u01f2\u01f4"+
		"\u0003D\"\u0000\u01f3\u01f0\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f4?\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u0005K\u0000\u0000\u01f6\u01f7\u0005\t\u0000"+
		"\u0000\u01f7\u01f8\u0003,\u0016\u0000\u01f8\u01f9\u0005\u0001\u0000\u0000"+
		"\u01f9A\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005K\u0000\u0000\u01fb\u01fc"+
		"\u0007\u0006\u0000\u0000\u01fc\u01fd\u0005\t\u0000\u0000\u01fd\u01fe\u0003"+
		",\u0016\u0000\u01fe\u01ff\u0005\u0001\u0000\u0000\u01ffC\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0005K\u0000\u0000\u0201\u0202\u0005;\u0000\u0000\u0202"+
		"\u0203\u0003,\u0016\u0000\u0203\u0204\u0005\u0003\u0000\u0000\u0204\u0205"+
		"\u0005\u0001\u0000\u0000\u0205\u020f\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0005K\u0000\u0000\u0207\u0208\u00059\u0000\u0000\u0208\u0209\u0003,"+
		"\u0016\u0000\u0209\u020a\u0005:\u0000\u0000\u020a\u020b\u0005\t\u0000"+
		"\u0000\u020b\u020c\u0003,\u0016\u0000\u020c\u020d\u0005\u0001\u0000\u0000"+
		"\u020d\u020f\u0001\u0000\u0000\u0000\u020e\u0200\u0001\u0000\u0000\u0000"+
		"\u020e\u0206\u0001\u0000\u0000\u0000\u020fE\u0001\u0000\u0000\u0000,I"+
		"P\\ir\u0092\u00a0\u00b5\u00ba\u00bf\u00c5\u00d9\u00dd\u00e5\u00ee\u00f7"+
		"\u00fe\u0102\u010c\u0118\u0125\u012a\u0130\u013d\u014d\u015b\u0160\u017a"+
		"\u0184\u0199\u019f\u01a1\u01a3\u01ad\u01b0\u01c3\u01ce\u01d6\u01d9\u01dd"+
		"\u01e2\u01ee\u01f3\u020e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}