// Generated from C:/Users/jesus/OneDrive/Escritorio/Workspaces/DLP/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

    import ast.*;
    import ast.expression.*;
    import ast.definition.*;
    import ast.type.*;
    import ast.type.Integer;
    import ast.type.Double;
    import ast.type.Character;
    import ast.statement.*;
    import java.util.ArrayList;
    import java.util.List;
    import ast.expression.Boolean;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, ID=38, INT_CONSTANT=39, 
		CHAR_CONSTANT=40, REAL_CONSTANT=41, ONELINECOMMENT=42, MULTIPLELINECOMMENT=43, 
		THRASH=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "INT", "REAL_PART", "EXP", "LETTER", 
			"ID", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", "ONELINECOMMENT", 
			"MULTIPLELINECOMMENT", "THRASH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'{'", "'}'", "';'", "','", "':'", "'double'", 
			"'char'", "'int'", "'['", "']'", "'struct'", "'('", "')'", "'print'", 
			"'input'", "'='", "'if'", "'else'", "'while'", "'return'", "'.'", "'-'", 
			"'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", 
			"'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", "ONELINECOMMENT", 
			"MULTIPLELINECOMMENT", "THRASH"
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u013e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3"+
		"%\3%\3%\3&\3&\3&\3\'\3\'\3\'\7\'\u00e0\n\'\f\'\16\'\u00e3\13\'\5\'\u00e5"+
		"\n\'\3(\3(\7(\u00e9\n(\f(\16(\u00ec\13(\3)\3)\5)\u00f0\n)\3)\3)\3*\3*"+
		"\3+\3+\5+\u00f8\n+\3+\3+\7+\u00fc\n+\f+\16+\u00ff\13+\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\5-\u010b\n-\3-\3-\3.\3.\5.\u0111\n.\3.\5.\u0114\n.\3.\3"+
		".\5.\u0118\n.\5.\u011a\n.\3/\3/\7/\u011e\n/\f/\16/\u0121\13/\3/\5/\u0124"+
		"\n/\3/\5/\u0127\n/\3/\3/\3\60\3\60\3\60\3\60\3\60\7\60\u0130\n\60\f\60"+
		"\16\60\u0133\13\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\4"+
		"\u011f\u0131\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q\2S\2U(W)Y*[+],_-a.\3\2\f\3"+
		"\2\62\62\3\2\63;\3\2\62;\5\2GGgg~~\5\2--//~~\4\2C\\c|\4\2\62;aa\5\2pp"+
		"ttvv\3\3\f\f\5\2\13\f\17\17\"\"\2\u0149\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\3c\3\2\2\2\5g\3\2\2\2\7l\3\2\2\2\tn\3\2\2\2\13p\3\2\2\2\rr\3\2\2\2"+
		"\17t\3\2\2\2\21v\3\2\2\2\23}\3\2\2\2\25\u0082\3\2\2\2\27\u0086\3\2\2\2"+
		"\31\u0088\3\2\2\2\33\u008a\3\2\2\2\35\u0091\3\2\2\2\37\u0093\3\2\2\2!"+
		"\u0095\3\2\2\2#\u009b\3\2\2\2%\u00a1\3\2\2\2\'\u00a3\3\2\2\2)\u00a6\3"+
		"\2\2\2+\u00ab\3\2\2\2-\u00b1\3\2\2\2/\u00b8\3\2\2\2\61\u00ba\3\2\2\2\63"+
		"\u00bc\3\2\2\2\65\u00be\3\2\2\2\67\u00c0\3\2\2\29\u00c2\3\2\2\2;\u00c4"+
		"\3\2\2\2=\u00c6\3\2\2\2?\u00c8\3\2\2\2A\u00cb\3\2\2\2C\u00cd\3\2\2\2E"+
		"\u00d0\3\2\2\2G\u00d3\3\2\2\2I\u00d6\3\2\2\2K\u00d9\3\2\2\2M\u00e4\3\2"+
		"\2\2O\u00e6\3\2\2\2Q\u00ed\3\2\2\2S\u00f3\3\2\2\2U\u00f7\3\2\2\2W\u0100"+
		"\3\2\2\2Y\u0102\3\2\2\2[\u0119\3\2\2\2]\u011b\3\2\2\2_\u012a\3\2\2\2a"+
		"\u013a\3\2\2\2cd\7f\2\2de\7g\2\2ef\7h\2\2f\4\3\2\2\2gh\7o\2\2hi\7c\2\2"+
		"ij\7k\2\2jk\7p\2\2k\6\3\2\2\2lm\7}\2\2m\b\3\2\2\2no\7\177\2\2o\n\3\2\2"+
		"\2pq\7=\2\2q\f\3\2\2\2rs\7.\2\2s\16\3\2\2\2tu\7<\2\2u\20\3\2\2\2vw\7f"+
		"\2\2wx\7q\2\2xy\7w\2\2yz\7d\2\2z{\7n\2\2{|\7g\2\2|\22\3\2\2\2}~\7e\2\2"+
		"~\177\7j\2\2\177\u0080\7c\2\2\u0080\u0081\7t\2\2\u0081\24\3\2\2\2\u0082"+
		"\u0083\7k\2\2\u0083\u0084\7p\2\2\u0084\u0085\7v\2\2\u0085\26\3\2\2\2\u0086"+
		"\u0087\7]\2\2\u0087\30\3\2\2\2\u0088\u0089\7_\2\2\u0089\32\3\2\2\2\u008a"+
		"\u008b\7u\2\2\u008b\u008c\7v\2\2\u008c\u008d\7t\2\2\u008d\u008e\7w\2\2"+
		"\u008e\u008f\7e\2\2\u008f\u0090\7v\2\2\u0090\34\3\2\2\2\u0091\u0092\7"+
		"*\2\2\u0092\36\3\2\2\2\u0093\u0094\7+\2\2\u0094 \3\2\2\2\u0095\u0096\7"+
		"r\2\2\u0096\u0097\7t\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a"+
		"\7v\2\2\u009a\"\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e"+
		"\7r\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7v\2\2\u00a0$\3\2\2\2\u00a1\u00a2"+
		"\7?\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7h\2\2\u00a5(\3"+
		"\2\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7u\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7y\2\2\u00ac\u00ad\7j\2\2\u00ad"+
		"\u00ae\7k\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7g\2\2\u00b0,\3\2\2\2\u00b1"+
		"\u00b2\7t\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7w\2\2"+
		"\u00b5\u00b6\7t\2\2\u00b6\u00b7\7p\2\2\u00b7.\3\2\2\2\u00b8\u00b9\7\60"+
		"\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7/\2\2\u00bb\62\3\2\2\2\u00bc\u00bd"+
		"\7#\2\2\u00bd\64\3\2\2\2\u00be\u00bf\7,\2\2\u00bf\66\3\2\2\2\u00c0\u00c1"+
		"\7\61\2\2\u00c18\3\2\2\2\u00c2\u00c3\7\'\2\2\u00c3:\3\2\2\2\u00c4\u00c5"+
		"\7-\2\2\u00c5<\3\2\2\2\u00c6\u00c7\7@\2\2\u00c7>\3\2\2\2\u00c8\u00c9\7"+
		"@\2\2\u00c9\u00ca\7?\2\2\u00ca@\3\2\2\2\u00cb\u00cc\7>\2\2\u00ccB\3\2"+
		"\2\2\u00cd\u00ce\7>\2\2\u00ce\u00cf\7?\2\2\u00cfD\3\2\2\2\u00d0\u00d1"+
		"\7#\2\2\u00d1\u00d2\7?\2\2\u00d2F\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4\u00d5"+
		"\7?\2\2\u00d5H\3\2\2\2\u00d6\u00d7\7(\2\2\u00d7\u00d8\7(\2\2\u00d8J\3"+
		"\2\2\2\u00d9\u00da\7~\2\2\u00da\u00db\7~\2\2\u00dbL\3\2\2\2\u00dc\u00e5"+
		"\t\2\2\2\u00dd\u00e1\t\3\2\2\u00de\u00e0\t\4\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4\u00dd\3\2\2\2\u00e5"+
		"N\3\2\2\2\u00e6\u00ea\7\60\2\2\u00e7\u00e9\t\4\2\2\u00e8\u00e7\3\2\2\2"+
		"\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ebP\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\t\5\2\2\u00ee\u00f0\t\6\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\5M"+
		"\'\2\u00f2R\3\2\2\2\u00f3\u00f4\t\7\2\2\u00f4T\3\2\2\2\u00f5\u00f8\5S"+
		"*\2\u00f6\u00f8\7a\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fd"+
		"\3\2\2\2\u00f9\u00fc\5S*\2\u00fa\u00fc\t\b\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00feV\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\5M\'\2\u0101X\3\2"+
		"\2\2\u0102\u010a\7)\2\2\u0103\u010b\13\2\2\2\u0104\u0105\7^\2\2\u0105"+
		"\u0106\t\4\2\2\u0106\u0107\t\4\2\2\u0107\u010b\t\4\2\2\u0108\u0109\7^"+
		"\2\2\u0109\u010b\t\t\2\2\u010a\u0103\3\2\2\2\u010a\u0104\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7)\2\2\u010dZ\3\2\2\2\u010e"+
		"\u0110\5M\'\2\u010f\u0111\5O(\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2"+
		"\2\u0111\u0113\3\2\2\2\u0112\u0114\5Q)\2\u0113\u0112\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u011a\3\2\2\2\u0115\u0117\5O(\2\u0116\u0118\5Q)\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u010e\3\2"+
		"\2\2\u0119\u0115\3\2\2\2\u011a\\\3\2\2\2\u011b\u011f\7%\2\2\u011c\u011e"+
		"\13\2\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u0120\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124"+
		"\7\13\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2"+
		"\u0125\u0127\t\n\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129"+
		"\b/\2\2\u0129^\3\2\2\2\u012a\u012b\7$\2\2\u012b\u012c\7$\2\2\u012c\u012d"+
		"\7$\2\2\u012d\u0131\3\2\2\2\u012e\u0130\13\2\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7$\2\2\u0135\u0136\7$\2\2\u0136\u0137"+
		"\7$\2\2\u0137\u0138\3\2\2\2\u0138\u0139\b\60\2\2\u0139`\3\2\2\2\u013a"+
		"\u013b\t\13\2\2\u013b\u013c\3\2\2\2\u013c\u013d\b\61\2\2\u013db\3\2\2"+
		"\2\23\2\u00e1\u00e4\u00ea\u00ef\u00f7\u00fb\u00fd\u010a\u0110\u0113\u0117"+
		"\u0119\u011f\u0123\u0126\u0131\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}