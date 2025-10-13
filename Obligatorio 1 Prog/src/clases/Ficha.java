
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
            if(this.orientacion.equals("D")){
                dibujo[0] = " |\u25CF" + "  ";
                dibujo[1] = "|   " + "\u25CF" ;
                dibujo[2] = " |\u25CF" + "  ";
            }
            else{
                if(this.orientacion.equals("C")){
                    dibujo[0] = " |  " + "\u25CF";
                    dibujo[1] = "|\u25CF" + "   ";
                    dibujo[2] = " |  " + "\u25CF";
                }
            }
        }
        else{
            if(this.orientacion.equals("D")){
                dibujo[0] = " |\u25CB" + "  ";
                dibujo[1] = "|   " + "\u25CB";
                dibujo[2] = " |\u25CB" + "  ";
            }
            else{
                if(this.orientacion.equals("C")){
                    dibujo[0] = " |  " + "\u25CB";
                    dibujo[1] = "|\u25CB" + "   ";
                    dibujo[2] = " |  " + "\u25CB";
                }
            }
        }
        return dibujo;
    }
}
