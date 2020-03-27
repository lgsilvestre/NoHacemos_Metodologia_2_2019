/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import com.sun.javafx.scene.control.behavior.PasswordFieldBehavior;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
    private Button iSesion;
     @FXML
    private Button Nuser;
     @FXML
    private TextField nombre;
     @FXML
    private PasswordField pass;
     
     
   @FXML
   public void sesion(){
       String nombreIngresado = nombre.getText();
       String passIngresado = pass.getText();
       boolean estaEnSistema = false;
       estaEnSistema = estaEnSistema(nombreIngresado, passIngresado, estaEnSistema);
       if(estaEnSistema){
           SceneHandler.cargarVista(root, getClass().getResource("/Vistas/principal.fxml"));
       }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Informacion");
            alert.setHeaderText(null);
            alert.setContentText("El usuario o el pass ingresados son incorrectos");
            alert.showAndWait();
       } 
   }
   @FXML
   public void newUser(){
       
       SceneHandler.cargarVista(root, getClass().getResource("/Vistas/registro.fxml"));
   }
   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
    public boolean estaEnSistema(String nombre, String pass, boolean verificar){
        for (int i = 0; i < Main.registrados.size(); i++) {
            if(nombre.equals(Main.registrados.get(i).getNombre())){
                if(pass.equals(Main.registrados.get(i).getClave())){
                    verificar = true;
                    return verificar;
                }
            }
        }
        return verificar;
    }
}
