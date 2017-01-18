/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class Tiempo extends DatoCompuesto{
    Tiempo(double x,double y){
        super(x,y);
        this.fijarSuma();
        this.fijarSimetria();
        this.fijarEscalar();
    }

    @Override
    String escribir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void fijarSuma() {
        this.modoSuma=new SumaTiempo(this);
    }

    @Override
    void fijarSimetria() {
        this.modoSimetrico=new SimetriaTiempo(this);
    }

    @Override
    void fijarEscalar() {
        this.modoEscala=new EscalarTiempo(this);
    }
}
