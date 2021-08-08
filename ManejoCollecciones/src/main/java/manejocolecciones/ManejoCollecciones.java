package manejocolecciones;

import java.util.*;


/**
 *
 * @author octavio
 */
public class ManejoCollecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("1");
        miLista.add(2);
        miLista.add(3);
        miLista.add(1);
        //miLista.add(1);
        
        imprimir(miLista);
        
        Set miSet = new HashSet();
        miSet.add(1);
        miSet.add(2);
        miSet.add(3);
        miSet.add(1);
        imprimir(miSet);
        
        Map miMap = new HashMap();
        miMap.put(1, "gringo");
        miMap.put(2, "octavio");
        miMap.put(3, "daniel");
        
        /* imprimir las llaves*/
        imprimir(miMap.keySet());
        
        /* imprimir las valores*/
        imprimir(miMap.values());
        
        System.out.println(miMap.get(1));
        
    }
    
    private static void imprimir(Collection coleccion) {
        for (Object elemento: coleccion)  {
            System.out.println("elemento: " + elemento);
        }
        
        System.out.println("");
    }
}
