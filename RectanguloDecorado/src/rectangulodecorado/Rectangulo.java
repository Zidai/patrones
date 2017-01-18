/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulodecorado;

import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author subzero
 */
public class Rectangulo extends Panel{
    protected int x;
    protected int y;
    protected int alto;
    protected int ancho;
    
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(x,y,ancho,alto);
    }

    @Override
    public void pintar(int x, int y, int ancho, int alto) {
        System.out.println("Pintar Rec");
        this.x=x;
        this.y=y;
        this.ancho=ancho;
        this.alto=alto;
        this.repaint();
    }
    
   
    
}
