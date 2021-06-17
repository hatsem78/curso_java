
/**
 *
 * @author octavio
 */
public class PruebaAritmetica {

    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica(2, 3);
        
        int resultado = aritmetica.sumar();
        System.out.println("resultado = "  + resultado);
        
        
        Aritmetica aritmetica2 = new Aritmetica();
        aritmetica2.a = 2;
        aritmetica2.b = 6;
        
        int resultados = aritmetica2.sumar();
        System.out.println("resultado2 = "  + aritmetica2.sumar());
        
    }
}
