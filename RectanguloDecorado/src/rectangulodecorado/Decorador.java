/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulodecorado;

import java.awt.Graphics;

/**
 *
 * @author subzero
 */
public abstract class Decorador extends Panel{
    Panel otro;
    Decorador(Panel o){
     otro=o;
    }
    public void pintar(int x,int y,int ancho,int alto){
        System.out.println("Pintar decorador padre");
        otro.pintar(x,y,ancho,alto);
    }
    public void paint(Graphics g){
        otro.paint(g);
    }
}
