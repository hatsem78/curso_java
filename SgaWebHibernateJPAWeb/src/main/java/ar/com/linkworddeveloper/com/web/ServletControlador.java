package ar.com.linkworddeveloper.com.web;

import ar.com.linkworddeveloper.domain.Alumno;
import ar.com.linkworkdeveloper.servicio.ServicioAlumno;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author octavio
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        ServicioAlumno servicioAlumno = new ServicioAlumno();

        List<Alumno> alumnos = servicioAlumno.listarAlumnos();
        request.setAttribute("alumnos", alumnos);

        try {
            request.getRequestDispatcher("/WEB-INF/listarAlumnos.jsp").forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

}
