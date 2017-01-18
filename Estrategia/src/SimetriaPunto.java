/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class SimetriaPunto implements ModoSimetria{
    protected    DatoCompuesto este;
    
    SimetriaPunto(DatoCompuesto este){
        this.este=este;
    }
    @Override
    public DatoCompuesto simetria() {
        return new Punto((-1)*este.valor1,(-1)*este.valor2);
    }
    
}
