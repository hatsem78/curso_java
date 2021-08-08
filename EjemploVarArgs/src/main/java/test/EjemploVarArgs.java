package test;

/**
 *
 * @author octavio
 */
public class EjemploVarArgs {
    public static void main(String[] args) {
        // imprimimos varios numeros
        imprimirNumeros(15,1, 4,6,20,60);
        
        System.out.println("");
        //parametros variables
        variosParametros("juan", true, 14,2,5);
    }

    private static void imprimirNumeros(int... numeros) {
        for (int numero: numeros) {
            System.out.println("Numero del elemento:" + numero);
        }
    }

    private static void variosParametros(String nombre, boolean vandera, int... numeros) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vandera: " + vandera);
        
        for (int numero: numeros) {
            System.out.println("Numero:" + numero);
        }
    }
}
