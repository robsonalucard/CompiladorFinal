/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author pedro
 */
public class Variavel {
    public int tipo;
    public String identificador;
    public String valor;
    public int endereco;
    
    public Variavel(int tipo, String identificador){
        
        //Construtor chamado quando a variável é declarada, por isso atribuimos
        //um valor inicial. Que pode ser atualizado durante a execução do programa
        
        this.tipo = tipo;
        this.identificador = identificador;
        
        if(tipo == 1){
            //Tipo Int
            this.valor = "0";
        }
        if(tipo == 2){
            //Tipo Float
            this.valor = "0";
        }
        if(tipo == 3){
            //Tipo String
            this.valor = "";
        }
        if(tipo == 4){
            //Tipo Boolean
            this.valor = "FALSE";
        }
        
    }
}
