/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author subzero
 */
public abstract class LecturaEscrituraTexto  {
    protected BufferedReader flujo=new BufferedReader(new InputStreamReader(System.in));
    public abstract void leer(String []t);
    public abstract void escribir(String []t);
    
   
}
