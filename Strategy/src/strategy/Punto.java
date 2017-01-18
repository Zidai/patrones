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
public class Punto extends DatoCompuesto{
    Punto(float x,float y){
        this.setValor1(x);
        this.setValor2(y);
    }
    Punto(float x,float y,String nombre){
        this.setValor1(x);
        this.setValor2(y);
        this.setNombre(nombre);
    }
    

    @Override
    public String escribir() {
        return "("+this.getValor1()+","+this.getValor2()+")";
    }

    @Override
    public DatoCompuesto suma(DatoCompuesto seg) {
        float xaux=this.getValor1()+seg.getValor1();
        float yaux=this.getValor2()+seg.getValor2();
        return new Punto(xaux,yaux);
    }
    
}
