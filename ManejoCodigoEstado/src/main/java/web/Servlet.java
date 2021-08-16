package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author octavio
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        /* simulamos valores correctos */
        String usuarioOk = "Juan";
        String passwordOk = "juan1234";
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        if (usuarioOk.equals(usuario) && passwordOk.equals(password)) {
            out.print("<h1>");
            out.print("Datos correctos");
            out.print("<br>Usuario: " + usuario);
            out.print("<br>Password: " + password);
            out.print("</h1>");            
        } else {
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
    }
    
}
