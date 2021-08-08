package datos;

/**
 *
 * @author octavio
 */
public class ImplementacionOracle implements AccesoDatos {

    @Override
    public void insert() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Liatar desde Oracle");
    }   
    
}
