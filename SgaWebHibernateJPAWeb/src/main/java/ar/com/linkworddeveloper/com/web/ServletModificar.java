package ar.com.linkworddeveloper.com.web;

import ar.com.linkworddeveloper.domain.Alumno;
import ar.com.linkworkdeveloper.servicio.ServicioAlumno;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author octavio
 */
@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet  {    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String idAlumno = request.getParameter("idAlumno");
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        Integer idAlumnos = Integer.parseInt(idAlumno);
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(idAlumnos);
        alumno = servicioAlumno.encontrarAlumno(alumno);
        
        HttpSession session = request.getSession();
        session.setAttribute("alumno", alumno);
        
        request.getRequestDispatcher("/WEB-INF/ModificarAlumnos.jsp").forward(request, response);
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        String modificar = request.getParameter("Modificar");
        if (modificar != null) {

            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String calle = request.getParameter("calle");
            String noCalle = request.getParameter("noCalle");
            String pais = request.getParameter("pais");
            String email = request.getParameter("email");
            String telefono = request.getParameter("telefono");

            HttpSession sesion = request.getSession();
            Alumno alumno = (Alumno) sesion.getAttribute("alumno");

            alumno.setNombre(nombre);
            alumno.setApellido(apellido);
            alumno.getDomicilio().setCalle(calle);
            alumno.getDomicilio().setNoCalle(noCalle);
            alumno.getDomicilio().setPais(pais);
            alumno.getContacto().setEmail(email);
            alumno.getContacto().setTelefono(telefono);

            servicioAlumno.guardarAlumno(alumno);

            sesion.removeAttribute("alumno");
        }
        else{
            //caso de eliminar
            String idAlumnoS = request.getParameter("idAlumno");
            Integer idAlumno = Integer.parseInt(idAlumnoS);
            Alumno alumno = new Alumno(idAlumno);
            servicioAlumno.eliminarAlumno(alumno);
        }
        request.getRequestDispatcher("/index.jsp").forward(request, response);
        
    }
}
