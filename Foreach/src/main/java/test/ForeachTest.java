package test;

import identidad.Persona;

/**
 *
 * @author octavio
 */
public class ForeachTest {
    public static void main(String[] args) {
        int edades[] = {15,20,41,50};
        
        for(int edad: edades){
            System.out.println("edad: " + edad);
        }
        
        System.out.println("");
        
        Persona personas[] = {new Persona("Juan"), new Persona("Carla")};
        
        for (Persona persona: personas) {
            System.out.println("Persona nombre: " + persona.getNombre());
            System.out.println("Persona nombre: " + persona);
        }
    }
}
