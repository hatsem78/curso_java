package test;

import datos.AccesoDatos;
import datos.*;
import excepciones.AccesoDatosEx;
import excepciones.LecturaDatosEx;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author octavio
 */
public class ManejoExcepciones2 {

    public static void main(String[] args) {

        AccesoDatos datos = new ImplementacionMysql();
        datos.simularError(false);
        ejecutar(datos, "listar");
        
        datos.simularError(true);
        ejecutar(datos, "listar");
        
        
        AccesoDatos datos2 = new ImplementacionOracle();
        datos2.simularError(false);
        ejecutar(datos2, "listar");
        
        datos2.simularError(true);
        ejecutar(datos2, "listar");
    }

    private static void ejecutar(AccesoDatos datos, String accion) {

        if ("listar".equals(accion)) {
            try {
                datos.listar();
            } catch (LecturaDatosEx ex) {
                //Logger.getLogger(ManejoExcepciones2.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error de lectura");
                ex.printStackTrace(System.out);

            } catch (AccesoDatosEx ex) {
                //Logger.getLogger(ManejoExcepciones2.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error de acceso a datos");
                ex.printStackTrace(System.out);
            } catch (Exception ex) {
                System.out.println("Error general");
                ex.printStackTrace(System.out);
            } finally {
                System.out.println("Proceso finally es opcional, pero siempre se ejecuta");
            }

        } else if ("insertar".equals(accion)) {
            try {
                datos.insert();
            } catch (AccesoDatosEx ex) {
                //Logger.getLogger(ManejoExcepciones2.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Excepcion de acceso a datos");
                ex.printStackTrace(System.out);
            } finally {
                System.out.println("Proceso finally es opcional, pero siempre se ejecuta");
            }
        } else {
            System.out.println("No se proporciono ninguna accion conocida");
        }

    }
}
