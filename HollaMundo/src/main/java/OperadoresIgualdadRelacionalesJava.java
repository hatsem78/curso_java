
/**
 *
 * @author octavio
 */
public class OperadoresIgualdadRelacionalesJava {

    public static void main(String args[]) {
        int a = 1, b = 2;
        boolean c = (a == b);
        System.out.println("valor c = " + c);

        c = a != b;

        System.out.println("valor c = " + c);

        String cadena = "hola";
        String cadena2 = "adios";

        System.out.println(cadena.equals(cadena2));

        boolean d = a < b;
        System.out.println("d = " + d);

        boolean f = a < b;
        System.out.println("f = " + f);

        if (b % 2 == 0) {
            System.out.println("Numero par");
        }

        int edad = 8;
        int edadAdulto = 18;

        if (edad >= edadAdulto) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

    }
}
