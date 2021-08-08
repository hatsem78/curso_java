package datos;

/**
 *
 * @author octavio
 */
public interface AccesoDatos {
    
    public static final int MAX_REGISTRO = 10;
    
    public abstract void insert();
    
    public abstract void listar();
    
}
