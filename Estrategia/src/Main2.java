/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class Main2 {
    public static void main(String [] args){
        DatoCompuesto t1=new Tiempo(23,45);
        DatoCompuesto t2=new Tiempo(2,30);
        DatoCompuesto t3=t1.modoSuma.sumar(t2);
        System.out.println(t3.valor1+" "+t3.valor2);
        DatoCompuesto t4=t2.modoEscala.escalar(-4);
        System.out.println(t4.valor1+" "+t4.valor2);
        DatoCompuesto t5=t4.modoSimetrico.simetria();
        System.out.println(t5.valor1+" "+t5.valor2);

        
    }
    
}
