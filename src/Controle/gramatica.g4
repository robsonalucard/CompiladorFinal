/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar gramatica;

@header{
    package Controle;
}

prog: TK_program ID '{' decVars* decConst* decFuncs* bloco '}'
    ;

decVars: tipo ':' listaId ';'
       ;

listaId: ID (',' ID)*
       ;

decConst: TK_const tipo ID '=' valor ';'
        ;

valor: NUM
     | STRING
     | BOOLEAN
     ;

tipo: TK_int   
    | TK_string 
    | TK_boolean
    | TK_float
    ;

decFuncs: TK_func tipo ID '(' listaParametros ')' '{' comando* '}'
        ;

listaParametros: tipo ':' listaId (';' tipo ':' listaId)*
               ;

bloco: TK_block '{' comando* '}'
     ;

comando: comandoRead
        | comandoPrint
        | comandoIf
        | comandoIfElse
        | comandoFor
        | comandoBreak
        | comandoReturn
        | comandoAtribuicao ';'
        ;

comandoRead: TK_read '(' listaId ')' ';'
           ;

comandoBreak: Tk_break ';'
            ;

comandoPrint: TK_print '(' listaPrint ')' ';'
            ;

listaPrint: equality (',' equality)*
       ;

comandoAtribuicao: ID '=' equality
                 ;

comandoIf: TK_if '(' equality ')' '{' comando* '}'
         ;

comandoElse: TK_else '{' comando* '}'
           ;

comandoIfElse: TK_if '(' equality ')' '{' comando* '}' comandoElse
             ;

comandoFor: TK_for '(' atribuicaoFor testeFor listaIncrementos ')' '{' comando* '}'
          ;

atribuicaoFor: ID '=' equality (',' ID '=' equality)* ';'
             ;

testeFor: equality ';'
        ;

comandoReturn: TK_return equality ';'
             ;

listaIncrementos: incremento (',' incremento)*
                ;

incremento: unary
          | ID '=' equality
          ;

equality: equality '==' rel
        | equality '!=' rel
        | rel
        ;

rel: expr '<' expr
   | expr '<=' expr
   | expr '>=' expr
   | expr '>' expr
   | expr
   ;

expr: expr '+' term 
      | expr '-' term 
      | term
      ;

term: term '*' unary
    | term '/' unary
    | unary
    ;

unary: '!'unary
     | '-'unary
     | unary'++'
     | unary'--'
     | factor
     ;

factor: '(' equality ')'
      | valor
      | ID
      | chamadaFunc
      ;

chamadaFunc: ID '(' listaArgumentosFunc? ')'
           ;

listaArgumentosFunc: equality (',' equality)*
                   ;

TK_program: 'program';
TK_const: 'const';
TK_block: 'block';
TK_read: 'read';
TK_print: 'print';
TK_if: 'if';
TK_else: 'else';
TK_for: 'for';
TK_return: 'return';
TK_int: 'int';
TK_string: 'string';
TK_boolean: 'boolean';
TK_float: 'float';
TK_func: 'func';
Tk_break: 'break';

/*TK_AbreParenteses: '(';
TK_FechaParenteses: ')';
TK_Virgula: ',';
TK_PontoVirgula: ';';
TK_Ou: '||';
TK_E: '&&';
TK_Maior: '>';
TK_Menor: '<';
TK_MaiorIgual: '>=';
TK_MenorIgual: '<=';
TK_Mais: '+';
TK_Menos: '-';
TK_Multiplicacao: '*';
TK_Divisao: '/';
TK_Negacao: '!';
TK_Inversao: '-';
TK_Incremento: '++';
TK_Decremento: '--';
TK_Igualdade: '==';
TK_Desigualdade: '!=';
TK_Igual: '=';
TK_AbreChaves: '{';
TK_FechaChaves: '}';
TK_DoisPontos: ':';*/


BOOLEAN: TK_true
       | TK_false
       ;

TK_true: 'true'
       ;

TK_false: 'false'
        ;

ID: [A-Za-z][A-Za-z0-9]*
  ;

NUM:[0-9]+('.'[0-9]+)?
   ;

STRING: '"' .*? '"'
      ;
        
WS: ([ \t\r\n] | '//' .*? '\n' | '/*' .*? '*/')+ -> skip;

