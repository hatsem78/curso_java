package datos;

import excepciones.AccesoDatosEx;

/**
 *
 * @author octavio
 */
public interface AccesoDatos {
    
    public static final int MAX_REGISTRO = 10;
    
    public abstract void insert() throws AccesoDatosEx;
    
    public abstract void listar() throws AccesoDatosEx;
    
    public abstract void simularError(boolean simularError);
}
