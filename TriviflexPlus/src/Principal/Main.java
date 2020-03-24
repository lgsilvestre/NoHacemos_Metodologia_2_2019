/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Logica.Musica;
import Logica.Pelicula;
import Logica.Serie;
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
    static ArrayList<Pelicula> peliculas = new ArrayList<>();
    
    static ArrayList<Serie> serie2= new ArrayList<>();
    static ArrayList<Serie> serie1= new ArrayList<>();

    static ArrayList<Musica> canciones = new ArrayList<>();
        
    public static ArrayList<Usuario> registrados = new ArrayList<>();
    
    public void start(Stage stage) throws Exception {
        /**
         * Se cargan las peliculas y se guardan en el arreglo
         * los datos de las peliculas estan en orden
         * 1.- subtitulos (indica si existen subtitulos)
         * 2.- nombre de pelicula
         * 3.- genero de la pelicula
         * 4.- director
         * 5.- link 
         */
        
        Pelicula peli1= new Pelicula("Solo canciones","Cats","Musical","Tom Hooper","https://storage.googleapis.com/iron-fountain-266419.appspot.com/Ng3LYWPmk2z.mp4");
        Pelicula peli2= new Pelicula("Sin subtitulos","Avengers Endgame","Accion","Anthony y Joe Russo","https://storage.googleapis.com/iron-fountain-266419.appspot.com/Rjo21qZak7x.mp4");
        Pelicula peli3= new Pelicula("Subtitulada al español","Deadpool 2","Accion","David Leitch","https://storage.googleapis.com/omega-pivot-269518.appspot.com/tt1431045_SUBP_HD.mp4");
        peliculas.add(peli1);
        peliculas.add(peli2);
        peliculas.add(peli3);
        /**
         * Se cargan los capitulos de la serie y se guardan en el arreglo
         * los datos de las series estan en orden
         * 1.- subtitulos (indica si existen subtitulos)
         * 2.- nombre del capitulo
         * 3.- genero de la serie
         * 4.- productora
         * 5.- link 
         * 6.- temporada
         * 7.- nombre de la serie
         */
        Serie cap1S1= new Serie("Subtitulada al español","Dio el invasor","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%201%20-%2001.mp4","temporada 1","JoJo's Bizarre Adventure: Phantom Blood");
        Serie cap2S1= new Serie("Subtitulada al español","Una carta del pasado","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%201%20-%2002.mp4","temporada 1","JoJo's Bizarre Adventure: Phantom Blood");
        Serie cap3S1= new Serie("Subtitulada al español","Juventud con Dio","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%201%20-%2003.mp4","temporada 1","JoJo's Bizarre Adventure: Phantom Blood");
        Serie cap4S1= new Serie("Subtitulada al español","Overdrive","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%201%20-%2004.mp4","temporada 1","JoJo's Bizarre Adventure: Phantom Blood");
        Serie cap5S1= new Serie("Subtitulada al español","Los caballeros oscuros","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%201%20-%2005.mp4","temporada 1","JoJo's Bizarre Adventure: Phantom Blood");
        serie1.add(cap1S1);
        serie1.add(cap2S1);
        serie1.add(cap3S1);
        serie1.add(cap4S1);
        serie1.add(cap5S1);
        
        Serie cap1S2= new Serie("Subtitulada al español","Un Hombre Poseído por un Espíritu Maligno","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%203%20-%2001.mp4","temporada 3","Jojos Bizarre Adventure: Stardust Crusaders");
        Serie cap2S2= new Serie("Subtitulada al español","¿¡Quien Será el Juez!?","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%203%20-%2002.mp4","temporada 3","Jojos Bizarre Adventure: Stardust Crusaders");
        Serie cap3S2= new Serie("Subtitulada al español","La Maldición de DIO","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%203%20-%2003.mp4","temporada 3","Jojos Bizarre Adventure: Stardust Crusaders");
        Serie cap4S2= new Serie("Subtitulada al español","Tower of Gray","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%203%20-%2004.mp4","temporada 3","Jojos Bizarre Adventure: Stardust Crusaders");
        Serie cap5S2= new Serie("Subtitulada al español","Silver Chariot","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%203%20-%2005.mp4","temporada 3","Jojos Bizarre Adventure: Stardust Crusaders");
        serie2.add(cap1S2);
        serie2.add(cap2S2);
        serie2.add(cap3S2);
        serie2.add(cap4S2);
        serie2.add(cap5S2);
        
        /**
         * Datos de la musica a cargar
         * los datos estan en orden:
         * 1.-nombre de la cancion
         * 2.-genero
         * 3.-autor
         * 4.-duracion
         * 5.- link
         */
        
        Musica cancion1 = new Musica("","","","","");
        Musica cancion2 = new Musica("","","","","");
        canciones.add(cancion1);
        canciones.add(cancion2);
        
        Usuario user1 = new Usuario("Jeremy", "1234");
        Usuario user2 = new Usuario("Shipus", "arroz");
        registrados.add(user1);
        registrados.add(user2);
        Parent  root = FXMLLoader.load(getClass().getResource("/Vistas/inicio.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        
        stage.show();
    }
     public static void main(String[] args) {
        launch(args);
    }
    
}
