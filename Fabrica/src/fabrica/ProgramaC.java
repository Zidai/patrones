/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

/**
 *
 * @author subzero
 */
import java.util.ArrayList;
public class ProgramaC extends Programa{

    @Override
    protected Ventana crearVentana(String t) {
        if(t.equals("marco")){
    
            return new MarcoC();
        }
        if(t.equals("panel")){
    
            return new PanelC();
        }
        return null;
            
        
    }

    @Override
    public Ventana iniciar(Ventana v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
