package ar.com.linkdorddeveloper.test.cascada;

import ar.com.linkworddeveloper.domain.Alumno;
import ar.com.linkworddeveloper.domain.Contacto;
import ar.com.linkworddeveloper.domain.Domicilio;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author octavio
 */
public class PersistenciaCascada {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("Nogales");
        domicilio.setNoCalle("10");
        domicilio.setPais("Argentina1");
        
        Contacto contacto = new Contacto();
        
        contacto.setEmail("slara@mail.com");
        contacto.setTelefono("13213215");
        
        
        Alumno alumno = new Alumno();
        
        alumno.setApellido("gomes");
        alumno.setNombre("Juan");
        
        alumno.setDomicilio(domicilio);
        
        alumno.setContacto(contacto);
        
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        
        
    }
}
