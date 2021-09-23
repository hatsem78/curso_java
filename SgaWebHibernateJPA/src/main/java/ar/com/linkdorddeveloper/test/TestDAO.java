package ar.com.linkdorddeveloper.test;

import ar.com.linkworddeveloper.dao.AlumnoDAO;
import ar.com.linkworddeveloper.dao.AsignacionDAO;
import ar.com.linkworddeveloper.dao.ContactoDAO;
import ar.com.linkworddeveloper.dao.CursoDao;
import ar.com.linkworddeveloper.dao.DomicilioDAO;
import java.util.List;

/**
 *
 * @author octavio
 */
public class TestDAO {
    public static void main(String[] args) {
        AlumnoDAO alumno = new AlumnoDAO();
        System.out.println("Alumnos:" );
        imprimir(alumno.listar());
        
        DomicilioDAO domicilio = new DomicilioDAO();
        System.out.println("domicilio:" );
        imprimir(domicilio.listar());
        
        
        ContactoDAO contactoDAO = new ContactoDAO();
        System.out.println("contactoDAO:" );
        imprimir(contactoDAO.listar());
        
        CursoDao cursoDAO = new CursoDao();
        System.out.println("cursoDAO:" );
        imprimir(cursoDAO.listar());
        
        AsignacionDAO asignacionDAO = new AsignacionDAO();
        System.out.println("AsignacionDAO:" );
        imprimir(asignacionDAO.listar());
    }
    
    private static void imprimir(List coleccion) {
        for(Object o: coleccion) {
            System.out.println("valor = " + o);
        }
    }
}
