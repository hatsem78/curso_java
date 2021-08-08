package test;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author octavio
 */
public class EntradaDatos1 {

    public static void main(String[] args) {
        String captura;
        InputStreamReader input = new InputStreamReader(System.in);
        
        BufferedReader brInput = new BufferedReader(input);
        
        System.out.println("Introduce un dato");
        try {
            captura = brInput.readLine();
            System.out.println("Dato introducido: " + captura);
        } catch (IOException ex) {
            //Logger.getLogger(EntradaDatos1.class.getName()).log(Level.SEVERE, null, ex);
            
            ex.printStackTrace(System.out);
        }
    }
}
