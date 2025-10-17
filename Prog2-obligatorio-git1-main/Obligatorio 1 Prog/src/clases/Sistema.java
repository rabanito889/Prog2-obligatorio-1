
package clases;

import java.util.ArrayList;
import java.util.Scanner;


public class Sistema{
    private ArrayList<Jugador> listaJugadores;

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void AgregarListaJugadores(Jugador unJugador) {
        this.listaJugadores.add(unJugador);
    }
    public Sistema(){
       listaJugadores = new ArrayList<>(); 
    }
    
    public void registrarJugador() {
        boolean ok = false;
        
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int edad = 0;
        if (this.getListaJugadores().isEmpty()) {
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
                for (Jugador jugador : this.getListaJugadores()) {
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
        this.AgregarListaJugadores(jugador);
    }
    public void ordenarJugadores(){

        if(this.getListaJugadores().isEmpty()){
            System.out.println("No hay jugadores registrados todavía.");
        }
        else{
            for(int i = 0; i < this.getListaJugadores().size() - 1; i++){
                for(int j = i; j < this.getListaJugadores().size(); j++){
                    Jugador jugador1 = this.getListaJugadores().get(i);
                    Jugador jugador2 = this.getListaJugadores().get(j);
                        if(jugador1.getNombre().compareToIgnoreCase(jugador2.getNombre()) > 0){
                            this.getListaJugadores().set(i, jugador2);
                            this.getListaJugadores().set(j, jugador1);
                        }
                }
            }
        }
         

    }
    
    
    
}
