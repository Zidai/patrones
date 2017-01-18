/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerDis;

/**
 *
 * @author subzero
 */
public interface Observador {
    public void actualizart(float temperatura,float humedad,float presion);
    public void actualizart(float temperatura);
    public void actualizarh(float humedad);
    public void actualizarp(float presion);
    
}
