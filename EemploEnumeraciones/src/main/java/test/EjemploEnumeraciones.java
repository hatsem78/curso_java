package test;

import enumeraciones.*;

/**
 *
 * @author octavio
 */
public class EjemploEnumeraciones {
    public static void main(String[] args) {
        //valores de la enumeracion Dia
        System.out.println("valor 1: " + Dias.LUNES);
        
        //vamos a utilizar la enumeracion de Paises
        System.out.println("Continente Nº 4: " + Continentes.AMERICA);
        System.out.println("Accedemos al numero de paises del continente Nº 4: " 
                + Continentes.AMERICA.getPaices());
        for (Continentes continente: Continentes.values()) {
            System.out.println("Continentes : " + continente 
                    + " contienen " + continente.getPaices()
                    + " paises."
            );
        
        }
        indicarIdia(Dias.DOMINGO);
    }
    
    private static void indicarIdia(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case DOMINGO:
                System.out.println("7º dia de la semana");
                break;
        }
    
    }
}
