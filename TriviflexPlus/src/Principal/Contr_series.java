/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Logica.Musica;
import Logica.Pelicula;
import Logica.Serie;
import static Principal.Contr_busqueda.peliculaObservable;
import static Principal.Main.canciones;
import static Principal.Main.peliculas;
import static Principal.Main.serie1;
import static Principal.Main.serie2;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author Shipus
 */
public class Contr_series implements Initializable{
    @FXML
    private AnchorPane root;
    @FXML
    private Pane pane;
    @FXML
    private Pane pane2;
    @FXML
    private Button b51;
    @FXML
    private Button b11;
    @FXML
    private Button b111;
    @FXML
    private Button b112;
    @FXML
    private Button b113;
    
    static String nombreSerie="";
    static int numeroCapitulo=1;
    
    
    @FXML
    private ImageView recomendacions;
    @FXML
    private Pane recomendacion;
    Random rand = new Random(); //instance of random class
    int upperbound = 2;
    int int_random = rand.nextInt(upperbound); 
    @FXML
    private Label recomen;
    @FXML
    private TextField buscar;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        if(int_random==0){
            recomendacions.setImage(serie1.get(int_random).getBanner());
            recomen.setText(serie1.get(int_random).getNombre());
        }else{
            recomendacions.setImage(serie2.get(int_random).getBanner());
            recomen.setText(serie2.get(int_random).getNombre());
        }
        
    }
    @FXML
    public void volver(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/principal.fxml"));
    }
    @FXML
    public void buscar(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/busqueda.fxml"));
       
        
        String eu =buscar.getText();
        
        for (int i = 0; i < peliculas.size(); i++) {
            String buscarr = peliculas.get(i).getNombre();
            String[] palabras1 = buscarr.split("\\s+");
            for ( String palabra : palabras1){
                if (eu.contains(palabra)) {
                    Pelicula song = peliculas.get(i);
                    System.out.println("Encontrado en peliculas");
                    System.out.println(palabra);
                    peliculaObservable.add(song);
                    
                    
                }
            }
        }
        
        for (int i = 0; i < serie1.size(); i++) {
            String buscarr = serie1.get(i).getNombre();
            String[] palabras1 = buscarr.split("\\s+");
            for ( String palabra : palabras1){
                if (eu.contains(palabra)) {
                    Serie song = serie1.get(i);
                    System.out.println("Encontrado en series1");
                    System.out.println(palabra);
                    peliculaObservable.add(song);
                    
                }
            }
        }
        
        for (int i = 0; i < serie2.size(); i++) {
            String buscarr = serie2.get(i).getNombre();
            String[] palabras1 = buscarr.split("\\s+");
            for ( String palabra : palabras1){
                if (eu.contains(palabra)) {
                    Serie song = serie2.get(i);
                    System.out.println("Encontrado en series1");
                    System.out.println(palabra);
                    peliculaObservable.add(song);
                    
                }
            }
        }
        
        for (int i = 0; i < canciones.size(); i++) {
            String buscarr = canciones.get(i).getNombre();
            String[] palabras1 = buscarr.split("\\s+");
            for ( String palabra : palabras1){
                if (eu.contains(palabra)) {
                    Musica song = canciones.get(i);
                    System.out.println("Encontrado en canciones");
                    peliculaObservable.add(song);

                    
                    
                }
            }
        }
        
   
    }
    @FXML
    public void peliculas(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/peliculas.fxml"));
    }
    @FXML
    public void series(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/series.fxml"));
    }
    @FXML
    public void musica(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/musica.fxml"));
    }   
    @FXML
    public void repro(){
        nombreSerie=serie1.get(0).getNombre();
        numeroCapitulo=serie1.get(0).getNumeroCap();
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rseries.fxml"));
    }
    @FXML
    public void repro2(){
        nombreSerie=serie2.get(0).getNombre();
        numeroCapitulo=serie2.get(0).getNumeroCap();
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rseries.fxml"));
    }
    
    @FXML
    public void repro3(){
        if (int_random==0) {
            nombreSerie=serie1.get(0).getNombre();
            numeroCapitulo=serie1.get(0).getNumeroCap();
            SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rseries.fxml"));
        }else{
            nombreSerie=serie2.get(0).getNombre();
            numeroCapitulo=serie2.get(0).getNumeroCap();
            SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rseries.fxml"));
            
        }
        
    }
}
