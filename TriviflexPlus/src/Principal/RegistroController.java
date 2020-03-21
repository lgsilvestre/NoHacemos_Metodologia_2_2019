/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author jralb
 */
public class RegistroController implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private Button b1;
    @FXML
    private Button b2;

    @FXML
    public void Crear(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/inicio.fxml"));       //aqui ve como harás la funcion para crear
    }
    @FXML
    public void Cancelar(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/inicio.fxml"));
    }   
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
}
