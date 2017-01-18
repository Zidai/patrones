/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class Prueba {
    public static void main(String [] args){
        Articulo llantas=new Articulo(123,"4 llantas",4,1350);
        Articulo motor=new Articulo(124,"1 motor",1,50000);
        Producto coche=new Producto(125,"1 coche",1);
        coche.agregar(llantas);
        coche.agregar(motor);
        coche.listarComponentes();
    }
    
}
