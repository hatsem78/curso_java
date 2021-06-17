
/**
 *
 * @author octavio
 */
public class Persona {

    private String nombre;
    private double sueldo;
    private boolean eliminado;

    Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean istEliminar() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

//    public String toString() {
//        return "nombre: " + this.nombre + "\nsueldo: " + this.sueldo + 
//                "\neliminado: " + this.eliminado;
//    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", eliminado=" + eliminado + '}';
    }
    

}
