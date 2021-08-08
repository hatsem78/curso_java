package matrices;

/**
 *
 * @author octavio
 */
public class EjemploMatricesPrueba {

    public static void main(String[] args) {

        /* matris de tipo entero int */
        int[][] edades;

        /* instanciar la matris*/
        edades = new int[3][2];

        /* instanciar los valores de la matris*/
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;

        for (int i = 0; i <= edades.length; i++) {
            for (int j = 0; j < edades[j].length; j++) {
                System.out.println("edades [" + i + "] " + "[" + j + "]= " + edades[j]);
            }
        }
        
        /* matris de objecto tipo persona*/
        
        Persona personas[][] = new Persona[1][2];
        
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Pedro");
        
        System.out.println("Persona [0][0]=" + personas[0][0]);
        System.out.println("Persona [0][1]=" + personas[0][1]);
        
        for (int renglon = 0; renglon < personas.length; renglon++) {
            for (int columna = 0; columna < personas[renglon].length ; columna++) {
                System.out.println("Persona [" + renglon + "] " + "[" + columna + "]= " + personas[renglon][columna]);
            }
        }
    }
}
