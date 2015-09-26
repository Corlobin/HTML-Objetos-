// Generated from C:\Users\20122bsi0387\Documents\NetBeansProjects\HTMLObjetos\grammar\Objetos.g4 by ANTLR 4.1

package lfa.obj;         

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ObjetosLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, WS=3, INICIO=4, VERMELHO=5, AZUL=6, PRETO=7, ROXO=8, BRANCO=9, 
		VERDE=10, ROSA=11, AMARELO=12, QUADRADO=13, RETANGULO=14, OVAL=15, ESTRELA=16, 
		PENTAGONO=17, HEXAGONO=18, OCATGONO=19, CORACAO=20, INFINITO=21, DIAMANTE=22, 
		YINYANG=23, CIRCULO=24, TRIANGULO=25, TRAPEZIO=26, PARALELO=27, FIM=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"INT", "FLOAT", "WS", "'inicio'", "'vermelho'", "'azul'", "'preto'", "'roxo'", 
		"'branco'", "'verde'", "'rosa'", "'amarelo'", "'quadrado'", "'retangulo'", 
		"'oval'", "'estrela'", "'pentagono'", "'hexagono'", "'octagno'", "'coracao'", 
		"'infinito'", "'diamente'", "'yinyang'", "'circulo'", "'triangulo'", "'trapezio'", 
		"'paralelograma'", "'fim'"
	};
	public static final String[] ruleNames = {
		"INT", "FLOAT", "WS", "INICIO", "VERMELHO", "AZUL", "PRETO", "ROXO", "BRANCO", 
		"VERDE", "ROSA", "AMARELO", "QUADRADO", "RETANGULO", "OVAL", "ESTRELA", 
		"PENTAGONO", "HEXAGONO", "OCATGONO", "CORACAO", "INFINITO", "DIAMANTE", 
		"YINYANG", "CIRCULO", "TRIANGULO", "TRAPEZIO", "PARALELO", "FIM"
	};


	public ObjetosLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Objetos.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\36\u0116\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\6\2=\n\2\r\2\16\2>\3"+
		"\3\6\3B\n\3\r\3\16\3C\3\3\3\3\6\3H\n\3\r\3\16\3I\3\4\6\4M\n\4\r\4\16\4"+
		"N\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\2\36\3\3\1\5\4\1\7\5\2\t\6\1\13\7\1\r\b\1"+
		"\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!"+
		"\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34"+
		"\1\67\35\19\36\1\3\2\4\3\2\62;\5\2\13\f\17\17\"\"\u0119\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3<\3\2\2\2\5A\3\2\2"+
		"\2\7L\3\2\2\2\tR\3\2\2\2\13Y\3\2\2\2\rb\3\2\2\2\17g\3\2\2\2\21m\3\2\2"+
		"\2\23r\3\2\2\2\25y\3\2\2\2\27\177\3\2\2\2\31\u0084\3\2\2\2\33\u008c\3"+
		"\2\2\2\35\u0095\3\2\2\2\37\u009f\3\2\2\2!\u00a4\3\2\2\2#\u00ac\3\2\2\2"+
		"%\u00b6\3\2\2\2\'\u00bf\3\2\2\2)\u00c7\3\2\2\2+\u00cf\3\2\2\2-\u00d8\3"+
		"\2\2\2/\u00e1\3\2\2\2\61\u00e9\3\2\2\2\63\u00f1\3\2\2\2\65\u00fb\3\2\2"+
		"\2\67\u0104\3\2\2\29\u0112\3\2\2\2;=\t\2\2\2<;\3\2\2\2=>\3\2\2\2><\3\2"+
		"\2\2>?\3\2\2\2?\4\3\2\2\2@B\t\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3"+
		"\2\2\2DE\3\2\2\2EG\7\60\2\2FH\t\2\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ"+
		"\3\2\2\2J\6\3\2\2\2KM\t\3\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2"+
		"OP\3\2\2\2PQ\b\4\2\2Q\b\3\2\2\2RS\7k\2\2ST\7p\2\2TU\7k\2\2UV\7e\2\2VW"+
		"\7k\2\2WX\7q\2\2X\n\3\2\2\2YZ\7x\2\2Z[\7g\2\2[\\\7t\2\2\\]\7o\2\2]^\7"+
		"g\2\2^_\7n\2\2_`\7j\2\2`a\7q\2\2a\f\3\2\2\2bc\7c\2\2cd\7|\2\2de\7w\2\2"+
		"ef\7n\2\2f\16\3\2\2\2gh\7r\2\2hi\7t\2\2ij\7g\2\2jk\7v\2\2kl\7q\2\2l\20"+
		"\3\2\2\2mn\7t\2\2no\7q\2\2op\7z\2\2pq\7q\2\2q\22\3\2\2\2rs\7d\2\2st\7"+
		"t\2\2tu\7c\2\2uv\7p\2\2vw\7e\2\2wx\7q\2\2x\24\3\2\2\2yz\7x\2\2z{\7g\2"+
		"\2{|\7t\2\2|}\7f\2\2}~\7g\2\2~\26\3\2\2\2\177\u0080\7t\2\2\u0080\u0081"+
		"\7q\2\2\u0081\u0082\7u\2\2\u0082\u0083\7c\2\2\u0083\30\3\2\2\2\u0084\u0085"+
		"\7c\2\2\u0085\u0086\7o\2\2\u0086\u0087\7c\2\2\u0087\u0088\7t\2\2\u0088"+
		"\u0089\7g\2\2\u0089\u008a\7n\2\2\u008a\u008b\7q\2\2\u008b\32\3\2\2\2\u008c"+
		"\u008d\7s\2\2\u008d\u008e\7w\2\2\u008e\u008f\7c\2\2\u008f\u0090\7f\2\2"+
		"\u0090\u0091\7t\2\2\u0091\u0092\7c\2\2\u0092\u0093\7f\2\2\u0093\u0094"+
		"\7q\2\2\u0094\34\3\2\2\2\u0095\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097\u0098"+
		"\7v\2\2\u0098\u0099\7c\2\2\u0099\u009a\7p\2\2\u009a\u009b\7i\2\2\u009b"+
		"\u009c\7w\2\2\u009c\u009d\7n\2\2\u009d\u009e\7q\2\2\u009e\36\3\2\2\2\u009f"+
		"\u00a0\7q\2\2\u00a0\u00a1\7x\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7n\2\2"+
		"\u00a3 \3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7v\2"+
		"\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab"+
		"\7c\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7r\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af"+
		"\7p\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7i\2\2\u00b2"+
		"\u00b3\7q\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7q\2\2\u00b5$\3\2\2\2\u00b6"+
		"\u00b7\7j\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7z\2\2\u00b9\u00ba\7c\2\2"+
		"\u00ba\u00bb\7i\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be"+
		"\7q\2\2\u00be&\3\2\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2"+
		"\7v\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7i\2\2\u00c4\u00c5\7p\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6(\3\2\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7q\2\2\u00c9"+
		"\u00ca\7t\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7c\2\2"+
		"\u00cd\u00ce\7q\2\2\u00ce*\3\2\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2"+
		"\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5"+
		"\7k\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7q\2\2\u00d7,\3\2\2\2\u00d8\u00d9"+
		"\7f\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7o\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7g\2\2"+
		"\u00e0.\3\2\2\2\u00e1\u00e2\7{\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7p\2"+
		"\2\u00e4\u00e5\7{\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8"+
		"\7i\2\2\u00e8\60\3\2\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec"+
		"\7t\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef\7n\2\2\u00ef"+
		"\u00f0\7q\2\2\u00f0\62\3\2\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7t\2\2\u00f3"+
		"\u00f4\7k\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7i\2\2"+
		"\u00f7\u00f8\7w\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7q\2\2\u00fa\64\3\2"+
		"\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff"+
		"\7r\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7|\2\2\u0101\u0102\7k\2\2\u0102"+
		"\u0103\7q\2\2\u0103\66\3\2\2\2\u0104\u0105\7r\2\2\u0105\u0106\7c\2\2\u0106"+
		"\u0107\7t\2\2\u0107\u0108\7c\2\2\u0108\u0109\7n\2\2\u0109\u010a\7g\2\2"+
		"\u010a\u010b\7n\2\2\u010b\u010c\7q\2\2\u010c\u010d\7i\2\2\u010d\u010e"+
		"\7t\2\2\u010e\u010f\7c\2\2\u010f\u0110\7o\2\2\u0110\u0111\7c\2\2\u0111"+
		"8\3\2\2\2\u0112\u0113\7h\2\2\u0113\u0114\7k\2\2\u0114\u0115\7o\2\2\u0115"+
		":\3\2\2\2\7\2>CIN";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}