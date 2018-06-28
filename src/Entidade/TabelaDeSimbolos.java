/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class TabelaDeSimbolos {
    
    public String identificadorPrograma; //Corresponde ao nome que damos ao Programa
    public ArrayList<Variavel> variaveis;
    public ArrayList<Constante> constantes;
    public ArrayList<Funcao> funcoes;
    public int numeroGlobais;
    
    public TabelaDeSimbolos(){      
        this.variaveis = new ArrayList<Variavel>();
        this.constantes = new ArrayList<Constante>();
        this.funcoes = new ArrayList<Funcao>();
        this.numeroGlobais = 1;
    }
    
    
    //Métodos de Adicionar elementos à Tabela de Símbolos
    public void adicionarVariavel(Variavel v){
        v.endereco = this.numeroGlobais;
        this.variaveis.add(v);
        this.numeroGlobais++;
    }
    public void adicionarConstante(Constante c){
        c.endereco = this.numeroGlobais;
        this.constantes.add(c);
        this.numeroGlobais++;
    }
    public void adicionarFuncao(Funcao f){
        this.funcoes.add(f);
    }
       
    public boolean identificadorExistente(String identificador){
        
        for(int i = 0; i < this.variaveis.size(); i++){
            if(this.variaveis.get(i).identificador.equals(identificador)){
                return true;
            }
        }
        for(int i = 0; i < this.constantes.size(); i++){
            if(this.constantes.get(i).identificador.equals(identificador)){
                return true;
            }
        }
        for(int i = 0; i < this.funcoes.size(); i++){
            if(this.funcoes.get(i).identificador.equals(identificador)){
                return true;
            }
        }
        
        return false;
    }
    public boolean ehPalavraReservada(String id){
        
        String palavrasReservadas[] = {"int", 
                                       "float", 
                                       "string",
                                       "boolean",
                                       "const",
                                       "func",
                                       "return",
                                       "print",
                                       "read",
                                       "if",
                                       "else",
                                       "for",
                                       "break",
                                       "program",
                                       "true",
                                       "false"};
        
        for (String palavraReservada : palavrasReservadas) {
            
            if ((id).equals(palavraReservada)) {
                return true;
            }
        }
   
        return false;
    }
    public boolean ehVariavel(String identificador){
        boolean ehVariavel = false;
        
        for(int i = 0; i < this.variaveis.size(); i++){
            if(this.variaveis.get(i).identificador.equals(identificador)){
                ehVariavel = true;
            }
        }
        
        return ehVariavel;
    }
    public boolean ehConstante(String identificador){
        boolean ehConstante = false;
        
        for(int i = 0; i < this.constantes.size(); i++){
            if(this.constantes.get(i).identificador.equals(identificador)){
                ehConstante = true;
            }
        }
        
        return ehConstante;
        
    }
    public boolean ehFuncao(String identificador){
        boolean ehFuncao = false;
        
        for(int i = 0; i < this.funcoes.size(); i++){
            if(this.funcoes.get(i).identificador.equals(identificador)){
                ehFuncao = true;
            }
        }
        
        return ehFuncao;
    }
    
    
    //Métodos para Obter elementos da Tabela de Símbolos
    public Variavel obterVariavel(String identificador){
        Variavel v = null;
        
        for(int i = 0; i < this.variaveis.size(); i++){
            if(this.variaveis.get(i).identificador.equals(identificador)){
                v = this.variaveis.get(i);
            }
        }
        
        return v;
    }
    public Constante obterConstante(String identificador){
        Constante c = null;
        
        for(int i = 0; i < this.constantes.size(); i++){
            if(this.constantes.get(i).identificador.equals(identificador)){
                c = this.constantes.get(i);
            }
        }
        
        return c;
    }
    public Funcao obterFuncao(String identificador){
        Funcao f = null;
        
        for(int i = 0; i < this.funcoes.size(); i++){
            if(this.funcoes.get(i).identificador.equals(identificador)){
                f = this.funcoes.get(i);
            }
        }
        
        return f;
    }
    
    public void imprimirTabela(){
        
        System.out.println("Imprimindo Tabela ... \n\n");
        
        if(this.variaveis.size() > 0){
            System.out.println("VARIÁVEIS");
            for(int i = 0; i < this.variaveis.size(); i++){
                System.out.println(this.variaveis.get(i).identificador+"-"+this.variaveis.get(i).tipo);
            }
        }
        
        
        System.out.println();
        
        if(this.constantes.size() > 0){
            System.out.println("CONSTANTES");
            for(int i = 0; i < this.constantes.size(); i++){
                System.out.println(this.constantes.get(i).identificador+"-"+this.constantes.get(i).tipo);
            }
        }
        
        if(this.funcoes.size() > 0){
            System.out.println("FUNÇÕES");
            for(int i = 0; i < this.funcoes.size(); i++){
                System.out.println("Função "+(i+1)+"-"+this.funcoes.get(i).identificador);
                System.out.println("Tipo :"+this.funcoes.get(i).tipo);
                System.out.println("\nArgumentos:");
            
                for(int j = 0; j < this.funcoes.get(i).argumentos.size(); j++){
                    System.out.println(this.funcoes.get(i).argumentos.get(j).identificador+"-"+this.funcoes.get(i).argumentos.get(j).tipo);
                }
                
                System.out.println();
            }
        }
        System.out.println();
        
        /*for(){
            
        }*/
    }
}
