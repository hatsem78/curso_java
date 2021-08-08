package test;

import java.util.Scanner;
import static calculadora.Operaciones.sumar;
/**
 *
 * @author octavio
 */
public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Proporciona el primer valor");
        Scanner scanner = new Scanner(System.in);
        
        int a;
        a = scanner.nextInt();
        
        System.out.println("Solicitamos el segundo valor b");
        int b = scanner.nextInt();
        int resultado = sumar(a, b);
        
        System.out.println("El resultado es: " + resultado);
        
    }
}
