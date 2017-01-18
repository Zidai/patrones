/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.tutoria.ln;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import mx.edu.itoaxaca.tutoria.dao.CarreraFacade;
import mx.edu.itoaxaca.tutoria.modelo.Carrera;

/**
 *
 * @author subzero
 */
@Stateless
@LocalBean
public class TutoriaLn {

    @EJB
    private CarreraFacade carreraF;
    
    
    public void crear(Carrera c){
        carreraF.create(c);
    }
    public int numReg(){
        return carreraF.count();
    }
    public List<Carrera> carreras(){
        
        return carreraF.findAll();
    }
    public Carrera buscar(int c){
        return carreraF.find(c);
    }
    public void editar(Carrera c){
        carreraF.edit(c);
    }
   public void Eliminar(Carrera c){
       carreraF.remove(c);
   }
    
    //private Carrera carrera;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
