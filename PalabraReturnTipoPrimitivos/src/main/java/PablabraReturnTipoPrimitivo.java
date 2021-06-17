
/**
 *
 * @author octavio
 */
public class PablabraReturnTipoPrimitivo {

    public static void main(String[] args) {
        sumarSinRetornarValor(3, 6);
        
        System.out.println("returno de suma: " + sumaRetornandoValor(4, 2));
    }

    private static void sumarSinRetornarValor(int argA, int argB) {
        System.out.println("suma de a + b: " + (argA + argB));
    }

    private static int sumaRetornandoValor(int a, int b) {
        return a + b;
    }

    
}
