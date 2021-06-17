
/**
 *
 * @author octavio
 */
public class PalabraThis {

    public static void main(String[] args) {
       Persona persona = new Persona("Juan") ;
    }

}


class Persona {
    String nombre;
    
    Persona(String nombre) {
        this.nombre = nombre;
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this);
    }
}


class Imprimir {
    
    public void imprimir(Persona persona) {
        System.out.println("impresion del argumento persona: " + persona);
        System.out.println("impresion del objeto actual (this):" +  this);
    }
}