/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class Pruebas {
    public static void main(String[]args){
        /*LecturaEscrituraTexto ob=new LeerEscTextoArchivo();
        LecturaEscrituraTexto deco=new Autenticacion(new Encriptar(ob));
        String text[]={new String()};
        deco.escribir(text);
        System.out.println("Texto:"+text[0]);
        deco.leer(text);*/
        
        LecturaEscrituraTexto ob=new LeerEscTextoArchivo();
        LecturaEscrituraTexto deco=new Alineacion(new Colorear(ob,"azul"),"derecha");
        String text[]={new String()};
        deco.escribir(text);
        System.out.println("Texto:"+text[0]);
        deco.leer(text);
         
               
    
    }

   
    
}
