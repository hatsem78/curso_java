package paquete1;

/**
 *
 * @author octavio
 */
public class Clase1 {
    //definicion de atributos
    public String atributoPublico = "Valor atributo publico";
    protected String atributoProtegido = "Valor atributo protegido";
    String atributoDefult = "valor atributo defult o package";
    private String atributoPrivado = "valor atributo privado";
    
    
    public Clase1() {
        System.out.println("Constructor publico");
    }
    
    public Clase1(String texto) {
        System.out.println("Constructor publico con un argumento: " + texto);
    }
    
    protected Clase1(String texto, String texto2) {
        System.out.println("Contructor protected con dos argumentos");
        System.out.println(texto);
        System.out.println(texto2);
    }
    
    
    Clase1(String texto, String texto2, String texto3) {
    
        System.out.println("Contructor default o package");
    }
    
    
    private Clase1(String texto, String texto2, String texto3, String texto4) {
    
        System.out.println("Contructor privado");
    }
    
    
    public String metodoPublico() {    
        return "Metodo Publico";
    }
    
    protected String metodoProtected() {    
        return "Metodo protected";
    }
    
    String metodoDefault() {    
        return "Metodo metodoDefault";
    }
    
    private String metodoPrivado() {    
        return "Metodo Privado";
    }
    
}
