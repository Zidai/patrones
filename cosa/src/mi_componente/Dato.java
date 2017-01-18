/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_componente;

/**
 *
 * @author subzero
 */


import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dato extends JPanel implements KeyListener,FocusListener{
    private JLabel etiqueta;
    private boolean letra,numero,caracter,nuevo_decimal;
    private int max_punto = 3;
    private int minimo = 1, maximo = 7;
    private JTextField texto;
    boolean status = false;
    
    public Dato(){
        this.etiqueta = new JLabel("");
        this.texto = new JTextField(10);
        add(etiqueta);
        add(texto);
        texto.addKeyListener(this);
        texto.addFocusListener(this);
    }

    public String getEtiqueta() {
        return etiqueta.getText();
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta.setText(etiqueta);
    }
    
    public double getDecimal(){
        String texto2 = texto.getText();
        int longitud = texto.getText().length();
        for(int i = 0; i < longitud; i++){
            if(texto2.charAt(i) == '.'){
                for(int j = i; j < longitud - i; j++){
                    if(j > getMax_punto()){
                        status = true;
                    }
                }
            }
        }
        acabo();
        return Double.parseDouble(texto.getText());
    }
    
    public void acabo(){
        //si el texto tiene mas numeros depues del punto decimal muestra el mensaje
        if(status == true){
            texto.setForeground(Color.red);
        }
    }
    
    public void setDecimal(double decimal){
        this.texto.setText(""+decimal);
    }

    public boolean isLetra() {
        return letra;
    }

    public void setLetra(boolean letra) {
        this.letra = letra;
        this.numero = false;
        this.caracter = false;
        this.nuevo_decimal = false;
    }

    public boolean isNumero() {
        return numero;
    }

    public void setNumero(boolean numero) {
        this.numero = numero;
        this.letra = false;
        this.caracter = false;
        this.nuevo_decimal = false;
    }

    public boolean isCaracter() {
        return caracter;
    }

    public void setCaracter(boolean caracter) {
        this.caracter = caracter;
        this.letra = false;
        this.numero = false;
        this.nuevo_decimal = false;
    }

    public String getTexto() {
        return texto.getText();
    }

    public void setTexto(String texto) {
        this.texto.setText(texto);
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public boolean isDecimal() {
        return nuevo_decimal;
    }

    public void setDecimal(boolean decimal) {
        this.nuevo_decimal = decimal;
        this.letra = false;
        this.caracter = false;
        this.numero = false;
    }
    

    @Override
    public void keyTyped(KeyEvent e) {
        char valor_entrada = e.getKeyChar();
        int longitud_texto = texto.getText().length();
        //si es nuevodecimal 
        if(nuevo_decimal && (Character.isLetter(valor_entrada)) || (longitud_texto == getMaximo())){
            e.consume();
        }
        if(letra && Character.isDigit(valor_entrada) || (longitud_texto == getMaximo())){
            e.consume();
        }
        if(numero && Character.isLetter(valor_entrada) || (longitud_texto == getMaximo())){
            e.consume();
        }
        if(caracter && Character.isDigit(valor_entrada) || (longitud_texto == getMaximo())){
            e.consume();
        }   
    }

    public int getMax_punto() {
        return max_punto;
    }

    public void setMax_punto(int max_punto) {
        this.max_punto = max_punto;
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void focusGained(FocusEvent e) {}

    @Override
    public void focusLost(FocusEvent e) {
        int longitud_texto = texto.getText().length();
        if(longitud_texto == 0){
            setTexto("Campo Vacio");
        }else if(longitud_texto < getMinimo()){
            setTexto("");
            focusLost(e);
        }
    }
}
