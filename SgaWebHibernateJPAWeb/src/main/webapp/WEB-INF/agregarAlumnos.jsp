<%-- 
    Document   : agregarAlumnos
    Created on : 8 sept. 2021, 17:53:07
    Author     : octavio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Alumnos</title>
    </head>
    <body>
        <h1>Agregar Alumnos</h1>
        
        <form name="form1" action="${pageContext.request.contextPath}/ServletAgregar" method="post">
            Nombre: <input type="text" name="nombre">
            <br>
            Apellido: <input type="text" name="apellido">
            <br>
            <br>
            Datos domicilio:
            <br>
            Calle: <input type="text" name="calle">
            <br>
            No. Calle: <input type="text" name="noCalle">
            <br>
            Pais: <input type="text" name="pais">
            <br>
            <br>
            Datos de contacto
            <br>
            Email <input type="email" name="email">
            <br>
            No. Calle: <input type="tel" name="telefono">
            <br>
            <input type="submit" name="Agregar" value="Agregar">
            
        </form>
    </body>
</html>
