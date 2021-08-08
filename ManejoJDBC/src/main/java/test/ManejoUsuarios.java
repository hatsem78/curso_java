package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author octavio
 */
public class ManejoUsuarios {

    public static void main(String[] args) {
        
        List<Usuario> usuarios = new ArrayList<Usuario>();
        
        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
        
        
        
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
        
        
        /* Eliminar usuario */
        usuario.setIdUsurio(1);        
        usuarioJDBC.detlete(usuario);
        
        
        /* seleccion de todos los usuarios*/
        usuarios = usuarioJDBC.select();
        
        usuarios.forEach(elemento-> {
            System.out.println("Usuario: " + elemento);
        });
        
    }
}
