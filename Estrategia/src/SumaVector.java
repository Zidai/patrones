/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class SumaVector implements ModoSumar{
protected DatoCompuesto este;
    SumaVector(DatoCompuesto este){
        this.este=este;
    }
    
    @Override
    public DatoCompuesto sumar(DatoCompuesto otro){
        if(este.valor2==otro.valor2){
            return new Vector(este.valor1+otro.valor1,este.valor2);
        }
        System.out.println("NaN");
        return null;
    }
    
}
