package ar.com.linkworkdeveloper.servicio;

import ar.com.linkworddeveloper.dao.AlumnoDAO;
import ar.com.linkworddeveloper.domain.Alumno;
import java.util.List;

/**
 *
 * @author octavio
 */
public class ServicioAlumno {
    private AlumnoDAO alumnoDao = new AlumnoDAO();
    
    public List<Alumno> listarAlumnos() {
        return alumnoDao.listar();
    
    }
    
    public void guardarAlumno(Alumno alumno) {
        
        if(alumno != null && alumno.getIdAlumno() == null ) {
            alumnoDao.insertar(alumno);
        } else {
            alumnoDao.actualizar(alumno);
        }
    }
    
    
    public void eliminarAlumno(Alumno alumno) {
        alumnoDao.eliminar(alumno);
    }
    
    
    public Alumno encontrarAlumno(Alumno alumno) {
        
        return alumnoDao.buscarPorId(alumno);
    }
}
