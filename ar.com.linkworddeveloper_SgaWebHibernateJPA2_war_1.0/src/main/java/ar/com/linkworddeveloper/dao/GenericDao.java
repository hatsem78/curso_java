package ar.com.linkworddeveloper.dao;

import javax.persistence.*;

/**
 *
 * @author octavio
 */
public class GenericDao {
    
    protected static EntityManager em;
    private static EntityManagerFactory emf;
    private static final String PU = "HibernateJpaPU";

    public GenericDao() {
        if(emf == null ) {
            emf = Persistence.createEntityManagerFactory(PU);
        }
    }
    
    
    protected EntityManager getEntityManager() {
        if(em == null ) {
            em = emf.createEntityManager();
        }
        return em;
    }
    
    
    
}
