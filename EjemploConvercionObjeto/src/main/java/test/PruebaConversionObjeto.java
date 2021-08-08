package test;

import ejemploconvercionesobjetos.Empleado;
import ejemploconvercionesobjetos.Escritor;
import ejemploconvercionesobjetos.Gerente;
import ejemploconvercionesobjetos.TipoEscritura;

/**
 *
 * @author octavio
 */
public class PruebaConversionObjeto {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("roy", 5000, TipoEscritura.CLASICO);
        
        //empleado.getTipoEscrituraEnTexto();
        
        System.out.println(empleado.obtenerDetalle());
        Escritor escritor;
        //System.out.println(((Escritor) empelado.));
        escritor = (Escritor) empleado;
        System.out.println(escritor.obtenerDetalle());
        
        ((Escritor) empleado).obtenerDetalle();
        
        //System.out.println(((Escritor) empleado).getTipoEscritura());
        
        empleado = new Gerente("Laura", 6000, "Sistemas");
        
        System.out.println(((Gerente) empleado).getDepartamento());
        
    }
}
