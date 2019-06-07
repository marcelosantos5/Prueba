/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IAlumnoDAO;
import aplicacion.modelo.dominio.Alumno;
import aplicacion.modelo.util.ListaAlumno;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author MARCELO
 */
public class AlumnoListDAOImp implements Serializable, IAlumnoDAO{
    private ListaAlumno listaAlumno;

    public AlumnoListDAOImp() {
        listaAlumno = new ListaAlumno();
    }
    

    @Override
    public void crear(Alumno alumno) {
        listaAlumno.agregarAlumno(alumno);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumno> obtener() {
        return listaAlumno.getAlumnos();
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Alumno alumno) {
        listaAlumno.modificar(alumno);
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
