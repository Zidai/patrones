/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author subzero
 */
public class Main {
 public static void main(String [] a){
     /*Singleton datos=Singleton.getInstancia();
     System.out.println("Numero Instancias creadas despues de instancia1:"+datos.getNumIns());
     Singleton data=Singleton.getInstancia();
     System.out.println("Numero Instancias creadas despues de instancia1:"+data.getNumIns());
     Singleton data2=Singleton.getInstancia();
     System.out.println("Numero Instancias creadas despues de instancia1:"+data2.getNumIns());*/
     Proceso p1=new Proceso();
     Proceso p2=new Proceso();
     Thread h1=new Thread(p1);
    
     Thread h2=new Thread(p1);
     
     Thread h3=new Thread(p1);
     Thread h4=new Thread(p2);
     Thread h5=new Thread(p2);      
     
     h1.start();
     h2.start();
     h3.start();
     h4.start();
     h5.start();
     
     


 }   
}
