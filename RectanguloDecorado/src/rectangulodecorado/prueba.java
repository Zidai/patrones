/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulodecorado;

import javax.swing.JFrame;

/**
 *
 * @author subzero
 */
public class prueba {
    public static void main(String []p){
        JFrame frame=new JFrame("NAda");
        Panel pa=new Rotar90(new Traslate(new ColorAzul(new Escalar(new Rectangulo(),3)),100,100));
        frame.add(pa);
        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pa.pintar(0, 0,200,100);
    }

    
}
