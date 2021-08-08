package palabrafinal;

/**
 *
 * @author octavio
 */
public final class ClaseFinal {

    public final int varNumero = 10;
    
    /* Constante en java*/
    public static final int VAR_PRIMITIVO  = 15;
    
    public static final Persona VAR_PERSONA = new Persona();
    
    public final  void metodoFinal() {};

}


/*
    No es posible extender de una clase definida como final
 */

//class ClaseHija extends ClaseFinal {
//    
//    /*
//        No es posible modificar el comportamiento (sobreescritura)
//        de un metodo padre marcado como final
//    */
//    public static void metodoFinal() {}
//
//}
