/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Controle.gramaticaParser.EqualityContext;
import Controle.gramaticaParser.IncrementoContext;
import Controle.gramaticaParser.ListaIdContext;
import Entidade.Constante;
import Entidade.Funcao;
import Entidade.PilhaIterador;
import Entidade.TabelaDeSimbolos;
import Entidade.Variavel;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author pedro
 */
public class Semantica extends gramaticaBaseListener {

    public GeradorDeCodigo gc;
    public TabelaDeSimbolos tabelaDeSimbolos;
    public PilhaIterador pilhaIteradores;
    
    //Constantes para facilitar quando precisarmos lidar com os tipos
    public final int Inteiro = 1;
    public final int Float =  2;
    public final int String = 3;
    public final int Bool = 4;
    
    //Identifica a funcao que está sendo analisada no momento
    public String funcaoAtual;
    
    //Habilita ou Não a possibilidade de haver um return 
    //Recebe True ao entrar em Funcoes
    public Boolean habilitaReturn;
    
    //Recebe True caso tenhamos entrado no Bloco
    public Boolean estaNoBloco;
    
    //Usada para testes e impressões de flags
    public Boolean debug = false;
    public Boolean readInt, readFloat, readString;
    
    public Semantica(String diretorioSourceFile){
        this.tabelaDeSimbolos = new TabelaDeSimbolos();
        this.gc = new GeradorDeCodigo(this.tabelaDeSimbolos, diretorioSourceFile);
        this.funcaoAtual = "";
        this.habilitaReturn = false;
        this.pilhaIteradores = new PilhaIterador();
        this.estaNoBloco = false;
        this.readInt = false;
        this.readFloat = false;
        this.readString = false;
    }
    
    
    @Override
    public void enterProg(gramaticaParser.ProgContext ctx) {
        
        /*
            prog : 'program' ID '{' decVars* decConst* decFuncs* bloco '}'
        */
        
        //Verificar se o nome dado ao programa é uma Palavra Reservada
        //Caso seja, imprimir um erro
        if(this.tabelaDeSimbolos.ehPalavraReservada(ctx.ID().getText())){
            exibirErro(ctx.ID().getText()+" é uma Palavra Reservada", ctx);
        }
        else{
            //Armazena o nome do Programa na Tabela de Símbolos
            this.tabelaDeSimbolos.identificadorPrograma = ctx.ID().getText();
            this.gc.genFile();
            this.gc.genHeader();
        }
    }

   
    @Override
    public void exitProg(gramaticaParser.ProgContext ctx) {
       this.gc.closeFile();
    }

    
    @Override
    public void enterDecVars(gramaticaParser.DecVarsContext ctx) {
        /*
            decVars : tipo ':' listaID ';'
        */
        
        int tipo = mapeiaTipoStringInt(ctx.tipo().getText());
        
        for(TerminalNode terminalNode : ctx.listaId().ID()){
            
            //System.out.println("Variável : "+terminalNode.getText());
            
            //Verificação 1: Analisa os Identificadores de cada variável e ver se eles são ou não
            //palavras reservadas
            if(this.tabelaDeSimbolos.ehPalavraReservada(terminalNode.getText())){
                exibirErro(terminalNode.getText()+" é uma Palavra Reservada", ctx);
                continue;
            }
            
            //Verificação 2: Verificar se a variavel ja nao foi declarada anteriormente
            if(this.tabelaDeSimbolos.identificadorExistente(terminalNode.getText())){
                exibirErro("A variável "+terminalNode.getText()+" já foi declarada anteriormente", ctx);
                continue;
            } 
            
            //Caso não tenha sido enquadrada em nenhuma das duas verificações, pode adicionar na Tabela de Símbolos
            Variavel v = new Variavel(tipo, terminalNode.getText());
            this.tabelaDeSimbolos.adicionarVariavel(v);
        }
    }

    
    @Override
    public void exitDecVars(gramaticaParser.DecVarsContext ctx) {
        /*if(debug){
            this.tabelaDeSimbolos.imprimirTabela();
        }*/
    }

   
    @Override
    public void enterListaId(gramaticaParser.ListaIdContext ctx) {
    }

   
    @Override
    public void exitListaId(gramaticaParser.ListaIdContext ctx) {
    }

   
    @Override
    public void enterDecConst(gramaticaParser.DecConstContext ctx) {
        /*
            decConst : 'const' tipo ID '=' valor ';'
        */
        
        int tipo = mapeiaTipoStringInt(ctx.tipo().getText());
        
        //Verificação 1: Verificar se é Palavra Reservada
        if(this.tabelaDeSimbolos.ehPalavraReservada(ctx.ID().getText())){
            exibirErro(ctx.ID().getText()+" é uma Palavra Reservada", ctx);
        }
        else{
            //Verificacao 2: Verificar se ja foi declarada anteriormente
            if(this.tabelaDeSimbolos.identificadorExistente(ctx.ID().getText())){
                exibirErro(ctx.ID().getText()+" já foi declarada anteriormente", ctx);
            }
            else{
                //Verificacao 3: Verificar compatibilidade de tipo 
                int tipoExpressao = this.obterTipo(ctx.valor().getText());
                
                if(tipo == tipoExpressao){
                    //Adiciona a Constante na Tabela de Símbolos
                    
                    this.tabelaDeSimbolos.adicionarConstante(new Constante(tipo, ctx.ID().getText(), ctx.valor().getText()));

                }
                else{
                    exibirErro("Atribuição de valor incompatível na Constante "+ctx.ID().getText(), ctx);
                }
            }
        }
    }

