<%@page errorPage="WEB-INF/manjorErrores.jsp" %>
<%@page import="utileria.Conversiones, java.util.Date"  %>
<%@page contentType="aplication/vnd.ms-excel" %>
<% 
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "attachment;filename=" + nombreArchivo);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte de Excel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br>
        
        <table border="">
            <thead>
                <th>Curso</th>
                <th>Descripcòn</th>
                <th>Fecha</th>
            </thead>
            <tbody>
                <tr>
                    <td>1. Fundamentos de java</td>
                    <td>Aprenderemos la sintaxis basica de java</td>
                    <td><%= Conversiones.format(new Date()) %></td>
                </tr>
                <tr>
                    <td>2. Programaciòn con java</td>
                    <td>Pondremos en practica conceptos de la programaciòn orientada a objeto</td>
                    <td><%= Conversiones.format(new Date()) %></td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
