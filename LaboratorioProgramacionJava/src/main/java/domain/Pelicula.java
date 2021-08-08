package domain;

/**
 *
 * @author octavio
 */
public class Pelicula {
    
    private String pelicula;

    public Pelicula() {
    
    }

    public Pelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "pelicula=" + pelicula + '}';
    }
    
}
