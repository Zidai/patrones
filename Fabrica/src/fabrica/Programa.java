/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

/**
 *
 * @author subzero
 */
public abstract class Programa {
    protected abstract Ventana crearVentana(String t);
    public abstract Ventana iniciar(Ventana v);
}
