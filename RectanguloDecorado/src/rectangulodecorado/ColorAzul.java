/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulodecorado;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author subzero
 */
public class ColorAzul extends Decorador{
    
    public ColorAzul(Panel o) {
        super(o);
    }
    @Override
    public void pintar(int x,int y, int ancho,int alto){
        System.out.println("Pintar Color");
        super.pintar(x, y, ancho, alto);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.blue);
        super.paint(g);
    }
}
