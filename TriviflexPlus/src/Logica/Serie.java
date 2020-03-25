/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author Shipus
 */
/**
 * param 
 * sub = subtitulos, queda como boolean solo para indicar si este contara con
 * subtitulos integrados
 * 
 */
public class Serie extends Multimedia{
    
    String temporada;
    String sub;
    String link;
    String Ncapitulo;
    int numeroCap;
    public Serie( String sub, String Ncapitulo, String genero, String autor,String link,String temporada, String nombre,int numeroCap){
        super(nombre, genero, autor);
        this.Ncapitulo=Ncapitulo;
        this.temporada = temporada;
        this.sub = sub;
        this.link=link;
        this.numeroCap=numeroCap;
    }

    public String getSub() {
        return sub;
    }

    public int getNumeroCap() {
        return numeroCap;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getNcapitulo() {
        return Ncapitulo;
    }

    public void setNcapitulo(String Ncapitulo) {
        this.Ncapitulo = Ncapitulo;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
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
