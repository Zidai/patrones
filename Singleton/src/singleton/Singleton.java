/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JLabel;
/**
 *
 * @author subzero
 */
public class Singleton extends javax.swing.JFrame{
    private JLabel jLabel1;
    private int numIns=0;
    private static Singleton instancia;
    
    public static Singleton getInstancia(){
        if(instancia==null){
            System.out.println("\nPrimera Instancia");
            instancia=new Singleton();
        }
        System.out.println("\nSe creo una instancia");
        return instancia;
    
    }
    
    protected Singleton(){
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jLabel1 = new javax.swing.JLabel();
        this.setBackground(new java.awt.Color(59, 59, 229));
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                instancia=null;
                
        } 
        });
        this.add(jLabel1);
        this.setSize(200, 200);
        this.setLocation(500,100);
        jLabel1.setText(System.currentTimeMillis()+"");
        System.out.println(System.currentTimeMillis()+"");
        numIns++;
    }
    
    public int getNumIns(){
        return numIns;
    }

   
   
}
