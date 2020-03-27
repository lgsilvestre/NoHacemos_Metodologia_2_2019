/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Logica.Musica;
import Logica.Pelicula;
import Logica.Serie;
import static Principal.Main.canciones;
import static Principal.Main.peliculas;
import static Principal.Main.serie1;
import static Principal.Main.serie2;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private TextField textfield;
    
    public ObservableList<Object> peliculaObservable = FXCollections.observableArrayList();

    @FXML
    private TableView<Object> peliculast;
    @FXML
    private TableColumn nombre;
    @FXML
    private TableColumn tipo;
    
    
    

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //peliculaObservable.clear();
        peliculast.setEditable(true);
        nombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        tipo.setCellValueFactory(new PropertyValueFactory<>("Tipo"));
        peliculaObservable.add(serie1.get(0));
        peliculaObservable.add(serie2.get(1));
        peliculaObservable.add(peliculas.get(0));
        peliculaObservable.add(peliculas.get(1));
        peliculaObservable.add(peliculas.get(2));
        if (peliculaObservable.size()==6) {
            System.out.println(peliculaObservable.get(5).toString());
        }
        
        peliculast.setItems(peliculaObservable);
        
        
        
        textfield.setText("");
    }
    @FXML
    public void volver(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/principal.fxml"));
    }
    @FXML
    public void buscar(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/busqueda.fxml"));

        String eu =textfield.getText();
        
        for (int i = 0; i < peliculas.size(); i++) {
            String buscarr = peliculas.get(i).getNombre();
            String[] palabras1 = buscarr.split("\\s+");
            for ( String palabra : palabras1){
                if (eu.contains(palabra)) {
                    System.out.println("Encontrado en peliculas");
                    System.out.println(palabra);
                    
                    
                }
            }
        }
        
        for (int i = 0; i < serie1.size(); i++) {
            String buscarr = serie1.get(i).getNombre();
            String[] palabras1 = buscarr.split("\\s+");
            for ( String palabra : palabras1){
                if (eu.contains(palabra)) {
                    System.out.println("Encontrado en series1");
                    System.out.println(palabra);
                    
                }
            }
        }
        
        for (int i = 0; i < serie2.size(); i++) {
            String buscarr = serie2.get(i).getNombre();
            String[] palabras1 = buscarr.split("\\s+");
            for ( String palabra : palabras1){
                if (eu.contains(palabra)) {
                    System.out.println("Encontrado en series1");
                    System.out.println(palabra);
                    
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
                    System.out.println(palabra);
                    System.out.println(song.getNombre());
                    System.out.println(song.getDuracion());
                    
                    
                }
            }
        }
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
