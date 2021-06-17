
import java.awt.font.NumericShaper;
import java.util.Scanner;

/**
 *
 * @author octavio
 */
public class SentenciaControl {

    public static void main(String args[]) {

        var condicion = true;

        if (condicion) {
            System.out.println("condicion verdadero");
        } else {
            System.out.println("condicion falso");
        }

        var valor = 1;

        var numeroTexto = "valor desconocido";

        if (valor == 1) {
            numeroTexto = "valor uno";
        } else if (valor == 2) {
            numeroTexto = "valor dos";
        }

        System.out.println("numeroTexto =" + numeroTexto);

        Scanner scanner = new Scanner(System.in);
        /* mes del año*/
        var mes = scanner.nextInt();

        String estacion = null;

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "invierno";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "otoño";
        } else {
            estacion = "mes incorrecto";
        }

        System.out.println("estacion = " + estacion);

        System.out.println("===================Switch==========");

        Scanner scannerNumero = new Scanner(System.in);
        var numero = scannerNumero.nextInt();

        switch (numero) {
            case 1:
                numeroTexto = "valor uno";
                break;

            case 2:
                numeroTexto = "valor dos";
                break;
            case 3:
                numeroTexto = "valor tres";
                break;
            default:
                numeroTexto = "nùmero desconocido";
        }

        System.out.println("Numero de texto = " + numeroTexto + "para el numero proporcionado" + numero);

        System.out.println("===================Switch caso mes==========");

        Scanner scannerEstacion = new Scanner(System.in);
        int estacionMes = scannerNumero.nextInt();
        
        
        switch (estacionMes) {
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Estacion desconocida";
                            
        }
        
        System.out.println("Estacion " + estacion + "Mes proporcionado " + estacionMes);
    }

}
