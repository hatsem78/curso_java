package datos;

import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;

/**
 *
 * @author octavio
 */
public class ImplementacionMysql implements AccesoDatos {
    
    private boolean simularError;

    @Override
    public void insert() throws AccesoDatosEx {
        if (this.simularError) {
            throw new EscrituraDatosEx("Error de escritura de datos");
        } else {
            System.out.println("Insertar desde Mysql");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx {
        if (this.simularError) {
            throw new EscrituraDatosEx("Error de lectura de datos");
        } else {
            System.out.println("Liatar desde Mysql");
        }
    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }
    
    public boolean isSimularError() {
        return this.simularError;
    }
}
