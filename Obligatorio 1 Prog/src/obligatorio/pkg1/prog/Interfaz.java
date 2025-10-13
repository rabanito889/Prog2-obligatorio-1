
package obligatorio.pkg1.prog;

import clases.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Interfaz {
    
    public static void menu(Sistema sistema){
        Scanner in = new Scanner(System.in);
        String opcion = "";
        
        while(!opcion.equals("e")){
            System.out.println("Bienvenido al Medio Tateti");
            System.out.println("A) Registrar jugador");
            System.out.println("B) Comenzar partida");
            System.out.println("C) Continuar partida");
            System.out.println("D) Mostrar Ranking");
            System.out.println("E) Terminar programa");
            
            System.out.println("Ingrese su opcion: ");
            opcion = in.nextLine().toLowerCase();
            switch (opcion){
                case "a":
                    System.out.println(sistema.getListaJugadores());
                    sistema.registrarJugador();
                    
                    break;
                case "b":
                    Tablero tab = new Tablero();
                    sistema.ordenarJugadores();
                    Partida partida = new Partida();
                    partida.empezarPartida(sistema);
                    interfazPartida(partida);
                    
                    break;
                case "c":
                    
                    break;
                case "d":
                    
                    break;
                
            }
        }
    }
    
    
   
    
    
    public static String[] leerJugada(String jugada){
        String[] movimiento = new String[3];
        if((jugada.charAt(0)+"").equalsIgnoreCase("A")){
            movimiento[0] = "1";
        }
        if((jugada.charAt(0)+"").equalsIgnoreCase("B")){
            movimiento[0] = "2";
        }
        if((jugada.charAt(0)+"").equalsIgnoreCase("C")){
            movimiento[0] = "3";
        }
        movimiento[1] = jugada.charAt(1)+"";
        movimiento[2] = jugada.charAt(2)+"";
        return movimiento;
    }
    public static void agregarFicha(String[] mov){
        String fila = mov[0];
        String columna = mov[1];
        String orientacion = mov[2];
        Partida.jugadorEnTurno();
        String jug = "";
        if(jugadorEnTurno.equals("negro")){
            jug ="N" + orientacion;
        }
        else{
            jug = "B" + orientacion;
        }
    }
    public static void interfazPartida(Partida partida){
        Scanner in = new Scanner(System.in);
        String opcion = "";
        partida.setTab(new Tablero());
        boolean si = true;
        while(!opcion.equals("X")){
            
            
            partida.getTab().mostrarTableroVisual(si);
            System.out.println("Comienza la partida, elija su jugada: ");
            opcion = in.nextLine().toUpperCase();
            if(opcion.length() == 3){
                partida.agregarJugada();
            }
            if(opcion.equals("H")){
                partida.hayjugadaGanadora();
            }
            if(opcion.equals("B")){
                si = true;
            }
            if(opcion.equals("N")){
                si = false;
            }
            if(opcion.equals("T")){
                System.out.println("Quieren empatar");
                opcion = in.nextLine();
                if(opcion.equalsIgnoreCase("si")){
                    opcion = "X";
                }
                else{
                    opcion = " ";
                }
            }
            
        }           
    }
 
    
        

}

