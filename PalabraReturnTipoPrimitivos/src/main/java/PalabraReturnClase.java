
/**
 *
 * @author octavio
 */
public class PalabraReturnClase {

    public static void main(String[] args) {
        Suma suma = createObjetoSuma();
        System.out.println("resultado del metodo sumar: " + suma.suma());
    }
    
    private static Suma createObjetoSuma() {
        return new Suma(10, 20);
    }
}

class Suma {

    int a;
    int b;

    public Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    
    public int suma() {
        return (this.a + this.b);
    }
}
