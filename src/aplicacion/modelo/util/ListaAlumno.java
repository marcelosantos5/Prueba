/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Alumno;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARCELO
 */
public class ListaAlumno implements Serializable{
    private List<Alumno> alumnos;

    public ListaAlumno() {
        alumnos = new ArrayList();
    }
    /**
     * permite agregar un objeto tipo  alumno
     * a alumnos
     * @param alumno el alumno a agregar
     */
    public void agregarAlumno (Alumno alumno){
        Alumno aluAuxiliar =new Alumno();
        aluAuxiliar.setApellido(alumno.getApellido());
        aluAuxiliar.setLu(alumno.getLu());
        alumnos.add(aluAuxiliar);
    }
    
   
    
    
    

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void modificar(Alumno alumno){
        for (int i=0 ; i< alumnos.size(); i++){
            if (alumnos.get(i).getLu().equals(alumno.getLu())){
                alumnos.set(i, alumno);
            }
        }
    }
    
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    
    
}
