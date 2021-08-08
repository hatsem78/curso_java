package datos;

import domain.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author octavio
 */
public class PersonaJDBC {

    private Connection connexionTransacional;

    private static final String SQL_SELECT = "select id_persona, nombre, apellido, email, telefono from persona";
    private static final String SQL_INSERT = "insert into persona(nombre, apellido, email, telefono) value(?, ? ,?, ?)";
    private static final String SQL_UPDATE = "update persona set nombre=?, apellido=?, email=?, telefono=? where id_persona=?";
    private static final String SQL_DELETE = "delete from persona where id_persona=?";

    public PersonaJDBC() {
    }

    public PersonaJDBC(Connection conxionTransacional) {
        this.connexionTransacional = conxionTransacional;
    }

    public List<Persona> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        try {
            conn = this.connexionTransacional != null ? this.connexionTransacional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_persona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                persona = new Persona();
                persona.setIdPersona(id_persona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                persona.setEmail(email);
                persona.setTelefono(telefono);

                personas.add(persona);

            }
        } catch (SQLException ex) {
            //Logger.getLogger(PersonaJDBC.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.connexionTransacional == null) {
                Conexion.close(conn);
            }
        }

        return personas;
    }

    public int insert(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        //ResultSet rs = null;

        int row = 0;

        try {
            conn = this.connexionTransacional != null ? this.connexionTransacional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            System.out.println("Ejecutando query: " + SQL_INSERT);
            row = stmt.executeUpdate();
        } finally {
            Conexion.close(stmt);
            Conexion.close(stmt);
            if (this.connexionTransacional == null) {
                Conexion.close(conn);        
            }
        }
        return row;
    }

    public int update(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        //ResultSet rs = null;

        int row = 0;

        try {
            conn = this.connexionTransacional != null ? this.connexionTransacional : Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());

            row = stmt.executeUpdate();
            System.out.println("Registros actualizados: " + row);
        } finally {
            Conexion.close(stmt);
            Conexion.close(stmt);
            if (this.connexionTransacional == null) {
                Conexion.close(conn);        
            }
        }
        return row;
    }

    public int delete(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        int row = 0;

        try {
            conn = this.connexionTransacional != null ? this.connexionTransacional : Conexion.getConnection();

            System.out.println("Ejecuta query: " + SQL_DELETE);

            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdPersona());

            row = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + row);
        } finally {
            Conexion.close(stmt);
            Conexion.close(stmt);
            if (this.connexionTransacional == null) {
                Conexion.close(conn);        
            }
        }

        return row;
    }

}
