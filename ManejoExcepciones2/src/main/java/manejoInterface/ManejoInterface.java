package manejoInterface;

import datos.*;
import excepciones.AccesoDatosEx;

/**
 *
 * @author octavio
 */
public class ManejoInterface {
    public static void main(String[] args) throws AccesoDatosEx {
        AccesoDatos datos = new ImplementacionOracle();
        
        datos.insert();
        datos.listar();
        
        
        datos = new ImplementacionMysql();
        
        datos.insert();
        datos.listar();
        
        System.out.println(AccesoDatos.MAX_REGISTRO);
    }
}
