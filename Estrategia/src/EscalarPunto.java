/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class EscalarPunto implements ModoEscalar{
    protected DatoCompuesto este;
    EscalarPunto(DatoCompuesto in){
        this.este=in;
    }

    @Override
    public DatoCompuesto escalar(double in) {
        double aux1=0;
        double aux2=0;
        if(this.este.valor1<0){
            aux1=in*(-1);
        }
        else{aux1=in;}
        
        if(this.este.valor2<0){
            aux2=in*(-1);
        }
        else{aux2=in;}
        
        return new Punto(this.este.valor1+aux1,this.este.valor2+aux2);
    }
}
