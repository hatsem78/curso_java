package test;

import java.util.*;

/**
 *
 * @author octavio
 */
public class EntradaDatos {

    public static void main(String[] args) {
        String captura  = null;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar datos");
        captura = scanner.nextLine();
        while (! "salir".equals(captura))  {
            System.out.println("Dato introducido: " + captura);
            captura = scanner.nextLine();
        }
        
        
    }
}
