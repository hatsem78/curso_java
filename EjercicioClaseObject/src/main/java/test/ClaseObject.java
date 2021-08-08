package test;

import dominio.Empleado;
import org.openjdk.jol.info.GraphLayout;
import org.openjdk.jol.vm.VM;

/**
 *
 * @author octavio
 */
public class ClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 1000);
        Empleado empleado2 = new Empleado("Juan", 1000);
        
        
        
        /*System.out.println("objecto iguales: " + (empleado1 == empleado2));
        
        System.out.println("objecto iguales: " + (empleado1.equals(empleado2)));
        
        System.out.println("Direccion de memoria empleado1: "+ VM.current().addressOf(empleado1));
        System.out.println("Direccion de memoria empleado2: "+ VM.current().addressOf(empleado2));
        System.out.println("Detalle del  empleado1: "+ GraphLayout.parseInstance(empleado1).toPrintable());
        System.out.println("Detalle del  empleado2: "+ GraphLayout.parseInstance(empleado2).toPrintable());*/
        
        compararObjetos(empleado1, empleado2);
        
    }
    
    private static void compararObjetos(Empleado obj1, Empleado obj2) {
        System.out.println("Empleado1 = " + obj1);
        System.out.println("Empleado2 = " + obj2);
        
        //revision por referencia
        if (obj1 == obj2) {
            System.out.println("Los objetos tienen la misma direccion en memoria");
        } else {
            System.out.println("Los objetos tienen distinta direccion en memoria");
        }
        
        //revision del metodo equals
        if (obj1.equals(obj2)) {
            System.out.println("Los objetos tienen el mismo contenido");
        } else {
            System.out.println("Los objetos NO tienen el mismo contenido");
        }
        
        //metodo hashcode
        
        if (obj1.hashCode() == obj2.hashCode()) {
            System.out.println("Los objectos tienen el mismo codigo hash");
        } else {
            System.out.println("Los objectos NO tienen el mismo codigo hash");
        }
    }
}
