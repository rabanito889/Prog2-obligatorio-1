
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
                    sistema.setListaJugadores(registrarJugador(sistema));
                    
                    break;
                case "b":
                    Tablero tab = new Tablero();
                    
                    tab.mostrarTableroVisual(true);
                    break;
                case "c":
                    
                    break;
                case "d":
                    
                    break;
                
            }
        }
    }
    
    
   
    public static Jugador registrarJugador(Sistema sis) {
        boolean ok = false;
        
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int edad = 0;
        if (sis.getListaJugadores().isEmpty()) {
            System.out.println("Ingrese su nombre: ");
            nombre = in.nextLine();
            System.out.println("Ingrese edad: ");
            edad = in.nextInt();
        } 
        else {
            while (!ok) {
                System.out.println("Ingrese su nombre: ");
                nombre = in.nextLine();
                
                boolean existe = false;
                for (Jugador jugador : sis.getListaJugadores()) {
                    if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                        existe = true;
                    }
                }
                if (existe) {
                    System.out.println("Ese nombre ya existe. Pruebe de nuevo");
                } 
                else {
                    ok = true;
                }
                
            }
            System.out.println("Ingrese edad: ");
                edad = in.nextInt();
        }
        Jugador jugador = new Jugador(nombre, edad, 0, 0);
        return jugador;
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
    
    
        

}

