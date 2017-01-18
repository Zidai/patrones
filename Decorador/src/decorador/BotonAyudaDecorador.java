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
public class BotonAyudaDecorador extends VentanaDecorador{

    public BotonAyudaDecorador(Ventana decVentana) {
        super(decVentana);
    }

    @Override
    public void dibujar() {
        dibujarBotonAyuda();
        decoradorVentana.dibujar();
    }
    void dibujarBotonAyuda(){}

    @Override
    public String getDesciption() {
        return decoradorVentana.getDesciption()+", con boton de ayuda";
    }
    
}
