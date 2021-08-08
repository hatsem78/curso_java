package test;

import datos.Conexion;
import datos.PersonaJDBC;
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
public class ManejoPersonas {

    public static void main(String[] args) {
        
        Connection conn = null;
        
        try {
            conn = Conexion.getConnection();
            
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            
            PersonaJDBC personaJDBC = new PersonaJDBC(conn);
            Persona persona = new Persona();
            
            /* update tabla persona*/
            persona.setIdPersona(1);
            persona.setNombre("Lucia");
            persona.setApellido("lara");
            persona.setEmail("lara@gmail.com");
            persona.setTelefono("12345678");
            personaJDBC.update(persona);
            
            
            /* insert tabla persona*/            
            persona.setNombre("pedro");
            persona.setApellido("peres");
            persona.setEmail("pperes@gmail.com");
            //persona.setTelefono("123456788888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888");
            persona.setTelefono("3216549877");
            personaJDBC.insert(persona);
            
            System.out.println("se ha hecho commit de la transaccion");
            conn.commit();
            
            
            
            
        } catch (SQLException ex) {
            try {
                ex.printStackTrace(System.out);
                System.out.println("Entramos en el rollback");
                conn.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
        
    }
}
