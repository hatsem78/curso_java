
/**
 *
 * @author octavio
 */
public class Caja {

    /* Atributos */
    int ancho;
    int alto;
    int profundo;

    public Caja() {
        System.out.println("Constructor Caja vacio");

    }

    public Caja(int arg1, int arg2, int arg3) {
        this.ancho = arg1;
        this.alto = arg2;
        this.profundo = arg3;
    }

    public int calcularArea() {
        int vol = (this.ancho * this.alto * this.profundo);
        return vol;
    }

}
