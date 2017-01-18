/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class ProductoFraccion implements ModoProducto{
     DatoCompuesto este;
     
    ProductoFraccion(DatoCompuesto in){
        this.este=in;
    }
    @Override
    public DatoCompuesto producto(DatoCompuesto otro) {
        return new Punto(this.este.valor1*otro.valor1,this.este.valor2*otro.valor2);
    }


}
