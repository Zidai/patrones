/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class Articulo implements Componente{
    private int idProducto;
    private String descripcion;
    private int cantidad;
    private int precio;
    Articulo(int id,String desc,int can,int pre){
        idProducto=id;
        descripcion=desc;
        cantidad=can;
        precio=pre;
    }
    String getDescripcion(){
        return descripcion;
    }
    int getCantidad(){
        return cantidad;
    }
    int getPrecio(){
        return precio*cantidad;
    }
    int importe(){
        return cantidad*precio;
    }
    
   
    @Override
    public void remover(Componente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void acceder(Componente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregar(Componente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
