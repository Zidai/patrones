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
import mx.edu.itoaxaca.tutoria.dao.MateriaCarreraFacade;
import mx.edu.itoaxaca.tutoria.modelo.MateriaCarrera;

/**
 *
 * @author subzero
 */
@Stateless
@LocalBean
public class MateriaCarreraLn {
    @EJB
    private MateriaCarreraFacade materiaF;
    
    
    public void crear(MateriaCarrera c){
        materiaF.create(c);
    }
    public int numReg(){
        return materiaF.count();
    }
    public List<MateriaCarrera> materiasCarrera(){
        
        return materiaF.findAll();
    }
    public MateriaCarrera buscar(int c){
        return materiaF.find(c);
    }
    public void editar(MateriaCarrera c){
        materiaF.edit(c);
    }
   public void Eliminar(MateriaCarrera c){
       materiaF.remove(c);
   }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
