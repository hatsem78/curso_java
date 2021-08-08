package datos;

import domain.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author octavio
 */
public class UsuarioJDBC {

    private static String JODBC_SELECT = "select id_usuario, usuario, password from usuarios";
    private static String JODBC_INSERT = "INSERT INTO usuarios(usuario, password) value(?, ?)";
    private static String JODBC_UPDATE = "update usuarios set usuario=? , password=? where id_usuario=?";
    private static String JODBC_DELETE = "delete from usuarios where id_usuario=?";

    public List<Usuario> select() {

        List<Usuario> usuarios = new ArrayList<Usuario>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(JODBC_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                usuario = new Usuario(
                        rs.getInt("id_usuario"),
                        rs.getString("usuario"),
                        rs.getString("password")
                );

                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return usuarios;
    }

    public int insert(Usuario usuario) {
        int row = 0;
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: " + JODBC_INSERT);
            stmt = conn.prepareStatement(JODBC_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            row = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return row;
    }

    public int update(Usuario usuario) {
        int row = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: " + JODBC_UPDATE);
            stmt = conn.prepareStatement(JODBC_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getIdUsurio());

            row = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return row;
    }

    public int detlete(Usuario usuario) {

        int row = 0;
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: " + JODBC_DELETE);
            
            stmt = conn.prepareStatement(JODBC_DELETE);
            stmt.setInt(1, usuario.getIdUsurio());
            
            row = stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        return row;
    }
}
