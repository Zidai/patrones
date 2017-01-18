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
public class Estacion {
       public static void main(String []g){
            DatosClima datos=new DatosClima();
            CondicionesActuales ver=new CondicionesActuales(datos);
            Pronostico pro=new Pronostico(datos);
            MostrarEstadisticas est=new MostrarEstadisticas(datos);
            SensacionTermica sense=new SensacionTermica(datos);
            datos.ajustarMedidas(57.0f,94f,45.5f);
            //ver.update(datos, g);
            //pro.update(datos, g);
            datos.ajustarMedidas(45f,90f,45.5f);
            //ver.update(datos, g);
       }

    
}
