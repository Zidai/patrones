/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.tutoria.carreraadmo;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import mx.edu.itoaxaca.tutoria.ln.MateriaLn;
import mx.edu.itoaxaca.tutoria.modelo.Materia;
import javax.faces.model.SelectItem;

/**
 *
 * @author subzero
 */
@Named(value = "materiaAdm")
@SessionScoped
public class MateriaAdm implements Serializable {
    @EJB
    private MateriaLn materiaLn;
    private Materia materia;
    private List<Materia> materias;
    private int idCBuscar;
    private boolean edit;
    private LinkedHashMap<String,Integer> ids;
   
    /**
     * Creates a new instance of MateriaAdm
     */
    public MateriaAdm() {
        materias=new ArrayList<Materia>();
        ids=new LinkedHashMap<String,Integer>();
        idCBuscar=0;
        edit=true;
       
    }

  
    public LinkedHashMap<String,Integer> getIds(){
        materias=materiaLn.materias();
        ids=new LinkedHashMap<String,Integer>();
        
        for (Materia mat1 : materias) {
            ids.put(mat1.getNombre(),mat1.getIdmateria());
        }
        idCBuscar=materias.get(0).getIdmateria();
        
        return ids;
    }
    public void cambio(ValueChangeEvent e){
        Materia c;
        materia.setIdmateria((Integer)e.getNewValue());
        c=materiaLn.buscar(materia.getIdmateria());
        if(c!=null){
            edit=false;
            this.materia=c;
            idCBuscar=materia.getIdmateria();
            System.out.println("No es nulo "+materia.getNombre());
        }
        else{
            edit=true;
            this.materia=new Materia();
        }

    }   
    

    public void setIds(LinkedHashMap<String,Integer> ids) {
        this.ids = ids;
    }
    
    
    
    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }
    

    public int getIdCBuscar() {
        return idCBuscar;
    }

    public void setIdCBuscar(int idCBuscar) {
        this.idCBuscar = idCBuscar;
    }
    

    public MateriaLn getTutoriaLn() {
        return materiaLn;
    }

    public void setTutoriaLn(MateriaLn materiaLn) {
        this.materiaLn = materiaLn;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    
    public List<Materia> getMaterias(){
        return materias;
    }
    
   public void crearMaterias(ActionEvent e){
       materias=materiaLn.materias();
   }
    
    public Materia getMateria(){
        return materia;
    }
    public void setMateria(Materia materia){
        this.materia=materia;
    }
    public void crearMateria(ActionEvent e){
        materia=new Materia();
        
    }
    public void agregarMateria(ActionEvent e){
        materiaLn.crear(materia);
        materia=new Materia();
    } 
    public void buscar(ActionEvent e){
        Materia c;
        c=materiaLn.buscar(idCBuscar);
        System.out.println("********************************************");
        System.out.println("buscando..........");
        if(c!=null){
            edit=false;
            materia=c;
            System.out.println("No Es nulo");
        }
        else{
            edit=true;
            materia=new Materia();
            System.out.println("Es nulo");
        }
    }
    public void cancelSearch(ActionEvent e){
        idCBuscar=0;
        materia=new Materia();
    }
    public void editar(ActionEvent e){
            materiaLn.editar(materia);  
    }
    public void eliminar(ActionEvent e){
        materiaLn.Eliminar(materia);
        materia=new  Materia();
        idCBuscar=0;
        edit=true;
    }
    
    
}
