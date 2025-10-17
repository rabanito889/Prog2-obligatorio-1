
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
                    
                    sistema.ordenarJugadores();
                    Partida partida = new Partida();
                    partida.empezarPartida(sistema);
                    boolean continua = false;
                    interfazPartida(partida, continua);
                    
                    break;
                case "c":
                    sistema.ordenarJugadores();
                    Partida parti = new Partida();
                    Tablero tabl = new Tablero();
                    parti.continuarPartida(sistema, tabl);
                    boolean cont = true;
                    interfazPartida(parti, cont);
                    break;
                case "d":
                    
                    break;
                
            }
        }
    }
    
    
   
    
    
    
    public static void interfazPartida(Partida partida, boolean continua){
        Scanner in = new Scanner(System.in);
        String opcion = "";
        if(!continua){
            partida.setTab(new Tablero());
        }
        boolean si = true;
        boolean blanco = true;
        boolean gano = false;
        String[][] s = new String[3][6];
        partida.getTab().mostrarTableroVisual(si,s);
        while(!opcion.equals("X") && !gano){
            if(blanco){
                System.out.println(" elija su jugada(TURNO BLANCO): ");
            }else{
                System.out.println(" elija su jugada(TURNO NEGRO): ");
            }
            opcion = in.nextLine().toUpperCase();
            if(opcion.length() == 3){
                partida.agregarJugada(opcion, blanco, partida.getTab());
                if(partida.getTab().verSiGanan(si)){
                   
                   if(blanco){ 
                    System.out.println("Gano blanco!!!!");
                   }
                   else{
                       System.out.println("Gano Negro!!!");
                   }
                    gano = true;
                }
                if(partida.getTab().lleno()){
                    gano = true;
                    System.out.println("Empate!!!");
                }
                if(blanco){
                    blanco = false;
                    
                }
                else{
                    blanco = true;
                }
            }
            if(opcion.equals("H")){
                partida.hayjugadaGanadora();
            }
            if(opcion.equals("B")){
                si = true;
                partida.getTab().mostrarTableroVisual(si,s);
            }
            if(opcion.equals("N")){
                si = false;
                partida.getTab().mostrarTableroVisual(si,s);
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

