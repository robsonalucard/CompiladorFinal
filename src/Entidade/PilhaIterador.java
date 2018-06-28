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
public class PilhaIterador {
    private ArrayList<Integer> pilha;
    private int topo;
    
    public PilhaIterador(){
        this.pilha = new ArrayList<Integer>() {};
        this.topo = -1;
    }
    
    public void pop(){
        this.pilha.remove(topo);
        this.topo--;
    }
    
    public void push(int i){
        this.pilha.add(i);
        this.topo++;
    }
    
    public int getTopo(){
        return this.pilha.get(topo);
    }
    
    public boolean isEmpty(){
        return this.pilha.isEmpty();
    }
}
