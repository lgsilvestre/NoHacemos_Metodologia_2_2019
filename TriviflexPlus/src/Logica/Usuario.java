/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Shipus
 */
public class Usuario {
    String nombre;
    String pass;

    public Usuario(String nombre, String pass) {
        this.nombre = nombre;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return pass;
    }

    public void setClave(String pass) {
        this.pass = pass;
    }
    /**
     * Dejar lista para historial
     */
    
    
}
