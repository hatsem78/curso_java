
/**
 *
 * @author octavio
 */
public class OperadorTernarioJava {

    public static void main(String args[]) {

        var resultado = (3 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);
        
        var par = (10 % 2 == 0) ? "par" : "inpar";
        
        System.out.println("par = " + par);

    }

}
