package observador;

import java.util.Observable;
import java.util.Observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class MostrarEstadisticas implements Observer,MostrarElemento{
    private float mtemperatura,mhumedad,mpresion;
    private float xtemperatura,xhumedad,xpresion;
    private float ptemperatura,phumedad,ppresion;
    private Observable datos;
    
    MostrarEstadisticas(Observable datos){
        this.datos=datos;
        this.datos.addObserver(this);
        mtemperatura=1000;mhumedad=1000;mpresion=1000;
        xtemperatura=0;xhumedad=0;xpresion=0;
    }
    @Override
    public void update(Observable o, Object o1) {
        if(o instanceof DatosClima){
            DatosClima datos=(DatosClima)o;
            if(datos.getTemperatura()<this.mtemperatura){
            this.mtemperatura=datos.getTemperatura();
        }
        if(datos.getTemperatura()>this.xtemperatura){
            this.xtemperatura=datos.getTemperatura();
        }
        this.ptemperatura=(this.mtemperatura+this.xtemperatura)/2;
         if(datos.getHumedad()<this.mhumedad){
            this.mhumedad=datos.getHumedad();
        }
        if(datos.getHumedad()>this.xhumedad){
            this.xhumedad=datos.getHumedad();
        }
        this.phumedad=(this.mhumedad+this.xhumedad)/2;
        
        if(datos.getPresion()<this.mpresion){
            this.mpresion=datos.getPresion();
        }
        if(datos.getPresion()>this.xpresion){
            this.xpresion=datos.getPresion();
        }
        this.ppresion=(this.mpresion+this.xpresion)/2;
        mostrar();
        }
        
    }

    @Override
    public void mostrar() {
        System.out.println("Max Temp: "+xtemperatura+"\tMin Temp: "+mtemperatura+"\tAVG: "+ptemperatura);
        System.out.println("Max Presion: "+xpresion+"\tMin Presion: "+mpresion+"\tAVG: "+ppresion);
        System.out.println("Max Humedad: "+xhumedad+"\tMin Humedad: "+mhumedad+"\tAVG: "+phumedad);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
    }
    
    
    
}
