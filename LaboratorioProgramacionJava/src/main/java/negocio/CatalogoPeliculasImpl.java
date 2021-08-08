package negocio;

import datos.AccesoDatos;
import datos.AccesoDatosImpl;
import domain.Pelicula;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEX;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author octavio
 */
public class CatalogoPeliculasImpl  implements CatalogoPeliculas {
    
    private final AccesoDatos datos;
    
    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }
    
    @Override
    public void AgregarPelicula(String nombrePelicula, String nombreArchivo) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
            
        try {
            
            datos.escrivirPelicula(pelicula, nombreArchivo, anexar);
        } catch (EscrituraDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        
        try {
            List<Pelicula> peliculas = datos.listar(nombreArchivo);
            for (Pelicula pelicula : peliculas) {
                System.out.println("Pelicula:" + pelicula);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
        
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        try {
            String pelicula = datos.buscar(nombreArchivo, buscar);
            System.out.println("Resultado busqueda:" + pelicula);
        } catch (LecturaDatosEX ex) {
            System.out.println("Error al buscar la pelicula");
            ex.printStackTrace(System.out);
        }
        
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        try {
            if (datos.existe(nombreArchivo))  {
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            } else {
                datos.crear(nombreArchivo);
            }                
            
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }
    
}
