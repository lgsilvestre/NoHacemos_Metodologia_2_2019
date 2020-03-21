/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Logica.Usuario;
import Principal.SceneHandler;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author jralb
 */
public class Contr_registro implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private TextField user;
    @FXML
    private TextField pass;
    @FXML
    private TextField validarPass;
    String userIngresado;
    String passIngresado;
    String validarIngresado;

    @FXML
    public void Crear(){
        userIngresado = user.getText();
        passIngresado = pass.getText();
        validarIngresado = validarPass.getText();
        boolean validar = true;
        if(userIngresado.equals("")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Informacion");
            alert.setHeaderText(null);
            alert.setContentText("El user no puede estar vacio.");
            alert.showAndWait();
            validar = false;
        }
        if(passIngresado.equals("")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Informacion");
            alert.setHeaderText(null);
            alert.setContentText("El pass no puede estar vacio.");
            alert.showAndWait();
            validar = false;
        }
        if(validarIngresado.equals("")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Informacion");
            alert.setHeaderText(null);
            alert.setContentText("El pass de verificacion no puede estar vacio.");
            alert.showAndWait();
            validar = false;
        }
        if(passIngresado.equals(validarIngresado)){
            for (int i = 0; i < Main.registrados.size(); i++) {
                if(userIngresado.equals(Main.registrados.get(i).getNombre())){
                    validar = false;
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Informacion");
                    alert2.setHeaderText(null);
                    alert2.setContentText("El user ingresado ya existen en el sistema.");
                    alert2.showAndWait();
                }
            }
        }else{
            Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
            alert2.setTitle("Informacion");
            alert2.setHeaderText(null);
            alert2.setContentText("Los passwords ingresados no coinciden.");
            alert2.showAndWait();
            validar = false;
        }
        if(validar){
            Usuario user = new Usuario(userIngresado, passIngresado);
            Main.registrados.add(user);
            SceneHandler.cargarVista(root, getClass().getResource("/Vistas/inicio.fxml"));
        }
    }
    @FXML
    public void Cancelar(){
        SceneHandler.cargarVista(root, getClass().getResource("/Vistas/inicio.fxml"));
    }   
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
}
