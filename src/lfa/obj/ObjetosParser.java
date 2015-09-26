// Generated from C:\Users\20122bsi0387\Documents\NetBeansProjects\HTMLObjetos\grammar\Objetos.g4 by ANTLR 4.1

package lfa.obj;         

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ObjetosParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, WS=3, INICIO=4, VERMELHO=5, AZUL=6, PRETO=7, ROXO=8, BRANCO=9, 
		VERDE=10, ROSA=11, AMARELO=12, QUADRADO=13, RETANGULO=14, OVAL=15, ESTRELA=16, 
		PENTAGONO=17, HEXAGONO=18, OCATGONO=19, CORACAO=20, INFINITO=21, DIAMANTE=22, 
		YINYANG=23, CIRCULO=24, TRIANGULO=25, TRAPEZIO=26, PARALELO=27, FIM=28;
	public static final String[] tokenNames = {
		"<INVALID>", "INT", "FLOAT", "WS", "'inicio'", "'vermelho'", "'azul'", 
		"'preto'", "'roxo'", "'branco'", "'verde'", "'rosa'", "'amarelo'", "'quadrado'", 
		"'retangulo'", "'oval'", "'estrela'", "'pentagono'", "'hexagono'", "'octagno'", 
		"'coracao'", "'infinito'", "'diamente'", "'yinyang'", "'circulo'", "'triangulo'", 
		"'trapezio'", "'paralelograma'", "'fim'"
	};
	public static final int
		RULE_init = 0, RULE_desenho = 1, RULE_bloco = 2, RULE_forma = 3, RULE_tipo = 4, 
		RULE_atributos = 5, RULE_cor = 6, RULE_altura = 7, RULE_largura = 8, RULE_lado = 9, 
		RULE_number = 10;
	public static final String[] ruleNames = {
		"init", "desenho", "bloco", "forma", "tipo", "atributos", "cor", "altura", 
		"largura", "lado", "number"
	};

	@Override
	public String getGrammarFileName() { return "Objetos.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ObjetosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public String result;
		public DesenhoContext desenho;
		public DesenhoContext desenho() {
			return getRuleContext(DesenhoContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); ((InitContext)_localctx).desenho = desenho();
			((InitContext)_localctx).result =  ((InitContext)_localctx).desenho.result;
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

	public static class DesenhoContext extends ParserRuleContext {
		public String result;
		public BlocoContext bloco;
		public TerminalNode FIM() { return getToken(ObjetosParser.FIM, 0); }
		public TerminalNode INICIO() { return getToken(ObjetosParser.INICIO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DesenhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desenho; }
	}

	public final DesenhoContext desenho() throws RecognitionException {
		DesenhoContext _localctx = new DesenhoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_desenho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(INICIO);
			setState(26); ((DesenhoContext)_localctx).bloco = bloco();
			setState(27); match(FIM);
			((DesenhoContext)_localctx).result =  ((DesenhoContext)_localctx).bloco.result;
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

	public static class BlocoContext extends ParserRuleContext {
		public String result;
		public AtributosContext atributos;
		public FormaContext forma;
		public List<FormaContext> forma() {
			return getRuleContexts(FormaContext.class);
		}
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
		public FormaContext forma(int i) {
			return getRuleContext(FormaContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((BlocoContext)_localctx).result =  "bloco;";
			setState(31); ((BlocoContext)_localctx).atributos = atributos();
			((BlocoContext)_localctx).result =  _localctx.result + ((BlocoContext)_localctx).atributos.result+";\n";
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUADRADO) | (1L << RETANGULO) | (1L << OVAL) | (1L << ESTRELA) | (1L << PENTAGONO) | (1L << HEXAGONO) | (1L << OCATGONO) | (1L << CORACAO) | (1L << INFINITO) | (1L << DIAMANTE) | (1L << YINYANG) | (1L << CIRCULO) | (1L << TRIANGULO) | (1L << TRAPEZIO) | (1L << PARALELO))) != 0)) {
				{
				{
				setState(33); ((BlocoContext)_localctx).forma = forma();
				((BlocoContext)_localctx).result =  _localctx.result+((BlocoContext)_localctx).forma.result+"\n";
				}
				}
				setState(40);
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

	public static class FormaContext extends ParserRuleContext {
		public String result;
		public TipoContext tipo;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public FormaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forma; }
	}

	public final FormaContext forma() throws RecognitionException {
		FormaContext _localctx = new FormaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); ((FormaContext)_localctx).tipo = tipo();
			((FormaContext)_localctx).result =  ((FormaContext)_localctx).tipo.result+";";
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

	public static class TipoContext extends ParserRuleContext {
		public String result;
		public Token QUADRADO;
		public Token CIRCULO;
		public Token TRIANGULO;
		public Token TRAPEZIO;
		public Token PARALELO;
		public Token RETANGULO;
		public Token OVAL;
		public Token ESTRELA;
		public Token PENTAGONO;
		public Token HEXAGONO;
		public Token OCATGONO;
		public Token INFINITO;
		public Token DIAMANTE;
		public Token YINYANG;
		public Token CORACAO;
		public AtributosContext atributos;
		public TerminalNode CIRCULO() { return getToken(ObjetosParser.CIRCULO, 0); }
		public TerminalNode TRAPEZIO() { return getToken(ObjetosParser.TRAPEZIO, 0); }
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
		public TerminalNode INFINITO() { return getToken(ObjetosParser.INFINITO, 0); }
		public TerminalNode QUADRADO() { return getToken(ObjetosParser.QUADRADO, 0); }
		public TerminalNode TRIANGULO() { return getToken(ObjetosParser.TRIANGULO, 0); }
		public TerminalNode PENTAGONO() { return getToken(ObjetosParser.PENTAGONO, 0); }
		public TerminalNode DIAMANTE() { return getToken(ObjetosParser.DIAMANTE, 0); }
		public TerminalNode RETANGULO() { return getToken(ObjetosParser.RETANGULO, 0); }
		public TerminalNode OCATGONO() { return getToken(ObjetosParser.OCATGONO, 0); }
		public TerminalNode YINYANG() { return getToken(ObjetosParser.YINYANG, 0); }
		public TerminalNode PARALELO() { return getToken(ObjetosParser.PARALELO, 0); }
		public TerminalNode HEXAGONO() { return getToken(ObjetosParser.HEXAGONO, 0); }
		public TerminalNode CORACAO() { return getToken(ObjetosParser.CORACAO, 0); }
		public TerminalNode OVAL() { return getToken(ObjetosParser.OVAL, 0); }
		public TerminalNode ESTRELA() { return getToken(ObjetosParser.ESTRELA, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			switch (_input.LA(1)) {
			case QUADRADO:
				{
				setState(44); ((TipoContext)_localctx).QUADRADO = match(QUADRADO);
				((TipoContext)_localctx).result =  (((TipoContext)_localctx).QUADRADO!=null?((TipoContext)_localctx).QUADRADO.getText():null)+";";
				}
				break;
			case CIRCULO:
				{
				setState(46); ((TipoContext)_localctx).CIRCULO = match(CIRCULO);
				((TipoContext)_localctx).result =  (((TipoContext)_localctx).CIRCULO!=null?((TipoContext)_localctx).CIRCULO.getText():null)+";";
				}
				break;
			case TRIANGULO:
				{
				setState(48); ((TipoContext)_localctx).TRIANGULO = match(TRIANGULO);
				((TipoContext)_localctx).result =  (((TipoContext)_localctx).TRIANGULO!=null?((TipoContext)_localctx).TRIANGULO.getText():null)+";";
				}
				break;
			case TRAPEZIO:
				{
				setState(50); ((TipoContext)_localctx).TRAPEZIO = match(TRAPEZIO);
				((TipoContext)_localctx).result =  (((TipoContext)_localctx).TRAPEZIO!=null?((TipoContext)_localctx).TRAPEZIO.getText():null)+";";
				}
				break;
			case PARALELO:
				{
				setState(52); ((TipoContext)_localctx).PARALELO = match(PARALELO);
				((TipoContext)_localctx).result =  (((TipoContext)_localctx).PARALELO!=null?((TipoContext)_localctx).PARALELO.getText():null)+";";
				}
				break;
			case RETANGULO:
				{
				setState(54); ((TipoContext)_localctx).RETANGULO = match(RETANGULO);
				((TipoContext)_localctx).result =  (((TipoContext)_localctx).RETANGULO!=null?((TipoContext)_localctx).RETANGULO.getText():null)+";";
				}
				break;
			case OVAL:
				{
				setState(56); ((TipoContext)_localctx).OVAL = match(OVAL);
				((TipoContext)_localctx).result =  (((TipoContext)_localctx).OVAL!=null?((TipoContext)_localctx).OVAL.getText():null)+";";
				}
				break;
			case ESTRELA:
				{
				setState(58); ((TipoContext)_localctx).ESTRELA = match(ESTRELA);
				((TipoContext)_localctx).result =  (((TipoContext)_localctx).ESTRELA!=null?((TipoContext)_localctx).ESTRELA.getText():null)+";";
				}
				break;
			case PENTAGONO:
				{
				setState(60); ((TipoContext)_localctx).PENTAGONO = match(PENTAGONO);
				((TipoContext)_localctx).result =  (((TipoContext)_localctx).PENTAGONO!=null?((TipoContext)_localctx).PENTAGONO.getText():null)+";";
				}
				break;
			case HEXAGONO:
				{
				setState(62); ((TipoContext)_localctx).HEXAGONO = match(HEXAGONO);
				((TipoContext)_localctx).result =  (((TipoContext)_localctx).HEXAGONO!=null?((TipoContext)_localctx).HEXAGONO.getText():null)+";";
				}
				break;
			case OCATGONO:
				{
				setState(64); ((TipoContext)_localctx).OCATGONO = match(OCATGONO);
				((TipoContext)_localctx).result =  (((TipoContext)_localctx).OCATGONO!=null?((TipoContext)_localctx).OCATGONO.getText():null)+";";
				}
				break;
			case INFINITO:
				{
				setState(66); ((TipoContext)_localctx).INFINITO = match(INFINITO);
				((TipoContext)_localctx).result =  (((TipoContext)_localctx).INFINITO!=null?((TipoContext)_localctx).INFINITO.getText():null)+";";
				}
				break;
			case DIAMANTE:
				{
				setState(68); ((TipoContext)_localctx).DIAMANTE = match(DIAMANTE);
				((TipoContext)_localctx).result =  (((TipoContext)_localctx).DIAMANTE!=null?((TipoContext)_localctx).DIAMANTE.getText():null)+";";
				}
				break;
			case YINYANG:
				{
				setState(70); ((TipoContext)_localctx).YINYANG = match(YINYANG);
				((TipoContext)_localctx).result =  (((TipoContext)_localctx).YINYANG!=null?((TipoContext)_localctx).YINYANG.getText():null)+";";
				}
				break;
			case CORACAO:
				{
				setState(72); ((TipoContext)_localctx).CORACAO = match(CORACAO);
				((TipoContext)_localctx).result =  (((TipoContext)_localctx).CORACAO!=null?((TipoContext)_localctx).CORACAO.getText():null)+";";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(76); ((TipoContext)_localctx).atributos = atributos();
			((TipoContext)_localctx).result =  _localctx.result + ((TipoContext)_localctx).atributos.result;
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

	public static class AtributosContext extends ParserRuleContext {
		public String result;
		public AlturaContext altura;
		public LarguraContext largura;
		public CorContext cor;
		public CorContext cor() {
			return getRuleContext(CorContext.class,0);
		}
		public AlturaContext altura() {
			return getRuleContext(AlturaContext.class,0);
		}
		public LarguraContext largura() {
			return getRuleContext(LarguraContext.class,0);
		}
		public AtributosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos; }
	}

	public final AtributosContext atributos() throws RecognitionException {
		AtributosContext _localctx = new AtributosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atributos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); ((AtributosContext)_localctx).altura = altura();
			setState(80); ((AtributosContext)_localctx).largura = largura();
			setState(81); ((AtributosContext)_localctx).cor = cor();
			((AtributosContext)_localctx).result =  ((AtributosContext)_localctx).altura.result + ((AtributosContext)_localctx).largura.result + ((AtributosContext)_localctx).cor.result;
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

	public static class CorContext extends ParserRuleContext {
		public String result;
		public TerminalNode BRANCO() { return getToken(ObjetosParser.BRANCO, 0); }
		public TerminalNode AZUL() { return getToken(ObjetosParser.AZUL, 0); }
		public TerminalNode AMARELO() { return getToken(ObjetosParser.AMARELO, 0); }
		public TerminalNode VERDE() { return getToken(ObjetosParser.VERDE, 0); }
		public TerminalNode ROSA() { return getToken(ObjetosParser.ROSA, 0); }
		public TerminalNode ROXO() { return getToken(ObjetosParser.ROXO, 0); }
		public TerminalNode VERMELHO() { return getToken(ObjetosParser.VERMELHO, 0); }
		public TerminalNode PRETO() { return getToken(ObjetosParser.PRETO, 0); }
		public CorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cor; }
	}

	public final CorContext cor() throws RecognitionException {
		CorContext _localctx = new CorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			switch (_input.LA(1)) {
			case VERMELHO:
				{
				setState(84); match(VERMELHO);
				((CorContext)_localctx).result =  "background-color:#FF0000";
				}
				break;
			case AZUL:
				{
				setState(86); match(AZUL);
				((CorContext)_localctx).result =  "background-color:#0000FF";
				}
				break;
			case PRETO:
				{
				setState(88); match(PRETO);
				((CorContext)_localctx).result =  "background-color:#000000";
				}
				break;
			case ROXO:
				{
				setState(90); match(ROXO);
				((CorContext)_localctx).result =  "background-color:#A020F0";
				}
				break;
			case AMARELO:
				{
				setState(92); match(AMARELO);
				((CorContext)_localctx).result =  "background-color:#FFFF00";
				}
				break;
			case ROSA:
				{
				setState(94); match(ROSA);
				((CorContext)_localctx).result =  "background-color:#EE49EE";
				}
				break;
			case VERDE:
				{
				setState(96); match(VERDE);
				((CorContext)_localctx).result =  "background-color:#228B22";
				}
				break;
			case BRANCO:
				{
				setState(98); match(BRANCO);
				((CorContext)_localctx).result =  "background-color:#ffffff";
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

	public static class AlturaContext extends ParserRuleContext {
		public String result;
		public NumberContext number;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AlturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altura; }
	}

	public final AlturaContext altura() throws RecognitionException {
		AlturaContext _localctx = new AlturaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_altura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); ((AlturaContext)_localctx).number = number();
			((AlturaContext)_localctx).result =  "height:"+((AlturaContext)_localctx).number.result+";";
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

	public static class LarguraContext extends ParserRuleContext {
		public String result;
		public NumberContext number;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LarguraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_largura; }
	}

	public final LarguraContext largura() throws RecognitionException {
		LarguraContext _localctx = new LarguraContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_largura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); ((LarguraContext)_localctx).number = number();
			((LarguraContext)_localctx).result =  "width:"+((LarguraContext)_localctx).number.result+";";
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

	public static class LadoContext extends ParserRuleContext {
		public String result;
		public NumberContext number;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lado; }
	}

	public final LadoContext lado() throws RecognitionException {
		LadoContext _localctx = new LadoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); ((LadoContext)_localctx).number = number();
			((LadoContext)_localctx).result =  "lado:"+((LadoContext)_localctx).number.result+";";
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

	public static class NumberContext extends ParserRuleContext {
		public String result;
		public Token INT;
		public TerminalNode INT() { return getToken(ObjetosParser.INT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); ((NumberContext)_localctx).INT = match(INT);
			((NumberContext)_localctx).result =  (((NumberContext)_localctx).INT!=null?((NumberContext)_localctx).INT.getText():null);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\36u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\'\n"+
		"\4\f\4\16\4*\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6M\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bg\n\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\2\r\2\4\6\b\n\f\16\20\22\24"+
		"\26\2\2\177\2\30\3\2\2\2\4\33\3\2\2\2\6 \3\2\2\2\b+\3\2\2\2\nL\3\2\2\2"+
		"\fQ\3\2\2\2\16f\3\2\2\2\20h\3\2\2\2\22k\3\2\2\2\24n\3\2\2\2\26q\3\2\2"+
		"\2\30\31\5\4\3\2\31\32\b\2\1\2\32\3\3\2\2\2\33\34\7\6\2\2\34\35\5\6\4"+
		"\2\35\36\7\36\2\2\36\37\b\3\1\2\37\5\3\2\2\2 !\b\4\1\2!\"\5\f\7\2\"(\b"+
		"\4\1\2#$\5\b\5\2$%\b\4\1\2%\'\3\2\2\2&#\3\2\2\2\'*\3\2\2\2(&\3\2\2\2("+
		")\3\2\2\2)\7\3\2\2\2*(\3\2\2\2+,\5\n\6\2,-\b\5\1\2-\t\3\2\2\2./\7\17\2"+
		"\2/M\b\6\1\2\60\61\7\32\2\2\61M\b\6\1\2\62\63\7\33\2\2\63M\b\6\1\2\64"+
		"\65\7\34\2\2\65M\b\6\1\2\66\67\7\35\2\2\67M\b\6\1\289\7\20\2\29M\b\6\1"+
		"\2:;\7\21\2\2;M\b\6\1\2<=\7\22\2\2=M\b\6\1\2>?\7\23\2\2?M\b\6\1\2@A\7"+
		"\24\2\2AM\b\6\1\2BC\7\25\2\2CM\b\6\1\2DE\7\27\2\2EM\b\6\1\2FG\7\30\2\2"+
		"GM\b\6\1\2HI\7\31\2\2IM\b\6\1\2JK\7\26\2\2KM\b\6\1\2L.\3\2\2\2L\60\3\2"+
		"\2\2L\62\3\2\2\2L\64\3\2\2\2L\66\3\2\2\2L8\3\2\2\2L:\3\2\2\2L<\3\2\2\2"+
		"L>\3\2\2\2L@\3\2\2\2LB\3\2\2\2LD\3\2\2\2LF\3\2\2\2LH\3\2\2\2LJ\3\2\2\2"+
		"MN\3\2\2\2NO\5\f\7\2OP\b\6\1\2P\13\3\2\2\2QR\5\20\t\2RS\5\22\n\2ST\5\16"+
		"\b\2TU\b\7\1\2U\r\3\2\2\2VW\7\7\2\2Wg\b\b\1\2XY\7\b\2\2Yg\b\b\1\2Z[\7"+
		"\t\2\2[g\b\b\1\2\\]\7\n\2\2]g\b\b\1\2^_\7\16\2\2_g\b\b\1\2`a\7\r\2\2a"+
		"g\b\b\1\2bc\7\f\2\2cg\b\b\1\2de\7\13\2\2eg\b\b\1\2fV\3\2\2\2fX\3\2\2\2"+
		"fZ\3\2\2\2f\\\3\2\2\2f^\3\2\2\2f`\3\2\2\2fb\3\2\2\2fd\3\2\2\2g\17\3\2"+
		"\2\2hi\5\26\f\2ij\b\t\1\2j\21\3\2\2\2kl\5\26\f\2lm\b\n\1\2m\23\3\2\2\2"+
		"no\5\26\f\2op\b\13\1\2p\25\3\2\2\2qr\7\3\2\2rs\b\f\1\2s\27\3\2\2\2\5("+
		"Lf";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}