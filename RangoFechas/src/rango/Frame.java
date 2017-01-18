/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rango;

import javax.swing.JFrame;


/**
 *
 * @author subzero
 */
public class Frame extends JFrame{
    
    Frame(){
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(100, 100, 450, 300);
        
    }
    
    public static void main(String [] args){
        RangoFechas fechas;
         fechas=new RangoFechas();
        Frame f=new Frame();
        
        //System.out.println("Fechas:"+fechas.getFecha1().toString());
        f.add(fechas);
        f.setVisible(true);
        
        
        
    }
    
}
