
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class Autenticacion extends Decorador{
    
    public Autenticacion(LecturaEscrituraTexto olet) {
        super(olet);
    }
    
    @Override
    public void leer(String []t){
        System.out.println("Contraseña:");
        try{
            flujo.readLine();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        super.leer(t);
    }
    @Override
    public void escribir(String []t){
            System.out.println("contraseña?\n");
        try{
            t[0]=flujo.readLine();
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        super.escribir(t);
    }

    
}
