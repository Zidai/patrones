/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rango;

import com.toedter.calendar.JDateChooser;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;


/**
 *
 * @author subzero
 */
public class RangoFechas extends JPanel implements Serializable{
   
    private JDateChooser fecha1;
    private JDateChooser fecha2;
    private JLabel eti1;
    private JLabel eti2;
    
    public RangoFechas(){
        eti1=new JLabel();
        eti2=new JLabel();
        fecha1=new JDateChooser();
        fecha2=new JDateChooser();
        fecha2.setBounds(20, 20, 200, 20);
        fecha1.setBounds(20, 20, 200, 20);
        fecha2.setEnabled(false);
        this.add(eti1);
        this.add(fecha1);
         this.add(eti2);
        this.add(fecha2);
        
       
        agregarOyente();
        agregarOyente2();
    }
    public String getEti1(){
        return eti1.getText();
    }
        public String getEti2(){
        return eti2.getText();
    }
    public void setEti1(String s){
        eti1.setText(s);
    }
    public void setEti2(String s){
        eti2.setText(s);
    }
    
    
    public Date getFecha1(){
        return fecha1.getDate();
    }
        public Date getFecha2(){
        return fecha2.getDate();
    }
    public void setFecha1(Date f){
        fecha1.setDate(f);
    }
    public void setFecha2(Date f){
        fecha2.setDate(f);
    }
    private void agregarOyente() {
        fecha1.addPropertyChangeListener(
                new java.beans.PropertyChangeListener() {
                    @Override
                    public void propertyChange(java.beans.PropertyChangeEvent evt) {
                        System.out.print(evt.getPropertyName());
                           if (evt.getPropertyName().compareTo("date") == 0) {
                               System.out.println("evento fecha");
                               fecha2.setEnabled(true);
                               fecha2.setDate(fecha1.getDate());
                        }
                           if (evt.getPropertyName().compareTo("ancestor") == 0) {
                               System.out.println("ancestor");
                               //fecha2.setEnabled(true);
                        }
                           
                    }
                    
                });
    }
     private void agregarOyente2() {
        fecha2.addPropertyChangeListener(
                new java.beans.PropertyChangeListener() {
                    @Override
                    public void propertyChange(java.beans.PropertyChangeEvent evt) {
                       
                           if (evt.getPropertyName().compareTo("date") == 0) {
                               System.out.println(fecha1.getDate().toString());
                               if(fecha1.getDate().compareTo(null)==0){
                                   fecha2.setEnabled(true);
                               }
                               if(fecha1.getDate().compareTo(fecha2.getDate())>0){
                                  
                                   javax.swing.JOptionPane.showMessageDialog(null,"La fecha seleccionada debe ser mayor o igual a la fecha1");
                                   
                               }
                        }
                    }
                    
                });
    }
    
    
}
