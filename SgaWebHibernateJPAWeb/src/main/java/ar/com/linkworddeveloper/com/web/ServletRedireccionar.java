/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@WebServlet("/ServletRedireccionar")
public class ServletRedireccionar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/WEB-INF/agregarAlumnos.jsp").forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

}
