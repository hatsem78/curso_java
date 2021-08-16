<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con scriptlets</title>
    </head>
    <body>
        <h1>JSP con scriptlets</h1>
        <%-- Scriptlet para enviar informacion al navegador --%>
        <% 
            out.print("Saludos desde un scriptlet");
        %>
        <%-- Scriptlet para manejar los objectos explicitos --%>
        <% 
            String nombreAplicacion = request.getContextPath();
            out.print("Nombre de la aplicaciòn: " + nombreAplicacion);
        %>
        
        <%-- Scriptlet con codigo condicionado --%>
        
        <%
            if(session == null && session.isNew()) {
        %>
        la session nueva
        <%
            } else if(session != null) {
        %>
        la session no es nueva
        <%
            }
        %>
    </body>
</html>
