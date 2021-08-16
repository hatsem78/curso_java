package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author octavio
 */
@WebServlet("/ServletHeders")
public class ServletHeders extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    
        response.setContentType("text/html;chartset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String methodHttp = request.getMethod();
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP </title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Headers HTTP </h1>");
        out.print("<br>");
        out.print("Metodo HTTP: " + methodHttp);
        out.print("<br>");
        
        String uri = request.getRequestURI();
        out.print("Uri solicitada: " + methodHttp);
        out.print("<br>");
        
        Enumeration cabeceros = request.getHeaderNames();
        
        while(cabeceros.hasMoreElements()) {
            String cabecero = cabeceros.nextElement().toString();
            out.print("<br>");
            out.print(request.getHeader(cabecero));
            out.print("<br>");            
        }
        
        
        out.print("</dody>");
        out.print("</html>");
        out.close();
        
    }
    
}
