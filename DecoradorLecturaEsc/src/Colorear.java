/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
import java.awt.Color;
import java.util.Map;
import java.util.HashMap;
public class Colorear extends Decorador {
   String color;
    public Colorear(LecturaEscrituraTexto olet,String color) {
        super(olet);
        this.color=color;
    }
    private String getColor(String col){
            Map<String,String> colores=new HashMap<String,String>();
            colores.put("negro","\u001B[30m");
            colores.put("rojo","\u001B[31m");
            colores.put("verde","\u001B[32m");
            colores.put("amarillo","\u001B[33m");
            colores.put("azul","\u001B[34m");
            colores.put("purpura","\u001B[35m");
            colores.put("cyan","\u001B[36m");
            colores.put("blanco","\u001B[31m");

            if(colores.get(col)!=null){
                return colores.get(col);
            }
            return "";
    }
    
    @Override
    public void escribir(String[]t){
        super.escribir(t);
    }
    
    @Override
    public void leer(String t[]){
        t[0]=getColor(color)+t[0];
        super.leer(t);
    }
   
    
}
