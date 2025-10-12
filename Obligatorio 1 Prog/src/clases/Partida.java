
package clases;


public class Partida {
    private Tablero tab;
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
}
