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
import mx.edu.itoaxaca.tutoria.dao.MateriaFacade;
import mx.edu.itoaxaca.tutoria.modelo.Materia;

/**
 *
 * @author subzero
 */
@Stateless
@LocalBean
public class MateriaLn {
    @EJB
    private MateriaFacade materiaF;
    
    
    public void crear(Materia c){
        materiaF.create(c);
    }
    public int numReg(){
        return materiaF.count();
    }
    public List<Materia> materias(){
        
        return materiaF.findAll();
    }
    public Materia buscar(int c){
        return materiaF.find(c);
    }
    public void editar(Materia c){
        materiaF.edit(c);
    }
   public void Eliminar(Materia c){
       materiaF.remove(c);
   }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