    @Override
    public void exitDecConst(gramaticaParser.DecConstContext ctx) {
    }
  
    @Override
    public void enterDecFuncs(gramaticaParser.DecFuncsContext ctx) {
        /*
            decFuncs : 'func' tipo ID '(' listaParametros ')''{' comando* '}' 
        */
        
        //Já que entramos em uma Declaração de Função, deve haver um return ( Não temos retorno void )
        this.habilitaReturn = true;
        
        int tipo = this.mapeiaTipoStringInt(ctx.tipo().getText());
        String identificador = ctx.ID().getText();
        
        this.funcaoAtual = identificador; // Atualiza o identificador da Função que estamos analisando atualmente
        
        //Verificação 1: Verificar se o Identificador da Função é Palavra Reservada
        if(this.tabelaDeSimbolos.ehPalavraReservada(ctx.ID().getText())){
            exibirErro(ctx.ID().getText()+" é uma Palavra Reservada", ctx);
            return;
        }
        
        //Verificação 2: Verificar se o Identificador da Função já existe
        if(this.tabelaDeSimbolos.identificadorExistente(ctx.ID().getText())){
            exibirErro(ctx.ID().getText()+" já foi declarada anteriormente", ctx);
            return;
        }
       
        this.tabelaDeSimbolos.adicionarFuncao(new Funcao(tipo, identificador));
        
        int contador = 0, tipoLista;
        
        if(ctx.listaParametros() != null){ //Função com Argumentos
            for(ListaIdContext lic : ctx.listaParametros().listaId()){
                
                //Obtem o Tipo da Lista de IDs
                tipoLista = mapeiaTipoStringInt(ctx.listaParametros().tipo(contador).getText());
                
                for(TerminalNode terminalNode : lic.ID()){
                    
                    //Verificação 3 : Verificar se os identificadores do argumentos são palavras reservadas
                    if(this.tabelaDeSimbolos.ehPalavraReservada(terminalNode.getText())){
                        exibirErro("O Identificador "+terminalNode.getText()+ " é uma Palavra Reservada", ctx);
                        continue;
                    }
                    
                    //Verificação 4 : Verificar se os identificadores do argumentos já foram declarados na mesma função
                    if(this.tabelaDeSimbolos.obterFuncao(identificador).identificadorExistente(terminalNode.getText())){
                        exibirErro("O Identificador "+terminalNode.getText()+ " já existe na função "+identificador, ctx);
                        continue;
                    }
                  
                    this.tabelaDeSimbolos.obterFuncao(identificador).adicionarArgumento(tipoLista, terminalNode.getText());
                    
                }
                contador++;
            }
            
            //Após todas as verificações, pode gerar o código da Função
        }
        
        this.gc.genInitFunc(this.funcaoAtual);
    }

    
    @Override
    public void exitDecFuncs(gramaticaParser.DecFuncsContext ctx) {
        
        this.gc.genFinalFunc(this.funcaoAtual);
        this.habilitaReturn = false;
        this.funcaoAtual = "";
        if(debug){
            //this.tabelaDeSimbolos.imprimirTabela();
        }
    }

       
    @Override
    public void enterBloco(gramaticaParser.BlocoContext ctx) {
        this.estaNoBloco = true;
        this.gc.genMainHeader();
        this.carregarConstantes();
    }

   
    @Override
    public void exitBloco(gramaticaParser.BlocoContext ctx) {
        this.estaNoBloco = false;
        this.gc.finalizarMain();
        this.gc.genConstrutor();
        if(this.readInt){
            this.gc.genReadInt();
        }
        if(this.readFloat){
            this.gc.genReadFloat();
        }
        if(this.readString){
            this.gc.genReadString();
        }
    }
    
