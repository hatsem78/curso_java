package datos;

import domain.Pelicula;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEX;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author octavio
 */
public class AccesoDatosImpl implements AccesoDatos {

    public AccesoDatosImpl() {
    
    }
    

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {

        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEX {

        File archivo = new File(nombreArchivo);

        List<Pelicula> peliculas = new ArrayList();
        String linea = null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            linea = entrada.readLine();
            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

        return peliculas;
    }

    @Override
    public void escrivirPelicula(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {

        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.print(pelicula.toString());
            System.out.println("Se ha escrito correctamente al archivo");
            salida.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEX {

        File archivo = new File(nombreArchivo);
        String resultado = null;
        String linea = null;
        int i = 0;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            linea = entrada.readLine();
            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula " + linea + " encontrada en indice " + i;
                    break;

                }
                linea = entrada.readLine();
                i++;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

        return resultado;

    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo correctamente");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        archivo.delete();
        System.out.println("Se ha borrado el archivo correctamente");
    }

}
