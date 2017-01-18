
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class Dato extends JPanel implements KeyListener,FocusListener{
    private JLabel etiqueta;
    private JTextField campo;
    private boolean caracteres;
    private boolean letras;
    private boolean numeros;
    private boolean decimales;
    private double maxdecimal;
    private double mindecimal;
    private int ndecimales;
    private boolean point;
    private int maximo;
    private int minimo;
    public Dato(){
        point =false;
        campo=new JTextField(20);
        etiqueta=new JLabel("");
        add(etiqueta);
        add(campo);
        campo.addKeyListener(this);
        campo.addFocusListener(this);
        campo.setInputVerifier(new Verificador(this));
    }
    public void setNdecimales(int n){
        ndecimales=n;
    }
    public int getNdecimales(){
        return ndecimales;
    }
    public void setMaximoDec(double n){
        maxdecimal=n;
    }
    public double getMaximoDec(){
        return maxdecimal;
    }
    public void setMinimoDec(double n){
        mindecimal=n;
    }
    public double getMinimoDec(){
        return mindecimal;
    }
    
    public void setMaximo(int n){
        maximo=n;
    }
    public int getMaximo(){
        return maximo;
    }
    public void setMinimo(int n){
        minimo=n;
    }
    public int getMinimo(){
        return minimo;
    }
    public JTextField getCampo(){
        return campo;
    }
    
    public void setCaracteres(boolean n){
        caracteres=n;
        letras=false;
        numeros=false;
        decimales=false;
    }
    public void setLetras(boolean n){
        caracteres=false;
        letras=n;
        numeros=false;
        decimales=false;
    }
    public void setNumeros(boolean n){
        caracteres=false;
        letras=false;
        numeros=n;
        decimales=false;
    }
    public void setDecimal(boolean n){
        decimales=n;
        caracteres=false;
        letras=false;
        numeros=false;
    }
    public boolean getCaracteres(){
        return caracteres;
    }
    public boolean getLetras(){
        return letras;
    }
    public boolean getNumeros(){
        return numeros;
    }
    public boolean getDecimal(){
        return decimales;
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
        try{
           return Integer.parseInt(campo.getText());
        }
        catch(NumberFormatException e){
            return 0;
        }
    }
    public double getValorDecimal(){
        try{
           return Double.parseDouble(campo.getText());
        }
        catch(NumberFormatException e){
            return 0.0;
        }
    
    }

    

    @Override
    public void keyTyped(KeyEvent ke) {
        char key = ke.getKeyChar();
        if(numeros){
            
            if(((key < '0') || (key > '9')) && (key != KeyEvent.VK_BACK_SPACE)){
                ke.consume();
            }       
        }
        if(caracteres){
            
            if(Character.isDigit(key)){
                ke.consume();
            }
        }
        if(letras){
          
            if(Character.isDigit(key)){
                ke.consume();
            }
            
        }
        if(decimales){
           if(((key < '0') || (key > '9')) && (key != KeyEvent.VK_BACK_SPACE ) && (key != '.')){
                ke.consume();
            }
            if(key == '.' && point){
                ke.consume();
            }
            if((key == '.')){
                point=true;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
        
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //System.out.println(campo.getText());
        if((caracteres || letras) ){
            if((campo.getText().length()>maximo || campo.getText().length()<minimo)){
                System.out.println("holoa");
                campo.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
            else
            campo.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }
        if(numeros){
            if((this.getValorNumerico()>maximo || this.getValorNumerico()<minimo)){
                campo.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
            else
                campo.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }
        if(decimales){
            if(this.getValorDecimal()>maxdecimal || this.getValorDecimal()<mindecimal){
                System.out.println("fuera de rango decimal");
                campo.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
            else{
                System.out.println("dentro del campo");
                campo.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            }
            
            if(point){
                String []arr = this.getValorTexto().split("\\.");
                System.out.println(getValorTexto());
                System.out.println(arr.length);
                if(arr.length>1){
                    System.out.print(arr[0]+","+arr[1]);
                    if(arr[1].length()>ndecimales){
                        System.out.println("numero decimales mayor");
                        campo.setBorder(BorderFactory.createLineBorder(Color.RED));
                    }
                }
                if(arr.length==0){
                    point=false;
                }
                
            }
            
        
        }
    }

    @Override
    public void focusGained(FocusEvent fe) {
        System.out.println("foco ganado");
    }

    @Override
    public void focusLost(FocusEvent fe) {
        System.out.println("foco perdido");
        /*if(numeros){
            if(this.getValorNumerico()>maximo){
                javax.swing.JOptionPane.showMessageDialog(null,"El valor ingresado supera el valor maximo");
                campo.setText("");
            }
            if(this.getValorNumerico()<minimo){
                javax.swing.JOptionPane.showMessageDialog(null,"El valor ingresado no alcanza el valor minimo");
                campo.setText("");
            }
        }*/
    }
    
    private class Verificador extends InputVerifier{
        Dato n;
        Border  rojo= BorderFactory.createLineBorder(Color.red);
        Border  verde= BorderFactory.createLineBorder(Color.GREEN);
       
        Verificador(Dato x){
            this.n=x;
        }
        @Override
        public boolean verify(JComponent jc) {
            
            if(numeros){
                if(n.getValorNumerico()>maximo){
                    n.getCampo().setBorder(rojo);
                    return false;
                }             
                if(n.getValorNumerico()<minimo){
                    n.getCampo().setBorder(rojo);
                    return false;
                }
            }
            if(letras || caracteres){   
                if(n.getValorTexto().length()>maximo){
                    n.getCampo().setBorder(rojo);
                    return false;
                }
                if(n.getValorTexto().length()<minimo){
                    n.getCampo().setBorder(rojo);
                    return false;
                }
            }
            if(decimales){
                String []arr;
                if(point){
                    arr=campo.getText().split("\\.");
                    if(arr.length>1){
                        if(arr[1].length()>ndecimales){
                            campo.setBorder(BorderFactory.createLineBorder(Color.RED));
                            return false;
                        }
                    }
                }
                if(n.getValorDecimal()>maxdecimal || n.getValorDecimal()<mindecimal){
                    campo.setBorder(BorderFactory.createLineBorder(Color.RED));
                    return false;
                }
                
            }
            n.getCampo().setBorder(verde);
            return true;
        }
    
    
    }
    
}
