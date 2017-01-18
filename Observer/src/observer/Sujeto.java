/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author subzero
 */
public interface Sujeto {
    public void registrarObservador(Observador O,int[] servicios);
    public void removerObservador(Observador O);
    public void notificarObservadores();
    
    
}
