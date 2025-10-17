
package clases;


public class Tablero {
    private Ficha[][] tab = new Ficha[3][5];

    public Ficha[][] getTab() {
        return tab;
    }

    public void setTab(Ficha[][] tab) {
        this.tab = tab;
    }
    
    public Tablero(){
        tab = new Ficha[3][6];
    }
    
    public void mostrarTableroVisual(boolean titulos, String[][] letrasG){
        if(titulos){
            System.out.print("   1    2    3    4    5    6 ");
        }
        System.out.println("");
        System.out.println(" +----+----+----+----+----+----+");
        for(int i=0; i<3; i++){
            String[] primer = new String[6];
            String[] segundo = new String[6];
            String[] tercer = new String[6];
            for(int j = 0; j<6; j++){
                
                Ficha ficha = tab[i][j];
                if(ficha != null){
                    if(letrasG[i][j] != null && !letrasG[i][j].equals(" ")){
                        String letra = letrasG[i][j];
                        primer[j] = " | "+letra+letra;
                        segundo[j] = "| "+letra+letra+" ";
                        tercer[j] = " | "+letra+letra;
                          
                    }
                    else{
                        String[] dibujar = ficha.dibujarPieza();
                        primer[j] = dibujar[0];
                        segundo[j] = dibujar[1];
                        tercer[j] = dibujar[2];
                    }
                }
                else{
                    
                       primer[j] = " |   ";
                       segundo[j] = "|    ";
                       tercer[j] =" |   ";
                    
                }
            }
            for(int k = 0; k<6; k++){
                System.out.print(primer[k]);
            }
            
            System.out.println(" |");
            String letra = " ";
            if(titulos){
                
                if(i == 0){
                    letra = "A";
                }
                else{
                    if(i == 1){
                        letra = "B";
                    }
                    else{
                        letra = "C";
                    }
                }
                
            }
            System.out.print(letra);
            for(int k = 0; k<6; k++){
                System.out.print(segundo[k]);
            }
            System.out.println("|");
            for(int k = 0; k<6; k++){
                System.out.print(tercer[k]);
            }
            System.out.println(" |");
            System.out.println(" +----+----+----+----+----+----+");
            
        }
        
        
    }
    
    
    public boolean verSiGanan(boolean blanco){
        String[][] aux = new String[3][5];
        Ficha[][] tab = this.getTab();
        String [][] letraG = new String[3][6];
        //Creamos una matriz auxiliar de X y O
        for(int i = 0; i<3; i++){
            for(int j = 0; j<5; j++){
                aux[i][j] = " ";
            }
        }
        
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<5; j++){
                if(tab[i][j] != null && tab[i][j+1]!= null ){    
                    if(tab[i][j].getOrientacion().equalsIgnoreCase("D") && tab[i][j+1].getOrientacion().equalsIgnoreCase("C")){
                        aux[i][j] = "X";
                    }else{
                        if(tab[i][j].getOrientacion().equalsIgnoreCase("C") && tab[i][j+1].getOrientacion().equalsIgnoreCase("D")){
                        aux[i][j] = "O";
                        }
                    }
            }
            }
                    
                    
                
                
                
            }
            
        
        
        //La recorremos y vemos si hay 3 alineados
        boolean hayG = false;
        
        
        
        //filas
        
            for(int i = 0; i<3 && !hayG; i++){
            
               if(!aux[i][0].equals(" ") && aux[i][0].equals(aux[i][2]) && aux[i][0].equals(aux[i][4])){
                   hayG = true;
                   
                   letraG[i][0] = aux[i][0];
                   letraG[i][1] = aux[i][0];
                   letraG[i][2] = aux[i][0];
                   letraG[i][3] = aux[i][0];
                   letraG[i][4] = aux[i][0];
                   letraG[i][5] = aux[i][0];
               
            }
            }
            //columnas
            
            for(int j = 0; j<5 && !hayG; j++){
                if(!aux[0][j].equals(" ") && aux[0][j].equals(aux[1][j]) && aux[0][j].equals(aux[2][j])){
                    hayG = true;
                    letraG[0][j] = aux[0][j];
                    letraG[1][j] = aux[0][j];
                    letraG[2][j] = aux[0][j];
                    letraG[0][j+1] = aux[0][j];
                    letraG[1][j+1] = aux[0][j];
                    letraG[2][j+1] = aux[0][j];
                    
                }
            }
            //Diagonales
            
            for(int j = 0; j<3 && !hayG; j++){
               if(!aux[0][j].equals(" ") && aux[0][j].equals(aux[1][j+1]) && aux[0][j].equals(aux[2][j+2])){
                   hayG = true;
                   letraG[0][j] = aux[0][j];
                   letraG[1][j+1] = aux[0][j];
                   letraG[2][j+2] = aux[0][j];
                   letraG[0][j+1] = aux[0][j];
                   letraG[1][j+2] = aux[0][j];
                   letraG[2][j+3] = aux[0][j];
                   
               }
            }

            for(int j = 4; j>1 && !hayG; j--){
               if(!aux[0][j].equals(" ") && aux[0][j].equals(aux[1][j-1]) && aux[0][j].equals(aux[2][j-2])){
                   hayG = true;
                   
                   letraG[0][j+1] = aux[0][j];
                   letraG[1][j] = aux[0][j];
                   letraG[2][j-1] = aux[0][j];
                   letraG[0][j] = aux[0][j];
                   letraG[1][j-1] = aux[0][j];
                   letraG[2][j-2] = aux[0][j];
                   
               }
            }
            
            System.out.println(aux);
            for (int i = 0; i < letraG.length; i++) {
                for (int j = 0; j < letraG[0].length; j++) {
                    System.out.print(letraG[i][j]);
                }
        }
            
            mostrarTableroVisual(blanco, letraG);
        
        return hayG;
    }
    
    
}
