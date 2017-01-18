/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class SumaDirecta implements ModoSumar{
    protected DatoCompuesto este;
    SumaDirecta(DatoCompuesto este){
        this.este=este;
    }
    
    @Override
    public DatoCompuesto sumar(DatoCompuesto otro){
        return new Punto(este.valor1+otro.valor1,este.valor2+otro.valor2);
    }
    
    
    
}
