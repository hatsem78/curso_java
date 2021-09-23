package test;

import ar.com.linkworddeveloper.Persona;
import ar.com.linkworddeveloper.dao.PersonaDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author octavio
 */
public class OperacionesHibernateJPA {
 
    public static void main(String[] args) {
        
        PersonaDao personaDao = new PersonaDao();
        personaDao.listar();
        
        Persona persona = new Persona();
        Persona persona2 = new Persona();
        
        persona.setApellido("Perez");
        persona.setNombre("Juan");
        persona.setEmail("perez@gmail.com");
        persona.setTelefono("7777777");
        
        personaDao.insertar(persona);
        
        persona2.setIdPersona(1);
        
        persona2 = personaDao.buscarPersonaPorId(persona2);
        
        persona2.setTelefono("555555555");
        
        personaDao.modificar(persona2);
        
        personaDao.listar();

    }
}
