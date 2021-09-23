package ar.com.linkworkdeveloper.test.ciclovida;

import ar.com.linkworddeveloper.domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author octavio
 */
public class Estado4EliminarObjecto {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //1. estado transitivo
        Contacto contacto = null;
        
        contacto = em.find(Contacto.class, 3);
        
        em.getTransaction().begin();
        
        em.remove(em.merge(contacto));
        em.getTransaction().commit();
        
        System.out.println("contacto: " + contacto);
        
    }
}
