/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
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
    }
    @FXML
    public void repro1(){
        nombrePeli="bueno";
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rpeliculas.fxml"));
    }
    @FXML
    public void repro2(){
        nombrePeli="bruh";
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/rpeliculas.fxml"));
    }


    @FXML
    private void peliculas(ActionEvent event) {
    }
}
