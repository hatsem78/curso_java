package bloquecodigo;

/**
 *
 * @author octavio
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    /*bloque codigo anonimo statico*/
    static {
        contadorPersona = 10;
        System.out.println("Se ejecuta bloque anonimo staticas");
        //no se pueden usar variables no static en bloque static
        //idPersona = 10;
    }
    
    /* Bloque no estatico se copia a cada onjecto*/
    {
        System.out.println("Bloque no estatico");
        this.idPersona = ++contadorPersona;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

}
