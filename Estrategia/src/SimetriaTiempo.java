/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class SimetriaTiempo implements ModoSimetria{
    DatoCompuesto este;
    SimetriaTiempo(DatoCompuesto in){
        this.este=in;
    }
    @Override
    public DatoCompuesto simetria() {
        DatoCompuesto otro=este.modoSuma.sumar(new Tiempo(6,0));
        return otro;
    }
    
}
