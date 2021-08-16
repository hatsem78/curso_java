<%-- 
    Document   : setterJsp
    Created on : 11 ago. 2021, 9:08:00
    Author     : octavio
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jsp que modifica a un JavaBean</title>
    </head>
    <body>
        <h1>Jsp que modifica a un JavaBean</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
        Modificamos los atributos:
        <br/>
        <br/>
        <%
            int baseValor = 2;
            int alturaValor = 1;
        %>
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>" />
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>" />
        <br/>
        Nuevo valor base: <%=baseValor%>
        <br/>
        Nuevo valor altura: <%=alturaValor%>
        <br/>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
