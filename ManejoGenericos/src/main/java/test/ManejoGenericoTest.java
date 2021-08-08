package test;

import genericos.ClaseGenerica;

/**
 *
 * @author octavio
 */
public class ManejoGenericoTest {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objectoInteger = new ClaseGenerica(15);
        objectoInteger.obtenerTipo();
        
        
        ClaseGenerica<String> objectoString = new ClaseGenerica("Obtener tipo");
        objectoString.obtenerTipo();
        
        /* no soporta tipos primitivos como int, float etc*/
        /* ClaseGenerica<int> objectoString = new ClaseGenerica(15);
        objectoString.obtenerTipo(); */
    }
}
