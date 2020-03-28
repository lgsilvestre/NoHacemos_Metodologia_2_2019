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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author Shipus
 */
public class Contr_peliculas implements Initializable{
    @FXML
    private Pane pane;
    
    @FXML
    private Pane pane2;
    @FXML
    private Pane pane3;
    
    @FXML
    private AnchorPane root;
    
    static String nombrePeli = ""; 
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
    @FXML
    private ImageView recomendacion;
    Random rand = new Random(); //instance of random class
    int upperbound = 3;
    int int_random = rand.nextInt(upperbound); 
    @FXML
    private Label recomen;
    @FXML
    private TextField buscar;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(int_random==0){
            recomendacion.setImage(peliculas.get(int_random).getBanner());
            recomen.setText(peliculas.get(int_random).getNombre());
            
        }else if (int_random==1){
            recomendacion.setImage(peliculas.get(int_random).getBanner());
            recomen.setText(peliculas.get(int_random).getNombre());
        }else{
            recomendacion.setImage(peliculas.get(int_random).getBanner());
            recomen.setText(peliculas.get(int_random).getNombre());
        }
    }
    @FXML
    public void volver(){
     
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/principal.fxml"));
    }
    @FXML
    public void musica(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/musica.fxml"));
    }
    @FXML
    public void series(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/series.fxml"));
    }
    public void pelisas(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/peliculas.fxml"));
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
    /**
     * Como en esta parte se "elige" la pelicula le cambiamos el nombre a nuestro
     * nombre estatico de modo que sea posible distinguir en las demas ventanas la eleccion
     * del usuario
     */
    @FXML
    public void repro1(){
        nombrePeli=peliculas.get(0).getNombre();
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rpeliculas.fxml"));
    }
    @FXML
    public void repro2(){
        nombrePeli=peliculas.get(1).getNombre();
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rpeliculas.fxml"));
    }
    @FXML
    public void repro3(){
        nombrePeli=peliculas.get(2).getNombre();
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rpeliculas.fxml"));
    }
    @FXML
    public void repro4(){
        
        if(int_random==0){
            nombrePeli=peliculas.get(0).getNombre();
            SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rpeliculas.fxml"));
            
        }else if (int_random==1){
            nombrePeli=peliculas.get(1).getNombre();
            SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rpeliculas.fxml"));
        }else{
            nombrePeli=peliculas.get(2).getNombre();
            SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rpeliculas.fxml"));
        }
    }


    @FXML
    private void peliculas(ActionEvent event) {
    }
}
