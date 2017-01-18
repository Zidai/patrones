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
import mx.edu.itoaxaca.tutoria.ln.MateriaCarreraLn;
import mx.edu.itoaxaca.tutoria.ln.MateriaLn;
import mx.edu.itoaxaca.tutoria.ln.TutoriaLn;
import mx.edu.itoaxaca.tutoria.modelo.Carrera;
import mx.edu.itoaxaca.tutoria.modelo.Materia;
import mx.edu.itoaxaca.tutoria.modelo.MateriaCarrera;

/**
 *
 * @author subzero
 */
@Named(value = "materiaCarreraAdm")
@SessionScoped
public class MateriaCarreraAdm implements Serializable {

    /**
     * Creates a new instance of MateriaCarreraAdm
     */
    public MateriaCarreraAdm() {
        materias=new ArrayList<MateriaCarrera>();
        idCBuscar=0;
        edit=true;
        matDisp=new LinkedHashMap<String,Integer>();
        carrDisp=new LinkedHashMap<String,Integer>();
        ids=new LinkedHashMap<String,Integer>();
    }
    @EJB
    private MateriaCarreraLn materiaLn;
    private MateriaCarrera materia;
    private List<MateriaCarrera> materias;
    private int idCBuscar;
    private boolean edit;
    private LinkedHashMap<String,Integer> ids;
    
    @EJB
    private MateriaLn matLn;
    private LinkedHashMap<String,Integer> matDisp;
    @EJB
    private TutoriaLn tutoriaLn;
    private LinkedHashMap<String,Integer> carrDisp;

    public void cambio(ValueChangeEvent e){
        MateriaCarrera c=new MateriaCarrera();
        materia.setIdcarrera((Integer)e.getNewValue());
        try{
            c=materiaLn.buscar(materia.getIdcm());
        
        
        if(c!=null){
            System.out.println("No es nulo");
            edit=false;
            this.materia=c;
            this.idCBuscar=materia.getIdcm();
        }
        else{
            edit=true;
            this.materia=new MateriaCarrera();
            System.out.println("Es nulo "+materia.getIdcarrera());
        }
        }
        catch(NullPointerException ev){
            System.out.println("La materia no existe");
        }

    }
    public LinkedHashMap<String, Integer> getIds() {
        materias=materiaLn.materiasCarrera();
        for (MateriaCarrera materia1 : materias) {
            ids.put(materia1.getIdcm().toString(),materia1.getIdcm());
        }
        return ids;
    }

    public void setIds(LinkedHashMap<String, Integer> ids) {
        this.ids = ids;
    }
    
    
        
    public void setMatDisp(LinkedHashMap<String, Integer> matDisp) {
        this.matDisp = matDisp;
    }

    public void setCarrDisp(LinkedHashMap<String, Integer> carrDisp) {
        this.carrDisp = carrDisp;
    }

    
    public LinkedHashMap<String, Integer> getMatDisp() {
        System.out.println("Buscando Materias Disponibles");
        List<Materia> m=matLn.materias();
        for (Materia materia1 : m) {
            matDisp.put(materia1.getNombre(),materia1.getIdmateria());
        }
        return matDisp;
    }

    public LinkedHashMap<String, Integer> getCarrDisp() {
        System.out.println("Buscando Carreras Disponibles");
        List<Carrera> m=tutoriaLn.carreras();
        for (Carrera carrera : m) {
            carrDisp.put(carrera.getNombre(),carrera.getIdcarrera());
        }
        return carrDisp;
    }
    /**
     * Creates a new instance of MateriaAdm
     */
   
    
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
    

    public MateriaCarreraLn getMateriaLn() {
        return materiaLn;
    }

    public void setMateriaLn(MateriaCarreraLn materiaLn) {
        this.materiaLn = materiaLn;
    }

    public void setMaterias(List<MateriaCarrera> materias) {
        this.materias = materias;
    }

    
    public List<MateriaCarrera> getMaterias(){
        return materias;
    }
    
   public void crearMaterias(ActionEvent e){
       materias=materiaLn.materiasCarrera();
   }
    
    public MateriaCarrera getMateria(){
        return materia;
    }
    public void setMateria(MateriaCarrera materia){
        this.materia=materia;
    }
    public void crearMateria(ActionEvent e){
        materia=new MateriaCarrera();
        getMatDisp();
        getCarrDisp();
    }
    public void agregarMateria(ActionEvent e){
        materiaLn.crear(materia);
        materia=new MateriaCarrera();
    } 
    public void buscar(ActionEvent e){
        MateriaCarrera c;
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
            materia=new MateriaCarrera();
            System.out.println("Es nulo");
        }
    }
    public void cancelSearch(ActionEvent e){
        idCBuscar=0;
        materia=new MateriaCarrera();
    }
    public void editar(ActionEvent e){
            materiaLn.editar(materia);
    }
    public void eliminar(ActionEvent e){
        materiaLn.Eliminar(materia);
        materia=new  MateriaCarrera();
        idCBuscar=0;
        edit=true;
    }
    
}
