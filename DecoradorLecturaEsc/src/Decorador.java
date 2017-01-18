/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public abstract class Decorador extends LecturaEscrituraTexto{
    LecturaEscrituraTexto ele;
    Decorador(LecturaEscrituraTexto olet){
        this.ele=olet;
    }
    
    public void leer(String []t){
        ele.leer(t);
    }
    public void escribir(String []t){
        ele.escribir(t);
    }
    
}
