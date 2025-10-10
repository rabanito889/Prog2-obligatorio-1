
package clases;

import java.util.ArrayList;


public class Sistema{
    private ArrayList<Jugador> listaJugadores;

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(Jugador unJugador) {
        this.listaJugadores.add(unJugador);
    }
    public Sistema(){
       listaJugadores = new ArrayList<>(); 
    }
    
}
