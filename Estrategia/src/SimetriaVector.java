/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class SimetriaVector implements ModoSimetria{
    protected DatoCompuesto este;
    
    SimetriaVector(DatoCompuesto este){
        this.este=este;
    }
    @Override
    public DatoCompuesto simetria() {
        return new Vector(este.valor1,(180)+este.valor2);
    }
}
