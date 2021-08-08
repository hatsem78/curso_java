package arreglos;

/**
 *
 * @author octavio
 */
public class EjemploArreglo {
    public static void main(String[] args) {
        /* variable de tipo int */
        int edades[];
        
        /* instanciar el arreglo tipo int*/
        edades = new int[3];
        
        /* inicializamos los valores del arreglo*/
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        
        /*imprimimos los valores del arreglo*/
        System.out.println("Valor del arreglo edades[0]: " + edades[0]);
        System.out.println("Valor del arreglo edades[1]: " + edades[1]);
        System.out.println("Valor del arreglo edades[2]: " + edades[2]);
        
        /* arreglo tipo object */
        Persona personas[] = new Persona[4];
        
        /*inicializar el valor del arreglo*/
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Carla");
        
        System.out.println("Arreglo person index 0: " + personas[0]);
        System.out.println("Arreglo person index 1: " + personas[1]);
        System.out.println("Arreglo person index 2: " + personas[2]);
        System.out.println("Arreglo person index 3: " + personas[3]);
        
        /*arreglo utilizando anotacion simplificada*/
        String[] nombres = {"Juan", "Carl", "Andrea"};
        
        for (int i=0; nombres.length < i; i++){
            System.out.println("nombres" + i + ": " + nombres[i]);
        }
    }
}
