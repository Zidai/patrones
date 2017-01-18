/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

/**
 *
 * @author subzero
 */
public class BordeDecorador extends VentanaDecorador{

    public BordeDecorador(Ventana decVentana) {
        super(decVentana);
    }

    @Override
    public void dibujar() {
        dibujarBorde();
        decoradorVentana.dibujar();
    }
    void dibujarBorde(){}

    @Override
    public String getDesciption() {
        return decoradorVentana.getDesciption()+", con borde";
    }
    
}
