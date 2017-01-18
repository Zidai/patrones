
import java.util.Iterator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class IteraLista implements Iterator{
    ListaArticulo lista;
    int contador;
    
    IteraLista(ListaArticulo l){
        lista=l;
        contador=0;
    }
    @Override
    public boolean hasNext() {
        
        return contador <lista.getLista().size();
    }

    @Override
    public Object next() {
        Object s=lista.getLista().get(contador);
        contador++;
        return s;
    }
    
    
}
