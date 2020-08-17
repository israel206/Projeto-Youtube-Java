/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author Mr-Robot
 */
public class ProjetoYouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        Usuarios u[] = new Usuarios[2];
        u[0] = new Usuarios("Israel", 22, "M", "isra");
        u[1] = new Usuarios("Angela", 25, "F", "angel");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(u[0], v[2]);//israel assistindo HTML5
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(u[0], v[1]);//israel assistindo PHP
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
        /*System.out.println("VIDEOS\n--------------------------->");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nUSUARIOS\n----------------------->");
        System.out.println(u[0].toString());
        System.out.println(u[1].toString());*/
    }
    
}
