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
import static Principal.Contr_peliculas.nombrePeli;
import static Principal.Main.canciones;
import static Principal.Main.peliculas;
import static Principal.Main.serie1;
import static Principal.Main.serie2;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import static javafx.scene.media.MediaPlayer.Status.PLAYING;
import javafx.scene.media.MediaView;
import javafx.util.Duration;
import static sun.audio.AudioPlayer.player;


/**
 *
 * @author Shipus
 */
public class Contr_rpeliculas implements Initializable{
    /***
     * Cargar peliculas 
     */
    
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
    private ImageView caratula;
    @FXML
    private Label Npro;
    @FXML
    private Label Nserie;
    @FXML
    private Label Ngen;
    @FXML
    private Label sub;
    @FXML
    private TextField buscar;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /**
         * Hacemos esto para identificar nuevamente la eleccion del usuario
         * de este modo se podran cargar los datos restantes 
         */
       for (int i = 0; i < peliculas.size(); i++) {
            if(nombrePeli==peliculas.get(i).getNombre()){
                media = new Media(peliculas.get(i).getLink());
                Nserie.setText(peliculas.get(i).getNombre());
                Npro.setText(peliculas.get(i).getAutor());
                Ngen.setText(peliculas.get(i).getGenero());
                sub.setText(peliculas.get(i).isSub());
                caratula.setImage(peliculas.get(i).getImagen());
            }
        }

        
        media.setOnError(() -> System.out.println("error media"));

        player = new MediaPlayer(media);
        player.setOnError(() -> System.out.println("error player"));
        
        
        
        if(view == null){
            view = new MediaView(player);
            view.setFitHeight(600);
            view.setFitWidth(1200);
            view.setPreserveRatio(false);
           
            
        }
       
        view.toFront();
        
        
       
        view.setMediaPlayer(player);
       
       
        
        
        player.setOnReady(() -> {
            volumeSlide.setValue(player.getVolume()*100);
            volumeSlide.valueProperty().addListener(new InvalidationListener(){
                @Override
                public void invalidated(Observable o) {
                    player.setVolume(volumeSlide.getValue() / 100);
                }
                
                
            });
            minD.setText("0:00");
            maxD.setText("0:00");
            // obtener metadatos, si existen
            media.getMetadata().forEach((k, v) -> System.out.println(k + ", " + v));
            
            maxD.setText(String.format("%.2f", player.getTotalDuration().toMinutes()));     
            slide.setMax(player.getTotalDuration().toSeconds());
            
            slide.valueProperty().addListener((p, o, value) -> {
                if (slide.isPressed()) {
                    player.seek(Duration.seconds(value.doubleValue()));
                }
            });

            player.currentTimeProperty().addListener((p, o, value) -> {
                slide.setValue(value.toSeconds());
                minD.setText(String.format("%.2f", value.toMinutes()));
            });
        });
        
    }
    @FXML
    private Slider volumeSlide;
    private Media media;
    private MediaPlayer player;
    @FXML
    private AnchorPane root;
    @FXML
    private Button bplay;
    @FXML
    private Button bstop;
    @FXML
    private Button bpause;
    @FXML
    private Label minD;
    @FXML
    private Label maxD;
    @FXML
    private MediaView view;

    @FXML
    private Slider slide;
    
    @FXML
    public void volver(){
        if(player.getStatus()==PLAYING){
            player.stop();
        }
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/principal.fxml"));
    }
    @FXML
    public void buscar(){
        if(player.getStatus()==PLAYING){
            player.stop();
        }
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
        if(player.getStatus()==PLAYING){
            player.stop();
        }
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/peliculas.fxml"));
    }
    @FXML
    public void series(){
        if(player.getStatus()==PLAYING){
            player.stop();
        }
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/series.fxml"));
    }
    @FXML
    public void musica(){
        if(player.getStatus()==PLAYING){
            player.stop();
        }
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/musica.fxml"));
    }   
    @FXML
    public void play(){
        if(player.getStatus()==PLAYING){
            player.play();
        }
        player.play();
    }
    @FXML
    public void stop(){
        player.stop();
    }
    @FXML
    public void pause(){
        player.pause();
    }
    /***
     * TDO
     * Actualizar con reproduccion de video
     */
}

