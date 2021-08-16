package test;

import datos.Conexion;
import datos.PersonaDAO;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;
import java.sql.*;
import java.util.List;

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
            
            PersonaDAO personaJDBC = new PersonaDaoJDBC(conn);
            List<PersonaDTO> persona = personaJDBC.select();
            
            persona.forEach(elemento->{
                System.out.println("Persona DTO: " +  elemento);
            });
            
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
