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
public class Vector extends DatoCompuesto{
    
    
     Vector(float x1,float y1){
        this.setValor1(x1);
        this.setValor2(y1);
        
    }
    
    Vector(float x1,float y1,float x2,float y2,String nombre){
        this.setValor1(x1);
        this.setValor2(y1);
        this.setNombre(nombre);
    }

    @Override
    public String escribir() {
        return ""+this.getValor1()+"@"+this.getValor2();
    }

    @Override
    public DatoCompuesto suma(DatoCompuesto vec) {
        Vector aux=(Vector)vec;
        float valoraux=(float)0.0;
        if(aux.getValor2()==this.getValor2()){
            valoraux=this.getValor1()+aux.getValor1();
            return new Vector(valoraux,this.getValor2());
        }
        
        return new Vector((float)0.0,(float)0.0);
        //return new Vector(xaux,yaux);
    }
}
