package ejemploconvercionesobjetos;

/**
 *
 * @author octavio
 */
public class Escritor extends Empleado {
    
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) { 
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() 
                + ", tipoEscritura: " +  this.tipoEscritura.getDescripcion();
    }
    
    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }
    
    public String getTipoEscrituraEnTexto() {    
        return tipoEscritura.getDescripcion();
    }
}
