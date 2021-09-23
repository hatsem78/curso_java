package ar.com.linkworddeveloper.dao;

import ar.com.linkworddeveloper.dominio.Persona;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author octavio
 */


public class PersonaDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDao() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }

    public List<Persona> listar() {
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
        /*for (Persona p : personas) {
            System.out.println("p = " + p);
        } */
        return personas;
    }

    public void insertar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
//        finally{
//            if(em != null){
//                em.close();
//            }
//        }
    }

    public void modificar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.merge(persona);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
//        finally{
//            if(em != null){
//                em.close();
//            }
//        }
    }

    public Persona buscarPersonaPorId(Persona p) {
        return em.find(Persona.class, p.getIdPersona());
    }
    
    public Persona buscarPersonaPorTelefono(Persona p) {
        return em.find(Persona.class, p.getTelefono());
    }
    
    public void eliminar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(persona));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
//        finally{
//            if(em != null){
//                em.close();
//            }
//        }
    }

}