    @Override
    public void enterComandoRead(gramaticaParser.ComandoReadContext ctx) {
        
        /*
            comandoRead: 'read' '(' listaId ')' ';'
        
            listaId: ID (',' ID)*
        */
        
        for(TerminalNode tn : ctx.listaId().ID()){
            
            String ID = tn.getText();
            
            //Verificação 1 : Verificar se os IDs correspondem a Constantes
            if(this.tabelaDeSimbolos.ehConstante(ID)){
               exibirErro(ID+" corresponde a uma Constante. Seu valor não pode ser alterado", ctx);
            }
            else if(this.tabelaDeSimbolos.ehVariavel(ID)){
                Variavel v = this.tabelaDeSimbolos.obterVariavel(ID);
                switch (v.tipo) {
                case Inteiro:
                    this.readInt = true; //sinalizar que um readInt() deve ser gerado depois do 'main'
                    this.gc.genChamadaReadInt(v.endereco);
                    break;
                case Float:
                    this.readFloat = true;
                    this.gc.genChamadaReadFloat(v.endereco);
                    break;
                case String:
                    this.readString = true;
                    this.gc.genChamadaReadString(v.endereco);
                    break;
                default:
                    exibirErro("Tipo 'boolean' não pode ser lido.", ctx);
                    break;
            }
            }
            else{               
                exibirErro("'"+ID+"' não foi declarada.", ctx);
            }
        }
        
        
    }

    
    @Override
    public void exitComandoRead(gramaticaParser.ComandoReadContext ctx) {
    }

    
    @Override
    public void enterComandoBreak(gramaticaParser.ComandoBreakContext ctx) {
        
        /*
            comandoBreak: 'break' ';'
        */
        
        //Verificação 1 : Verificar se o Break foi declarado em um For
        if(this.pilhaIteradores.isEmpty()){
            exibirErro("O comando break foi declarado fora de um comando For.", ctx);
        }
        else{
            
        }
    }

   
    @Override
    public void exitComandoBreak(gramaticaParser.ComandoBreakContext ctx) {
    }

   
    @Override
    public void enterComandoPrint(gramaticaParser.ComandoPrintContext ctx) {
        /*
            comandoPrint: TK_print '(' listaPrint ')' ';'
                        ;
            listaPrint: equality (',' equality)*
                        ;
        */
        
        for(gramaticaParser.EqualityContext ec : ctx.listaPrint().equality()){
            this.gc.genPrintInit();
            //Dentro do obterTipoEquality é feita uma verificação de tipos
            int tipo = this.obterTipoEquality(ec);
            switch (tipo) {
                case String:
                    this.gc.genPrintString();
                    break;
                case Inteiro:
                    this.gc.genPrintInteiro();
                    break;
                case Float:
                    this.gc.genPrintReal();
                    break;
                case Bool:
                    this.gc.genPrintBool();
                    break;
            }
        }
        this.gc.genPrintNewLine();
    }

   
    @Override
    public void exitComandoPrint(gramaticaParser.ComandoPrintContext ctx) {
    }

    
    @Override
    public void enterComandoAtribuicao(gramaticaParser.ComandoAtribuicaoContext ctx) {
        /*
            comandoAtribuicao: ID '=' equality
        */
        
        String ID = ctx.ID().getText();
        
        //Verificação 1 : Verificar de ID corresponde a uma Constante
        if(this.tabelaDeSimbolos.ehConstante(ID)){
            exibirErro(ID+" corresponde a uma Constante. Seu valor não pode ser alterado.", ctx);
        }
        else{
            //Verificação 2 : Verificar se ID corresponde a uma Variável
            if(this.tabelaDeSimbolos.ehVariavel(ID)){
                
                Variavel var = this.tabelaDeSimbolos.obterVariavel(ID);
                int tipoVariavel = var.tipo;
                int tipoAtribuicao = this.obterTipoEquality(ctx.equality());
                
                //Verificação 3 : Verificar compatibilidade de tipos
                if((tipoVariavel == this.Inteiro && tipoAtribuicao == this.Float) || (tipoVariavel == this.Float && tipoAtribuicao == this.Inteiro)){
                    salvarVariavelCoercao(tipoVariavel, var.endereco);
                }
                else if(tipoVariavel == tipoAtribuicao){
                    salvarVariavel(tipoVariavel, var.endereco);
                }
                else{
                    exibirErro("O tipo de "+ctx.equality().getText()+" é imcompatível com o tipo de "+ID, ctx);
                }
            }
            else{               
                exibirErro("'"+ID+"' não foi declarada como Variável.", ctx);
            }
        }
        
    }

    
    @Override
    public void exitComandoAtribuicao(gramaticaParser.ComandoAtribuicaoContext ctx) {
    }

   
    @Override
    public void enterComandoIf(gramaticaParser.ComandoIfContext ctx) {
        
        /*
            comandoIf: 'if' '(' equality ')' '{' comando* '}'
        */
        
        //Verificação 1 : Verifica se o valor de equality é Booleano
        if(this.obterTipoEquality(ctx.equality()) == this.Bool){
            this.gc.genIfInit();
        }
        else{        
            exibirErro("Não corresponde a um valor Booleano", ctx);
        }
    }

    
    @Override
    public void exitComandoIf(gramaticaParser.ComandoIfContext ctx) {
        this.gc.genIfFinal();
    }

   
    @Override
    public void enterComandoIfElse(gramaticaParser.ComandoIfElseContext ctx) {
        
        /*
            comandoIfElse: TK_if '(' equality ')' '{' comando* '}' TK_else '{' comando* '}'
        */
        
        if(this.obterTipoEquality(ctx.equality()) == this.Bool){
            this.gc.genIfElseInit();
        }
        else{           
            exibirErro("Não corresponde a um valor Booleano", ctx);
        }
    }
    
    @Override 
    public void enterComandoElse(gramaticaParser.ComandoElseContext ctx) { 
        this.gc.genIfElseMeio();
    }
   
