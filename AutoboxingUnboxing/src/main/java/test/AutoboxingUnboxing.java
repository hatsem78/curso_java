package test;

/**
 *
 * @author octavio
 */
public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //Autoboxing (envolvemos tipos primitivos en clases wrapper)
        Integer entero = 10;
        System.out.println("entero: " + entero.intValue());
        
        //Utoboxing (envolvemos tipos primitivos en clases wrapper)
        int enteroObj = entero;
        System.out.println("enteroObj = " + enteroObj);
        
        Float floatObj = 15.5F;
        float flotante = floatObj;
        System.out.println("floatObj = " + floatObj);
        System.out.println("flotante = " + flotante);
        System.out.println("floatObj valor entero = " + floatObj.intValue());
        
        /*
        listado de las clases envolventes
        boolean - Bolean
        byte - Byte
        char - Char
        short - Short
        int - Interger
        float - Float
        long - Long
        double - Double
        
        
        */
        
    }
}
