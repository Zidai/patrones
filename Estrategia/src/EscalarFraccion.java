/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class EscalarFraccion implements ModoEscalar{
     protected  DatoCompuesto este;
    EscalarFraccion(DatoCompuesto in){
        this.este=in;
    }

    @Override
    public DatoCompuesto escalar(double in) {
        double aux=0;
        if(este.valor1<0){
            aux=in*(-1);
        }
        else{aux=in;}
        return new Fraccion(this.este.valor1+aux,this.este.valor2);
    }
    
}
