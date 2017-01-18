/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class Main {
    public static void main(String []f){
        System.out.println("\n******Puntos*********");
        DatoCompuesto p1=new Punto(12.5,4.5);
        DatoCompuesto p2=new Punto(1.4,3.5);
        System.out.println("Punto1_:"+p1.escribir());
        System.out.println("Punto2_:"+p2.escribir());
        DatoCompuesto p3=p1.modoSuma.sumar(p2);
        System.out.println("SumaDePuntoAyB_:"+p3.escribir());
        DatoCompuesto p4=p3.modoSimetrico.simetria();
        System.out.println("PuntoSimetricoA_P3:"+p4.escribir());
        DatoCompuesto p5=p4.modoEscala.escalar(3);
        System.out.println("Punto4 escalado 3"+p5.escribir());
        
        System.out.println("\n******Vectores*********");
        
        DatoCompuesto v1=new Vector(2.3,40);
        DatoCompuesto v2=new Vector(-5.3,40);
        System.out.println("Vector1_:"+v1.escribir());
        System.out.println("Vector2_:"+v2.escribir());
        DatoCompuesto v3=v1.modoSuma.sumar(v2);
        System.out.println("Suma de vector 1 y 2:"+v3.escribir());
        DatoCompuesto v4=v3.modoSimetrico.simetria();
        System.out.println("Vector Simetrico a Vector3"+v4.escribir());
        DatoCompuesto v5=v4.modoEscala.escalar(3);
        System.out.println("Vector4 escalado 3"+v5.escribir());
        
        System.out.println("\n******Fracciones*********");
        
        DatoCompuesto f1=new Fraccion(24,4);
        DatoCompuesto f2=new Fraccion(2,7);
        System.out.println("Fraccion1_:"+f1.escribir());
        System.out.println("Fraccion2_:"+f2.escribir());
        DatoCompuesto f3=f1.modoSuma.sumar(f2);
        System.out.println("Suma de Fraccion 1 y 2:"+f3.escribir());
        DatoCompuesto f4=f3.modoEscala.escalar(3);
        System.out.println("Fraccion3 escalado 3"+f4.escribir());
        
        
    
    }
}

