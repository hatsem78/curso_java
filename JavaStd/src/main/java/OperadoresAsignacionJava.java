/* *
 * @author octavio
 */
public class OperadoresAsignacionJava {
    public static void main(String args[]) {

        int a = 1, b = 2;
        int c = b;

        System.out.println("c = " + c);
        
        c = a + 5 + b;

        System.out.println("resultado resta = " + c);
        
        a += 1;

        System.out.println("a = " + a);
        
        b -= 1;

        System.out.println("b = " + b);
        
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
