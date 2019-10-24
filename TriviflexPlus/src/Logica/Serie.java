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
/**
 * param 
 * sub = subtitulos, queda como boolean solo para indicar si este contara con
 * subtitulos integrados
 * 
 */
public class Serie extends Multimedia{
    String reparto;
    String temporada;
    boolean sub;

    public Serie(String reparto, String temporada, boolean sub, String nombre, String genero, String autor) {
        super(nombre, genero, autor);
        this.reparto = reparto;
        this.temporada = temporada;
        this.sub = sub;
    }

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public boolean isSub() {
        return sub;
    }

    public void setSub(boolean sub) {
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
    /**
     * Queda vacio por el momento, se espera que este busque las temporadas 
     * relacionadas a esta serie
     */
    public void buscarTemporadas(){
    }
    
}
