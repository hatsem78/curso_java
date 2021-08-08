/**
 *
 * @author octavio
 */
public class Persona {
    
    private int IdPersona; // se asocia a un objecto(instancia)
    private String nombre;
    private static int contadorPersona; // se asocia a cada clase y no objecto
    
    public Persona(String nombre) {
        this.IdPersona = ++contadorPersona;
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return IdPersona;
    }

//    public void setIdPersona(int IdPersona) {
//        this.IdPersona = IdPersona;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

//    public static void setContadorPersona(int contadorPersona) {
//        Persona.contadorPersona = contadorPersona;
//    }

    @Override
    public String toString() {
        return "Persona{" + "IdPersona=" + IdPersona + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
