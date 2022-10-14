// Generated from C:/Users/Median/workspace/RdfPatternEngine/src/main/antlr4\SPARQLPatternsGrammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SPARQLPatternsGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, VARAIBLEMARKER=4, DOTLISTSEP=5, FILTEROPENER=6, 
		FILTERCLOSER=7, SINGELTONSEP=8, SPACELISTSEP=9, FILTERLISTSEP=10, JFLISTSEP=11, 
		JCSEP=12, DOTSEP=13, CONCAT=14, ASCLAUSEBEGIN=15, ASCLAUSEEND=16, AS=17, 
		ID=18, SPARQLTEXT=19, WS=20;
	public static final int
		RULE_sparqlTemplate = 0, RULE_patternFunction = 1, RULE_singleton = 2, 
		RULE_spaceList = 3, RULE_filterList = 4, RULE_dotList = 5, RULE_joinFilterList = 6, 
		RULE_asClause = 7, RULE_baseElement = 8, RULE_prefixedElementRole = 9, 
		RULE_prefix = 10, RULE_elementRole = 11, RULE_attribute = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"sparqlTemplate", "patternFunction", "singleton", "spaceList", "filterList", 
			"dotList", "joinFilterList", "asClause", "baseElement", "prefixedElementRole", 
			"prefix", "elementRole", "attribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'<'", "'>'", "'!VM'", "'!DL'", "' FILTER('", "')'", "'!E'", 
			"'!SL'", "'!FL'", "'!JL'", "'!JFL'", "'.'", "'!+'", "'!['", "'!]'", "'AS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "VARAIBLEMARKER", "DOTLISTSEP", "FILTEROPENER", 
			"FILTERCLOSER", "SINGELTONSEP", "SPACELISTSEP", "FILTERLISTSEP", "JFLISTSEP", 
			"JCSEP", "DOTSEP", "CONCAT", "ASCLAUSEBEGIN", "ASCLAUSEEND", "AS", "ID", 
			"SPARQLTEXT", "WS"
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
	public String getGrammarFileName() { return "SPARQLPatternsGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SPARQLPatternsGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SparqlTemplateContext extends ParserRuleContext {
		public List<TerminalNode> SPARQLTEXT() { return getTokens(SPARQLPatternsGrammarParser.SPARQLTEXT); }
		public TerminalNode SPARQLTEXT(int i) {
			return getToken(SPARQLPatternsGrammarParser.SPARQLTEXT, i);
		}
		public List<PatternFunctionContext> patternFunction() {
			return getRuleContexts(PatternFunctionContext.class);
		}
		public PatternFunctionContext patternFunction(int i) {
			return getRuleContext(PatternFunctionContext.class,i);
		}
		public SparqlTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparqlTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).enterSparqlTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).exitSparqlTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SPARQLPatternsGrammarVisitor ) return ((SPARQLPatternsGrammarVisitor<? extends T>)visitor).visitSparqlTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SparqlTemplateContext sparqlTemplate() throws RecognitionException {
		SparqlTemplateContext _localctx = new SparqlTemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sparqlTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SPARQLTEXT:
					{
					setState(26);
					match(SPARQLTEXT);
					}
					break;
				case DOTLISTSEP:
				case SINGELTONSEP:
				case SPACELISTSEP:
				case FILTERLISTSEP:
				case JCSEP:
					{
					setState(27);
					patternFunction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOTLISTSEP) | (1L << SINGELTONSEP) | (1L << SPACELISTSEP) | (1L << FILTERLISTSEP) | (1L << JCSEP) | (1L << SPARQLTEXT))) != 0) );
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

	public static class PatternFunctionContext extends ParserRuleContext {
		public SingletonContext singleton() {
			return getRuleContext(SingletonContext.class,0);
		}
		public DotListContext dotList() {
			return getRuleContext(DotListContext.class,0);
		}
		public FilterListContext filterList() {
			return getRuleContext(FilterListContext.class,0);
		}
		public SpaceListContext spaceList() {
			return getRuleContext(SpaceListContext.class,0);
		}
		public JoinFilterListContext joinFilterList() {
			return getRuleContext(JoinFilterListContext.class,0);
		}
		public PatternFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).enterPatternFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).exitPatternFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SPARQLPatternsGrammarVisitor ) return ((SPARQLPatternsGrammarVisitor<? extends T>)visitor).visitPatternFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternFunctionContext patternFunction() throws RecognitionException {
		PatternFunctionContext _localctx = new PatternFunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_patternFunction);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGELTONSEP:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				singleton();
				}
				break;
			case DOTLISTSEP:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				dotList();
				}
				break;
			case FILTERLISTSEP:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				filterList();
				}
				break;
			case SPACELISTSEP:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				spaceList();
				}
				break;
			case JCSEP:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				joinFilterList();
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

	public static class SingletonContext extends ParserRuleContext {
		public List<TerminalNode> SINGELTONSEP() { return getTokens(SPARQLPatternsGrammarParser.SINGELTONSEP); }
		public TerminalNode SINGELTONSEP(int i) {
			return getToken(SPARQLPatternsGrammarParser.SINGELTONSEP, i);
		}
		public BaseElementContext baseElement() {
			return getRuleContext(BaseElementContext.class,0);
		}
		public AsClauseContext asClause() {
			return getRuleContext(AsClauseContext.class,0);
		}
		public SingletonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).enterSingleton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).exitSingleton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SPARQLPatternsGrammarVisitor ) return ((SPARQLPatternsGrammarVisitor<? extends T>)visitor).visitSingleton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingletonContext singleton() throws RecognitionException {
		SingletonContext _localctx = new SingletonContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(SINGELTONSEP);
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case VARAIBLEMARKER:
			case SPARQLTEXT:
				{
				setState(40);
				baseElement();
				}
				break;
			case ASCLAUSEBEGIN:
				{
				setState(41);
				asClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(44);
			match(SINGELTONSEP);
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

	public static class SpaceListContext extends ParserRuleContext {
		public List<TerminalNode> SPACELISTSEP() { return getTokens(SPARQLPatternsGrammarParser.SPACELISTSEP); }
		public TerminalNode SPACELISTSEP(int i) {
			return getToken(SPARQLPatternsGrammarParser.SPACELISTSEP, i);
		}
		public BaseElementContext baseElement() {
			return getRuleContext(BaseElementContext.class,0);
		}
		public AsClauseContext asClause() {
			return getRuleContext(AsClauseContext.class,0);
		}
		public SpaceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spaceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).enterSpaceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).exitSpaceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SPARQLPatternsGrammarVisitor ) return ((SPARQLPatternsGrammarVisitor<? extends T>)visitor).visitSpaceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceListContext spaceList() throws RecognitionException {
		SpaceListContext _localctx = new SpaceListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_spaceList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(SPACELISTSEP);
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case VARAIBLEMARKER:
			case SPARQLTEXT:
				{
				setState(47);
				baseElement();
				}
				break;
			case ASCLAUSEBEGIN:
				{
				setState(48);
				asClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(51);
			match(SPACELISTSEP);
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

	public static class FilterListContext extends ParserRuleContext {
		public List<TerminalNode> FILTERLISTSEP() { return getTokens(SPARQLPatternsGrammarParser.FILTERLISTSEP); }
		public TerminalNode FILTERLISTSEP(int i) {
			return getToken(SPARQLPatternsGrammarParser.FILTERLISTSEP, i);
		}
		public BaseElementContext baseElement() {
			return getRuleContext(BaseElementContext.class,0);
		}
		public FilterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).enterFilterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).exitFilterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SPARQLPatternsGrammarVisitor ) return ((SPARQLPatternsGrammarVisitor<? extends T>)visitor).visitFilterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterListContext filterList() throws RecognitionException {
		FilterListContext _localctx = new FilterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_filterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(FILTERLISTSEP);
			setState(54);
			baseElement();
			setState(55);
			match(FILTERLISTSEP);
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

	public static class DotListContext extends ParserRuleContext {
		public List<TerminalNode> DOTLISTSEP() { return getTokens(SPARQLPatternsGrammarParser.DOTLISTSEP); }
		public TerminalNode DOTLISTSEP(int i) {
			return getToken(SPARQLPatternsGrammarParser.DOTLISTSEP, i);
		}
		public BaseElementContext baseElement() {
			return getRuleContext(BaseElementContext.class,0);
		}
		public DotListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).enterDotList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).exitDotList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SPARQLPatternsGrammarVisitor ) return ((SPARQLPatternsGrammarVisitor<? extends T>)visitor).visitDotList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotListContext dotList() throws RecognitionException {
		DotListContext _localctx = new DotListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dotList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(DOTLISTSEP);
			setState(58);
			baseElement();
			setState(59);
			match(DOTLISTSEP);
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

	public static class JoinFilterListContext extends ParserRuleContext {
		public List<TerminalNode> JCSEP() { return getTokens(SPARQLPatternsGrammarParser.JCSEP); }
		public TerminalNode JCSEP(int i) {
			return getToken(SPARQLPatternsGrammarParser.JCSEP, i);
		}
		public List<BaseElementContext> baseElement() {
			return getRuleContexts(BaseElementContext.class);
		}
		public BaseElementContext baseElement(int i) {
			return getRuleContext(BaseElementContext.class,i);
		}
		public JoinFilterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinFilterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).enterJoinFilterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).exitJoinFilterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SPARQLPatternsGrammarVisitor ) return ((SPARQLPatternsGrammarVisitor<? extends T>)visitor).visitJoinFilterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinFilterListContext joinFilterList() throws RecognitionException {
		JoinFilterListContext _localctx = new JoinFilterListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_joinFilterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(JCSEP);
			setState(62);
			baseElement();
			setState(63);
			match(T__0);
			setState(64);
			baseElement();
			setState(65);
			match(JCSEP);
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

	public static class AsClauseContext extends ParserRuleContext {
		public TerminalNode ASCLAUSEBEGIN() { return getToken(SPARQLPatternsGrammarParser.ASCLAUSEBEGIN, 0); }
		public List<BaseElementContext> baseElement() {
			return getRuleContexts(BaseElementContext.class);
		}
		public BaseElementContext baseElement(int i) {
			return getRuleContext(BaseElementContext.class,i);
		}
		public TerminalNode ASCLAUSEEND() { return getToken(SPARQLPatternsGrammarParser.ASCLAUSEEND, 0); }
		public TerminalNode AS() { return getToken(SPARQLPatternsGrammarParser.AS, 0); }
		public TerminalNode VARAIBLEMARKER() { return getToken(SPARQLPatternsGrammarParser.VARAIBLEMARKER, 0); }
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TerminalNode SPARQLTEXT() { return getToken(SPARQLPatternsGrammarParser.SPARQLTEXT, 0); }
		public AsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).enterAsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).exitAsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SPARQLPatternsGrammarVisitor ) return ((SPARQLPatternsGrammarVisitor<? extends T>)visitor).visitAsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsClauseContext asClause() throws RecognitionException {
		AsClauseContext _localctx = new AsClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ASCLAUSEBEGIN);
			setState(68);
			baseElement();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(69);
				match(AS);
				setState(70);
				match(VARAIBLEMARKER);
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(71);
					prefix();
					setState(72);
					baseElement();
					}
					break;
				case 2:
					{
					setState(74);
					match(SPARQLTEXT);
					}
					break;
				}
				}
			}

			setState(79);
			match(ASCLAUSEEND);
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

	public static class BaseElementContext extends ParserRuleContext {
		public ElementRoleContext elementRole() {
			return getRuleContext(ElementRoleContext.class,0);
		}
		public PrefixedElementRoleContext prefixedElementRole() {
			return getRuleContext(PrefixedElementRoleContext.class,0);
		}
		public BaseElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).enterBaseElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).exitBaseElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SPARQLPatternsGrammarVisitor ) return ((SPARQLPatternsGrammarVisitor<? extends T>)visitor).visitBaseElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseElementContext baseElement() throws RecognitionException {
		BaseElementContext _localctx = new BaseElementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_baseElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(81);
				elementRole();
				}
				break;
			case VARAIBLEMARKER:
			case SPARQLTEXT:
				{
				setState(82);
				prefixedElementRole();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrefixedElementRoleContext extends ParserRuleContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public ElementRoleContext elementRole() {
			return getRuleContext(ElementRoleContext.class,0);
		}
		public TerminalNode VARAIBLEMARKER() { return getToken(SPARQLPatternsGrammarParser.VARAIBLEMARKER, 0); }
		public PrefixedElementRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedElementRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).enterPrefixedElementRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).exitPrefixedElementRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SPARQLPatternsGrammarVisitor ) return ((SPARQLPatternsGrammarVisitor<? extends T>)visitor).visitPrefixedElementRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixedElementRoleContext prefixedElementRole() throws RecognitionException {
		PrefixedElementRoleContext _localctx = new PrefixedElementRoleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prefixedElementRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARAIBLEMARKER) {
				{
				setState(85);
				match(VARAIBLEMARKER);
				}
			}

			setState(88);
			prefix();
			setState(89);
			elementRole();
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

	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode SPARQLTEXT() { return getToken(SPARQLPatternsGrammarParser.SPARQLTEXT, 0); }
		public TerminalNode CONCAT() { return getToken(SPARQLPatternsGrammarParser.CONCAT, 0); }
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).exitPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SPARQLPatternsGrammarVisitor ) return ((SPARQLPatternsGrammarVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(SPARQLTEXT);
			setState(92);
			match(CONCAT);
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

	public static class ElementRoleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SPARQLPatternsGrammarParser.ID, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public ElementRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).enterElementRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).exitElementRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SPARQLPatternsGrammarVisitor ) return ((SPARQLPatternsGrammarVisitor<? extends T>)visitor).visitElementRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementRoleContext elementRole() throws RecognitionException {
		ElementRoleContext _localctx = new ElementRoleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elementRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__1);
			setState(95);
			match(ID);
			setState(96);
			attribute();
			setState(97);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode DOTSEP() { return getToken(SPARQLPatternsGrammarParser.DOTSEP, 0); }
		public TerminalNode ID() { return getToken(SPARQLPatternsGrammarParser.ID, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQLPatternsGrammarListener ) ((SPARQLPatternsGrammarListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SPARQLPatternsGrammarVisitor ) return ((SPARQLPatternsGrammarVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(DOTSEP);
			setState(100);
			match(ID);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0014g\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0004\u0000\u001d\b\u0000\u000b\u0000"+
		"\f\u0000\u001e\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001&\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"+\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u00032\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007L\b\u0007\u0003\u0007N\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0003\bT\b\b\u0001\t\u0003\tW\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0000"+
		"\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000"+
		"\u0000e\u0000\u001c\u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000"+
		"\u0004\'\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b5\u0001"+
		"\u0000\u0000\u0000\n9\u0001\u0000\u0000\u0000\f=\u0001\u0000\u0000\u0000"+
		"\u000eC\u0001\u0000\u0000\u0000\u0010S\u0001\u0000\u0000\u0000\u0012V"+
		"\u0001\u0000\u0000\u0000\u0014[\u0001\u0000\u0000\u0000\u0016^\u0001\u0000"+
		"\u0000\u0000\u0018c\u0001\u0000\u0000\u0000\u001a\u001d\u0005\u0013\u0000"+
		"\u0000\u001b\u001d\u0003\u0002\u0001\u0000\u001c\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f\u0001\u0001\u0000\u0000\u0000 &\u0003\u0004\u0002\u0000!"+
		"&\u0003\n\u0005\u0000\"&\u0003\b\u0004\u0000#&\u0003\u0006\u0003\u0000"+
		"$&\u0003\f\u0006\u0000% \u0001\u0000\u0000\u0000%!\u0001\u0000\u0000\u0000"+
		"%\"\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000"+
		"\u0000&\u0003\u0001\u0000\u0000\u0000\'*\u0005\b\u0000\u0000(+\u0003\u0010"+
		"\b\u0000)+\u0003\u000e\u0007\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0005\b\u0000\u0000-\u0005\u0001"+
		"\u0000\u0000\u0000.1\u0005\t\u0000\u0000/2\u0003\u0010\b\u000002\u0003"+
		"\u000e\u0007\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000034\u0005\t\u0000\u00004\u0007\u0001\u0000\u0000"+
		"\u000056\u0005\n\u0000\u000067\u0003\u0010\b\u000078\u0005\n\u0000\u0000"+
		"8\t\u0001\u0000\u0000\u00009:\u0005\u0005\u0000\u0000:;\u0003\u0010\b"+
		"\u0000;<\u0005\u0005\u0000\u0000<\u000b\u0001\u0000\u0000\u0000=>\u0005"+
		"\f\u0000\u0000>?\u0003\u0010\b\u0000?@\u0005\u0001\u0000\u0000@A\u0003"+
		"\u0010\b\u0000AB\u0005\f\u0000\u0000B\r\u0001\u0000\u0000\u0000CD\u0005"+
		"\u000f\u0000\u0000DM\u0003\u0010\b\u0000EF\u0005\u0011\u0000\u0000FK\u0005"+
		"\u0004\u0000\u0000GH\u0003\u0014\n\u0000HI\u0003\u0010\b\u0000IL\u0001"+
		"\u0000\u0000\u0000JL\u0005\u0013\u0000\u0000KG\u0001\u0000\u0000\u0000"+
		"KJ\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005\u0010"+
		"\u0000\u0000P\u000f\u0001\u0000\u0000\u0000QT\u0003\u0016\u000b\u0000"+
		"RT\u0003\u0012\t\u0000SQ\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"T\u0011\u0001\u0000\u0000\u0000UW\u0005\u0004\u0000\u0000VU\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0003"+
		"\u0014\n\u0000YZ\u0003\u0016\u000b\u0000Z\u0013\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u0013\u0000\u0000\\]\u0005\u000e\u0000\u0000]\u0015\u0001\u0000"+
		"\u0000\u0000^_\u0005\u0002\u0000\u0000_`\u0005\u0012\u0000\u0000`a\u0003"+
		"\u0018\f\u0000ab\u0005\u0003\u0000\u0000b\u0017\u0001\u0000\u0000\u0000"+
		"cd\u0005\r\u0000\u0000de\u0005\u0012\u0000\u0000e\u0019\u0001\u0000\u0000"+
		"\u0000\t\u001c\u001e%*1KMSV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}