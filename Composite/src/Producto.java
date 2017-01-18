
import java.util.ArrayList;
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
public class Producto implements Componente{
    private ArrayList<Componente> componentes;
    private int idProducto;
    private String descripcion;
    private int cantidad;
    
    Producto(int idP,String des,int cant){
        componentes=new ArrayList();
        idProducto=idP;
        descripcion=des;
        cantidad=cant;
    }
    
    int getPrecio(){
        int t=0;
        int i=0;
        Iterator it=componentes.iterator();
        while(it.hasNext()){
            Componente c=(Componente)it.next();
            t+=c instanceof Articulo?((Articulo) c).getPrecio():0;
        }
       
        return t;
       }
    
    void  listarComponentes(){
        int t=0;
        int i=0;
        System.out.println("lista de componentes de:"+idProducto+" precio:"+this.getPrecio());
        Iterator it=componentes.iterator();
        while(it.hasNext()){
            Componente c=(Componente)it.next();
            if(c instanceof Articulo){
                System.out.println(((Articulo) c).getDescripcion()+" $"+((Articulo) c).getPrecio());
            }

        }
       
       }
        
    
//mostrar: muestre todos los componente
    String getDescripcion(){
        return descripcion;
    }
  

    @Override
    public void remover(Componente c) {
        componentes.remove(c);
    }

    @Override
    public void acceder(Componente c) {
        //componentes.
    }

    @Override
    public void agregar(Componente c) {
        componentes.add(c);
    }
    
}
