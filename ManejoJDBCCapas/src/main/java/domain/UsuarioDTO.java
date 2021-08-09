/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author octavio
 */
public class UsuarioDTO {
    
    private int idUsurio;
    private String usuario;
    private String password;

    public UsuarioDTO() {
    }

    public UsuarioDTO(int idUsurio, String usuario, String password) {
        this.idUsurio = idUsurio;
        this.usuario = usuario;
        this.password = password;
    }

    public int getIdUsurio() {
        return idUsurio;
    }

    public void setIdUsurio(int idUsurio) {
        this.idUsurio = idUsurio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario {" + "idUsurio=" + idUsurio 
                + ", usuario=" + usuario 
                + ", password=" + password 
                + '}';
    }
    
    
    
    
}
