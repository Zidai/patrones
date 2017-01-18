/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */

/**
 *
 * @author subzero
 */
public class Encriptar extends Decorador{
    int constante=3;
    public Encriptar(LecturaEscrituraTexto olet){
        super(olet);
    }
   
    @Override
    public void escribir(String[]t){
        super.escribir(t);
        StringBuffer ot=new StringBuffer(t[0]);
        for(int p=0;p<t[0].length();p++){
            ot.setCharAt(p,(char)(ot.charAt(p)+constante));
        
        }
        t[0]=ot.toString();
    }
    
    @Override
    public void leer(String t[]){
        
        StringBuffer ot=new StringBuffer(t[0]);
        for(int p=0;p<t[0].length();p++){
            ot.setCharAt(p,(char)(ot.charAt(p)-constante));
        
        }
        t[0]=ot.toString();
        super.leer(t);
    }
        
}
    



