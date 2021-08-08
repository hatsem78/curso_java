package test;

import sobreescritura.Empleado;

/**
 *
 * @author octavio
 */
public class EjemploSobreEscritura {
    public static void main(String[] args) {
        /*solo se puede llamar a los metodos protected cuando se extiende de la clase*/
        //Empleado empleado = new Empleado("juan", 1000);
        Empleado empleado = new Empleado("juan", 1000, "Constructor publico");
        System.out.println("empleado: " + empleado);
        System.out.println("empleado metodo: " + empleado.obtenerDetalle());
    }
}
