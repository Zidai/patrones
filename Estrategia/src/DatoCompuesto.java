/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public abstract class DatoCompuesto {
    protected double valor1;
    protected double valor2;
    protected ModoSumar modoSuma;
    protected ModoSimetria modoSimetrico;
    protected ModoEscalar modoEscala;
 
    DatoCompuesto(){}
    DatoCompuesto(double x,double y){
        this.valor1=x;
        this.valor2=y;
         
    }        
     abstract String escribir();
    
    abstract void fijarSuma();
    abstract void fijarSimetria();
    abstract void fijarEscalar();
    
    
}
