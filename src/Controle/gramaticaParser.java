// Generated from /home/wellyson/NetBeansProjects/CompiladorFinal/src/Controle/gramatica.g4 by ANTLR 4.5.3

    package Controle;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_decVars = 1, RULE_listaId = 2, RULE_decConst = 3, 
		RULE_valor = 4, RULE_tipo = 5, RULE_decFuncs = 6, RULE_listaParametros = 7, 
		RULE_bloco = 8, RULE_comando = 9, RULE_comandoRead = 10, RULE_comandoBreak = 11, 
		RULE_comandoPrint = 12, RULE_listaPrint = 13, RULE_comandoAtribuicao = 14, 
		RULE_comandoIf = 15, RULE_comandoElse = 16, RULE_comandoIfElse = 17, RULE_comandoFor = 18, 
		RULE_atribuicaoFor = 19, RULE_testeFor = 20, RULE_comandoReturn = 21, 
		RULE_listaIncrementos = 22, RULE_incremento = 23, RULE_equality = 24, 
		RULE_rel = 25, RULE_expr = 26, RULE_term = 27, RULE_unary = 28, RULE_factor = 29, 
		RULE_chamadaFunc = 30, RULE_listaArgumentosFunc = 31;
	public static final String[] ruleNames = {
		"prog", "decVars", "listaId", "decConst", "valor", "tipo", "decFuncs", 
		"listaParametros", "bloco", "comando", "comandoRead", "comandoBreak", 
		"comandoPrint", "listaPrint", "comandoAtribuicao", "comandoIf", "comandoElse", 
		"comandoIfElse", "comandoFor", "atribuicaoFor", "testeFor", "comandoReturn", 
		"listaIncrementos", "incremento", "equality", "rel", "expr", "term", "unary", 
		"factor", "chamadaFunc", "listaArgumentosFunc"
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

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode TK_program() { return getToken(gramaticaParser.TK_program, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public List<DecVarsContext> decVars() {
			return getRuleContexts(DecVarsContext.class);
		}
		public DecVarsContext decVars(int i) {
			return getRuleContext(DecVarsContext.class,i);
		}
		public List<DecConstContext> decConst() {
			return getRuleContexts(DecConstContext.class);
		}
		public DecConstContext decConst(int i) {
			return getRuleContext(DecConstContext.class,i);
		}
		public List<DecFuncsContext> decFuncs() {
			return getRuleContexts(DecFuncsContext.class);
		}
		public DecFuncsContext decFuncs(int i) {
			return getRuleContext(DecFuncsContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(TK_program);
			setState(65);
			match(ID);
			setState(66);
			match(T__0);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_int) | (1L << TK_string) | (1L << TK_boolean) | (1L << TK_float))) != 0)) {
				{
				{
				setState(67);
				decVars();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_const) {
				{
				{
				setState(73);
				decConst();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_func) {
				{
				{
				setState(79);
				decFuncs();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			bloco();
			setState(86);
			match(T__1);
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

	public static class DecVarsContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ListaIdContext listaId() {
			return getRuleContext(ListaIdContext.class,0);
		}
		public DecVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDecVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDecVars(this);
		}
	}

	public final DecVarsContext decVars() throws RecognitionException {
		DecVarsContext _localctx = new DecVarsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decVars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			tipo();
			setState(89);
			match(T__2);
			setState(90);
			listaId();
			setState(91);
			match(T__3);
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

	public static class ListaIdContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public ListaIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaId(this);
		}
	}

	public final ListaIdContext listaId() throws RecognitionException {
		ListaIdContext _localctx = new ListaIdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listaId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ID);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(94);
				match(T__4);
				setState(95);
				match(ID);
				}
				}
				setState(100);
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

	public static class DecConstContext extends ParserRuleContext {
		public TerminalNode TK_const() { return getToken(gramaticaParser.TK_const, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public DecConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDecConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDecConst(this);
		}
	}

	public final DecConstContext decConst() throws RecognitionException {
		DecConstContext _localctx = new DecConstContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(TK_const);
			setState(102);
			tipo();
			setState(103);
			match(ID);
			setState(104);
			match(T__5);
			setState(105);
			valor();
			setState(106);
			match(T__3);
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(gramaticaParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(gramaticaParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(gramaticaParser.BOOLEAN, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUM) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TK_int() { return getToken(gramaticaParser.TK_int, 0); }
		public TerminalNode TK_string() { return getToken(gramaticaParser.TK_string, 0); }
		public TerminalNode TK_boolean() { return getToken(gramaticaParser.TK_boolean, 0); }
		public TerminalNode TK_float() { return getToken(gramaticaParser.TK_float, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_int) | (1L << TK_string) | (1L << TK_boolean) | (1L << TK_float))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class DecFuncsContext extends ParserRuleContext {
		public TerminalNode TK_func() { return getToken(gramaticaParser.TK_func, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public DecFuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decFuncs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDecFuncs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDecFuncs(this);
		}
	}

	public final DecFuncsContext decFuncs() throws RecognitionException {
		DecFuncsContext _localctx = new DecFuncsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decFuncs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(TK_func);
			setState(113);
			tipo();
			setState(114);
			match(ID);
			setState(115);
			match(T__6);
			setState(116);
			listaParametros();
			setState(117);
			match(T__7);
			setState(118);
			match(T__0);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_read) | (1L << TK_print) | (1L << TK_if) | (1L << TK_for) | (1L << TK_return) | (1L << Tk_break) | (1L << ID))) != 0)) {
				{
				{
				setState(119);
				comando();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T__1);
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

	public static class ListaParametrosContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<ListaIdContext> listaId() {
			return getRuleContexts(ListaIdContext.class);
		}
		public ListaIdContext listaId(int i) {
			return getRuleContext(ListaIdContext.class,i);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaParametros(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			tipo();
			setState(128);
			match(T__2);
			setState(129);
			listaId();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(130);
				match(T__3);
				setState(131);
				tipo();
				setState(132);
				match(T__2);
				setState(133);
				listaId();
				}
				}
				setState(139);
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

	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode TK_block() { return getToken(gramaticaParser.TK_block, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(TK_block);
			setState(141);
			match(T__0);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_read) | (1L << TK_print) | (1L << TK_if) | (1L << TK_for) | (1L << TK_return) | (1L << Tk_break) | (1L << ID))) != 0)) {
				{
				{
				setState(142);
				comando();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(T__1);
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

	public static class ComandoContext extends ParserRuleContext {
		public ComandoReadContext comandoRead() {
			return getRuleContext(ComandoReadContext.class,0);
		}
		public ComandoPrintContext comandoPrint() {
			return getRuleContext(ComandoPrintContext.class,0);
		}
		public ComandoIfContext comandoIf() {
			return getRuleContext(ComandoIfContext.class,0);
		}
		public ComandoIfElseContext comandoIfElse() {
			return getRuleContext(ComandoIfElseContext.class,0);
		}
		public ComandoForContext comandoFor() {
			return getRuleContext(ComandoForContext.class,0);
		}
		public ComandoBreakContext comandoBreak() {
			return getRuleContext(ComandoBreakContext.class,0);
		}
		public ComandoReturnContext comandoReturn() {
			return getRuleContext(ComandoReturnContext.class,0);
		}
		public ComandoAtribuicaoContext comandoAtribuicao() {
			return getRuleContext(ComandoAtribuicaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comando);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				comandoRead();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				comandoPrint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				comandoIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				comandoIfElse();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				comandoFor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				comandoBreak();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				comandoReturn();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(157);
				comandoAtribuicao();
				setState(158);
				match(T__3);
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

	public static class ComandoReadContext extends ParserRuleContext {
		public TerminalNode TK_read() { return getToken(gramaticaParser.TK_read, 0); }
		public ListaIdContext listaId() {
			return getRuleContext(ListaIdContext.class,0);
		}
		public ComandoReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComandoRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComandoRead(this);
		}
	}

	public final ComandoReadContext comandoRead() throws RecognitionException {
		ComandoReadContext _localctx = new ComandoReadContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comandoRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(TK_read);
			setState(163);
			match(T__6);
			setState(164);
			listaId();
			setState(165);
			match(T__7);
			setState(166);
			match(T__3);
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

	public static class ComandoBreakContext extends ParserRuleContext {
		public TerminalNode Tk_break() { return getToken(gramaticaParser.Tk_break, 0); }
		public ComandoBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoBreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComandoBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComandoBreak(this);
		}
	}

	public final ComandoBreakContext comandoBreak() throws RecognitionException {
		ComandoBreakContext _localctx = new ComandoBreakContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comandoBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(Tk_break);
			setState(169);
			match(T__3);
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

	public static class ComandoPrintContext extends ParserRuleContext {
		public TerminalNode TK_print() { return getToken(gramaticaParser.TK_print, 0); }
		public ListaPrintContext listaPrint() {
			return getRuleContext(ListaPrintContext.class,0);
		}
		public ComandoPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComandoPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComandoPrint(this);
		}
	}

	public final ComandoPrintContext comandoPrint() throws RecognitionException {
		ComandoPrintContext _localctx = new ComandoPrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comandoPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(TK_print);
			setState(172);
			match(T__6);
			setState(173);
			listaPrint();
			setState(174);
			match(T__7);
			setState(175);
			match(T__3);
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

	public static class ListaPrintContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public ListaPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaPrint(this);
		}
	}

	public final ListaPrintContext listaPrint() throws RecognitionException {
		ListaPrintContext _localctx = new ListaPrintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listaPrint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			equality(0);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(178);
				match(T__4);
				setState(179);
				equality(0);
				}
				}
				setState(184);
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

	public static class ComandoAtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public ComandoAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComandoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComandoAtribuicao(this);
		}
	}

	public final ComandoAtribuicaoContext comandoAtribuicao() throws RecognitionException {
		ComandoAtribuicaoContext _localctx = new ComandoAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comandoAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ID);
			setState(186);
			match(T__5);
			setState(187);
			equality(0);
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

	public static class ComandoIfContext extends ParserRuleContext {
		public TerminalNode TK_if() { return getToken(gramaticaParser.TK_if, 0); }
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComandoIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComandoIf(this);
		}
	}

	public final ComandoIfContext comandoIf() throws RecognitionException {
		ComandoIfContext _localctx = new ComandoIfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comandoIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(TK_if);
			setState(190);
			match(T__6);
			setState(191);
			equality(0);
			setState(192);
			match(T__7);
			setState(193);
			match(T__0);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_read) | (1L << TK_print) | (1L << TK_if) | (1L << TK_for) | (1L << TK_return) | (1L << Tk_break) | (1L << ID))) != 0)) {
				{
				{
				setState(194);
				comando();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(T__1);
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

	public static class ComandoElseContext extends ParserRuleContext {
		public TerminalNode TK_else() { return getToken(gramaticaParser.TK_else, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComandoElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComandoElse(this);
		}
	}

	public final ComandoElseContext comandoElse() throws RecognitionException {
		ComandoElseContext _localctx = new ComandoElseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comandoElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(TK_else);
			setState(203);
			match(T__0);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_read) | (1L << TK_print) | (1L << TK_if) | (1L << TK_for) | (1L << TK_return) | (1L << Tk_break) | (1L << ID))) != 0)) {
				{
				{
				setState(204);
				comando();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(T__1);
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

	public static class ComandoIfElseContext extends ParserRuleContext {
		public TerminalNode TK_if() { return getToken(gramaticaParser.TK_if, 0); }
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public ComandoElseContext comandoElse() {
			return getRuleContext(ComandoElseContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoIfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoIfElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComandoIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComandoIfElse(this);
		}
	}

	public final ComandoIfElseContext comandoIfElse() throws RecognitionException {
		ComandoIfElseContext _localctx = new ComandoIfElseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comandoIfElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(TK_if);
			setState(213);
			match(T__6);
			setState(214);
			equality(0);
			setState(215);
			match(T__7);
			setState(216);
			match(T__0);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_read) | (1L << TK_print) | (1L << TK_if) | (1L << TK_for) | (1L << TK_return) | (1L << Tk_break) | (1L << ID))) != 0)) {
				{
				{
				setState(217);
				comando();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(T__1);
			setState(224);
			comandoElse();
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

	public static class ComandoForContext extends ParserRuleContext {
		public TerminalNode TK_for() { return getToken(gramaticaParser.TK_for, 0); }
		public AtribuicaoForContext atribuicaoFor() {
			return getRuleContext(AtribuicaoForContext.class,0);
		}
		public TesteForContext testeFor() {
			return getRuleContext(TesteForContext.class,0);
		}
		public ListaIncrementosContext listaIncrementos() {
			return getRuleContext(ListaIncrementosContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComandoFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComandoFor(this);
		}
	}

	public final ComandoForContext comandoFor() throws RecognitionException {
		ComandoForContext _localctx = new ComandoForContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comandoFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(TK_for);
			setState(227);
			match(T__6);
			setState(228);
			atribuicaoFor();
			setState(229);
			testeFor();
			setState(230);
			listaIncrementos();
			setState(231);
			match(T__7);
			setState(232);
			match(T__0);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_read) | (1L << TK_print) | (1L << TK_if) | (1L << TK_for) | (1L << TK_return) | (1L << Tk_break) | (1L << ID))) != 0)) {
				{
				{
				setState(233);
				comando();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(T__1);
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

	public static class AtribuicaoForContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public AtribuicaoForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAtribuicaoFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAtribuicaoFor(this);
		}
	}

	public final AtribuicaoForContext atribuicaoFor() throws RecognitionException {
		AtribuicaoForContext _localctx = new AtribuicaoForContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_atribuicaoFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ID);
			setState(242);
			match(T__5);
			setState(243);
			equality(0);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(244);
				match(T__4);
				setState(245);
				match(ID);
				setState(246);
				match(T__5);
				setState(247);
				equality(0);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(T__3);
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

	public static class TesteForContext extends ParserRuleContext {
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public TesteForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testeFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTesteFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTesteFor(this);
		}
	}

	public final TesteForContext testeFor() throws RecognitionException {
		TesteForContext _localctx = new TesteForContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_testeFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			equality(0);
			setState(256);
			match(T__3);
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

	public static class ComandoReturnContext extends ParserRuleContext {
		public TerminalNode TK_return() { return getToken(gramaticaParser.TK_return, 0); }
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public ComandoReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComandoReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComandoReturn(this);
		}
	}

	public final ComandoReturnContext comandoReturn() throws RecognitionException {
		ComandoReturnContext _localctx = new ComandoReturnContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comandoReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(TK_return);
			setState(259);
			equality(0);
			setState(260);
			match(T__3);
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

	public static class ListaIncrementosContext extends ParserRuleContext {
		public List<IncrementoContext> incremento() {
			return getRuleContexts(IncrementoContext.class);
		}
		public IncrementoContext incremento(int i) {
			return getRuleContext(IncrementoContext.class,i);
		}
		public ListaIncrementosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIncrementos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaIncrementos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaIncrementos(this);
		}
	}

	public final ListaIncrementosContext listaIncrementos() throws RecognitionException {
		ListaIncrementosContext _localctx = new ListaIncrementosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_listaIncrementos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			incremento();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(263);
				match(T__4);
				setState(264);
				incremento();
				}
				}
				setState(269);
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

	public static class IncrementoContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitIncremento(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_incremento);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				unary(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(ID);
				setState(272);
				match(T__5);
				setState(273);
				equality(0);
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

	public static class EqualityContext extends ParserRuleContext {
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEquality(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		return equality(0);
	}

	private EqualityContext equality(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityContext _localctx = new EqualityContext(_ctx, _parentState);
		EqualityContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_equality, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(277);
			rel();
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(285);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(279);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(280);
						match(T__8);
						setState(281);
						rel();
						}
						break;
					case 2:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(282);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(283);
						match(T__9);
						setState(284);
						rel();
						}
						break;
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class RelContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRel(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_rel);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				expr(0);
				setState(291);
				match(T__10);
				setState(292);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				expr(0);
				setState(295);
				match(T__11);
				setState(296);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				expr(0);
				setState(299);
				match(T__12);
				setState(300);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				expr(0);
				setState(303);
				match(T__13);
				setState(304);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(310);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(318);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(313);
						match(T__14);
						setState(314);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(316);
						match(T__15);
						setState(317);
						term(0);
						}
						break;
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(324);
			unary(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(332);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(326);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(327);
						match(T__16);
						setState(328);
						unary(0);
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(329);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(330);
						match(T__17);
						setState(331);
						unary(0);
						}
						break;
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		return unary(0);
	}

	private UnaryContext unary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnaryContext _localctx = new UnaryContext(_ctx, _parentState);
		UnaryContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_unary, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			switch (_input.LA(1)) {
			case T__18:
				{
				setState(338);
				match(T__18);
				setState(339);
				unary(5);
				}
				break;
			case T__15:
				{
				setState(340);
				match(T__15);
				setState(341);
				unary(4);
				}
				break;
			case T__6:
			case BOOLEAN:
			case ID:
			case NUM:
			case STRING:
				{
				setState(342);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(349);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new UnaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unary);
						setState(345);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(346);
						match(T__19);
						}
						break;
					case 2:
						{
						_localctx = new UnaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unary);
						setState(347);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(348);
						match(T__20);
						}
						break;
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ChamadaFuncContext chamadaFunc() {
			return getRuleContext(ChamadaFuncContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_factor);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(T__6);
				setState(355);
				equality(0);
				setState(356);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				chamadaFunc();
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

	public static class ChamadaFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ListaArgumentosFuncContext listaArgumentosFunc() {
			return getRuleContext(ListaArgumentosFuncContext.class,0);
		}
		public ChamadaFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterChamadaFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitChamadaFunc(this);
		}
	}

	public final ChamadaFuncContext chamadaFunc() throws RecognitionException {
		ChamadaFuncContext _localctx = new ChamadaFuncContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_chamadaFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(ID);
			setState(364);
			match(T__6);
			setState(366);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__15) | (1L << T__18) | (1L << BOOLEAN) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
				{
				setState(365);
				listaArgumentosFunc();
				}
			}

			setState(368);
			match(T__7);
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

	public static class ListaArgumentosFuncContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public ListaArgumentosFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgumentosFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaArgumentosFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaArgumentosFunc(this);
		}
	}

	public final ListaArgumentosFuncContext listaArgumentosFunc() throws RecognitionException {
		ListaArgumentosFuncContext _localctx = new ListaArgumentosFuncContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_listaArgumentosFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			equality(0);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(371);
				match(T__4);
				setState(372);
				equality(0);
				}
				}
				setState(377);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return equality_sempred((EqualityContext)_localctx, predIndex);
		case 26:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 27:
			return term_sempred((TermContext)_localctx, predIndex);
		case 28:
			return unary_sempred((UnaryContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean equality_sempred(EqualityContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean unary_sempred(UnaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u017d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\7\2M\n\2\f\2\16\2P\13"+
		"\2\3\2\7\2S\n\2\f\2\16\2V\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\7\4c\n\4\f\4\16\4f\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t\3\n\3\n"+
		"\3\n\7\n\u0092\n\n\f\n\16\n\u0095\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00a3\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00b7\n\17"+
		"\f\17\16\17\u00ba\13\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\7\21\u00c6\n\21\f\21\16\21\u00c9\13\21\3\21\3\21\3\22\3\22\3\22\7"+
		"\22\u00d0\n\22\f\22\16\22\u00d3\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\7\23\u00dd\n\23\f\23\16\23\u00e0\13\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00ed\n\24\f\24\16\24\u00f0\13"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00fb\n\25\f\25"+
		"\16\25\u00fe\13\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\7\30\u010c\n\30\f\30\16\30\u010f\13\30\3\31\3\31\3\31\3\31\5"+
		"\31\u0115\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0120"+
		"\n\32\f\32\16\32\u0123\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0136\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0141\n\34\f\34\16\34\u0144\13"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u014f\n\35\f\35"+
		"\16\35\u0152\13\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u015a\n\36\3\36"+
		"\3\36\3\36\3\36\7\36\u0160\n\36\f\36\16\36\u0163\13\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u016c\n\37\3 \3 \3 \5 \u0171\n \3 \3 \3!\3!"+
		"\3!\7!\u0178\n!\f!\16!\u017b\13!\3!\2\6\62\668:\"\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\4\4\2\'\'+,\3\2!$\u0185"+
		"\2B\3\2\2\2\4Z\3\2\2\2\6_\3\2\2\2\bg\3\2\2\2\nn\3\2\2\2\fp\3\2\2\2\16"+
		"r\3\2\2\2\20\u0081\3\2\2\2\22\u008e\3\2\2\2\24\u00a2\3\2\2\2\26\u00a4"+
		"\3\2\2\2\30\u00aa\3\2\2\2\32\u00ad\3\2\2\2\34\u00b3\3\2\2\2\36\u00bb\3"+
		"\2\2\2 \u00bf\3\2\2\2\"\u00cc\3\2\2\2$\u00d6\3\2\2\2&\u00e4\3\2\2\2(\u00f3"+
		"\3\2\2\2*\u0101\3\2\2\2,\u0104\3\2\2\2.\u0108\3\2\2\2\60\u0114\3\2\2\2"+
		"\62\u0116\3\2\2\2\64\u0135\3\2\2\2\66\u0137\3\2\2\28\u0145\3\2\2\2:\u0159"+
		"\3\2\2\2<\u016b\3\2\2\2>\u016d\3\2\2\2@\u0174\3\2\2\2BC\7\30\2\2CD\7*"+
		"\2\2DH\7\3\2\2EG\5\4\3\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IN\3\2"+
		"\2\2JH\3\2\2\2KM\5\b\5\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OT\3\2"+
		"\2\2PN\3\2\2\2QS\5\16\b\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3"+
		"\2\2\2VT\3\2\2\2WX\5\22\n\2XY\7\4\2\2Y\3\3\2\2\2Z[\5\f\7\2[\\\7\5\2\2"+
		"\\]\5\6\4\2]^\7\6\2\2^\5\3\2\2\2_d\7*\2\2`a\7\7\2\2ac\7*\2\2b`\3\2\2\2"+
		"cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\7\3\2\2\2fd\3\2\2\2gh\7\31\2\2hi\5\f\7"+
		"\2ij\7*\2\2jk\7\b\2\2kl\5\n\6\2lm\7\6\2\2m\t\3\2\2\2no\t\2\2\2o\13\3\2"+
		"\2\2pq\t\3\2\2q\r\3\2\2\2rs\7%\2\2st\5\f\7\2tu\7*\2\2uv\7\t\2\2vw\5\20"+
		"\t\2wx\7\n\2\2x|\7\3\2\2y{\5\24\13\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3"+
		"\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\4\2\2\u0080\17\3\2\2\2\u0081"+
		"\u0082\5\f\7\2\u0082\u0083\7\5\2\2\u0083\u008b\5\6\4\2\u0084\u0085\7\6"+
		"\2\2\u0085\u0086\5\f\7\2\u0086\u0087\7\5\2\2\u0087\u0088\5\6\4\2\u0088"+
		"\u008a\3\2\2\2\u0089\u0084\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\21\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f"+
		"\7\32\2\2\u008f\u0093\7\3\2\2\u0090\u0092\5\24\13\2\u0091\u0090\3\2\2"+
		"\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\4\2\2\u0097\23\3\2\2\2\u0098"+
		"\u00a3\5\26\f\2\u0099\u00a3\5\32\16\2\u009a\u00a3\5 \21\2\u009b\u00a3"+
		"\5$\23\2\u009c\u00a3\5&\24\2\u009d\u00a3\5\30\r\2\u009e\u00a3\5,\27\2"+
		"\u009f\u00a0\5\36\20\2\u00a0\u00a1\7\6\2\2\u00a1\u00a3\3\2\2\2\u00a2\u0098"+
		"\3\2\2\2\u00a2\u0099\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2"+
		"\u009c\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2"+
		"\2\2\u00a3\25\3\2\2\2\u00a4\u00a5\7\33\2\2\u00a5\u00a6\7\t\2\2\u00a6\u00a7"+
		"\5\6\4\2\u00a7\u00a8\7\n\2\2\u00a8\u00a9\7\6\2\2\u00a9\27\3\2\2\2\u00aa"+
		"\u00ab\7&\2\2\u00ab\u00ac\7\6\2\2\u00ac\31\3\2\2\2\u00ad\u00ae\7\34\2"+
		"\2\u00ae\u00af\7\t\2\2\u00af\u00b0\5\34\17\2\u00b0\u00b1\7\n\2\2\u00b1"+
		"\u00b2\7\6\2\2\u00b2\33\3\2\2\2\u00b3\u00b8\5\62\32\2\u00b4\u00b5\7\7"+
		"\2\2\u00b5\u00b7\5\62\32\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\35\3\2\2\2\u00ba\u00b8\3\2\2"+
		"\2\u00bb\u00bc\7*\2\2\u00bc\u00bd\7\b\2\2\u00bd\u00be\5\62\32\2\u00be"+
		"\37\3\2\2\2\u00bf\u00c0\7\35\2\2\u00c0\u00c1\7\t\2\2\u00c1\u00c2\5\62"+
		"\32\2\u00c2\u00c3\7\n\2\2\u00c3\u00c7\7\3\2\2\u00c4\u00c6\5\24\13\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\4\2\2\u00cb"+
		"!\3\2\2\2\u00cc\u00cd\7\36\2\2\u00cd\u00d1\7\3\2\2\u00ce\u00d0\5\24\13"+
		"\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\4\2\2\u00d5"+
		"#\3\2\2\2\u00d6\u00d7\7\35\2\2\u00d7\u00d8\7\t\2\2\u00d8\u00d9\5\62\32"+
		"\2\u00d9\u00da\7\n\2\2\u00da\u00de\7\3\2\2\u00db\u00dd\5\24\13\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\4\2\2\u00e2"+
		"\u00e3\5\"\22\2\u00e3%\3\2\2\2\u00e4\u00e5\7\37\2\2\u00e5\u00e6\7\t\2"+
		"\2\u00e6\u00e7\5(\25\2\u00e7\u00e8\5*\26\2\u00e8\u00e9\5.\30\2\u00e9\u00ea"+
		"\7\n\2\2\u00ea\u00ee\7\3\2\2\u00eb\u00ed\5\24\13\2\u00ec\u00eb\3\2\2\2"+
		"\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\4\2\2\u00f2\'\3\2\2\2\u00f3"+
		"\u00f4\7*\2\2\u00f4\u00f5\7\b\2\2\u00f5\u00fc\5\62\32\2\u00f6\u00f7\7"+
		"\7\2\2\u00f7\u00f8\7*\2\2\u00f8\u00f9\7\b\2\2\u00f9\u00fb\5\62\32\2\u00fa"+
		"\u00f6\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7\6\2\2\u0100"+
		")\3\2\2\2\u0101\u0102\5\62\32\2\u0102\u0103\7\6\2\2\u0103+\3\2\2\2\u0104"+
		"\u0105\7 \2\2\u0105\u0106\5\62\32\2\u0106\u0107\7\6\2\2\u0107-\3\2\2\2"+
		"\u0108\u010d\5\60\31\2\u0109\u010a\7\7\2\2\u010a\u010c\5\60\31\2\u010b"+
		"\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e/\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0115\5:\36\2\u0111\u0112"+
		"\7*\2\2\u0112\u0113\7\b\2\2\u0113\u0115\5\62\32\2\u0114\u0110\3\2\2\2"+
		"\u0114\u0111\3\2\2\2\u0115\61\3\2\2\2\u0116\u0117\b\32\1\2\u0117\u0118"+
		"\5\64\33\2\u0118\u0121\3\2\2\2\u0119\u011a\f\5\2\2\u011a\u011b\7\13\2"+
		"\2\u011b\u0120\5\64\33\2\u011c\u011d\f\4\2\2\u011d\u011e\7\f\2\2\u011e"+
		"\u0120\5\64\33\2\u011f\u0119\3\2\2\2\u011f\u011c\3\2\2\2\u0120\u0123\3"+
		"\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\63\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\u0125\5\66\34\2\u0125\u0126\7\r\2\2\u0126\u0127\5"+
		"\66\34\2\u0127\u0136\3\2\2\2\u0128\u0129\5\66\34\2\u0129\u012a\7\16\2"+
		"\2\u012a\u012b\5\66\34\2\u012b\u0136\3\2\2\2\u012c\u012d\5\66\34\2\u012d"+
		"\u012e\7\17\2\2\u012e\u012f\5\66\34\2\u012f\u0136\3\2\2\2\u0130\u0131"+
		"\5\66\34\2\u0131\u0132\7\20\2\2\u0132\u0133\5\66\34\2\u0133\u0136\3\2"+
		"\2\2\u0134\u0136\5\66\34\2\u0135\u0124\3\2\2\2\u0135\u0128\3\2\2\2\u0135"+
		"\u012c\3\2\2\2\u0135\u0130\3\2\2\2\u0135\u0134\3\2\2\2\u0136\65\3\2\2"+
		"\2\u0137\u0138\b\34\1\2\u0138\u0139\58\35\2\u0139\u0142\3\2\2\2\u013a"+
		"\u013b\f\5\2\2\u013b\u013c\7\21\2\2\u013c\u0141\58\35\2\u013d\u013e\f"+
		"\4\2\2\u013e\u013f\7\22\2\2\u013f\u0141\58\35\2\u0140\u013a\3\2\2\2\u0140"+
		"\u013d\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\67\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\b\35\1\2\u0146\u0147"+
		"\5:\36\2\u0147\u0150\3\2\2\2\u0148\u0149\f\5\2\2\u0149\u014a\7\23\2\2"+
		"\u014a\u014f\5:\36\2\u014b\u014c\f\4\2\2\u014c\u014d\7\24\2\2\u014d\u014f"+
		"\5:\36\2\u014e\u0148\3\2\2\2\u014e\u014b\3\2\2\2\u014f\u0152\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u01519\3\2\2\2\u0152\u0150\3\2\2\2"+
		"\u0153\u0154\b\36\1\2\u0154\u0155\7\25\2\2\u0155\u015a\5:\36\7\u0156\u0157"+
		"\7\22\2\2\u0157\u015a\5:\36\6\u0158\u015a\5<\37\2\u0159\u0153\3\2\2\2"+
		"\u0159\u0156\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u0161\3\2\2\2\u015b\u015c"+
		"\f\5\2\2\u015c\u0160\7\26\2\2\u015d\u015e\f\4\2\2\u015e\u0160\7\27\2\2"+
		"\u015f\u015b\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162;\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0165\7\t\2\2\u0165\u0166\5\62\32\2\u0166\u0167\7\n\2\2\u0167\u016c\3"+
		"\2\2\2\u0168\u016c\5\n\6\2\u0169\u016c\7*\2\2\u016a\u016c\5> \2\u016b"+
		"\u0164\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2"+
		"\2\2\u016c=\3\2\2\2\u016d\u016e\7*\2\2\u016e\u0170\7\t\2\2\u016f\u0171"+
		"\5@!\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0173\7\n\2\2\u0173?\3\2\2\2\u0174\u0179\5\62\32\2\u0175\u0176\7\7\2"+
		"\2\u0176\u0178\5\62\32\2\u0177\u0175\3\2\2\2\u0178\u017b\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017aA\3\2\2\2\u017b\u0179\3\2\2\2"+
		"\37HNTd|\u008b\u0093\u00a2\u00b8\u00c7\u00d1\u00de\u00ee\u00fc\u010d\u0114"+
		"\u011f\u0121\u0135\u0140\u0142\u014e\u0150\u0159\u015f\u0161\u016b\u0170"+
		"\u0179";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}