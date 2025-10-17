
package clases;


public class Jugador {
    private String nombre;
    private int edad;
    private int partidasGanadas;
    private int partidasJugadas;

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Jugador(){
        
    }
    public Jugador(String unNombre, int unaEdad, int partidasGanadas, int jugadas){
        this.setNombre(unNombre);
        this.setEdad(unaEdad);
        this.setPartidasGanadas(partidasGanadas);
        this.setPartidasJugadas(jugadas);
    }
    @Override
    public String toString(){
        return this.getNombre() + " " + this.getEdad();
    }
}