    @Override
    public void exitComandoIfElse(gramaticaParser.ComandoIfElseContext ctx) {
        this.gc.genIfElseFinal();
    }

   
    @Override
    public void enterComandoFor(gramaticaParser.ComandoForContext ctx) {
        
        this.pilhaIteradores.push(1);
        
        /*
            comandoFor : 'for' '(' atribuicaoFor testeFor listaIncrementos  ')' '{' comando* '}'
        
            atribuicaoFor: ID '=' equality (',' ID '=' equality)* ';'
        
            testeFor: equality ';'
        
            listaIncrementos: incremento (',' incremento)*

            incremento: unary
                      | ID '=' equality
        
        */
        
        
        int contador = 0;
        
        for(EqualityContext ec : ctx.atribuicaoFor().equality()){
            
            String ID = ctx.atribuicaoFor().ID(contador).getText();
            
            //Verificação 1 : Verifica se temos apenas variáveis na Atribuição
            if(!this.tabelaDeSimbolos.ehVariavel(ID)){
               exibirErro(ID+" não corresponde a uma Variável", ctx);
            }
            else{
                //Verificação 2 : Verifica se as variáveis são inteiras
                if(this.tabelaDeSimbolos.obterVariavel(ID).tipo != Inteiro){
                   exibirErro(ID+" não corresponde a uma variável Inteira", ctx);
                }
                else{
                    //Verificação 3 : Verifica se Equality tem tipo Inteiro
                    if(this.obterTipoEquality(ec) != Inteiro){                       
                       exibirErro(ec.getText()+" não corresponde a uma expressão de valor Inteiro", ctx);                       
                    }
                    else{
                        //TUDO OKAY
                    }
                }
            }
            
            contador++;
        }
        
        //Verificação 4 : Verifica se o tipo de Equality é Boolean
        if(this.obterTipoEquality(ctx.testeFor().equality()) != this.Bool){
           exibirErro(ctx.testeFor().equality().getText()+" não corresponde a uma expressão Booleana", ctx);  
        }
        
      
        for(IncrementoContext ic : ctx.listaIncrementos().incremento()){
            
            if(ic.getChildCount() == 3){
                //Deriva em ID '=' equality
                
                String ID = ic.getChild(0).getText();
                
                //Verificação 5 : Verifica se a lista de incrementos corresponde a variáveis
                if(!this.tabelaDeSimbolos.ehVariavel(ID)){
                    exibirErro(ic.getChild(0).getText()+" não corresponde a uma variável", ctx);
                }
                else{
                    //Verificação 6 : Verifica se a lista de incrementos corresponde a variáveis inteiras
                    if(this.tabelaDeSimbolos.obterVariavel(ID).tipo != Inteiro){
                        exibirErro(ID+" não corresponde a uma variável inteira", ctx);
                    }
                    else{
                        //Verificação 7 : Verifica se a expressão da atribuição resulta em inteiro
                        if(this.obterTipoEquality(ic.equality()) != Inteiro){
                           exibirErro(ic.equality().getText()+" não resulta em valor inteiro", ctx);
                        }
                        else{
                            //TUDO OKAY
                        }
                    }
                    
                }
            }
            else{
                //Deriva em unary
                //Verificação 8 : Verifica se o unary resulta em valor inteiro
                if(this.obterTipoUnary(ic.unary()) != Inteiro){
                    exibirErro(ic.unary().getText()+" não resulta em valor inteiro", ctx);
                }
                else{
                    //TUDO OKAY
                }
            }
        }
        
    }

   
    @Override
    public void exitComandoFor(gramaticaParser.ComandoForContext ctx) {
        this.pilhaIteradores.pop();
    }

  
    @Override
    public void enterAtribuicaoFor(gramaticaParser.AtribuicaoForContext ctx) {
    
    }

   
    @Override
    public void exitAtribuicaoFor(gramaticaParser.AtribuicaoForContext ctx) {
    }

   
    @Override
    public void enterComandoReturn(gramaticaParser.ComandoReturnContext ctx) {
        
        /*
            comandoReturn : 'return' equality ';'
        */
        
        //Verificação 1: Verificar se o Return está sendo usado dentro de uma função
        if(this.habilitaReturn == true){
            
            int tipoExpressao = this.obterTipoEquality(ctx.equality());
            int tipoFuncao = this.tabelaDeSimbolos.obterFuncao(this.funcaoAtual).tipo;
            
            //Verificação 2 : Verificar se o tipo retornado é compatível com a função na qual ele está
            if(tipoExpressao == Inteiro && tipoFuncao == Float){
                this.gc.genInttoReal();
            }else if(tipoExpressao == Float && tipoFuncao == Inteiro){
                this.gc.genRealtoInt();
            }else if(tipoExpressao == tipoFuncao){
                //Tipos Iguais, pode gerar
            }
            else{
                exibirErro("Expressão "+ctx.equality().getText()+" incompatível com o retorno da funcão "+this.funcaoAtual, ctx);
            }
            
        }else{
           exibirErro("O comando return não está sendo usado dentro de uma função", ctx);
        }
        //Verificação 2: Verificar se o tipo da expressão é compatível com o retorno da função
   
    }

   
    @Override
    public void exitComandoReturn(gramaticaParser.ComandoReturnContext ctx) {
    }

   
    @Override public void enterListaIncrementos(gramaticaParser.ListaIncrementosContext ctx) {
        
    }
	
    @Override public void exitListaIncrementos(gramaticaParser.ListaIncrementosContext ctx) {
    }
	
    @Override public void enterIncremento(gramaticaParser.IncrementoContext ctx) {
        
        /*
        //Verificar se é Unary
        if(ctx.getChildCount() == 1){
            //Precisa ser inteiro
            if(this.obterTipoUnary((gramaticaParser.UnaryContext)ctx.getChild(0)) != Inteiro){
                exibirErro(ctx.getText()+" não resulta em um Inteiro", ctx);
            }
            else{
                
            }
        }
        //Verificar se é atribuição
        else if(ctx.getChildCount() == 3){
            
            String identificador = ctx.getChild(0).getText();
            
            //Verificação 1: Verificar se o ID corresponde a uma símbolo existente
            if(this.tabelaDeSimbolos.identificadorExistente(identificador)){
            
                //Verificação 2: Verificar se corresponde a uma Constante
                if(this.tabelaDeSimbolos.ehConstante(identificador)){
                    exibirErro(identificador+" corresponde a uma Constante. Seu valor não pode ser alterado", ctx);
                }
                else{
                    
                    //Verificação 3: Verificar se corresponde a uma Variável
                    if(this.tabelaDeSimbolos.ehVariavel(identificador)){
                        
                        //Verificação 4: Verificar se corresponde a uma Variável Inteira
                        if(this.tabelaDeSimbolos.obterVariavel(identificador).tipo == Inteiro){
                            
                            //Verificação 5: Verificar se a expressão do lado Direito tem tipo inteiro
                            if(this.obterTipoEquality((gramaticaParser.EqualityContext)ctx.getChild(2)) == Inteiro){
                                //Tudo Okay
                            }
                            else{
                               exibirErro("Expressão"+ctx.getChild(2).getText()+" associada a "+identificador+" não é do tipo Inteiro", ctx);
                            }       
                        }
                        else{
                             exibirErro(identificador+" não corresponde a uma Variável do Tipo Inteiro", ctx);
                        }
                    }
                    else{
                        exibirErro(identificador+" não corresponde a uma variável", ctx);
                    }
                }
            }
            else{
                exibirErro(identificador+" não corresponde a uma variável", ctx);
            }
            
        }
        */
    }
	
