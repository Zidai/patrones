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
public class Proceso implements Runnable{

    @Override
    public void run() {
        Singleton s1=Singleton.getInstancia();
        s1.setVisible(true);
        System.out.println("Instancias Creadas:"+s1.getNumIns());
        Singleton s2=Singleton.getInstancia();
        s2.setVisible(true);
       System.out.println("Instancias Creadas:"+s2.getNumIns());
        Singleton s3=Singleton.getInstancia();
        s3.setVisible(true);
       System.out.println("Instancias Creadas:"+s3.getNumIns());
    }
    
}
