package ar.com.linkworddeveloper.com.web;

import ar.com.linkworddeveloper.domain.Alumno;
import ar.com.linkworddeveloper.domain.Contacto;
import ar.com.linkworddeveloper.domain.Domicilio;
import ar.com.linkworkdeveloper.servicio.ServicioAlumno;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author octavio
 */
@WebServlet("/ServletAgregar")
public class ServletAgregar extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String calle = request.getParameter("calle");
        String noCalle = request.getParameter("noCalle");        
        String pais = request.getParameter("pais");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        
        ServicioAlumno ServicioAlumno = new ServicioAlumno();
        
        Domicilio domiciolio = new Domicilio();
        
        domiciolio.setCalle(calle);
        domiciolio.setNoCalle(noCalle);
        domiciolio.setPais(pais);
        
        Contacto contacto = new Contacto();
        
        contacto.setEmail(email);
        contacto.setTelefono(telefono);
        
        Alumno alumno = new Alumno();
        
        alumno.setApellido(apellido);
        alumno.setNombre(nombre);
        alumno.setDomicilio(domiciolio);
        alumno.setContacto(contacto);
        
        ServicioAlumno.guardarAlumno(alumno);
        
        request.getRequestDispatcher("/index.jsp").forward(request, response);    
    
    }
    
}
