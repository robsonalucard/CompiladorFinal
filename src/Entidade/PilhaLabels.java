
package Entidade;

import java.util.ArrayList;


public class PilhaLabels {
    
    private ArrayList<Integer> pilha;
    public int topo;
    public int valor;
    
    public PilhaLabels(){
        this.pilha = new ArrayList<Integer>() {};
        this.topo = -1;
        this.valor = 0;
    }
    
    public int pop(){
        Integer i = getTopo();
        this.pilha.remove(topo);
        this.topo--;
        return i;
    }
    
    public int push(){
        this.pilha.add(valor);
        this.valor++;
        this.topo++;
        return getTopo();
    }
    
    public int getTopo(){
        return this.pilha.get(topo);
    }
    
    public boolean isEmpty(){
        return this.pilha.isEmpty();
    }
    
}
