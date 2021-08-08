package test;

import datos.Conexion;
import datos.UsuarioJDBC;
import domain.Usuario;
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
        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
        try {
            conn = Conexion.getConnection();
            
            Usuario usuario = new Usuario();
        
            /* insertar un usuario a la tabla usuario */
            usuario.setUsuario("juan");
            usuario.setPassword("juan123");
            usuarioJDBC.insert(usuario);

            /* insertar un usuario a la tabla usuario */
            usuario.setUsuario("pedro");
            usuario.setPassword("pedro123");

            usuarioJDBC.insert(usuario);

            /* update tabla usuairo nombre */

            usuario.setUsuario("juanes");        
            usuarioJDBC.update(usuario);
            
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
