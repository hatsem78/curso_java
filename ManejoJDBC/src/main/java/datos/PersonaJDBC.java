package datos;

import domain.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author octavio
 */
public class PersonaJDBC {
    
    private static final String SQL_SELECT = "select id_persona, nombre, apellido, email, telefono from persona";
    private static final String SQL_INSERT = "insert into persona(nombre, apellido, email, telefono) value(?, ? ,?, ?)";
    private static final String SQL_UPDATE = "update persona set nombre=?, apellido=?, email=?, telefono=? where id_persona=?";
    private static final String SQL_DELETE = "delete from persona where id_persona=?";
    
    public List<Persona> select() {
        Connection conn = null;
        PreparedStatement stmt =  null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
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
            Conexion.close(conn);        
        }
        
        return personas;
    }
    
    public int insert(Persona persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        //ResultSet rs = null;
        
        int row = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            System.out.println("Ejecutando query: " + SQL_INSERT);
            row = stmt.executeUpdate();
        } catch (SQLException ex) {
            //Logger.getLogger(PersonaJDBC.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);  
        }
        return row;
    }
    
    public int update(Persona persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        //ResultSet rs = null;
        
        int row = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());
            
            row = stmt.executeUpdate();
            System.out.println("Registros actualizados: " + row);
        } catch (SQLException ex) {
            //Logger.getLogger(PersonaJDBC.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);  
        }
        return row;
    }
    
    
    public int delete(Persona persona)  {
        Connection conn = null;
        PreparedStatement stmt = null;
        
        int row = 0;
        
        try {
            conn = Conexion.getConnection();
            
            System.out.println("Ejecuta query: " + SQL_DELETE);
            
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdPersona());
            
            row = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + row);
        } catch (SQLException ex) {
           //Logger.getLogger(PersonaJDBC.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        
        return row;
    }
    
}
