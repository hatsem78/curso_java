package paquete2;

import paquete1.Clase1;

/**
 *
 * @author octavio
 */
public class Clase3 extends Clase1 {

    public Clase3() {
        /*
         para poder acceder a un constructor de una clase protected de otro package
         se debe acceder atavez de super, simpre que extendemos de otra clase;
         */
        super("uno", "dos");

        new Clase1();
        //new Clase1 ("Texto1", "Texto2"); //llamado al constructor protected
        //new Clase1 ("Texto1", "Texto2", "Texto3"); // llamado al contructor defoult o package

    }

    public void pruebaDesdeClase3() {
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico: " + c1.atributoPublico);

        System.out.println("atributo protegido: " + this.atributoProtegido);

        System.out.println("atributo publico: " + c1.atributoPublico);
        //System.out.println("atributo default o package: " + c1.atributoDefult);
        System.out.println("");
        System.out.println("Metodo Publico: " + c1.metodoPublico());
        //System.out.println("Metodo protegido: " + c1.metodoProtected());
        //System.out.println("Metodo default o packag: " + c1.metodoDefault());
    }

    public static void main(String[] args) {
        Clase3 c3 = new Clase3();
        c3.pruebaDesdeClase3();
    }

}
