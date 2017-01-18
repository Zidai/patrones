/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class EscalarTiempo implements ModoEscalar{
    protected DatoCompuesto este;
    EscalarTiempo(DatoCompuesto in){
        this.este=in;
    }
    @Override
    public DatoCompuesto escalar(double in) {
        if(in>0){
            DatoCompuesto aux=new Tiempo(in,0);
            DatoCompuesto otro=this.este.modoSuma.sumar(aux);
            return new Tiempo(otro.valor1,this.este.valor2);
        }
        if(in<0){
            double horast=this.este.valor1+in;
            if(horast<0){
                double res=Math.abs(horast);
                horast=24-res;
            }
            return new Tiempo(horast,this.este.valor2);
        
        }
        return new Tiempo(this.este.valor1,this.este.valor2);
    }
    
}
