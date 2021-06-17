
/**
 *
 * @author octavio
 */
public class PalabraNull {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1: " + persona1.obtenerNombre());
        
        Persona persona2 = persona1;
        
        System.out.println("persona2: " + persona2.obtenerNombre());
        
        persona1 = null;
        if (persona1 != null)
            System.out.println("persona1" + persona1.obtenerNombre());
        else
            System.out.println("variable persona1 no apunta a ningun lado");
        persona2 = null;
        System.gc(); /*manda a ejcutar el recolector de vasuara cuando se ueda*/
    }
}


class Persona {
    String nombre;
    
    Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtenerNombre() {
        return this.nombre;
    }
}