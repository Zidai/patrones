package observador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */

import java.util.Observable;
import java.util.Observer;

public class SensacionTermica implements Observer,MostrarElemento{
    private float temperatura;
    private float humedad;
    private Observable datos;
    private double hr;
    SensacionTermica(Observable o){
        this.datos=o;
        datos.addObserver(this);
    };

    @Override
    public void update(Observable o, Object o1) {
        if(o instanceof DatosClima){
            DatosClima datos=(DatosClima)o;
            temperatura=datos.getTemperatura();
            humedad=datos.getHumedad();
            hr = -42.379 +(2.04901523 * temperatura)+(10.14333127 * humedad)
                        -(0.22475541 * temperatura * humedad)-(6.83783 * Math.pow(10,-3)* Math.pow(temperatura,2))
                         -(5.481717 * Math.pow(10,-2) * Math.pow(humedad,2))
                         +(1.22874 *Math.pow(10,-3)*Math.pow(temperatura,2)*humedad)
                        +8.5282 * Math.pow(10,-4)*temperatura *Math.pow(humedad,2)
                        - 1.99 * Math.pow(10,-6) * Math.pow(temperatura,2)*Math.pow(humedad,2);
         mostrar();   
        }
    }

    @Override
    public void mostrar() {
        System.out.println("Sencacion termica de "+temperatura+"° es:"+hr);
        System.out.println("_________________________________________________");
    }
    
    
}
