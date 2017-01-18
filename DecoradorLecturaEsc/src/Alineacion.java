
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class Alineacion extends Decorador{
    String alineacion;

    public Alineacion(LecturaEscrituraTexto olet,String ali) {
        super(olet);
        alineacion=ali;
    }
    private String getAlineacion(String al){
        Map<String,String> alinea=new HashMap<String,String>();
            alinea.put("derecha","\t\t\t\t\t");
            alinea.put("centro","\t\t\t");
            alinea.put("izquierda","");
            if(alinea.get(al)!=null){
                return alinea.get(al);
            }
            return "";
    }
     @Override
    public void escribir(String[]t){
        super.escribir(t);
    }
    
    @Override
    public void leer(String t[]){
        
        t[0]=getAlineacion(alineacion)+t[0];
        super.leer(t);
    }
    
}
