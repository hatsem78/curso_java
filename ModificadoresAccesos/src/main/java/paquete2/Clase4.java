package paquete2;

import paquete1.Clase1;

/**
 *
 * @author octavio
 */
public class Clase4 {
    
    public Clase4 () {
        /*
         para poder acceder a un constructor de una clase protected de otro package
         se debe acceder atavez de super, simpre que extendemos de otra clase;
         */
        //super("uno", "dos"); la palabra super solo se utiliza cuando se hace extends de una clase

        new Clase1();
        //new Clase1 ("Texto1", "Texto2"); //llamado al constructor protected
        //new Clase1 ("Texto1", "Texto2", "Texto3"); // llamado al contructor defoult o package
    
    }
    
    public void pruebaDesdeClase4() {
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico: " + c1.atributoPublico);
        
        /* no se puede acceder del atributo protegido por que no es eredado*/
        //System.out.println("atributo protegido: " + this.atributoProtegido);

        System.out.println("atributo publico: " + c1.atributoPublico);
        //System.out.println("atributo default o package: " + c1.atributoDefult);
        System.out.println("");
        System.out.println("Metodo atributoDefult: " + c1.metodoPublico());
        //System.out.println("Metodo protegido: " + c1.metodoProtected());
        //System.out.println("Metodo default o packag: " + c1.metodoDefault());
    }

    public static void main(String[] args) {
        Clase4 c4 = new Clase4();
        c4.pruebaDesdeClase4();
    }
    
}
