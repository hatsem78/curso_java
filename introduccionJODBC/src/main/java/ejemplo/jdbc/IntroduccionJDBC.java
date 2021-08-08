package ejemplo.jdbc;

import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author octavio
 */
public class IntroduccionJDBC {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
            
            /* objecto de conexòn*/
            Connection conexion = DriverManager.getConnection(url, "root", "root@2021");
            
            /* Creamos un objecto tipo Statement*/
            Statement instruccion = conexion.createStatement();
            
            /* creacion consulta sql */
            String sql = "select id_persona, nombre, apellido, email, telefono from persona";
            
            ResultSet resultado = instruccion.executeQuery(sql);
            
            /* procesamos el resultado */
            while (resultado.next()) {
                System.out.print("Id_persona: " + resultado.getInt(1));
                System.out.print(", Nombre: " + resultado.getString(2));
                System.out.print(", Apellido: " + resultado.getString(3));
                System.out.print(", email: " + resultado.getString(4));
                System.out.println(", telefono: " + resultado.getString(5));
            }
            
            /* cerramos todas las conexiones */
            resultado.close();
            instruccion.close();
            conexion.close();
            
            /* realizamos un insert en la base de datos */
            
            
        } catch (SQLException ex) {
            //Logger.getLogger(IntroduccionJDBC.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        }
    }
}
