
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
public class Main {
    public static void main(String []a){
        ListaArticulo lista=new ListaArticulo();
        Articulo a1=new Articulo("Suavizante",2,56);
        Articulo a2=new Articulo("Zapatos",2,56);
        Articulo a3=new Articulo("cloro",1,60);
        Articulo a4=new Articulo("pan",2,20);
        Articulo a5=new Articulo("zanahorias",1,60);
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        lista.add(a5);
        Iterator it=new IteraLista(lista);
        Iterator it2=new IteraPares(lista);
        lista.mostrar(it2);  
        
    }
    
}
