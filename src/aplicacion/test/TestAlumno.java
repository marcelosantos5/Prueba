/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.IAlumnoDAO;
import aplicacion.dao.imp.AlumnoListDAOImp;
import aplicacion.modelo.dominio.Alumno;

/**
 *
 * @author MARCELO
 */
public class TestAlumno {
    public static void main(String[] args) {
        Alumno santos = new Alumno();
        santos.setApellido("Santos");
        santos.setLu("3374");
        
        
        
        Alumno miranda = new Alumno("3332","Miranda");
        
        
        IAlumnoDAO alumnoDao = new AlumnoListDAOImp();
        alumnoDao.crear(santos);
        alumnoDao.crear(miranda);
        santos.setApellido("cosa");
        alumnoDao.crear(santos);
        
        Alumno mirandia = new Alumno("3332", "Mira");
        alumnoDao.modificar(mirandia);
        
        for (Alumno a : alumnoDao.obtener()){
            System.out.println("LU: "+ a.getLu()+ " apellido: "+ a.getApellido()); 
        }
        
        
        
    }
}
