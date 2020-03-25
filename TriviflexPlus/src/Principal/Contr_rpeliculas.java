/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Logica.Pelicula;
import static Principal.Contr_peliculas.nombrePeli;
import static Principal.Main.peliculas;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
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
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /**
         * Hacemos esto para identificar nuevamente la eleccion del usuario
         * de este modo se podran cargar los datos restantes 
         */
       for (int i = 0; i < peliculas.size(); i++) {
            if(nombrePeli==peliculas.get(i).getNombre()){
                media = new Media(peliculas.get(i).getLink());
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
    private Media media;
    private MediaPlayer player;
    @FXML
    private AnchorPane root;
    @FXML
    private Button bplay;
    @FXML
    private Button bstop;
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
            player.stop();
        }
        player.play();
    }
    @FXML
    public void stop(){
        player.stop();
    }

    /***
     * TDO
     * Actualizar con reproduccion de video
     */
}

