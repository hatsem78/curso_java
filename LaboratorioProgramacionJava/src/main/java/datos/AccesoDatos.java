package datos;

import domain.Pelicula;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEX;
import java.util.List;

/**
 *
 * @author octavio
 */
public interface AccesoDatos {
    
    boolean existe(String nombreArchivo) throws AccesoDatosEx;
    
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEX;
    
    void escrivirPelicula(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEX;
    
    void crear(String nombreArchivo) throws AccesoDatosEx;
    
    void borrar(String nombreArchivo) throws AccesoDatosEx;
}
