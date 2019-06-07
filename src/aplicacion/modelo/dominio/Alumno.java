/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author MARCELO
 */
public class Alumno implements Serializable {
    private String lu;
    private String apellido;

    public Alumno() {
    }

    public Alumno(String lu, String apellido) {
        this.lu = lu;
        this.apellido = apellido;
    }

    public String getLu() {
        return lu;
    }

    public void setLu(String lu) {
        this.lu = lu;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
