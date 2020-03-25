/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import static Principal.Main.serie1;
import static Principal.Main.serie2;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    @FXML
    public void volver(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/principal.fxml"));
    }
    @FXML
    public void buscar(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/busqueda.fxml"));
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
}
