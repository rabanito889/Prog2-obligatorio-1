
package obligatorio.pkg1.prog;

import clases.Ficha;
import clases.Jugador;
import clases.Sistema;
import clases.Tablero;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;


public class Obligatorio1Prog {

    
    public static void main(String[] args) {
       try{
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
       }
       catch(UnsupportedEncodingException e){
           
       }
       System.out.println("\u25CF");
       System.out.println("\u25CB");
       Sistema sistema = new Sistema();
       Interfaz in = new Interfaz();
       Jugador j1 = new Jugador("juan",18,0,0);
       Jugador j2 = new Jugador("rodri",18,0,0);
       Jugador j3 = new Jugador("pedro",18,0,0);
       Jugador j4 = new Jugador("ana",18,0,0);
       Jugador j5 = new Jugador("jose",18,0,0);
       sistema.AgregarListaJugadores(j3);
       sistema.AgregarListaJugadores(j2);
       sistema.AgregarListaJugadores(j1);
       sistema.AgregarListaJugadores(j4);
       sistema.AgregarListaJugadores(j5);
       in.menu(sistema);
       //Tablero tab = new Tablero();
       
       /*Ficha ficha = new Ficha("negro","D");
       Ficha ficha2 = new Ficha("Blanco","D");
       Ficha ficha3 = new Ficha("blanco","C");
       tab.getTab()[0][0] = ficha;
       tab.getTab()[1][3] = ficha2;
       tab.getTab()[2][5] = ficha3;
       System.out.println(tab);
       tab.mostrarTableroVisual(true);*/
       
       
        
    }
    
}
