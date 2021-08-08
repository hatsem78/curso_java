package test;

import ejemploInstanceof.Empleado;
import ejemploInstanceof.Gerente;

/**
 *
 * @author octavio
 */
public class EjemploInstanceOf {
    public static void main(String[] args) {
        /*solo se puede llamar a los metodos protected cuando se extiende de la clase*/
        //Empleado empleado = new Empleado("juan", 1000);
        Empleado empleado = new Empleado("juan", 1000, "Constructor publico");
        determinaTipo(empleado);
        
        Gerente gerente = new Gerente("Karla", 2000, "Finanzas");
        determinaTipo(gerente);
    }
    
    public static void determinaTipo(Empleado empleado ) {
        
        if(empleado instanceof Gerente) {
            System.out.println("Gerente");
            Gerente gerente = (Gerente) empleado;
            System.out.println(((Gerente) empleado).getDepartamento());
        } else if (empleado instanceof Empleado) {
            System.out.println("Empleado");
            System.out.println(empleado.getNombre());
        }
    }
}
