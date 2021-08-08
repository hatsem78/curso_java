package manejoInterface;

import datos.*;

/**
 *
 * @author octavio
 */
public class ManejoInterface {
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionOracle();
        
        datos.insert();
        datos.listar();
        
        
        datos = new ImplementacionMysql();
        
        datos.insert();
        datos.listar();
        
        System.out.println(AccesoDatos.MAX_REGISTRO);
    }
}
