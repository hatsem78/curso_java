
/**
 *
 * @author octavio
 */
public class OperadoresUnariosJava {

    public static void main(String args[]) {
        int a = 3;
        int b = -a;

        System.out.println("valor b = " + b);

        boolean c = true;
        boolean d = !c;

        System.out.println("valor invertido de d = " + d);

        /*incremento, preincremento*/
        int e = 3;
        int f = ++e;
        System.out.println("valor de e = " + e);

        System.out.println("valor de f = " + f);

        /*post incremento*/
        int g = 5;
        int h = g++;

        System.out.println("valor de g = " + g);

        System.out.println("valor de h = " + h);
        
        /*decremento, predecremento y postdecremento*/
        
        int i = 2;
        int j = --i;
        
        System.out.println("valor de j = " + j);
        
        int k = 4;
        int l = k--;
        System.out.println("valor de l = " + l);
        System.out.println("valor de k = " + k);

    }
}