    @Override public void exitIncremento(gramaticaParser.IncrementoContext ctx) {
    }
   
    @Override
    public void exitChamadaFunc(gramaticaParser.ChamadaFuncContext ctx) {
    }

   
    @Override
    public void enterListaArgumentosFunc(gramaticaParser.ListaArgumentosFuncContext ctx) {
    }

   
    @Override
    public void exitListaArgumentosFunc(gramaticaParser.ListaArgumentosFuncContext ctx) {
    }

   
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

   
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

  
    @Override
    public void visitTerminal(TerminalNode node) {
    }

    
    @Override
    public void visitErrorNode(ErrorNode node) {
    }    
    
    //Analisa as expressões e retorna o tipo delas
    public int obterTipoEquality(gramaticaParser.EqualityContext ctx){
        
        int tipo = 0;
        
        if(ctx.getChildCount() == 1){
            //Deriva em Rel
            return this.obterTipoRel((gramaticaParser.RelContext)ctx.getChild(0));
        }
        else{
            //Deriva em equality == rel | equality != rel
            int tipoEquality = this.obterTipoEquality((gramaticaParser.EqualityContext)ctx.getChild(0));
            int tipoRel = this.obterTipoRel((gramaticaParser.RelContext)ctx.getChild(2));
            
            if(tipoEquality == Inteiro && tipoRel == Inteiro){
                if(ctx.getChild(1).getText().equals("==")){
                    this.gc.genIgualdadeInt();
                }else{
                    this.gc.genDiferenteInt();
                }
                return Bool;
            }
            else if(tipoEquality == Float && tipoRel == Float){
                if(ctx.getChild(1).getText().equals("==")){
                    this.gc.genIgualdadeReal();
                }else{
                    this.gc.genDiferenteReal();
                }
                return Bool;
            }
            else if(tipoEquality == Inteiro && tipoRel == Float){
                this.gc.genInttoRealPrimeiroOperando("");
                if(ctx.getChild(1).getText().equals("==")){
                    this.gc.genIgualdadeReal();
                }else{
                    this.gc.genDiferenteReal();
                }
                return Bool;
            }
            else if(tipoEquality == Float && tipoRel == Inteiro){
                this.gc.genInttoReal();
                if(ctx.getChild(1).getText().equals("==")){
                    this.gc.genIgualdadeReal();
                }else{
                    this.gc.genDiferenteReal();
                }
                return Bool;
            }else if(tipoEquality == Bool && tipoRel == Bool){
                if(ctx.getChild(1).getText().equals("==")){
                    this.gc.genIgualdadeInt(); //ja que Bool eh mapeado para inteiros em baixo nivel.
                }else{
                    this.gc.genDiferenteInt(); 
                } 
                return Bool;
            }
            else{
                 exibirErro("Operador "+ctx.getChild(1).getText()+" aplicado a tipos incompatíveis", ctx);
            }
        }
        
        return tipo;
    }
    
    public int obterTipoRel(gramaticaParser.RelContext ctx){
        int tipo = 0;
        
        if(ctx.getChildCount() == 1){
            //Deriva em expr
            return this.obterTipoExpr((gramaticaParser.ExprContext)ctx.getChild(0));
        }
        else{
            //Deriva em expr < expr | expr <= expr | expr >= expr | expr > expr
            int tipoExpr1 = this.obterTipoExpr((gramaticaParser.ExprContext)ctx.getChild(0));
            int tipoExpr2 = this.obterTipoExpr((gramaticaParser.ExprContext)ctx.getChild(2));
            
            if(tipoExpr1 == Inteiro && tipoExpr2 == Inteiro){
                if(ctx.getChild(1).getText().equals(">")){
                    this.gc.genMaiorQueInt();
                }else if(ctx.getChild(1).getText().equals("<")){
                    this.gc.genMenorQueInt();
                }else if(ctx.getChild(1).getText().equals(">=")){
                    this.gc.genMaiorIgualQueInt();
                }else{ // <=
                    this.gc.genMenorIgualQueInt();
                }
                return Bool;
            }
            else if(tipoExpr1 == Float && tipoExpr2 == Float){
                if(ctx.getChild(1).getText().equals(">")){
                    this.gc.genMaiorQueReal();
                }else if(ctx.getChild(1).getText().equals("<")){
                    this.gc.genMenorQueReal();
                }else if(ctx.getChild(1).getText().equals(">=")){
                    this.gc.genMaiorIgualQueReal();
                }else{ // <=
                    this.gc.genMenorIgualQueReal();
                }
                return Bool;
            }
            else if(tipoExpr1 == Inteiro && tipoExpr2 == Float){
                this.gc.genInttoRealPrimeiroOperando("");
                if(ctx.getChild(1).getText().equals(">")){
                    this.gc.genMaiorQueReal();
                }else if(ctx.getChild(1).getText().equals("<")){
                    this.gc.genMenorQueReal();
                }else if(ctx.getChild(1).getText().equals(">=")){
                    this.gc.genMaiorIgualQueReal();
                }else{ // <=
                    this.gc.genMenorIgualQueReal();
                }
                return Bool;
            }
            else if(tipoExpr1 == Float && tipoExpr2 == Inteiro){
                this.gc.genInttoReal();
                if(ctx.getChild(1).getText().equals(">")){
                    this.gc.genMaiorQueReal();
                }else if(ctx.getChild(1).getText().equals("<")){
                    this.gc.genMenorQueReal();
                }else if(ctx.getChild(1).getText().equals(">=")){
                    this.gc.genMaiorIgualQueReal();
                }else{ // <=
                    this.gc.genMenorIgualQueReal();
                }
                return Bool;
            }
            else{
   
                exibirErro("Operador "+ctx.getChild(1).getText()+" aplicado a tipos incompatíveis", ctx);
            }
        }
        
        return tipo;
    }
    
