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
public class Funcao {
    
    public int tipo;
    public String identificador;
    public ArrayList<Variavel> argumentos;
    public int countArgs;
    
    public Funcao(int tipo, String identificador){
        this.tipo = tipo;
        this.identificador = identificador;
        this.argumentos = new ArrayList<Variavel>();
        this.countArgs = 0;
    }
    
    public void adicionarArgumento(int tipo, String identificador){
        Variavel v = new Variavel(tipo, identificador);
        v.endereco = this.countArgs;
        this.argumentos.add(v);
        this.countArgs++;
    }
    
    public boolean identificadorExistente(String id){
        boolean existe = false;
        
        for(int i = 0; i < this.argumentos.size(); i++){
            if(this.argumentos.get(i).identificador.equals(id)){
                existe = true;
            }
        }
        
        return existe;
    }
    
    public Variavel obterArgumento(String id){
        
        Variavel argumento = null;
        
        for(int i = 0; i < this.argumentos.size(); i++){
            if(id.equals(this.argumentos.get(i).identificador)){
                argumento = this.argumentos.get(i);
            }
        }
        
        return argumento;
    }
}