package datos;

import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;

/**
 *
 * @author octavio
 */
public class ImplementacionOracle implements AccesoDatos {

    private boolean simularError;

    @Override
    public void insert() throws AccesoDatosEx {
        if (this.simularError) {
            throw new EscrituraDatosEx("Error al escribir el dato");
        } else {
            System.out.println("Insertar desde Oracle");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx {

        if (this.simularError) {
            throw new EscrituraDatosEx("Error al escribir el dato");
        } else {
            System.out.println("Liatar desde Oracle");
        }
    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }

    public boolean isSimularError() {
        return simularError;
    }

}
