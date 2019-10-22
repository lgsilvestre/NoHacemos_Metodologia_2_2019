/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.ConditionalFeature.FXML;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 *
 * @author Shipus
 */
public class Contr_iniciofx implements Initializable  {
    @FXML
    private AnchorPane root;
    
    @FXML
    private Button prueba1;
     @FXML
    private Button iSesion;
     @FXML
    private Button Nuser;
     
     
   @FXML
   public void sesion(){
       
       SceneHandler.cargarVista(root, getClass().getResource("/Vistas/principal.fxml"));
   }
   @FXML
   public void newUser(){
       
       SceneHandler.cargarVista(root, getClass().getResource("/Vistas/registro.fxml"));
   }
   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}
