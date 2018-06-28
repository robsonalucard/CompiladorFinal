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
public class Constante {
    
    public int tipo;
    public String identificador;
    public String valor;
    public int endereco;
    
    public Constante(int tipo, String identificador, String valor){
        
        this.tipo = tipo;
        this.identificador = identificador;
        
        //Diferente das Variáveis, as Constantes são declaradas com um valor inicial
        //Por isso seu construtor já recebe o valor
        
        this.valor = valor;
    }
    
}
