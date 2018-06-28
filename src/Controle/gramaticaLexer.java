// Generated from /home/wellyson/NetBeansProjects/CompiladorFinal/src/Controle/gramatica.g4 by ANTLR 4.5.3

    package Controle;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, TK_program=22, TK_const=23, TK_block=24, 
		TK_read=25, TK_print=26, TK_if=27, TK_else=28, TK_for=29, TK_return=30, 
		TK_int=31, TK_string=32, TK_boolean=33, TK_float=34, TK_func=35, Tk_break=36, 
		BOOLEAN=37, TK_true=38, TK_false=39, ID=40, NUM=41, STRING=42, WS=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "TK_program", "TK_const", "TK_block", 
		"TK_read", "TK_print", "TK_if", "TK_else", "TK_for", "TK_return", "TK_int", 
		"TK_string", "TK_boolean", "TK_float", "TK_func", "Tk_break", "BOOLEAN", 
		"TK_true", "TK_false", "ID", "NUM", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "':'", "';'", "','", "'='", "'('", "')'", "'=='", 
		"'!='", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'!'", 
		"'++'", "'--'", "'program'", "'const'", "'block'", "'read'", "'print'", 
		"'if'", "'else'", "'for'", "'return'", "'int'", "'string'", "'boolean'", 
		"'float'", "'func'", "'break'", null, "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "TK_program", 
		"TK_const", "TK_block", "TK_read", "TK_print", "TK_if", "TK_else", "TK_for", 
		"TK_return", "TK_int", "TK_string", "TK_boolean", "TK_float", "TK_func", 
		"Tk_break", "BOOLEAN", "TK_true", "TK_false", "ID", "NUM", "STRING", "WS"
	};
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


	public gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u0127\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$"+
		"\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\5&\u00e2\n&\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3)\3)\7)\u00f1\n)\f)\16)\u00f4\13)\3*\6*\u00f7\n*\r*\16"+
		"*\u00f8\3*\3*\6*\u00fd\n*\r*\16*\u00fe\5*\u0101\n*\3+\3+\7+\u0105\n+\f"+
		"+\16+\u0108\13+\3+\3+\3,\3,\3,\3,\3,\7,\u0111\n,\f,\16,\u0114\13,\3,\3"+
		",\3,\3,\3,\7,\u011b\n,\f,\16,\u011e\13,\3,\3,\6,\u0122\n,\r,\16,\u0123"+
		"\3,\3,\5\u0106\u0112\u011c\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\6\4\2"+
		"C\\c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\u0131\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2\13a\3\2\2\2\rc\3\2\2\2"+
		"\17e\3\2\2\2\21g\3\2\2\2\23i\3\2\2\2\25l\3\2\2\2\27o\3\2\2\2\31q\3\2\2"+
		"\2\33t\3\2\2\2\35w\3\2\2\2\37y\3\2\2\2!{\3\2\2\2#}\3\2\2\2%\177\3\2\2"+
		"\2\'\u0081\3\2\2\2)\u0083\3\2\2\2+\u0086\3\2\2\2-\u0089\3\2\2\2/\u0091"+
		"\3\2\2\2\61\u0097\3\2\2\2\63\u009d\3\2\2\2\65\u00a2\3\2\2\2\67\u00a8\3"+
		"\2\2\29\u00ab\3\2\2\2;\u00b0\3\2\2\2=\u00b4\3\2\2\2?\u00bb\3\2\2\2A\u00bf"+
		"\3\2\2\2C\u00c6\3\2\2\2E\u00ce\3\2\2\2G\u00d4\3\2\2\2I\u00d9\3\2\2\2K"+
		"\u00e1\3\2\2\2M\u00e3\3\2\2\2O\u00e8\3\2\2\2Q\u00ee\3\2\2\2S\u00f6\3\2"+
		"\2\2U\u0102\3\2\2\2W\u0121\3\2\2\2YZ\7}\2\2Z\4\3\2\2\2[\\\7\177\2\2\\"+
		"\6\3\2\2\2]^\7<\2\2^\b\3\2\2\2_`\7=\2\2`\n\3\2\2\2ab\7.\2\2b\f\3\2\2\2"+
		"cd\7?\2\2d\16\3\2\2\2ef\7*\2\2f\20\3\2\2\2gh\7+\2\2h\22\3\2\2\2ij\7?\2"+
		"\2jk\7?\2\2k\24\3\2\2\2lm\7#\2\2mn\7?\2\2n\26\3\2\2\2op\7>\2\2p\30\3\2"+
		"\2\2qr\7>\2\2rs\7?\2\2s\32\3\2\2\2tu\7@\2\2uv\7?\2\2v\34\3\2\2\2wx\7@"+
		"\2\2x\36\3\2\2\2yz\7-\2\2z \3\2\2\2{|\7/\2\2|\"\3\2\2\2}~\7,\2\2~$\3\2"+
		"\2\2\177\u0080\7\61\2\2\u0080&\3\2\2\2\u0081\u0082\7#\2\2\u0082(\3\2\2"+
		"\2\u0083\u0084\7-\2\2\u0084\u0085\7-\2\2\u0085*\3\2\2\2\u0086\u0087\7"+
		"/\2\2\u0087\u0088\7/\2\2\u0088,\3\2\2\2\u0089\u008a\7r\2\2\u008a\u008b"+
		"\7t\2\2\u008b\u008c\7q\2\2\u008c\u008d\7i\2\2\u008d\u008e\7t\2\2\u008e"+
		"\u008f\7c\2\2\u008f\u0090\7o\2\2\u0090.\3\2\2\2\u0091\u0092\7e\2\2\u0092"+
		"\u0093\7q\2\2\u0093\u0094\7p\2\2\u0094\u0095\7u\2\2\u0095\u0096\7v\2\2"+
		"\u0096\60\3\2\2\2\u0097\u0098\7d\2\2\u0098\u0099\7n\2\2\u0099\u009a\7"+
		"q\2\2\u009a\u009b\7e\2\2\u009b\u009c\7m\2\2\u009c\62\3\2\2\2\u009d\u009e"+
		"\7t\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7f\2\2\u00a1"+
		"\64\3\2\2\2\u00a2\u00a3\7r\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7k\2\2\u00a5"+
		"\u00a6\7p\2\2\u00a6\u00a7\7v\2\2\u00a7\66\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9"+
		"\u00aa\7h\2\2\u00aa8\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7n\2\2\u00ad"+
		"\u00ae\7u\2\2\u00ae\u00af\7g\2\2\u00af:\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1"+
		"\u00b2\7q\2\2\u00b2\u00b3\7t\2\2\u00b3<\3\2\2\2\u00b4\u00b5\7t\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7t\2\2"+
		"\u00b9\u00ba\7p\2\2\u00ba>\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2"+
		"\2\u00bd\u00be\7v\2\2\u00be@\3\2\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7"+
		"v\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5"+
		"\7i\2\2\u00c5B\3\2\2\2\u00c6\u00c7\7d\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9"+
		"\7q\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7c\2\2\u00cc"+
		"\u00cd\7p\2\2\u00cdD\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7n\2\2\u00d0"+
		"\u00d1\7q\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7v\2\2\u00d3F\3\2\2\2\u00d4"+
		"\u00d5\7h\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7e\2\2"+
		"\u00d8H\3\2\2\2\u00d9\u00da\7d\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7g\2"+
		"\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7m\2\2\u00deJ\3\2\2\2\u00df\u00e2\5"+
		"M\'\2\u00e0\u00e2\5O(\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"L\3\2\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7w\2\2\u00e6"+
		"\u00e7\7g\2\2\u00e7N\3\2\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7c\2\2\u00ea"+
		"\u00eb\7n\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00edP\3\2\2\2\u00ee"+
		"\u00f2\t\2\2\2\u00ef\u00f1\t\3\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3R\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f5\u00f7\t\4\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0100\3\2\2\2\u00fa\u00fc\7\60"+
		"\2\2\u00fb\u00fd\t\4\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fa\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101T\3\2\2\2\u0102\u0106\7$\2\2\u0103\u0105"+
		"\13\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0106\u0104\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a"+
		"\7$\2\2\u010aV\3\2\2\2\u010b\u0122\t\5\2\2\u010c\u010d\7\61\2\2\u010d"+
		"\u010e\7\61\2\2\u010e\u0112\3\2\2\2\u010f\u0111\13\2\2\2\u0110\u010f\3"+
		"\2\2\2\u0111\u0114\3\2\2\2\u0112\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0122\7\f\2\2\u0116\u0117\7\61"+
		"\2\2\u0117\u0118\7,\2\2\u0118\u011c\3\2\2\2\u0119\u011b\13\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011d\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7,\2\2\u0120"+
		"\u0122\7\61\2\2\u0121\u010b\3\2\2\2\u0121\u010c\3\2\2\2\u0121\u0116\3"+
		"\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0126\b,\2\2\u0126X\3\2\2\2\r\2\u00e1\u00f2\u00f8"+
		"\u00fe\u0100\u0106\u0112\u011c\u0121\u0123\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}