    public int obterTipoExpr(gramaticaParser.ExprContext ctx){
        
        if(ctx.getChildCount() == 1){
            //Deriva em Term
            return this.obterTipoTerm((gramaticaParser.TermContext)ctx.getChild(0));
        }
        else{
            //Deriva em expr + term | expr - term
            
            int tipoExpr = this.obterTipoExpr((gramaticaParser.ExprContext)ctx.getChild(0));
            int tipoTerm = this.obterTipoTerm((gramaticaParser.TermContext)ctx.getChild(2));
            
            if(tipoExpr == Inteiro && tipoTerm == Inteiro){
                if(ctx.getChild(1).getText().equals("+")){
                    this.gc.genSomaInt();
                }else{
                    this.gc.genSubInt();
                }
                return Inteiro;
            }
            else if(tipoExpr == Float && tipoTerm == Float){
                if(ctx.getChild(1).getText().equals("+")){
                    this.gc.genSomaReal();
                }else{
                    this.gc.genSubReal();
                }
                return Float;
            }
            else if(tipoExpr == Inteiro && tipoTerm == Float){
                this.gc.genInttoRealPrimeiroOperando("");
                if(ctx.getChild(1).getText().equals("+")){
                    this.gc.genSomaReal();
                }else{
                    this.gc.genSubReal();
                }
                return Float;
            }
            else if(tipoExpr == Float && tipoTerm == Inteiro){
                this.gc.genInttoReal();
                if(ctx.getChild(1).getText().equals("+")){
                    this.gc.genSomaReal();
                }else{
                    this.gc.genSubReal();
                }
                return Float;
            }
            else{
                exibirErro("Operador "+ctx.getChild(1).getText()+" aplicado a tipos incompatíveis", ctx);
                return 0;
            }
        }
    }
    
    public int obterTipoTerm(gramaticaParser.TermContext ctx){
        
        if(ctx.getChildCount() == 1){
            //Deriva em Unary
            return this.obterTipoUnary((gramaticaParser.UnaryContext) ctx.getChild(0));
        }
        else{
            //Deriva em term * unary | term / unary
            
            int tipoTerm = this.obterTipoTerm((gramaticaParser.TermContext)ctx.getChild(0));
            int tipoUnary = this.obterTipoUnary((gramaticaParser.UnaryContext)ctx.getChild(2));
            
            //Analisa os tipos. 
            if(tipoTerm == Inteiro && tipoUnary == Inteiro){
                if(ctx.getChild(1).getText().equals("*")){
                    this.gc.genMultInteiro();
                }else if(ctx.getChild(1).getText().equals("/")){
                    this.gc.genDivInteiro();
                }
                return Inteiro;
            }
            else if(tipoTerm == Float && tipoUnary == Float){
                if(ctx.getChild(1).getText().equals("/")){
                    this.gc.genDivReal();
                }else if(ctx.getChild(1).getText().equals("*")){
                    this.gc.genMultReal();
                }
                return Float;
            }
            else if(tipoTerm == Inteiro && tipoUnary == Float){
                this.gc.genInttoRealPrimeiroOperando("");
                if(ctx.getChild(1).getText().equals("/")){
                    this.gc.genDivReal();
                }else if(ctx.getChild(1).getText().equals("*")){
                    this.gc.genMultReal();
                }
                return Float;
            }
            else if(tipoTerm == Float && tipoUnary == Inteiro){
                this.gc.genInttoReal();
                if(ctx.getChild(1).getText().equals("/")){
                    this.gc.genDivReal();
                }else if(ctx.getChild(1).getText().equals("*")){
                    this.gc.genMultReal();
                }
                return Float;
            }
            else{                
                exibirErro("Operador "+ctx.getChild(1).getText()+" aplicado a tipos incompatíveis", ctx);
                return 0;
            }
        }
    }
    
