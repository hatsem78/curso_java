package genericos;

/**
 *
 * @author octavio
 */
public class ClaseGenerica<T> {
    
    //Definimos una variable de tipo generico
    T objecto;

    public ClaseGenerica(T objecto) {
        this.objecto = objecto;
    }
    
    public void obtenerTipo() {
        System.out.println("El tipo T es: " + objecto.getClass().getSimpleName());
    }
            
            
}
