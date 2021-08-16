package datos;

import domain.UsuarioDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author octavio
 */
public class UsuarioDaoJDBC implements UsuarioDao{
    
    private Connection connexionTransacional;
    
    private static String JODBC_SELECT = "select id_usuario, usuario, password from usuarios";
    private static String JODBC_INSERT = "INSERT INTO usuarios(usuario, password) value(?, ?)";
    private static String JODBC_UPDATE = "update usuarios set usuario=? , password=? where id_usuario=?";
    private static String JODBC_DELETE = "delete from usuarios where id_usuario=?";
    
    @Override
    public List<UsuarioDTO> select() throws SQLException {

        List<UsuarioDTO> usuarios = new ArrayList<UsuarioDTO>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        UsuarioDTO usuario = null;

        try {
            conn = this.connexionTransacional != null ? this.connexionTransacional : Conexion.getConnection();
            stmt = conn.prepareStatement(JODBC_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                usuario = new UsuarioDTO(
                        rs.getInt("id_usuario"),
                        rs.getString("usuario"),
                        rs.getString("password")
                );

                usuarios.add(usuario);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.connexionTransacional == null) {
                Conexion.close(conn);
            }
        }

        return usuarios;
    }

    @Override
    public int insert(UsuarioDTO usuario) throws SQLException {
        int row = 0;
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = this.connexionTransacional != null ? this.connexionTransacional : Conexion.getConnection();
            System.out.println("Ejecutando query: " + JODBC_INSERT);
            stmt = conn.prepareStatement(JODBC_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            row = stmt.executeUpdate();

        } finally {
            Conexion.close(stmt);
            if (this.connexionTransacional == null) {
                Conexion.close(conn);
            }
        }

        return row;
    }

    @Override
    public int update(UsuarioDTO usuario) throws SQLException {
        int row = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = this.connexionTransacional != null ? this.connexionTransacional : Conexion.getConnection();
            System.out.println("Ejecutando query: " + JODBC_UPDATE);
            stmt = conn.prepareStatement(JODBC_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getIdUsurio());

            row = stmt.executeUpdate();

        } finally {
            Conexion.close(stmt);
            if (this.connexionTransacional == null) {
                Conexion.close(conn);
            }
        }

        return row;
    }

    @Override
    public int delete(UsuarioDTO usuario) throws SQLException {

        int row = 0;
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = this.connexionTransacional != null ? this.connexionTransacional : Conexion.getConnection();
            System.out.println("Ejecutando query: " + JODBC_DELETE);
            
            stmt = conn.prepareStatement(JODBC_DELETE);
            stmt.setInt(1, usuario.getIdUsurio());
            
            row = stmt.executeUpdate();
            
        } finally {
            Conexion.close(stmt);
            if (this.connexionTransacional == null) {
                Conexion.close(conn);
            }
        }

        return row;
    }
}
