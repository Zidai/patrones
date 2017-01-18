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
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
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
@Named(value = "tutoriaAdm")
@SessionScoped
public class TutoriaAdm implements Serializable {

    @EJB
    private TutoriaLn tutoriaLn;
    private Carrera carrera;
    private List<Carrera> carreras;
    private int idCBuscar;
    private boolean edit;
    private LinkedHashMap ids;
    
    @EJB
    private MateriaCarreraLn materiaLn;
    private List<MateriaCarrera> materias;
    private List<Materia> materiasaux;
    private MateriaCarrera matCarr;
    private LinkedHashMap<String,Integer> matDisp;
    
    @EJB
    private MateriaLn mate;
    
    private String vista;

    private List<SelectItem> mateAux;

    public void setMateAux(List<SelectItem> mateAux) {
        this.mateAux = mateAux;
    }
   
    

    public String getVista() {
        return vista;
    }

    public void setVista(String vista) {
        this.vista = vista;
    }
    
    

    public MateriaCarrera getMatCarr() {
        return matCarr;
    }

    public void setMatCarr(MateriaCarrera matCarr) {
        this.matCarr = matCarr;
    }
    
    
    
    public MateriaCarreraLn getMateriaLn(){    
        return materiaLn;
    }

    /**
     * Creates a new instance of TutoriaAdm
     */
    public List<MateriaCarrera> getMaterias() {
        verMaterias();
        return materias;
    }
    public List<Materia> getMateriasAux() {
        return materiasaux;
    }

    public void setMateriaLn(MateriaCarreraLn materiaLn) {
        this.materiaLn = materiaLn;
    }

    public void setMaterias(List<MateriaCarrera> materias) {
        this.materias = materias;
    }
    public void setMateriasAux(List<Materia> materias) {
        this.materiasaux = materias;
    }
    
    public List<SelectItem> getMateAux() {
        //mateAux.clear();
        mateAux=new ArrayList<SelectItem>();
        
        List<MateriaCarrera> m=materiaLn.materiasCarrera();
        List<MateriaCarrera> m2=new ArrayList<>();
        try{
            for (MateriaCarrera mc : m) {
                if (mc.getIdcarrera()==carrera.getIdcarrera()) {
                    m2.add(mc);
                }
            }
            int j=1;
            for (j = 1; j <11; j++) {
                ArrayList<MateriaCarrera> laux=new ArrayList<>();
                for(MateriaCarrera mc2:m2){
                    if (mc2.getSemestre()==j) {
                        laux.add(mc2);
                    }
                }
                System.out.println("laux size:"+laux.size());
                if(laux.size()>0){
                    SelectItemGroup g=new SelectItemGroup("Semestre "+j);
                    SelectItem [] items=new SelectItem[laux.size()];
                    int i=0;
                    for (MateriaCarrera mat4 : laux) {
                        items[i]=new SelectItem(mat4.getIdmateria(),mate.buscar(mat4.getIdmateria()).getNombre());
                        i++;
                    }
                    g.setSelectItems(items);
                    mateAux.add(g);
                }
            
            }
        }
        catch(Exception e){
            System.out.println("Error al cargar materias");
            carrera=new Carrera();
        }
        return mateAux;
    }
    public void verMaterias() {
        materiasaux.clear();
        List<MateriaCarrera> m=materiaLn.materiasCarrera();
        materiasaux=new ArrayList<Materia>();
        System.out.println("long mat:"+m.size());
            for(MateriaCarrera matcar : m) {
                if(matcar.getIdcarrera()==carrera.getIdcarrera()){
                    Materia mo=mate.buscar(matcar.getIdmateria());
                    materiasaux.add(mo);
                    //System.out.println(m.getNombre());
                }
            }
            System.out.println("termino buscar materias"+" "+materiasaux.size());
        }
    
