package ar.com.linkworkdeveloper.test.ciclovida;

import ar.com.linkworddeveloper.domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author octavio
 */
public class Estado1Persistido {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //1. estado transitivo
        Contacto contacto = null;
        contacto = new Contacto();
        
        contacto.setEmail("algo@gmail.com");
        contacto.setTelefono("1321345");
        
        
        //2. persistente
        em.getTransaction().begin();
        em.persist(contacto);
        em.getTransaction().commit();
        
        //3. detached(separado)
        System.out.println("contacto: " + contacto);
        
    }
}
