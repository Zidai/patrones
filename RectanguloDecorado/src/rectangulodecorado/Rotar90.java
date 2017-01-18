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
public class Rotar90 extends Decorador{
    
    public Rotar90(Panel o) {
        super(o);
    }
    @Override
    public void pintar(int x,int y,int ancho,int alto){
            System.out.println("Pintar Escalar");
            super.pintar(x, y,alto,ancho);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
    }
    
}
