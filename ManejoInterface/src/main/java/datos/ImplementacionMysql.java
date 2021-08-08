package datos;

/**
 *
 * @author octavio
 */
public class ImplementacionMysql implements AccesoDatos {

    @Override
    public void insert() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Liatar desde Mysql");
    }
}
