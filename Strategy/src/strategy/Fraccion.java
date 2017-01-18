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
public class Fraccion extends DatoCompuesto{
    Fraccion(float num,float den){
        this.setValor1(num);
        this.setValor2(den);
    }
    

    @Override
    public String escribir() {
        return this.getValor1()+"/"+this.getValor2();
    }

    @Override
    public DatoCompuesto suma(DatoCompuesto seg) {
        Fraccion aux=(Fraccion)seg;
        float auxden=this.getValor2()*aux.getValor2();
        float auxnum=(this.getValor1()*aux.getValor2())+(this.getValor2()*aux.getValor1());
        
        return new Fraccion(auxden,auxnum);
        
    }
    
}
