package test;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author octavio
 */
public class manejoPersonas {

    public static void main(String[] args) {
        
        PersonaJDBC personaJDBC = new PersonaJDBC();
        List<Persona> personas = new ArrayList<Persona>();
        personas = personaJDBC.select();
        
        personas.forEach(persona -> {
            System.out.println("persona: " + persona);
        });
        
        /* agregamos un nuevo registro */
        Persona persona = new Persona();
        persona.setNombre("Maria");
        persona.setApellido("Lara");
        persona.setEmail("lara@gemail.com");
        persona.setTelefono("132131231");
        
        
        personaJDBC.insert(persona);
        
        
        /* actualizamos un registro*/
        persona.setIdPersona(1);
        persona.setNombre("Luciana");
        persona.setApellido("Lara");
        persona.setEmail("lara@gemail.com");
        persona.setTelefono("132131231");
        personaJDBC.update(persona);
        
        persona.setNombre("Maria");
        persona.setApellido("Pedro");
        persona.setEmail("lara@gemail.com");
        persona.setTelefono("132131231");       
        
        personaJDBC.insert(persona);
        
        /* eliminamos un registro*/
        persona.setIdPersona(2);
        personaJDBC.delete(persona);
    }
}
