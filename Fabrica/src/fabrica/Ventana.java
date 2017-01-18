/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import java.util.ArrayList;

/**
 *
 * @author subzero
 */
public abstract class Ventana {
    private String nombre;
    private int largo;
    private int ancho;
    private char borde;
    private char fondo;
    private ArrayList elementos;
    private ArrayList controles;
    
    abstract void definirla();
    abstract void mostrarla();
    
}
