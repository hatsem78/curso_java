package test;

import datos.Conexion;
import datos.UsuarioDao;
import datos.UsuarioDaoJDBC;
import domain.UsuarioDTO;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author octavio
 */
public class ManejoUsuarios {

    public static void main(String[] args) {

        Connection conn = null;
        
        try {
            
            conn = Conexion.getConnection();
            
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            
            UsuarioDao usuarioJDBC = new UsuarioDaoJDBC();

            List<UsuarioDTO> usuario = usuarioJDBC.select();

            usuario.forEach(elemento -> {
                System.out.println("Usuario DTO: " + elemento);
            });

            conn.commit();

        } catch (SQLException ex) {
            try {
                System.out.println("Entramos en el rollback");
                conn.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(ManejoUsuarios.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

    }
}
