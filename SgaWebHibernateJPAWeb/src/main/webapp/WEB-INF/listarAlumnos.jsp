<%-- 
    Document   : listarAlumno
    Created on : 8 sept. 2021, 17:24:56
    Author     : octavio
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Alumnos</title>
    </head>
    
    <body>
        <caption>
            Listar Alumnos
        </caption>
        <br>
        <a href="${pageContext.request.contextPath}/ServletRedireccionar">Agregar</a>
        <br>
        <table border="1">
            <thead>
                
                <tr>
                    <th>Alumno id</th>
                    <th>Apellido apellido</th>
                    <th>Domicilio</th>
                    <th>Email</th>
                    <th>Telefono</th>                    
                    <th>#</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="alumno" items="${alumnos}">
                    <tr>
                        <td><a href="${pageContext.request.contextPath}/ServletModificar?idAlumno=${alumno.idAlumno}" >${alumno.idAlumno}</a></td>
                        <td>${alumno.apellido} ${alumno.nombre}</td>
                        <td>${alumno.domicilio.calle} ${alumno.domicilio.noCalle} ${alumno.domicilio.pais}</td>
                        <td>${alumno.contacto.email}</td>
                        <td>${alumno.contacto.telefono}</td>
                    </tr>
                </c:forEach>
                    
            </tbody>
            
            
        </table>
    </body>
</html>
