
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
public class ListaArticulo {
    private LinkedList<Articulo> articulos;
    
    ListaArticulo(){
        articulos=new LinkedList();
    }
    public void add(Articulo a){
        articulos.add(a);
    }
    
    void mostrar(Iterator it){
        while(it.hasNext()){
            System.out.println(((Articulo)it.next()).toString());
        }
    
    }
    LinkedList getLista(){
        return articulos;
    }
    
}
