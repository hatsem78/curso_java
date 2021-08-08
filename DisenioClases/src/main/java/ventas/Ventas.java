package ventas;

import com.ar.ventas.Orden;
import com.ar.ventas.Producto;

/**
 *
 * @author octavio
 */
public class Ventas {
    
    public static void main(String[] args) {
        
        /*crear varios objetos tipos productos*/
        Producto productos1 = new Producto("Camisa", 50);
        Producto productos2 = new Producto("Pantalon", 100);
        
        /* creamos un objecto orden */
        Orden orden1 = new Orden();
        orden1.agregarProducto(productos1);
        orden1.agregarProducto(productos2);
        
        orden1.mostrarOrden();
        
    }
}
