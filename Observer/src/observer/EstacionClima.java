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
public class EstacionClima {
    public static void main(String [] p){
        DatosClima datos=new DatosClima();
        MostrarCondicionesActuales condicionesActuales=new MostrarCondicionesActuales(datos);
        MuestraEstadisticas std=new MuestraEstadisticas(datos);
        Pronostico pro=new Pronostico(datos);
        datos.modificarMedidas(12.5f, 45,65.4f);

        datos.modificarMedidas(20.3f,67,23);

        datos.modificarMedidas(15.5f, 45,34.4f);
        datos.modificarMedidas(15.5f, 32,60.4f);
                datos.modificarMedidas(15.5f, 32,60.4f);
    }
}
