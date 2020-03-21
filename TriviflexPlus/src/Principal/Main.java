/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Logica.Usuario;
import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Shipus
 */
public class Main extends Application{
    
    public static ArrayList<Usuario> registrados = new ArrayList<>();
    
    public void start(Stage stage) throws Exception {
        Usuario user1 = new Usuario("Jeremy", "1234");
        Usuario user2 = new Usuario("Shipus", "arroz");
        registrados.add(user1);
        registrados.add(user2);
        Parent  root = FXMLLoader.load(getClass().getResource("/Vistas/inicio.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setMinWidth(1300);
        stage.setMinHeight(720);
        stage.setResizable(false);
        
        stage.show();
    }
     public static void main(String[] args) {
        launch(args);
    }
    
}
