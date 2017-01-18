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
public class Escalar extends Decorador{
    int esc;
    Escalar(Panel r,int escalar){
        super(r);
        esc=escalar;
    }
    @Override
    public void pintar(int x,int y,int ancho,int alto){
            System.out.println("Pintar Escalar");
            super.pintar(x, y, ancho*esc, alto*esc);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
    }

    

  
}
