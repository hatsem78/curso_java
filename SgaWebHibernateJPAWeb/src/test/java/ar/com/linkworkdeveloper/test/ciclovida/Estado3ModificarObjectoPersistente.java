package ar.com.linkworkdeveloper.test.ciclovida;

import ar.com.linkworddeveloper.domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author octavio
 */
public class Estado3ModificarObjectoPersistente {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //1. estado transitivo
        Contacto contacto = null;
        
        contacto = em.find(Contacto.class, 3);
        
        contacto.setEmail("lara@.com");
        
        em.getTransaction().begin();
        em.persist(contacto);
        em.getTransaction().commit();
        
        System.out.println("contacto: " + contacto);
        
    }
}
