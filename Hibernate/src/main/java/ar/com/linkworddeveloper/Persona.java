package ar.com.linkworddeveloper;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.*;

/**
 *
 * @author octavio
 */
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    private static long serialVersionUID = 1L;
    @Column(name = "id_persona")
    @Id
    private int idPersona;

    private String nombre;

    private String apellido;

    private String email;

    private String telefono;

}
