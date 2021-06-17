
/**
 *
 * @author octavio
 */
public class Aritmetica {
    
    /* Atributos */
    int a;
    int b;
    
    
    public Aritmetica(){
        
        System.out.println("Aritmetica Contstructor vacio");
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Aritmetica Contstructor con variables a y b");
    }

    public int sumar() {
        int resultado = a + b;
        return resultado;
    }
    
    public int resta() {
        int resultado = a - b;
        return resultado;
    }
    
    public int multiplicar() {
        int resultado = a * b;
        return resultado;
    }
    
    public int dividir() {
        int resultado = a + b;
        return resultado;
    }
}
