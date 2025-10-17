
package clases;


public class Ficha {
    private String color;
    private String orientacion;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }
    public Ficha(String unColor, String unO){
        this.setColor(unColor);
        this.setOrientacion(unO);
    }
    public Ficha(){
        
    }
    @Override
    public String toString(){
        return this.getColor() + this.getOrientacion();
    }
    
    public String[] dibujarPieza(){
        String[] dibujo = new String[3];
        if(this.color.equals("negro")){
            if(this.orientacion.equalsIgnoreCase("D")){
                dibujo[0] = " |●" + "  ";
                dibujo[1] = "|   " + "●";
                dibujo[2] = " |●" + "  ";
            }
            else{
                if(this.orientacion.equalsIgnoreCase("C")){
                    dibujo[0] = " |  " + "●";
                    dibujo[1] = "|●" + "   ";
                    dibujo[2] = " |  " + "●";
                }
                else{
                    dibujo[0] = " |   ";
                    dibujo[1] = "|    ";
                    dibujo[2] = " |   ";
                }
            }
        }
        else{
            if(this.orientacion.equalsIgnoreCase("D")){
                dibujo[0] = " |○" + "  ";
                dibujo[1] = "|   " + "○";
                dibujo[2] = " |○" + "  ";
            }
            else{
                if(this.orientacion.equalsIgnoreCase("C")){
                    dibujo[0] = " |  " + "○";
                    dibujo[1] = "|○" + "   ";
                    dibujo[2] = " |  " + "○";
                }
                else{
                    dibujo[0] = " |   ";
                    dibujo[1] = "|    ";
                    dibujo[2] = " |   ";
                }
            }
        }
        return dibujo;
    }
    public String[] dibujarPiezaGanadora(String letraGanadora){
        String[] dibujo = new String[3];
        if(letraGanadora.equals("X")){
            dibujo[0] = " |X" + "XX";
            dibujo[1] = "| XX" + "X";
            dibujo[2] = " |X" + "XX";
        }
        else{
            dibujo[0] = " |O" + "OO";
            dibujo[1] = "| OO" + "O";
            dibujo[2] = " |O" + "OO";
        }
        return dibujo;
    }
}
