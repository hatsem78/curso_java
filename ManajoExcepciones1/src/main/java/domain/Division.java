package domain;

/**
 *
 * @author octavio
 */
public class Division {

    private int numerador;
    private int denominador;

    public Division(int numerador, int denominador) throws OperacionExcepcion {
        if (denominador == 0) {
            throw new OperacionExcepcion("Denominador igual a cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public void visualizarDivicion() {
    
        System.out.println("El resultado de la division es:" + (this.numerador / this.denominador));
    }

}
