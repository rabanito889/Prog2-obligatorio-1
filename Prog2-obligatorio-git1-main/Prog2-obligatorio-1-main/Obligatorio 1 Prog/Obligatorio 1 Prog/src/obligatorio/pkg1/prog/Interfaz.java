
package obligatorio.pkg1.prog;

import clases.Jugador;
import clases.Sistema;
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
                    String[][] tab = new String[3][6];
                    mostrarTablero(tab);
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
    
    
        public static void mostrarTablero(String[][] tablero) {
        int filas = 3;
        int columnas = 6;

        // Encabezado
        System.out.print("     ");
        for (int j = 0; j < columnas; j++) {
            System.out.print("  " + (j + 1) + "   ");
        }
        System.out.println();

        // Por cada fila lógica (A, B, C)
        for (int i = 0; i < filas; i++) {
            char letra = (char) ('A' + i);

            // Borde superior
            System.out.println("   +-----+-----+-----+-----+-----+-----+");

            // 3 líneas por celda para formar la letra
            for (int linea = 0; linea < 3; linea++) {
                if (linea == 1) System.out.print(" " + letra + " |");
                else System.out.print("   |");

                for (int j = 0; j < columnas; j++) {
                    
                    System.out.print("     |");
                }
                System.out.println();
            }
        }
        // Último borde
        System.out.println("   +-----+-----+-----+-----+-----+-----+");
    }

    }

