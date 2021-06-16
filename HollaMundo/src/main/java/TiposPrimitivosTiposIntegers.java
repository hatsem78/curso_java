
import java.util.Scanner;

/**
 *
 * @author octavio
 */
public class TiposPrimitivosTiposIntegers {
    public static void main(String args[]){
        /* tipos promitivos byte, short, int, long*/

        /* no se puede asignar un valor mayor al que soporta, resultante perdida de conversiòn*/
        /*byte byteVar = 150;*/
        System.out.println("Bits tipo byte:" + Byte.SIZE);
        System.out.println("Bytes tipo byte:" + Byte.BYTES);
        System.out.println("valor minimo  tipo byte:" + Byte.MIN_VALUE);
        System.out.println("valor maximo  tipo byte:" + Byte.MAX_VALUE);
        
        System.out.println("===============================================");
        
        Short shortVar = 1000;
        System.out.println("Variable Short" + shortVar);
        
        System.out.println("Bits tipo Short:" + Short.SIZE);
        System.out.println("Bytes tipo Short:" + Short.BYTES);
        System.out.println("valor minimo  tipo Short:" + Short.MIN_VALUE);
        System.out.println("valor maximo  tipo Short:" + Short.MAX_VALUE);
        
        System.out.println("===============================================");
        
        Short intVar = 5000;
        System.out.println("Variable intVar" + shortVar);
        
        System.out.println("Bits tipo Integer:" + Integer.SIZE);
        System.out.println("Bytes tipo Integer:" + Integer.BYTES);
        System.out.println("valor minimo  tipo Integer:" + Integer.MIN_VALUE);
        System.out.println("valor maximo  tipo Integer:" + Integer.MAX_VALUE);
        
        
        
        System.out.println("===============================================");
        
        /*
            para evitar que nos de el error de que el inte es mas grande,
            se debe agregar L es tipo long
        */
        long longVar = 9223372036854775807L;
        System.out.println("Variable intVar" + longVar);
        
        System.out.println("Bits tipo long:" + Long.SIZE);
        System.out.println("Bytes tipo long:" + Long.BYTES);
        System.out.println("valor minimo  tipo long:" + Long.MIN_VALUE);
        System.out.println("valor maximo  tipo long:" + Long.MAX_VALUE);
        
        /*Al utilizar la variable reservada var asigna al valor numero int*/
        var numeroInt = 92233777;
        System.out.println("numero = " + numeroInt);
        
        /*Al utilizar la variable reservada var asigna al valor numero long*/
        var numeroLong = 92233777L;
        System.out.println("numero = " + numeroLong);
        
        
    }    
}
