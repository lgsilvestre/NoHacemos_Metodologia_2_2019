/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Logica.Musica;
import Logica.Pelicula;
import Logica.Serie;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author Shipus
 */
public class Contr_busqueda implements Initializable{
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
    
    @FXML
    private TableView<Musica> t1;
    
    @FXML
    private TableColumn nombre1;
    
    @FXML
    private TableColumn duracion1;
    
    @FXML
    private TableColumn artista1;
    
    @FXML
    private TableView<Pelicula> t2;
    
    @FXML
    private TableColumn nombre2;
    
    @FXML
    private TableColumn duracion2;
    
    @FXML
    private TableColumn artista2;
    
    @FXML
    private TableView<Serie> t3;
    
    @FXML
    private TableColumn nombre3;
    
    @FXML
    private TableColumn duracion3;
    
    @FXML
    private TableColumn artista3;
    
    

    
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
    
    /**
     * TDO
     * Agregar tablas con los resultados previstos
     * Ya sea con mayus, primer en mayus o todo en minus.
     */
}
