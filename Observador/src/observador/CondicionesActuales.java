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
public class CondicionesActuales implements Observer,MostrarElemento{
    Observable sujeto;
    private float temperatura;
    private float humedad;
    CondicionesActuales(Observable o){
        this.sujeto=o;
        sujeto.addObserver(this);
    }
    @Override
    public void update(Observable o, Object o1) {
        if(o instanceof DatosClima){
            DatosClima datos=(DatosClima)o;
            this.temperatura=datos.getTemperatura();
            this.humedad=datos.getHumedad();
            mostrar();
        }
    }

    @Override
    public void mostrar() {
        System.out.println("Condiciones Actuales: "+temperatura+" °F, "+ humedad+"% de humedad");
        System.out.println("--------------------------------------------------------------------");
    }
    
}