    public void cambio(ValueChangeEvent e) {
        Carrera c;
        carrera.setIdcarrera((Integer)e.getNewValue());
        c=tutoriaLn.buscar(carrera.getIdcarrera());
        if(c!=null){
            edit=false;
            this.carrera=c;
            this.idCBuscar=carrera.getIdcarrera();
            System.out.println("No es nulo "+carrera.getNombre()+" id:"+carrera.getIdcarrera());
            //verMaterias();
            //verMaterias2();
        }
        else{
            edit=true;
            this.carrera=new Carrera();
            System.out.println("Es nulo "+carrera.getIdcarrera());
        }
        
        
    }
    public void llenarIds(){
        carreras=tutoriaLn.carreras();
        ids=new LinkedHashMap<String,Integer>();
        ids.put("Seleccione",0);
        for (Carrera carrera1 : carreras) {
            ids.put(carrera1.getNombre(),carrera1.getIdcarrera());
        }
        idCBuscar=carreras.get(0).getIdcarrera();
    }
    
    
    public  LinkedHashMap<String,Integer> getIds(){
        llenarIds();
        return ids;
    }
    public void setIds( LinkedHashMap<String,Integer> s){
        ids=s;
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
    

    public TutoriaLn getTutoriaLn() {
        return tutoriaLn;
    }

    public void setTutoriaLn(TutoriaLn tutoriaLn) {
        this.tutoriaLn = tutoriaLn;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    public TutoriaAdm() {
        vista="";
        carreras=new ArrayList<Carrera>();
        idCBuscar=0;
        edit=true;
        matDisp=new LinkedHashMap<String,Integer>();
        materiasaux=new ArrayList<Materia>();
        mateAux=new ArrayList<SelectItem>();
        //carreras=tutoriaLn.carreras();
    }
    
    public List<Carrera> getCarreras(){
        return carreras;
    }
    
   public void crearCarreras(ActionEvent e){
       carreras=tutoriaLn.carreras();
   }
    
    public Carrera getCarrera(){
        return carrera;
    }
    public void setCarrera(Carrera carrera){
        this.carrera=carrera;
    }
    public void crearCarrera(ActionEvent e){
        carrera=new Carrera();
    }
    public void crearBuscarCarr(ActionEvent e){
        carrera=new Carrera();
        edit=true;
    }
    public void agregarCarrera(ActionEvent e){
        FacesContext contexto=FacesContext.getCurrentInstance();
        FacesMessage mensaje;
        List<Carrera> c=tutoriaLn.carreras();
        boolean x=true;
        for (Carrera carrera1 : c) {
            if(carrera1.getNombre().equalsIgnoreCase(carrera.getNombre())){
                x=false;
                vista="carrera";
                mensaje=new FacesMessage("La carrera ya existe");
                contexto.addMessage(null, mensaje);
            }
        }
        if(x){
            vista="carrera";
            tutoriaLn.crear(carrera);
        }
        
        carrera=new Carrera();
    } 
    public void buscar(ActionEvent e){
        System.out.println("idBuscar:"+idCBuscar);
        Carrera c;
        c=tutoriaLn.buscar(idCBuscar);
        System.out.println("********************************************");
        System.out.println("buscando..........");
        if(c!=null){
            edit=false;
            carrera=c;
            System.out.println("No Es nulo");
        }
        else{
            edit=true;
            carrera=new Carrera();
            System.out.println("Es nulo");
        }
    }
    
    
    
    public void cancelSearch(ActionEvent e){
        idCBuscar=0;
        carrera=new Carrera();
    }
    public void editar(ActionEvent e){
            tutoriaLn.editar(carrera);
    }
    public void eliminar(ActionEvent e){
        tutoriaLn.Eliminar(carrera);
        carrera=new  Carrera();
        idCBuscar=0;
        edit=true;
    }
    
    

    public LinkedHashMap<String, Integer> getMatDisp() {
        matDisp.clear();
        ArrayList<Integer> ma=new ArrayList();
        List<MateriaCarrera> mc=materiaLn.materiasCarrera();
        for (MateriaCarrera materiaCarrera : mc){
            if(materiaCarrera.getIdcarrera()==carrera.getIdcarrera()){
                ma.add(materiaCarrera.getIdmateria());
                System.out.println("ma:"+materiaCarrera.getIdmateria());
            }
        }
        
        List<Materia> m=mate.materias();
        for (Materia mat : m) {
            if(ma.indexOf(mat.getIdmateria())<0){
                matDisp.put(mat.getNombre(),mat.getIdmateria());
                System.out.println("nombre:"+mat.getNombre());
            }
        }
        
        
        return matDisp;
    }

    public void setMatDisp(LinkedHashMap<String, Integer> matDisp) {
        this.matDisp = matDisp;
    }
    
    public void crearMatCarr(ActionEvent e){
        matCarr=new MateriaCarrera();
        matCarr.setIdcarrera(carrera.getIdcarrera());
    }
    public void agregarMateria(ActionEvent e){
        FacesContext contexto=FacesContext.getCurrentInstance();
        FacesMessage mensaje;
        int cred=tutoriaLn.buscar(matCarr.getIdcarrera()).getCreditos();
        List<MateriaCarrera> m=materiaLn.materiasCarrera();
        System.out.println("Creditos totales"+cred);
        int credactual=0;
        for (MateriaCarrera mc : m) {
            if(mc.getIdcarrera()==matCarr.getIdcarrera()){
                credactual+=mate.buscar(mc.getIdmateria()).getCreditos();
            }
        }
        credactual+=mate.buscar(matCarr.getIdmateria()).getCreditos();
        System.out.println("cred actual:"+credactual);
        if(credactual<=cred){
            materiaLn.crear(matCarr);
        }
        else{
            mensaje=new FacesMessage("La materia no se pudo agregar sobrepasa el numero de creditos");
            contexto.addMessage("mMatCad", mensaje);
        }
        //materiaLn.crear(matCarr);
        matCarr=new MateriaCarrera();
    }
}