    public int obterTipoUnary(gramaticaParser.UnaryContext ctx){
        int tipo = 0;
        
        if(ctx.getChildCount() == 1){
            //Deriva em Factor
            return this.obterTipoFactor((gramaticaParser.FactorContext)ctx.getChild(0));
        }
        else{
            //Deriva em !unary | -unary | unary++ | unary--
            
            if(ctx.getChild(0).getText().equals("!")){
                //! só pode ser aplicado a tipo Bool
                
                int tipoFactor = this.obterTipoUnary((gramaticaParser.UnaryContext)ctx.getChild(1));
                
                if(tipoFactor == Bool){
                    this.gc.genNegacao();
                    return Bool;
                }
                else{
                    exibirErro("O operador ! foi aplicado a um tipo incompatível", ctx);
                }
            }
            else if(ctx.getChild(0).getText().equals("-")){
                //- só pode ser aplicado a Int ou Float
                
                int tipoFactor = this.obterTipoUnary((gramaticaParser.UnaryContext)ctx.getChild(1));
                
                switch(tipoFactor){
                    case Inteiro:
                        this.gc.genMinusInteiro();
                        return tipoFactor;
                    case Float:
                        this.gc.genMinusReal();
                        return tipoFactor;
                    default:
                        exibirErro("Operador - aplicado a um tipo incompatível", ctx);
                        return 0;
                }
            }
            else if(ctx.getChild(1).getText().equals("++")){
                //++ Só pode ser aplicado a Int ou Float
                
                int tipoFactor = this.obterTipoUnary((gramaticaParser.UnaryContext)ctx.getChild(0));
                
                switch(tipoFactor){
                    case Inteiro:
                        this.gc.genIncremento();
                        return tipoFactor;
                    case Float:
                        this.gc.genIncrementoFloat();
                        return tipoFactor;
                    default:
                        exibirErro("Operador ++ aplicado a um tipo incompatível", ctx);
                        return 0;
                }
                
            }
            else if(ctx.getChild(1).getText().equals("--")){
                //-- Só pode ser aplicado a Int ou Float
                
                int tipoFactor = this.obterTipoUnary((gramaticaParser.UnaryContext)ctx.getChild(0));
                
                switch(tipoFactor){
                    case Inteiro:
                        this.gc.genDecremento();
                        return tipoFactor;
                    case Float:
                        this.gc.genDecrementoFloat();
                        return tipoFactor;
                    default:
                        exibirErro("Operador -- aplicado a um tipo incompatível", ctx);
                        return 0;
                }
            }
            
        }
        
        return tipo;
    }
    
    public int obterTipoFactor(gramaticaParser.FactorContext ctx){
        int tipo = 0, end;
        
        //Factor derivando em ( bool )
        if(ctx.getChildCount() == 3){
            return obterTipoEquality((gramaticaParser.EqualityContext)ctx.getChild(1));
        }
        
        //Factor derivando em valor | ID | chamadaFunc
        
        //Verificar se é chamada de Função
        if(ctx.getChild(0) instanceof gramaticaParser.ChamadaFuncContext){
            String nomeFuncao = ((gramaticaParser.ChamadaFuncContext)ctx.getChild(0)).ID().getText();
            
            //Buscamos o tipo da Função na Tabela de Simbolos
            //Caso exista retornamos ele, caso contrário, retornamos 0
            if(this.tabelaDeSimbolos.ehFuncao(nomeFuncao)){
                this.genChamadaFunc((gramaticaParser.ChamadaFuncContext) ctx.getChild(0));
                tipo = this.tabelaDeSimbolos.obterFuncao(nomeFuncao).tipo;
                return tipo;
            }
            else{
                exibirErro(nomeFuncao+" não é uma função declarada", ctx);
                return 0;
            }
        }
        
        //Verificar se é um valor
        String possivelValor = ctx.getChild(0).getText();
        
        if(possivelValor.equals("true") || possivelValor.equals("false")){
            this.gc.loadLiteralBool(possivelValor);
            return Bool;
        }else if(possivelValor.startsWith("\"") && possivelValor.endsWith("\"")){
            this.gc.loadLiteralString(possivelValor);
            return String;
        }else if(possivelValor.contains(".")){
            this.gc.loadLiteralReal(possivelValor);
            return Float;
        }else if(this.ehInteiro(possivelValor)){
            this.gc.loadLiteralInterio(possivelValor);
            return Inteiro;
        }
        
        //Verificar se é um ID
        String possivelID = ctx.getChild(0).getText();
        
        if(!this.estaNoBloco){
            //Significa que está dentro de uma função
            
            //Começamos buscando nos parâmetros
            if(this.tabelaDeSimbolos.obterFuncao(this.funcaoAtual).identificadorExistente(possivelID)){
                
                Variavel v = this.tabelaDeSimbolos.obterFuncao(this.funcaoAtual).obterArgumento(possivelID);
                carregarVariavel(v.tipo, v.endereco);
                return this.tabelaDeSimbolos.obterFuncao(this.funcaoAtual).obterArgumento(possivelID).tipo;
            }
            
        }
        
        //Caso não esteja em um Função (estaNoBloco ==  True ) ou não tenha sido encontrado um parâmetro com aquele ID
        //então buscamos nas constante e variáveis
        
        if(this.tabelaDeSimbolos.ehVariavel(possivelID)){
            Variavel v = this.tabelaDeSimbolos.obterVariavel(possivelID);
            carregarVariavel(v.tipo, v.endereco);
            return this.tabelaDeSimbolos.obterVariavel(possivelID).tipo;
        }
        else{
                    
            //Caso não seja uma variável, buscamos nas Constantes
            if(this.tabelaDeSimbolos.ehConstante(possivelID)){
                Constante c = this.tabelaDeSimbolos.obterConstante(possivelID);
                carregarVariavel(c.tipo, c.endereco);
                //return tipo;
                return this.tabelaDeSimbolos.obterConstante(possivelID).tipo;
            }
            else{
                        
                //Caso tenha falhado em todos os testes, então possivelID não foi declarado
                exibirErro(possivelID+ " não declarado", ctx);
                        
            }
        }
        
        /*
        //Verificar se é uma Constante
        if(this.tabelaDeSimbolos.ehConstante(possivelID)){
            Constante c = this.tabelaDeSimbolos.obterConstante(possivelID);
            carregarVariavel(c.tipo, c.endereco);
            return tipo;
        }
        //Caso contrário, verificar se é uma variável
        else if(this.tabelaDeSimbolos.ehVariavel(possivelID)){
            Variavel v = this.tabelaDeSimbolos.obterVariavel(possivelID);
            carregarVariavel(v.tipo, v.endereco);
            return tipo;
        }
        //Caso contrário, não declarada. Emitir erro.
        else{
            exibirErro("Constante ou Variável "+possivelID+ " não declarada", ctx);
        }
        
        //Caso estejamos fora do Block, ou seja, dentro de uma função
        if(!this.estaNoBloco){
            //Verifica se é Argumento da Função Atual
            if(this.tabelaDeSimbolos.obterFuncao(this.funcaoAtual).identificadorExistente(possivelID)){
                Variavel v = this.tabelaDeSimbolos.obterFuncao(this.funcaoAtual).obterArgumento(possivelID);
                carregarVariavel(v.tipo, v.endereco);
                return tipo;
            }
            else{
                exibirErro("Parâmetro "+possivelID+" não declarado na função "+this.funcaoAtual, ctx);
            }
        }
        */
        
        return 0;
    }
    
