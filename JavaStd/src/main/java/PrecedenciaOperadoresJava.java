
/**
 *
 * @author octavio
 */
public class PrecedenciaOperadoresJava {

    public static void main(String args[]) {

        var x = 5;
        var y = 10;
        var z = ++x + y--;//x =6 , y=10
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        System.out.println("\nEjemplo dos precesdencia de operadores");
        var resultado = 4 + 5 * 6 / 3;
        
        System.out.println("resultado = " + resultado);
        
        var resultado2 = (4 + 5) * (6 / 3);
        System.out.println("resultado2 = " + resultado2);

    }

}
