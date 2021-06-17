
/**
 *
 * @author octavio
 */
public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 5000, false);
        
        System.out.println(persona);
        
        
        persona.setNombre("pedro");
        persona.setSueldo(8000);
        persona.setEliminado(true);
        
        System.out.println( persona);

    }
}
