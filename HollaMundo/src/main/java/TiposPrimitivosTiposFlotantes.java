
/**
 *
 * @author octavio
 */
public class TiposPrimitivosTiposFlotantes {

    public static void main(String args[]) {
        float floatVar = 1000;
        System.out.println("floatVar = " + floatVar);

        /* para asignar un double a un tipo float hay que agregar el literal F*/
        float floatVarF = 1000.01F;
        System.out.println("floatVar = " + floatVarF);

        System.out.println("bit en el tipo float" + Float.SIZE);
        System.out.println("bites en el tipo float" + Float.BYTES);
        System.out.println("minnimo en el tipo float" + Float.MIN_VALUE);
        System.out.println("maximo en el tipo float" + Float.MAX_VALUE);

        double dobleVar = 1000.10;
        System.out.println("dobleVar = " + dobleVar);

        /* para asignar un double a un tipo float hay que agregar el literal D*/
        double dobleVarD = 1000.01D;
        System.out.println("floatVar = " + dobleVarD);

        System.out.println("bit en el tipo double" + Double.SIZE);
        System.out.println("bites en el tipo double" + Double.BYTES);
        System.out.println("minnimo en el tipo double" + Double.MIN_VALUE);
        System.out.println("maximo en el tipo double" + Double.MAX_VALUE);

    }
}
