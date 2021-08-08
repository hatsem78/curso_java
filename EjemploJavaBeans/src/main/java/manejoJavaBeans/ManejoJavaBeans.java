package manejoJavaBeans;

import beans.PersonaBean;

/**
 *
 * @author octavio
 */
public class ManejoJavaBeans {

    public static void main(String[] args) {
        
        PersonaBean personaBeans = new PersonaBean();
        
        personaBeans.setNombre("Juan");
        personaBeans.setEdad(15);
        
        System.out.println("Nombre: " + personaBeans.getNombre());
        System.out.println("Edad: " + personaBeans.getEdad());
        
        
        PersonaBean personaBeans3 = new PersonaBean("Carla", 16);
        
        System.out.println("Nombre: " + personaBeans3.getNombre());
        System.out.println("Edad: " + personaBeans3.getEdad());
        
        System.out.println(personaBeans3);
    }
}
