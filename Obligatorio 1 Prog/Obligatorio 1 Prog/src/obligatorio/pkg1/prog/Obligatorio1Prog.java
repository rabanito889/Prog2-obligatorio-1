
package obligatorio.pkg1.prog;

import clases.Sistema;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;


public class Obligatorio1Prog {

    
    public static void main(String[] args) {
       try{
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
       }
       catch(UnsupportedEncodingException e){
           
       }
       Sistema sistema = new Sistema();
       Interfaz in = new Interfaz();
       in.menu(sistema);
       
    }
    
}
