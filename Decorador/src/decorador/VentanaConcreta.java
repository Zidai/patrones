/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

/**
 *
 * @author subzero
 */
public class VentanaConcreta implements Ventana{
    
    public void dibujar(){
    
    }
  

    @Override
    public String getDesciption() {
        return "Ventana Simple";
    }
}
