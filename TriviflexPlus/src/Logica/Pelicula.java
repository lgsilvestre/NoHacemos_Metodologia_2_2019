/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javafx.scene.image.Image;

/**
 *
 * @author Shipus
 */
public class Pelicula extends Multimedia{
    String sub;
   
    String link;
    Image imagen;
    Image banner;
    String tipo;
    public Pelicula(String sub, String nombre, String genero, String autor, String link) {
        super(nombre, genero, autor);
        this.sub = sub;
        
        this.link=link;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public Image getBanner() {
        return banner;
    }

    public void setBanner(Image banner) {
        this.banner = banner;
    }
    
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String isSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
