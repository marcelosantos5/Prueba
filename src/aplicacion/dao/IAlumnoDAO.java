/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Alumno;
import java.util.List;

/**
 *
 * @author MARCELO
 */
public interface IAlumnoDAO {
    void crear (Alumno alumno);
    List <Alumno> obtener();
    
    void modificar (Alumno alumno);
    
}
