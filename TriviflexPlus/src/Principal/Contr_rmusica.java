/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import static javafx.scene.media.MediaPlayer.Status.PLAYING;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

/**
 *
 * @author Shipus
 */
public class Contr_rmusica implements Initializable{
    @FXML
    private AnchorPane root;
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
    private Media media;
    @FXML
    private Slider slide;
    @FXML
    private Label minD;
    @FXML
    private Label maxD;
    @FXML
    private Button bplay;
    @FXML
    private Button bstop;
    private MediaPlayer player;
    private MediaView view;
    @FXML
    private ImageView caratula;
    File file1= new File("src/Recursos/Megalovania.jpg");
    File file2= new File("src/Recursos/Chemical Plant Zone.jpg");
    File file3= new File("src/Recursos/Green Hill Zone.png");
    File file4= new File("src/Recursos/Gerudo Valley.jpg");
    private Image imgSerie1 = new Image(file1.toURI().toString());
    private Image imgSerie2= new Image(file2.toURI().toString());
    private Image imgSerie3= new Image(file3.toURI().toString());
    private Image imgSerie4= new Image(file4.toURI().toString());
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for (int i = 0; i < Main.canciones.size(); i++) {
            if(Contr_musica.nombre.equals(Main.canciones.get(i).getNombre())){
                media = new Media(Main.canciones.get(i).getLink());
                if(Contr_musica.nombre.equals("Megalovania")){
                    caratula.setImage(imgSerie1);
                }else if(Contr_musica.nombre.equals("Chemical Plant Zone")){
                    caratula.setImage(imgSerie2);
                }else if(Contr_musica.nombre.equals("Green Hill Zone")){
                    caratula.setImage(imgSerie3);
                }else{
                    caratula.setImage(imgSerie4);
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
    /**
     * TDO
     * Agregar reproduccion de musica 
     * Agregar lista de reproduccion en relacion a la seleccion elegida
     */
    
}
