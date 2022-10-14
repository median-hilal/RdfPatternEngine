// Generated from C:/Users/Median/workspace/RdfPatternEngine/src/main/antlr4\SPARQLPatternsGrammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SPARQLPatternsGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, VARAIBLEMARKER=4, DOTLISTSEP=5, FILTEROPENER=6, 
		FILTERCLOSER=7, SINGELTONSEP=8, SPACELISTSEP=9, FILTERLISTSEP=10, JFLISTSEP=11, 
		JCSEP=12, DOTSEP=13, CONCAT=14, ASCLAUSEBEGIN=15, ASCLAUSEEND=16, AS=17, 
		ID=18, SPARQLTEXT=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "VARAIBLEMARKER", "DOTLISTSEP", "FILTEROPENER", 
			"FILTERCLOSER", "SINGELTONSEP", "SPACELISTSEP", "FILTERLISTSEP", "JFLISTSEP", 
			"JCSEP", "DOTSEP", "CONCAT", "ASCLAUSEBEGIN", "ASCLAUSEEND", "AS", "ID", 
			"SPARQLTEXT", "WS"
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


	public SPARQLPatternsGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SPARQLPatternsGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014{\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011"+
		"g\b\u0011\n\u0011\f\u0011j\t\u0011\u0001\u0012\u0001\u0012\u0005\u0012"+
		"n\b\u0012\n\u0012\f\u0012q\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0004\u0013v\b\u0013\u000b\u0013\f\u0013w\u0001\u0013\u0001\u0013\u0001"+
		"o\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001"+
		"\u0000\u0003\u0004\u000009AZ__az\u0005\u0000--09AZ__az\u0003\u0000\t\n"+
		"\r\r  }\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001\u0000"+
		"\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000"+
		"\u0007/\u0001\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b7\u0001"+
		"\u0000\u0000\u0000\r@\u0001\u0000\u0000\u0000\u000fB\u0001\u0000\u0000"+
		"\u0000\u0011E\u0001\u0000\u0000\u0000\u0013I\u0001\u0000\u0000\u0000\u0015"+
		"M\u0001\u0000\u0000\u0000\u0017Q\u0001\u0000\u0000\u0000\u0019V\u0001"+
		"\u0000\u0000\u0000\u001bX\u0001\u0000\u0000\u0000\u001d[\u0001\u0000\u0000"+
		"\u0000\u001f^\u0001\u0000\u0000\u0000!a\u0001\u0000\u0000\u0000#d\u0001"+
		"\u0000\u0000\u0000%k\u0001\u0000\u0000\u0000\'u\u0001\u0000\u0000\u0000"+
		")*\u0005=\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005<\u0000\u0000"+
		",\u0004\u0001\u0000\u0000\u0000-.\u0005>\u0000\u0000.\u0006\u0001\u0000"+
		"\u0000\u0000/0\u0005!\u0000\u000001\u0005V\u0000\u000012\u0005M\u0000"+
		"\u00002\b\u0001\u0000\u0000\u000034\u0005!\u0000\u000045\u0005D\u0000"+
		"\u000056\u0005L\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005 \u0000"+
		"\u000089\u0005F\u0000\u00009:\u0005I\u0000\u0000:;\u0005L\u0000\u0000"+
		";<\u0005T\u0000\u0000<=\u0005E\u0000\u0000=>\u0005R\u0000\u0000>?\u0005"+
		"(\u0000\u0000?\f\u0001\u0000\u0000\u0000@A\u0005)\u0000\u0000A\u000e\u0001"+
		"\u0000\u0000\u0000BC\u0005!\u0000\u0000CD\u0005E\u0000\u0000D\u0010\u0001"+
		"\u0000\u0000\u0000EF\u0005!\u0000\u0000FG\u0005S\u0000\u0000GH\u0005L"+
		"\u0000\u0000H\u0012\u0001\u0000\u0000\u0000IJ\u0005!\u0000\u0000JK\u0005"+
		"F\u0000\u0000KL\u0005L\u0000\u0000L\u0014\u0001\u0000\u0000\u0000MN\u0005"+
		"!\u0000\u0000NO\u0005J\u0000\u0000OP\u0005L\u0000\u0000P\u0016\u0001\u0000"+
		"\u0000\u0000QR\u0005!\u0000\u0000RS\u0005J\u0000\u0000ST\u0005F\u0000"+
		"\u0000TU\u0005L\u0000\u0000U\u0018\u0001\u0000\u0000\u0000VW\u0005.\u0000"+
		"\u0000W\u001a\u0001\u0000\u0000\u0000XY\u0005!\u0000\u0000YZ\u0005+\u0000"+
		"\u0000Z\u001c\u0001\u0000\u0000\u0000[\\\u0005!\u0000\u0000\\]\u0005["+
		"\u0000\u0000]\u001e\u0001\u0000\u0000\u0000^_\u0005!\u0000\u0000_`\u0005"+
		"]\u0000\u0000` \u0001\u0000\u0000\u0000ab\u0005A\u0000\u0000bc\u0005S"+
		"\u0000\u0000c\"\u0001\u0000\u0000\u0000dh\u0007\u0000\u0000\u0000eg\u0007"+
		"\u0001\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i$\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000ko\u0005\"\u0000\u0000ln\t\u0000\u0000"+
		"\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000rs\u0005\"\u0000\u0000s&\u0001\u0000\u0000\u0000tv\u0007"+
		"\u0002\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000yz\u0006\u0013\u0000\u0000z(\u0001\u0000\u0000\u0000\u0004\u0000"+
		"how\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}