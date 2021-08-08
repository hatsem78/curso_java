package palabrafinal;

/**
 *
 * @author octavio
 */
public class EjemploPalabraFinal {
    public static void main(String[] args) {
        /* modificar un atributo final */
        //ClaseFinal.VAR_PRIMITIVO = 10;
        
        /* Modificar la referencia de un objeto tipo object*/
        //ClaseFinal.VAR_PERSONA = new Persona();
        
        ClaseFinal.VAR_PERSONA.setNombre("juan");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        
        ClaseFinal.VAR_PERSONA.setNombre("Carlo");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
}
