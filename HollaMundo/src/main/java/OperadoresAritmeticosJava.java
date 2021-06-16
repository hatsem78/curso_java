
import java.util.Scanner;

/**
 *
 * @author octavio
 */
public class OperadoresAritmeticosJava {

    public static void main(String args[]) {

        int a = 1, b = 2;
        int resultado = a + b;

        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b;

        System.out.println("resultado resta = " + resultado);
        
        resultado = a - b;

        System.out.println("resultado resta = " + resultado);
        
        resultado = 5 * b;

        System.out.println("resultado multiplicacion = " + resultado);
        
        double resultado2 = 6D / b;
        System.out.println("resultado dividir = " + resultado2);
        
        resultado2 = 6 % b;
        System.out.println("resultado par = " + resultado2);
        
        
        resultado2 = 5 % b;
        System.out.println("resultado inpar = " + resultado2);
        
        if(resultado2 == 1){
            System.out.println("resultado inpar");
        }

    }

}
