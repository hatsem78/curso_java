package paquete1;

/**
 *
 * @author octavio
 */
public class Clase2 {
    
    public Clase2 (){
        new Clase1 ();
        new Clase1 ("Texto1", "Texto2");
        new Clase1 ("Texto1", "Texto2", "Texto3");
        //No se puede llamar los contrusctores privados
        //new Clase1("Texto1", "Texto2", "Texto3", "Texto4");
        
    }
    
    public void pruebaDesdeClase2 () {
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico: " + c1.atributoPublico);
        System.out.println("atributo protegido: " + c1.atributoProtegido);
        System.out.println("atributo publico: " + c1.atributoPublico);
        System.out.println("atributo default o package: " + c1.atributoDefult);
        System.out.println("");
        System.out.println("Metodo Publico: " + c1.metodoPublico());
        System.out.println("Metodo protegido: " + c1.metodoProtected());
        System.out.println("Metodo default o packag: " + c1.metodoDefault());
    }
    
    public static void main(String[] args) {
        Clase2 c2 = new Clase2();
        c2.pruebaDesdeClase2();
    }
    
}
