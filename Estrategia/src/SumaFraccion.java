/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class SumaFraccion implements ModoSumar{
        protected DatoCompuesto este;
    SumaFraccion(DatoCompuesto este){
        this.este=este;
    }    
    
    @Override
    public DatoCompuesto sumar(DatoCompuesto in) {
        double denominador=este.valor2*in.valor2;
        double numerador=(este.valor1*in.valor2)+(este.valor2*in.valor1);
        return new Fraccion(numerador,denominador);
    }
    
}
