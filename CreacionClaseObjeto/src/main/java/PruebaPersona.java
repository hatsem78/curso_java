/**
 *
 * @author octavio
 */
public class PruebaPersona {
    public static void main(String[] args) {
        /* creacion de un objecto tipo persona*/
        Persona persona1;
        
        /*instancioando creando un objecto de la clase persona*/
        persona1 = new Persona();
        
        persona1.desplegarNombres();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        
        System.out.println("");
        persona1.desplegarNombres();
        
        
        System.out.println("====================================");
        System.out.println("");
        
        Persona persona2 = new Persona();
        
        persona1.nombre = "Pepe";
        persona1.apellido = "Perez";
        
        System.out.println("");
        persona1.desplegarNombres();
        
    }
}
