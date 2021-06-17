/**
 *
 * @author octavio
 */
public class TiposPrimitivosTipoChar {
   
    public static void main(String args[]) {
        

        System.out.println("bit en el tipo char" + Character.SIZE);
        System.out.println("bites en el tipo char" + Character.BYTES);
        System.out.println("minnimo en el tipo char" + Character.MIN_VALUE);
        System.out.println("maximo en el tipo char" + Character.MAX_VALUE);
        
        char varChar = 'a';
        System.out.println("varChar = " + varChar);
        
        char varCharU = '\u0021';
        System.out.println("varCharU = " + varCharU);
        
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);

    }
}
