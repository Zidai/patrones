/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author subzero
 */
public class Main {
    public static void main(String[]args){
        Vector vec1=new Vector((float)12.2,(float)45.0);
        Vector vec2=new Vector((float)4.2,(float)45.0);
        
        DatoCompuesto vec3=vec1.suma(vec2);
        System.out.println(vec3.escribir());
        
        Punto p1=new Punto((float)12.2,(float)15.2);
        Punto p2=new Punto((float)10.2,(float)12.2);
        
        DatoCompuesto p3=p1.suma(p2);
        System.out.println(p3.escribir());
        
        Fraccion f1=new Fraccion((float)1,(float)3);
        Fraccion f2=new Fraccion((float)2,(float)4);
        
        Fraccion f3=(Fraccion)f1.suma(f2);
        System.out.println(f3.escribir());

        
        
        
        
        
        
        
        
    }
    
}
