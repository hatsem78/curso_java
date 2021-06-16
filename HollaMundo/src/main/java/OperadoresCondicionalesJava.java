/**
 *
 * @author octavio
 */
public class OperadoresCondicionalesJava {
    public static void main(String args[]) {
        int a = 10;
        int variableMinimo = 0;
        int variableMaxima = 10;
        
        boolean resultado = a >= variableMinimo && a <= variableMinimo;
        System.out.println("resultado = " + resultado);
        
        boolean vaciones = false;
        boolean diaDescanso = false;
        if (vaciones || diaDescanso) {
            System.out.println("El padre asistira al juego del hijo");
        }
        else {
            System.out.println("padre esta ocupado");
        }
    }
    
}
