package ar.com.linkworddeveloper.servicio;

import ar.com.linkworddeveloper.dominio.Persona;
import ar.com.linkworddeveloper.dao.PersonaDao;
import java.util.List;

/**
 *
 * @author octavio
 */
public class ServicioPersonas {

    private PersonaDao personaDao;

    public ServicioPersonas() {
        this.personaDao = new PersonaDao();
    }

    public List<Persona> listarPersonas() {
        return personaDao.listar();
    }

    public void modificarPersona(Persona persona) {
        personaDao.modificar(persona);
    }

    public void insertarPersona(Persona persona) {
        personaDao.insertar(persona);
    }
    
    public Persona buscarPersonaPorId(Persona p) {
        return personaDao.buscarPersonaPorId(p);
    }
    
    public void eliminarPersona(Persona persona) {
       personaDao.eliminar(persona);
    }

}
