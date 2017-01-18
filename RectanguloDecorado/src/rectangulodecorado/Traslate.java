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
public class Traslate extends Decorador{
   
    protected int x;
    protected int y;
    Traslate(Panel r,int x,int y){
        super(r);
        this.x=x;
        this.y=y;
    }
    @Override
    public void pintar(int x,int y,int ancho,int alto){
            System.out.println("Pintar traslate");
            super.pintar(x+this.x,y+this.y, ancho, alto);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
    }
}
