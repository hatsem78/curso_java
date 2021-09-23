package ar.com.linkworddeveloper.dao;

import static ar.com.linkworddeveloper.dao.GenericDao.em;
import ar.com.linkworddeveloper.domain.Curso;
import ar.com.linkworddeveloper.domain.Domicilio;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author octavio
 */
public class CursoDao extends GenericDao {

    public List<Curso> listar() {

        String consulta = "SELECT c FROM Curso c";

        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Curso curso) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();;
            em.persist(curso);
            em.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void actualizar(Curso curso) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(curso);
            em.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void eliminar(Curso curso) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();;
            em.remove(em.merge(curso));
            em.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Object buscarPorId(Curso curso) {
        em = getEntityManager();
        return em.find(Domicilio.class, curso.getIdCurso());
    }

}

