
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author subzero
 */
public class LeerEscTextoArchivo extends LecturaEscrituraTexto{

    @Override
    public void leer(String[] t) {
        System.out.println("Texto:"+t[0]);
    }

    @Override
    public void escribir(String[] t) {
        System.out.println("texto?\n");
        try{
            t[0]=flujo.readLine();
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        

    }
    
}
