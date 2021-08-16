package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author octavio
 */

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
       String usuario = request.getParameter("usuario");
       String password = request.getParameter("password");
       System.out.println("usuario: " + usuario);
       System.out.println("password: " + password);
       PrintWriter out = response.getWriter();
       out.print("<html>");
       out.print("<body>");
       out.print("<p> el parametro usuario es: " + usuario);
       out.print("</p>");
       out.print("<p> el parametro password es: " + password);
       out.print("</p>");
       out.print("</body>");
       out.print("</html>");
    }
}
