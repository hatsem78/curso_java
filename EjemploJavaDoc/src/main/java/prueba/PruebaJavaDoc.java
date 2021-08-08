/*
 * Derechos reservado linkworkdeveloper.com.ar 
 */
package prueba;

import com.ar.javadoc.Aritmatica;

/**
 * Clase para porbar el concepta javaDoc
 * @author Hatsembiller Octavio Daniel
 */
public class PruebaJavaDoc {
    
    /**
     * Metodo que ejectuta la prueba de la clase Aritmetica
     * @param args es un arreglo del tipo string de la linea de comando
     */
    public static void main(String[] args) {
        Aritmatica aritmentica = new Aritmatica(3, 2);
        int resultado = aritmentica.sumar();
        System.out.println("resultado = " + resultado);
    }
    
    
    
}
