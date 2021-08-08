package negocio;

/**
 *
 * @author octavio
 */
public interface CatalogoPeliculas {
    
    void AgregarPelicula(String nombrePelicula, String nombreArchivo);
    
    void listarPeliculas(String nombreArchivo);
    
    void buscarPelicula(String nombreArchivo, String buscar);
    
    void iniciarArchivo(String nombreArchivo);
    
}
