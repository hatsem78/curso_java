package test;

import domain.Division;
import domain.OperacionExcepcion;

/**
 *
 * @author octavio
 */
public class ManejoExcepciones1 {
    public static void main(String[] args) {
        try {
            Division division = new Division(5, 0);
        } catch (OperacionExcepcion ex) {
            System.out.println("Mensaje de la excepcion: " + ex.getMessage());
            ex.printStackTrace();
        }
        
        System.out.println("");
    }
}
