
import java.util.Date;

/**
 *
 * @author octavio
 */
public class EjemploHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        empleado1.setEdad(28);
        empleado1.setGenero('M');
        empleado1.setDireccion("Las lomas 123");
        
        System.out.println(empleado1);
        
        
        Cliente cliente1 = new Cliente(new Date(), true);
        cliente1.setNombre("Carla");
        System.out.println(cliente1);
        
    }
 
}
