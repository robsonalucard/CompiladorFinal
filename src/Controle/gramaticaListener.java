// Generated from /home/wellyson/NetBeansProjects/CompiladorFinal/src/Controle/gramatica.g4 by ANTLR 4.5.3

    package Controle;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(gramaticaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(gramaticaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#decVars}.
	 * @param ctx the parse tree
	 */
	void enterDecVars(gramaticaParser.DecVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#decVars}.
	 * @param ctx the parse tree
	 */
	void exitDecVars(gramaticaParser.DecVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaId}.
	 * @param ctx the parse tree
	 */
	void enterListaId(gramaticaParser.ListaIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaId}.
	 * @param ctx the parse tree
	 */
	void exitListaId(gramaticaParser.ListaIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#decConst}.
	 * @param ctx the parse tree
	 */
	void enterDecConst(gramaticaParser.DecConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#decConst}.
	 * @param ctx the parse tree
	 */
	void exitDecConst(gramaticaParser.DecConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(gramaticaParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(gramaticaParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(gramaticaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(gramaticaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#decFuncs}.
	 * @param ctx the parse tree
	 */
	void enterDecFuncs(gramaticaParser.DecFuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#decFuncs}.
	 * @param ctx the parse tree
	 */
	void exitDecFuncs(gramaticaParser.DecFuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(gramaticaParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(gramaticaParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(gramaticaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(gramaticaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(gramaticaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(gramaticaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoRead}.
	 * @param ctx the parse tree
	 */
	void enterComandoRead(gramaticaParser.ComandoReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoRead}.
	 * @param ctx the parse tree
	 */
	void exitComandoRead(gramaticaParser.ComandoReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoBreak}.
	 * @param ctx the parse tree
	 */
	void enterComandoBreak(gramaticaParser.ComandoBreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoBreak}.
	 * @param ctx the parse tree
	 */
	void exitComandoBreak(gramaticaParser.ComandoBreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoPrint}.
	 * @param ctx the parse tree
	 */
	void enterComandoPrint(gramaticaParser.ComandoPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoPrint}.
	 * @param ctx the parse tree
	 */
	void exitComandoPrint(gramaticaParser.ComandoPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaPrint}.
	 * @param ctx the parse tree
	 */
	void enterListaPrint(gramaticaParser.ListaPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaPrint}.
	 * @param ctx the parse tree
	 */
	void exitListaPrint(gramaticaParser.ListaPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(gramaticaParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(gramaticaParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoIf}.
	 * @param ctx the parse tree
	 */
	void enterComandoIf(gramaticaParser.ComandoIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoIf}.
	 * @param ctx the parse tree
	 */
	void exitComandoIf(gramaticaParser.ComandoIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoElse}.
	 * @param ctx the parse tree
	 */
	void enterComandoElse(gramaticaParser.ComandoElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoElse}.
	 * @param ctx the parse tree
	 */
	void exitComandoElse(gramaticaParser.ComandoElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoIfElse}.
	 * @param ctx the parse tree
	 */
	void enterComandoIfElse(gramaticaParser.ComandoIfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoIfElse}.
	 * @param ctx the parse tree
	 */
	void exitComandoIfElse(gramaticaParser.ComandoIfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoFor}.
	 * @param ctx the parse tree
	 */
	void enterComandoFor(gramaticaParser.ComandoForContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoFor}.
	 * @param ctx the parse tree
	 */
	void exitComandoFor(gramaticaParser.ComandoForContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#atribuicaoFor}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoFor(gramaticaParser.AtribuicaoForContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#atribuicaoFor}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoFor(gramaticaParser.AtribuicaoForContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#testeFor}.
	 * @param ctx the parse tree
	 */
	void enterTesteFor(gramaticaParser.TesteForContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#testeFor}.
	 * @param ctx the parse tree
	 */
	void exitTesteFor(gramaticaParser.TesteForContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoReturn}.
	 * @param ctx the parse tree
	 */
	void enterComandoReturn(gramaticaParser.ComandoReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoReturn}.
	 * @param ctx the parse tree
	 */
	void exitComandoReturn(gramaticaParser.ComandoReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaIncrementos}.
	 * @param ctx the parse tree
	 */
	void enterListaIncrementos(gramaticaParser.ListaIncrementosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaIncrementos}.
	 * @param ctx the parse tree
	 */
	void exitListaIncrementos(gramaticaParser.ListaIncrementosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(gramaticaParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(gramaticaParser.IncrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(gramaticaParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(gramaticaParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(gramaticaParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(gramaticaParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(gramaticaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(gramaticaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(gramaticaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(gramaticaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(gramaticaParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(gramaticaParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#chamadaFunc}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFunc(gramaticaParser.ChamadaFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#chamadaFunc}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFunc(gramaticaParser.ChamadaFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaArgumentosFunc}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentosFunc(gramaticaParser.ListaArgumentosFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaArgumentosFunc}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentosFunc(gramaticaParser.ListaArgumentosFuncContext ctx);
}