/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author subzero
 */
public class Pronostico implements Observer,MostrarElemento{
    Observable sujeto;
    private float actualtemperatura;
    private float actualpresion;
    private float anttemperatura;
    private float antpresion;
    Pronostico(Observable o){
        this.sujeto=o;
        sujeto.addObserver(this);
    }

    @Override
    public void update(Observable o, Object o1) {
        if(o instanceof DatosClima){
            DatosClima datos=(DatosClima)o;
            this.anttemperatura=this.actualtemperatura;
            this.actualtemperatura=((DatosClima) o).getTemperatura();
            this.antpresion=this.actualpresion;
            this.actualpresion=((DatosClima) o).getPresion();
            mostrar();
        }
    }

    @Override
    public void mostrar() {
        System.out.println(pronosticar());
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
    }
    private String pronosticar(){
        String cadena;
        if(this.anttemperatura<this.actualtemperatura && this.antpresion>this.actualpresion){
           return cadena="Probabilidad de calor";
        }
        if(this.antpresion<this.actualpresion && this.anttemperatura>this.actualtemperatura){
         return cadena="Probabilidad de lluvias";
        }
        if(this.antpresion==this.actualpresion && this.anttemperatura==this.actualtemperatura){
            return cadena="Las condiciones son iguales";
        }
        
        return cadena="No es posible determinar el clima";
    }
}
