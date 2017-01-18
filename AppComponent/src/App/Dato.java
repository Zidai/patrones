package App;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serializable;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.beans.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class Dato extends JPanel implements KeyListener,Serializable{
    private JLabel etiqueta;
    private JTextField campo;
    private boolean caracteres;
    private boolean letras;
    private boolean numeros;
    Dato(){
        campo=new JTextField(20);
        etiqueta=new JLabel("");
        add(etiqueta);
        add(campo);
        campo.addKeyListener(this);
    }
    
    public void setCaracteres(){
        caracteres=true;
        letras=false;
        numeros=false;
    }
    public void setLetras(){
        caracteres=false;
        letras=true;
        numeros=false;
    }
    public void setNumeros(){
        caracteres=false;
        letras=false;
        numeros=true;
    }
    
    public void setEtiqueta(String n){
        etiqueta.setText(n);
    }
    public String getEtiqueta(){
        return etiqueta.getText();
    }
    public String getValorTexto(){
        return campo.getText();
    }
    public int getValorNumerico(){
        int n=0;
        
        return n;
    }
    

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode()==KeyEvent.VK_DOLLAR){
            System.out.println("dolar");
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }
    
}
