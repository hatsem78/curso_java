package ar.com.linkworddeveloper.dao;

import static ar.com.linkworddeveloper.dao.GenericDao.em;
import ar.com.linkworddeveloper.domain.Alumno;
import ar.com.linkworddeveloper.domain.Domicilio;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author octavio
 */
public class AlumnoDAO extends GenericDao {
    
    public List<Alumno> listar() {

        String consulta = "SELECT a FROM Alumno a";

        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Alumno alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();;
            em.persist(alumno);
            em.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void actualizar(Alumno alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(alumno);
            em.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void eliminar(Alumno alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();;
            em.remove(em.merge(alumno));
            em.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Object buscarPorId(Alumno alumno) {
        em = getEntityManager();
        return em.find(Domicilio.class, alumno.getIdAlumno());
    }

}

