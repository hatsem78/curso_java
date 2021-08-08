
/**
 *
 * @author octavio
 */
public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;

    private Persona() {
        this.idPersona = ++contadorPersonas;
    }

    /* sobre carga de constructor */
    public Persona(String nombre, int edad) {

        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{ \n"
                + "idPersona=" + idPersona
                + ", nombre=" + nombre
                + ", edad=" + edad
                + "\n}";
    }

}
