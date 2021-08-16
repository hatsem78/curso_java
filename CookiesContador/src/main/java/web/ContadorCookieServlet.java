package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author octavio
 */
@WebServlet("/ContadorCookieServlet")
public class ContadorCookieServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
        int contador = 0;
        
        /* revisamos si existe la cookie contador */
        Cookie[] cookies = request.getCookies();
        
        if (cookies != null) {
            
            for(Cookie cookie: cookies) {
                if(cookie.getName().equals("contadorVisitas")) {
                    contador = Integer.parseInt(cookie.getValue());
                }
            }        
        }
        
        /* incrementar contador */
        contador++;
        
        /* Agregamos la respuesta al contador */
        Cookie elemento = new Cookie("contadorVisitas", Integer.toString(contador));
        elemento.setMaxAge(3600);
        response.addCookie(elemento);
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.print("Contador de visitas de cada cliente: " + contador);
        
        out.close();
    
    }
}
