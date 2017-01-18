/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class ProductoVectorial implements ModoProducto{
    DatoCompuesto este;
    ProductoVectorial(DatoCompuesto in){
        this.este=in;
    }

    @Override
    public DatoCompuesto producto(DatoCompuesto otro) {
        double tetha=Math.cos(Math.abs(this.este.valor2-otro.valor2));
        double mag=this.este.valor1*otro.valor1*tetha;
        return new Vector(mag,90); 
    }
    
    
    
}
