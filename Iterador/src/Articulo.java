/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class Articulo {
    private String nombre;
    private int cantidad;
    private int precio;
    
    Articulo(String n,int c,int p){
        nombre=n;
        cantidad=c;
        precio=p;
    
    }
    public String toString(){
          return "Nombre: "+nombre+",Cantidad: "+ cantidad+", Precio: "+precio;
    }
}
