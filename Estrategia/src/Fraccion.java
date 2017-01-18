/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class Fraccion extends DatoCompuesto{

  Fraccion(double x,double y){
        super(x,y);
        this.fijarSuma();
        this.fijarSimetria();
        this.fijarEscalar();
    }
    
   
    
    @Override
    String escribir(){
        return +valor1+"/"+valor2;
    }

    @Override
    void fijarSuma() {
        this.modoSuma=new SumaFraccion(this);
    }

    @Override
    void fijarSimetria() {
        this.modoSimetrico=new Simplificar(this);
    }

    @Override
    void fijarEscalar() {
        this.modoEscala=new EscalarFraccion(this);
    }
}
