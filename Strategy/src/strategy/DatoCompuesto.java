/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author subzero
 */
public abstract class DatoCompuesto {
    private float valor1;
    private float valor2;
    private String nombre;
    
    public abstract String escribir();
    public abstract DatoCompuesto suma(DatoCompuesto seg);
 
    
    void setValor1(float in){
        valor1=in;
    }
    void setValor2(float in){
        valor2=in;
    }
    void setNombre(String str){
        nombre=str;
    }
     float getValor1(){
        return valor1;
    }
    float getValor2(){
        return valor2;
    }
    String getNombre(){
        return nombre;
    }
    
}
