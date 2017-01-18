
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class IteraPares implements Iterator{
    ListaArticulo lista;
    int contador;
    
    IteraPares(ListaArticulo l){
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
        contador+=2;
        return s;
    }
    
}
