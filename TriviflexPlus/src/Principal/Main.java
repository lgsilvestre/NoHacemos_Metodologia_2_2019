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
import javafx.scene.image.Image;
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
        Image caratula1 = new Image("/Recursos/cats.jpeg");
        Image banner1 = new Image("/Recursos/catsb.jpg");
        Image caratula2 = new Image("/Recursos/endgame.jpg");
        Image banner2 = new Image("/Recursos/endgameb.jpg");
        Image caratula3 = new Image("/Recursos/deadpool.jpg");
        Image banner3 = new Image("/Recursos/deadpoolb.jpg");
        peli1.setImagen(caratula1);
        peli1.setBanner(banner1);
        peli2.setImagen(caratula2);
        peli2.setBanner(banner2);
        peli3.setImagen(caratula3);
        peli3.setBanner(banner3);
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

        Serie cap1S1= new Serie("Subtitulada al español","Capitulo 1: Dio el invasor","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%201%20-%2001.mp4","temporada 1","JoJo's Bizarre Adventure: Phantom Blood",1);
        Serie cap2S1= new Serie("Subtitulada al español","Capitulo 2:Una carta del pasado","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%201%20-%2002.mp4","temporada 1","JoJo's Bizarre Adventure: Phantom Blood",2);
        Serie cap3S1= new Serie("Subtitulada al español","Capitulo 3:Juventud con Dio","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%201%20-%2003.mp4","temporada 1","JoJo's Bizarre Adventure: Phantom Blood",3);
        Serie cap4S1= new Serie("Subtitulada al español","Capitulo 4:Overdrive","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%201%20-%2004.mp4","temporada 1","JoJo's Bizarre Adventure: Phantom Blood",4);
        Serie cap5S1= new Serie("Subtitulada al español","Capitulo 5:Los caballeros oscuros","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%201%20-%2005.mp4","temporada 1","JoJo's Bizarre Adventure: Phantom Blood",5);
        Image caratula5 = new Image("/Recursos/jojophant.jpg");
        Image banner5 = new Image("/Recursos/jojophantb.jpg");
        cap1S1.setImagen(caratula5);
        cap2S1.setImagen(caratula5);
        cap3S1.setImagen(caratula5);
        cap4S1.setImagen(caratula5);
        cap5S1.setImagen(caratula5);
        cap1S1.setBanner(banner5);
        cap1S1.setBanner(banner5);
        cap1S1.setBanner(banner5);
        cap1S1.setBanner(banner5);
        cap1S1.setBanner(banner5);
        serie1.add(cap1S1);
        serie1.add(cap2S1);
        serie1.add(cap3S1);
        serie1.add(cap4S1);
        serie1.add(cap5S1);
        
        Serie cap1S2= new Serie("Subtitulada al español","Capitulo 1:Un Hombre Poseído por un Espíritu Maligno","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%203%20-%2001.mp4","temporada 3","Jojos Bizarre Adventure: Stardust Crusaders",1);
        Serie cap2S2= new Serie("Subtitulada al español","Capitulo 2:¿¡Quien Será el Juez!?","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%203%20-%2002.mp4","temporada 3","Jojos Bizarre Adventure: Stardust Crusaders",2);
        Serie cap3S2= new Serie("Subtitulada al español","Capitulo 3:La Maldición de DIO","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%203%20-%2003.mp4","temporada 3","Jojos Bizarre Adventure: Stardust Crusaders",3);
        Serie cap4S2= new Serie("Subtitulada al español","Capitulo 4:Tower of Gray","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%203%20-%2004.mp4","temporada 3","Jojos Bizarre Adventure: Stardust Crusaders",4);
        Serie cap5S2= new Serie("Subtitulada al español","Capitulo 5:Silver Chariot","Aventura","David Production","https://storage.googleapis.com/proven-reality-256313.appspot.com/Jojotos%20Part%203%20-%2005.mp4","temporada 3","Jojos Bizarre Adventure: Stardust Crusaders",5);
        Image caratula6 = new Image("/Recursos/jojostard.jpg");
        Image banner6 = new Image("/Recursos/jojostardb.jpg");
        cap1S2.setImagen(caratula6);
        cap2S2.setImagen(caratula6);
        cap3S2.setImagen(caratula6);
        cap4S2.setImagen(caratula6);
        cap5S2.setImagen(caratula6);
        cap1S2.setBanner(banner6);
        cap2S2.setBanner(banner6);
        cap3S2.setBanner(banner6);
        cap4S2.setBanner(banner6);
        cap5S2.setBanner(banner6);
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
        
        Musica cancion1 = new Musica("Megalovania","Videojuego","Toby Fox","5:13","https://dl.dropboxusercontent.com/s/mm2zi6lyvq3s7cv/Undertale-%20Megalovania.mp3");
        Musica cancion2 = new Musica("Green Hill Zone","Videojuego","Masato Nakamura","2:21","https://dl.dropboxusercontent.com/s/hk3918s5lgqy8cg/Sonic%20The%20Hedgehog%20OST%20-%20Green%20Hill%20Zone.mp3");
        Musica cancion3 = new Musica("Chemical Plant Zone","Videojuego","Masato Nakamura","2:11","https://dl.dropboxusercontent.com/s/sygm3x7cravouya/Sonic%202%20Music%20Chemical%20Plant%20Zone.mp3");
        Musica cancion4 = new Musica("Gerudo Valley","Videojuego","Kōji Kondō","2:55","https://dl.dropboxusercontent.com/s/srkqxin59eh5vk0/Gerudo%20Valley%20-%20The%20Legend%20of%20Zelda%20Ocarina%20Of%20Time.mp3");
        Image caratula7 = new Image("/Recursos/Megalovania.jpg");
        Image banner7 = new Image("/Recursos/undertalee.jpg");
        Image caratula8 = new Image("/Recursos/green.jpg");
        Image banner8 = new Image("/Recursos/green.jpg");
        Image caratula9 = new Image("/Recursos/plant.jpg");
        Image banner9 = new Image("/Recursos/plant.jpg");
        Image caratula10 = new Image("/Recursos/gerudo.jpg");
        Image banner10 = new Image("/Recursos/gerudo.jpg");
        cancion1.setImagen(caratula7);
        cancion1.setBanner(banner7);
        cancion2.setImagen(caratula8);
        cancion2.setBanner(banner8);
        cancion3.setImagen(caratula9);
        cancion3.setBanner(banner9);
        cancion4.setImagen(caratula10);
        cancion4.setBanner(banner10);
        canciones.add(cancion1);
        canciones.add(cancion2);
        canciones.add(cancion3);
        canciones.add(cancion4);
        
        Usuario user1 = new Usuario("Jeremy", "1234");
        Usuario user2 = new Usuario("Shipus", "arroz");
        Usuario user3 = new Usuario("a", "a");
        registrados.add(user1);
        registrados.add(user2);
        registrados.add(user3);
        Parent  root = FXMLLoader.load(getClass().getResource("/Vistas/inicio.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        //stage.setResizable(false);
        
        stage.show();
    }
     public static void main(String[] args) {
        launch(args);
    }
    
}
