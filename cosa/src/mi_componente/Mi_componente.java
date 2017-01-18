
package mi_componente;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel ;
import java.io.Serializable;
import static java.lang.Double.NaN;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Mi_componente extends JPanel implements Serializable,KeyListener {
    private JLabel etiqueta;
    private JTextField dato;
    private boolean numeros=true;
    private boolean letras=false;
    private boolean caracteres=false;
    private boolean decimal;
    private String sal="";
    private int minimo;
    private int maximo;
    private double minimodec;
    private double maximodec;
    private int ndecimal;
    private boolean decimalpoint;
    
    public Mi_componente() {
        decimalpoint=false;
        ndecimal=0;
        minimo=0;
        maximo=1;
        etiqueta=new JLabel(" ");
       dato=new JTextField(20);
       add(etiqueta);
       add(dato);
       dato.addKeyListener(this);
       dato.addFocusListener(new FocusListener() {
        public void focusGained(FocusEvent e) {
            System.out.println("Enfoque win");
            if(e.getOppositeComponent() instanceof JTextField){
                
            }
            
        }
        public void focusLost(FocusEvent e) {
       System.out.println("Enfoque Perdido");
       if(dato.getText().compareTo("")==0){
           javax.swing.JOptionPane.showMessageDialog(null,"debes ingresar un valor en el campo");
           //requestFocus();
       }
       else{
        if(numeros){
            System.out.println("entro a numeros"+dato.getText());
           if (Integer.parseInt(dato.getText())>maximo || Integer.parseInt(dato.getText())<minimo) {
               System.out.println(dato.getText());
               javax.swing.JOptionPane.showMessageDialog(null,"El valor ingresado esta fuera del rango establecido");
               dato.setText("");
           }
        }
       if(caracteres || letras){
           if(dato.getText().length() < minimo){
               System.out.println(dato.getText());
               javax.swing.JOptionPane.showMessageDialog(null,"El valor ingresado es menor del rango establecido");
               dato.setText("");
           }
           if(dato.getText().length() > maximo){
               System.out.println(dato.getText());
               javax.swing.JOptionPane.showMessageDialog(null,"El valor ingresado es mayor del rango establecido");
               dato.setText("");
           }
        }
        if(decimal){
            if(Double.parseDouble(dato.getText())>maximodec){
                javax.swing.JOptionPane.showMessageDialog(null,"El valor ingresado es mayor del rango establecido");
               dato.setText("");
            }
            
        }
        
      }

   }});
       
    } 
    public void setMinimo(int m){
        minimo=m;
    }
    public void setMaximo(int m){
        maximo=m;
    }
    public int getMinimo(){
        return minimo;
    }
    public int getMaximo(){
        return maximo;
    }
    
    
    public void setetiqueta(String e){
        etiqueta.setText(e);
    }
    
    public String getetiqueta(){
        return etiqueta.getText();
    }
    public void setDato(String s){
        dato.setText(s);
    }
    
    public String getDato(){
        return dato.getText();
    }
    
    public int getvalorentero(){
        if(!numeros){
           return (int) NaN; 
        }
        return Integer.parseInt(dato.getText());
    }

    
    public void setNDecimal(int n){
        ndecimal=n;
    }
    
    public int getNDecimal(){
        return ndecimal;
    } 
    
    public void setnumeros(boolean e){
        numeros=e;
        letras=false;
        caracteres=false;
        decimal=false;
    }
    public void setletras(boolean e){
        letras=e;
        caracteres=false;
        numeros=false;
        decimal=false;
    }
    public void setcaracteres(boolean e){
        caracteres=e;
        letras=false;
        numeros=false;
        decimal=false;
    }
    public void setDecimal(boolean e){
        caracteres=false;
        letras=false;
        numeros=false;
        decimal=e;
        
    }
    public void setMaximodec(double d){
        maximodec=d;
    }
    public void setMinimodec(double d){
        minimodec=d;
    }
    public double getMaximodec(){
        return maximodec;
    }
    public double getMinimodec(){
        return minimodec;
    }
    
    public boolean getDecimal(){
        return decimal;
    }
    public boolean getnumeros(){
        return numeros;
    }
    public boolean getletras(){
        return letras;
    }
    public boolean getcaracteres(){
        return caracteres;
    }
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.print("");
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
        char key= e.getKeyChar();
        if(numeros ){
            if(key>='0'&& key<='9'){
                sal+=key;                
            }
        }
        if(letras && dato.getText().length()<maximo){
           
            if((key>='a'&& key<='z')||(key>='A'&& key<='Z')){
                sal+=key;                
            }
        }
        if(caracteres && dato.getText().length()<maximo){
            if((key>='!'&& key<='~')||(e.getKeyCode()>=128 && e.getKeyCode()<=254)||(e.getKeyCode()==0)){
                sal+=key;                
            }
        }
        if(decimal){
             if((key>='0'&& key<='9')||key=='.'){
                 
                 if((key>='0'&& key<='9')){
                     sal+=key;
                     dato.setText(sal);
                 }
                 if(decimalpoint){

                     String[] sp=sal.split(".");
                     //System.out.println(sp[0]+"."+sp[1]);
                     if(sp.length>2){
                        System.out.println(sp[1]);
                        if(sp[1].length()<ndecimal){
                        sal+=key;
                                dato.setText(sal);
                        }
                        else{
                           sal+=key;
                                   dato.setText(sal);
                        }
                 
                     }
                 }
                 if(key=='.' && !decimalpoint){
                     decimalpoint=true;
                     sal+=key;
                    dato.setText(sal);
                 }
                
            }
        }
        //dato.setText("");
        dato.setText(sal);
        
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
         if((e.getKeyCode())==KeyEvent.VK_BACK_SPACE){
            sal=dato.getText();
        }else{
             if(dato.getText().length()!=0){
                 dato.setText(dato.getText().substring(0, dato.getText().length()-1));
             }
         }
         //System.out.println(sal);
         dato.setText(sal);
   }
}