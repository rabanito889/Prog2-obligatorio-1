
package clases;

import java.util.Scanner;


public class Partida {
    private Tablero tab;

    public Tablero getTab() {
        return tab;
    }

    public void setTab(Tablero tab) {
        this.tab = tab;
    }
    private Jugador jugadorBlanco;
    private Jugador jugadorNegro;
    private Jugador jugadorEnTurno;

    public Jugador getJugadorBlanco() {
        return jugadorBlanco;
    }

    public void setJugadorBlanco(Jugador jugadorBlanco) {
        this.jugadorBlanco = jugadorBlanco;
    }

    public Jugador getJugadorNegro() {
        return jugadorNegro;
    }

    public void setJugadorNegro(Jugador jugadorNegro) {
        this.jugadorNegro = jugadorNegro;
    }

    public Jugador getJugadorEnTurno() {
        return jugadorEnTurno;
    }

    public void setJugadorEnTurno(Jugador jugadorEnTurno) {
        this.jugadorEnTurno = jugadorEnTurno;
    }
    public Partida(){
        
    }
    
    public void empezarPartida(Sistema sis){
        System.out.println("Lista de jugadores" +"\n");
        for(int i = 0; i< sis.getListaJugadores().size(); i++){
            Jugador j = sis.getListaJugadores().get(i);
            System.out.println((i+1) + " Nombre: " + j.getNombre());
        }
        System.out.println("Seleccione su jugador (Blanco) : ");
        Scanner in = new Scanner(System.in);
        int indiceBlanco = in.nextInt();
        in.nextLine();
        System.out.println("Seleccione su jugador (Negro) : ");
        boolean ok = false;
        int indiceNegro = in.nextInt();
        in.nextLine();
        while(!ok){
            if(indiceNegro == indiceBlanco){
                System.out.println("No se pueden jugadores repetidos, Ingrese de vuelta");
                indiceNegro = in.nextInt();
                in.nextLine();
            }
            else{
                ok = true;
            }
        }
        Jugador blanco = sis.getListaJugadores().get(indiceBlanco-1);
        Jugador negro = sis.getListaJugadores().get(indiceNegro-1);
        this.setJugadorBlanco(blanco);
        this.setJugadorNegro(negro);
        
        System.out.println("Ingrese su jugada:  ");
    }
    
        
    
}
