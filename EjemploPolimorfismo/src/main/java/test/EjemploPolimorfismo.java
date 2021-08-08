package test;

import ejemplopolimorfismo.Empleado;
import ejemplopolimorfismo.Gerente;

/**
 *
 * @author octavio
 */
public class EjemploPolimorfismo {
    public static void main(String[] args) {
        /*solo se puede llamar a los metodos protected cuando se extiende de la clase*/
        //Empleado empleado = new Empleado("juan", 1000);
        Empleado empleado = new Empleado("juan", 1000, "Constructor publico");
        imprimirDetaslle(empleado);
        
        Gerente gerente = new Gerente("Karla", 2000, "Finanzas");
        imprimirDetaslle(gerente);
    }
    
    public static void imprimirDetaslle(Empleado empleado ) {
        System.out.println("imprimirDetaslle empleado=" + empleado.obtenerDetalle());
    }
}
