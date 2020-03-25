/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import static Principal.Contr_peliculas.nombrePeli;
import static Principal.Contr_series.nombreSerie;
import static Principal.Contr_series.numeroCapitulo;
import static Principal.Main.peliculas;
import static Principal.Main.serie1;
import static Principal.Main.serie2;
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

/**
 *
 * @author Shipus
 */
public class Contr_rseries implements Initializable{
    private Media media;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(nombreSerie==serie1.get(0).getNombre()){
            /**
             * agregar datos de la serie 1 luego de diferenciar el capitulo
             */
            for (int i = 0; i < serie1.size(); i++) {
                if(numeroCapitulo==serie1.get(i).getNumeroCap()){
                    media = new Media(serie1.get(i).getLink());
                    /**
                     *Cargar datos a los label del capitulo elegido
                    ***/
                    Nserie.setText(serie1.get(i).getNombre());
                    Ncap.setText(serie1.get(i).getNcapitulo());
                    Npro.setText(serie1.get(i).getAutor());
                    Ngen.setText(serie1.get(i).getGenero());
                    sub.setText(serie1.get(i).getSub());
                }else{
                    System.out.println("Error");
                }
            }
        }else{
            /**
             * agregar datos de la serie 2
             */
            for (int i = 0; i < serie2.size(); i++) {
                if(numeroCapitulo==serie2.get(i).getNumeroCap()){
                    media = new Media(serie2.get(i).getLink());
                    /**
                     *Cargar datos a los label del capitulo elegido
                    ***/
                    Nserie.setText(serie2.get(i).getNombre());
                    Ncap.setText(serie2.get(i).getNcapitulo());
                    Npro.setText(serie2.get(i).getAutor());
                    Ngen.setText(serie2.get(i).getGenero());
                    sub.setText(serie2.get(i).getSub());
                }else{
                    System.out.println("Error");
                }
            }

        }
        /**
         * Cargar datos a los labbel del costado para indicar los capitulos siguientes
         */
        if(numeroCapitulo==1){
            /**
             * Cargar label del 2,3,4,5
             */
            if(nombreSerie==serie1.get(0).getNombre()){
                Ncap1.setText(serie1.get(1).getNcapitulo());
                Ncap2.setText(serie1.get(2).getNcapitulo());
                Ncap3.setText(serie1.get(3).getNcapitulo());
                Ncap4.setText(serie1.get(4).getNcapitulo());
            }else{
                Ncap1.setText(serie2.get(1).getNcapitulo());
                Ncap2.setText(serie2.get(2).getNcapitulo());
                Ncap3.setText(serie2.get(3).getNcapitulo());
                Ncap4.setText(serie2.get(4).getNcapitulo());
            }
        }else{
            if(numeroCapitulo==2){
                /**
                 * nombre capitulos
                 * Cargar label del 1,3,4,5
                 */
                if(nombreSerie==serie1.get(0).getNombre()){
                Ncap1.setText(serie1.get(0).getNcapitulo());
                Ncap2.setText(serie1.get(2).getNcapitulo());
                Ncap3.setText(serie1.get(3).getNcapitulo());
                Ncap4.setText(serie1.get(4).getNcapitulo());
                }else{
                    Ncap1.setText(serie2.get(0).getNcapitulo());
                    Ncap2.setText(serie2.get(2).getNcapitulo());
                    Ncap3.setText(serie2.get(3).getNcapitulo());
                    Ncap4.setText(serie2.get(4).getNcapitulo());
            }
            }else{
                if(numeroCapitulo==3){
                /***
                 * cargar label del 1,2,4,5
                 */
                if(nombreSerie==serie1.get(0).getNombre()){
                Ncap1.setText(serie1.get(0).getNcapitulo());
                Ncap2.setText(serie1.get(1).getNcapitulo());
                Ncap3.setText(serie1.get(3).getNcapitulo());
                Ncap4.setText(serie1.get(4).getNcapitulo());
                }else{
                    Ncap1.setText(serie2.get(0).getNcapitulo());
                    Ncap2.setText(serie2.get(1).getNcapitulo());
                    Ncap3.setText(serie2.get(3).getNcapitulo());
                    Ncap4.setText(serie2.get(4).getNcapitulo());
            }
            }else{
                    if(numeroCapitulo==4){
                        /**
                         * cargar label del 1,2,3,5
                         */
                        if(nombreSerie==serie1.get(0).getNombre()){
                            Ncap1.setText(serie1.get(0).getNcapitulo());
                            Ncap2.setText(serie1.get(1).getNcapitulo());
                            Ncap3.setText(serie1.get(2).getNcapitulo());
                            Ncap4.setText(serie1.get(4).getNcapitulo());
                            }else{
                                Ncap1.setText(serie2.get(0).getNcapitulo());
                                Ncap2.setText(serie2.get(1).getNcapitulo());
                                Ncap3.setText(serie2.get(2).getNcapitulo());
                                Ncap4.setText(serie2.get(4).getNcapitulo());
                            }
                    }else{
                        if(numeroCapitulo==5){
                            /**
                             * Cargar label del 1,2,3,4
                             */
                            if(nombreSerie==serie1.get(0).getNombre()){
                                Ncap1.setText(serie1.get(0).getNcapitulo());
                                Ncap2.setText(serie1.get(1).getNcapitulo());
                                Ncap3.setText(serie1.get(2).getNcapitulo());
                                Ncap4.setText(serie1.get(3).getNcapitulo());
                                }else{
                                    Ncap1.setText(serie2.get(0).getNcapitulo());
                                    Ncap2.setText(serie2.get(1).getNcapitulo());
                                    Ncap3.setText(serie2.get(2).getNcapitulo());
                                    Ncap4.setText(serie2.get(3).getNcapitulo());
                                }
                        }
                    }
                }
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
    @FXML
    private AnchorPane root;
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Label Nserie;
    @FXML
    private Label Ncap;
    @FXML
    private Label Npro;
    @FXML
    private Label Ngen;
    @FXML
    private Label Ncap1;
    @FXML
    private Label Ncap2;
    @FXML
    private Label Ncap3;
    @FXML
    private Label Ncap4;
    @FXML
    private Label sub;
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
    private MediaPlayer player;
    @FXML
    private Pane paneC1;
    @FXML
    private Pane paneC2;
    @FXML
    private Pane paneC3;
    @FXML
    private Pane paneC4;
    
    @FXML
    public void volver(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/principal.fxml"));
    }
    @FXML
    public void buscar(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/busqueda.fxml"));
    }
    public void peliculas(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/peliculas.fxml"));
    }
    public void series(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/series.fxml"));
    }
    @FXML
    public void musica(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/musica.fxml"));
    }   
       public void play(){
        if(player.getStatus()==PLAYING){
            player.pause();
        }
        player.play();
    }
    @FXML
    public void stop(){
        player.stop();
    }
    @FXML
    public void series1(){
        if(numeroCapitulo==1){
            numeroCapitulo=2;
        }else{
            numeroCapitulo=1;
        }
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rseries.fxml"));
    }
    @FXML
    public void series2(){
        if(numeroCapitulo==2 || numeroCapitulo==1){
            numeroCapitulo=3;
        }else{
            numeroCapitulo=2;
        }
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rseries.fxml"));
    }
    @FXML
    public void series3(){
        if(numeroCapitulo==3 || numeroCapitulo==1 || numeroCapitulo==2){
            numeroCapitulo=4;
        }else{
            numeroCapitulo=3;
        }
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rseries.fxml"));
    }
    @FXML
    public void series4(){
        if(numeroCapitulo==4 || numeroCapitulo==3 || numeroCapitulo==2 || numeroCapitulo==1){
            numeroCapitulo=5;
        }else{
            numeroCapitulo=4;
        }
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rseries.fxml"));
    }
    

}
