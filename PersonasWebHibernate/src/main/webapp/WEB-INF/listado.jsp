<%-- 
    Document   : listadp
    Created on : 24 ago. 2021, 16:18:18
    Author     : octavio
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado de Personas</title>
    </head>
    <body>
        <table>
            <caption>Listado de Personas</caption>
            <thead bodder="1">
                <tr>
                    <th>Id Personas</th>
                    <th>Apellido</th>
                    <th>Nombre</th>
                    <th>Email</th>
                    <th>Tel.</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="persona" items="${personas}">
                    <tr>
                        <td>${persona.idPersona}</td>
                        <td>${persona.apellido}</td>
                        <td>${persona.nombre}</td>
                        <td>${persona.email}</td>
                        <td>${persona.telefono}</td>
                    </tr>
                    
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
