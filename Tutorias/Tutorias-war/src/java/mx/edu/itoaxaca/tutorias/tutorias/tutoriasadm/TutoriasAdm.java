/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.tutorias.tutorias.tutoriasadm;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import mx.edu.itoaxaca.tutorias.modelo.Carrera;

/**
 *
 * @author subzero
 */
@Named(value = "tutoriasAdm")
@SessionScoped
public class TutoriasAdm implements Serializable {
    private Carrera carrera;
    /**
     * Creates a new instance of TutoriasAdm
     */
    public TutoriasAdm() {
        
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

}
