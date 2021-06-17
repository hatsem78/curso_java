
import java.util.Scanner;

/**
 *
 * @author octavio
 */
public class ConversionTiposPrimitivosJava {
    public static void main(String args[]) {
        
        var scanner = new Scanner(System.in);
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.println("edad = " + edad);
        
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("caracter entrada: " + caracter);
        
        String edadTexto = String.valueOf(25);
        System.out.println("edadTexto entrada: " + edadTexto);
        
        short s = 10;
        byte b = (byte) s;

    }
}
