/**
 *
 * @author octavio
 */
public class Empleado extends Persona {
    private double sueldo;
    
    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }
    
    public Empleado(String nombre, int edad, double sueldo) {
        this(nombre, edad);
        //super(nombre, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nEmpleado {\n" 
                + "sueldo=" + sueldo 
                + "\n}";
    }
    
    
    
    
}
