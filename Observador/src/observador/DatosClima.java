/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

/**
 *
 * @author subzero
 */
import java.util.Observable;
import java.util.Observer;
public class DatosClima extends Observable{
    private float temperatura;
    private float humedad;
    private float presion;
    
    public DatosClima(){
    }
    public void cambioMedidas(){
        setChanged();
        notifyObservers();
    }
    public void ajustarMedidas(float temperatura,float humedad,float presion){
        this.temperatura=temperatura;
        this.humedad=humedad;
        this.presion=presion;
        cambioMedidas();
    }
    public float getTemperatura(){
        return temperatura;
    }
    public float getHumedad(){
        return humedad;
    }
    public float getPresion(){
        return presion;
    }
    
 
    
}
