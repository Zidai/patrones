
package mi_componente;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewClass {
   public static void main(String args[]){
       JFrame mi = new JFrame();
       JLabel b=new JLabel("Hola");
       //b.setSize(40,20);
       Mi_componente mi_com = new Mi_componente();
       mi_com.setetiqueta("jaja");
       mi_com.setcaracteres(true);
       mi_com.setMaximo(6);
        mi_com.setMinimo(3);
       mi.add(mi_com);
       //mi.add(b);
       mi.setVisible(true);
   } 
}