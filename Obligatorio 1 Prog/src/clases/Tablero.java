
package clases;


public class Tablero {
    private Ficha[][] tab = new Ficha[3][6];

    public Ficha[][] getTab() {
        return tab;
    }

    public void setTab(Ficha[][] tab) {
        this.tab = tab;
    }
    
    public Tablero(){
        
    }
    
    public void mostrarTableroVisual(boolean titulos){
        if(titulos){
            System.out.print("    1       2       3      4     5      6 ");
        }
        System.out.println("");
        System.out.println("+++++++++++++++++++");
        for(int i=0; i<3; i++){
            String[] primer = new String[6];
            String[] segundo = new String[6];
            String[] tercer = new String[6];
            for(int j = 0; j<6; j++){
                
                Ficha ficha = tab[i][j];
                if(ficha != null){
                   String[] dibujar = ficha.dibujarPieza();
                   primer[j] = dibujar[0];
                   segundo[j] = dibujar[1];
                   tercer[j] = dibujar[2];
                }
                else{
                    primer[j] = "|  . ";
                   segundo[j] = "|  . ";
                   tercer[j] ="|  . ";
                }
            }
            for(int k = 0; k<6; k++){
                System.out.print(primer[k]);
            }
            System.out.println("|");
            for(int k = 0; k<6; k++){
                System.out.print(segundo[k]);
            }
            System.out.println("|");
            for(int k = 0; k<6; k++){
                System.out.print(tercer[k]);
            }
            System.out.println("|");
            System.out.println("++++++++++++++++++++++");
            
        }
        
    }
}