    public void genChamadaFunc(gramaticaParser.ChamadaFuncContext ctx) {
        
        if(this.tabelaDeSimbolos.ehFuncao(ctx.ID().getText())){ //verifica se a funçao existe
        
            if(!ctx.listaArgumentosFunc().equality(0).getText().equals("")){
                
                if(ctx.listaArgumentosFunc().equality().size() != this.tabelaDeSimbolos.obterFuncao(ctx.ID().getText()).argumentos.size()){ //verifica quantidade de argumentos
                    exibirErro("Quantidade de argumentos incompativel na funcao \'"+ctx.ID().getText()+"\'.", ctx);
                    return;
                }
                
                for(int i = 0; i < ctx.listaArgumentosFunc().equality().size(); i++){
                    gramaticaParser.EqualityContext ec = ctx.listaArgumentosFunc().equality(i);
                    int tipoExp = this.obterTipoEquality(ec);
                    int tipoArg = this.tabelaDeSimbolos.obterFuncao(ctx.ID().getText()).argumentos.get(i).tipo;

                    if(tipoArg == Inteiro && tipoExp == Float){ // coerçao
                        this.gc.genRealtoInt();
                    }else if(tipoArg == Float && tipoExp == Inteiro){ //ceerçao
                        this.gc.genInttoReal();
                    }else if(tipoArg == tipoExp){ //tipos iguais
                        //gerar codigo sem coerçao
                    }else{ //tipos diferentes sem coerçao possivel
                        exibirErro("Tipo incompativel com o argumento '"+this.tabelaDeSimbolos.obterFuncao(ctx.ID().getText()).argumentos.get(i).identificador+"' da funcao '"+ctx.ID().getText()+"'.", ctx);
                    }
                }
            }
            this.gc.genChamadaFunc(ctx.ID().getText());
        }else{
            exibirErro("Funcao \'"+ctx.ID().getText()+"\' inexistente.", ctx);
        }  
    }
    
    public void carregarConstantes(){
        for(Constante c : this.tabelaDeSimbolos.constantes){
            if(c.tipo == Bool){
                this.gc.loadLiteralBool(c.valor); //apenas carrega na pilha
            }else{
                this.gc.decConstanteIntRealString(c.valor); //apenas carrega na pilha
            }
            this.salvarVariavel(c.tipo, c.endereco); //salva nas variaveis locais do main
        }
    }
    
    public void carregarVariavel(int tipo, int end){
        switch (tipo) {
            case Inteiro:
                this.gc.loadInteiro(end);
                break;
            case Float:
                this.gc.loadReal(end);
                break;
            case String:
                this.gc.loadString(end);
                break;
            case Bool:
                this.gc.loadBool(end);
                break;
            default:
                break;
        }
    }
    
    public void salvarVariavel(int tipo, int end){
        switch (tipo) {
            case Inteiro:
                this.gc.genStoreInteiro(end);
                break;
            case Float:
                this.gc.genStoreReal(end);
                break;
            case String:
                this.gc.genStoreString(end);
                break;
            case Bool:
                this.gc.genStoreBool(end);
                break;
            default:
                break;
        }
    }
    
    public void salvarVariavelCoercao(int tipoVar, int end){
        if(tipoVar == Inteiro){ //coerçao para Int
            this.gc.genRealtoInt();
            this.gc.genStoreInteiro(end);
        }else{ //coerçao para Real
            this.gc.genInttoReal();
            this.gc.genStoreReal(end);
        }
    }
    
    public boolean ehInteiro(String valor){
        for(char c : valor.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    
    public int mapeiaTipoStringInt(String t){
        if(t.equals("int"))
            return Inteiro;
        if(t.equals("float"))
            return Float;
        if(t.equals("string"))
            return String;
        if(t.equals("boolean"))
            return Bool;
        return 0;
    }
    
    public String mapeiaTipoIntString(int t){
        switch (t) {
            case Inteiro:
                return "int";
            case Float:
                return "float";
            case String:
                return "string";
            case Bool:
                return "boolean";
            default:
                return "Erro";
        }
    }
    
    public int obterTipo(String valor){
        
        if(valor.equals("TRUE") || valor.equals("FALSE")){
            return Bool; 
        }else if(valor.startsWith("\"") && valor.endsWith("\"")){
            return String;
        }else if(valor.contains(".")){
            return Float; 
        }
        return Inteiro;
    }
    
    public void exibirErro(String msg, ParserRuleContext prc){
        System.out.println("line "+prc.start.getLine()+":"+prc.start.getCharPositionInLine()+" "+msg);
    }
}