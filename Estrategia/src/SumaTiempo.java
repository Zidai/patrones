/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class SumaTiempo implements ModoSumar{
    protected DatoCompuesto este;
    SumaTiempo(DatoCompuesto in){
        this.este=in;
    }
    @Override
    public DatoCompuesto sumar(DatoCompuesto in) {
        double hora1=este.valor1;
        double hora2=in.valor1;
        double minutos1=este.valor2;
        double minutos2=in.valor2;
        double sumaHoras=hora1+hora2;
        double sumaMinutos=minutos1+minutos2;
        double residuominutos=0;
        double residuohoras=0;
        if(sumaMinutos>60){
            residuominutos=sumaMinutos-60;
            sumaMinutos=residuominutos;
            sumaHoras++;
        }
        if(sumaHoras>23){
            residuohoras=sumaHoras-24;
            sumaHoras=0;
            sumaHoras=sumaHoras+residuohoras;
            
        }
        
        return new Tiempo(sumaHoras,sumaMinutos);
        
        
    }
    
}
