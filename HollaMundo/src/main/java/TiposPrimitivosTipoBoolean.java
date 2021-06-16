/**
 *
 * @author octavio
 */
public class TiposPrimitivosTipoBoolean {
    public static void main(String args[]) {
        
        System.out.println("true tipo bollean = " + Boolean.TRUE);
        System.out.println("false tipo bollean = " + Boolean.FALSE);
        
        boolean booleanVar = true;
        
        if ( booleanVar){
            System.out.println("el valor es verdadero");
        }
        else {
            System.out.println("el valor es falso");
        }
        
        
        booleanVar = false;
        
        if ( booleanVar){
            System.out.println("el valor es verdadero");
        }
        else {
            System.out.println("el valor es falso");
        }
        
        System.out.println("");
        
        var edad = 10;
        
        var esAdulto = edad >= 10;
        
        System.out.println("esAdulto = " + esAdulto);
                

    }
}
