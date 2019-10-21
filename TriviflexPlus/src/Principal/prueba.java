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
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import static javafx.scene.media.MediaPlayer.Status.PLAYING;
import javafx.scene.media.MediaView;

/**
 *
 * @author Shipus
 */
public class prueba implements Initializable {
    @FXML
    private AnchorPane root;
    @FXML
    private Button play;
    @FXML
    private Button stop;
    @FXML
    private MediaView mv;
    
    MediaPlayer mediaplayer;
   
   
    @Override
    public void initialize(URL url, ResourceBundle rb){
       String Vurl= ("/Recursos/bueno.flv");
        Media media=new Media(Vurl);
        
        MediaPlayer mp = new MediaPlayer(media);
        mv.setMediaPlayer(mp);
    }
    @FXML
    public void start(){
        if(mediaplayer.getStatus()==PLAYING){
            mediaplayer.pause();
        }
        else{
            mediaplayer.play();
        }
    
    }
    @FXML
    public void stop(){
        mediaplayer.stop();
    }
}
