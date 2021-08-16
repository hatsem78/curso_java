package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author octavio
 */
@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        /* suponemos que visita nuestro citio*/
        boolean nuevoUsuario = true;
        
        /* obtencion de todos las cookies */
        Cookie[] cookies = request.getCookies();
        
        if (cookies != null) {
        
            for (Cookie cookie:cookies) {
                if(cookie.getName().equals("visitanteRecurrente") && cookie.getValue().equals("si")) {
                    nuevoUsuario = false;
                }
            }
        }
        
        String mensaje = null;
        if (nuevoUsuario) {
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez";
        } else {
            mensaje = "Gracias por visitar nuevamente nuestro sitio";
        }
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.print("Mensaje: " + mensaje);
        
        out.close();
    
    }
}
