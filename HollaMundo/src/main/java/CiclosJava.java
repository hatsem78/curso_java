/**
 *
 * @author octavio
 */
public class CiclosJava {
    public static void main(String args[]) {
        int contador = 0;
        
        while (contador <= 3) {
            System.out.println("while contador = " + contador);
            contador++;
            
        }
        
        do {
            System.out.println("do while contador = " + contador);
            contador++;
            
        } while (contador <= 6);
        
        
        for ( int i = 0; i <= 6; i++ ) {
            
            if ( i == 4 ) {
                System.out.println("continue 4");
                continue;
            } else if ( i == 5 ) {
                System.out.println("break 5");
                break;
            }
            
            System.out.println("for i = " + i);
        }
        
        inicio:
        for ( int i = 0; i <= 6; i++ ) {
            
            if ( i % 2 == 0 ) {
                System.out.println("continue pares " + i);
                continue inicio;
            
        }
    }
    
}
