package coleccionesgenericas;

import java.util.*;

/**
 *
 * @author octavio
 */
public class ColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList();
        miLista.add("hola1");
        miLista.add("hola2");
        miLista.add("hola3");
        
        imprimir(miLista);
        
        Set<String> miSet = new HashSet();
        
        miSet.add("100");
        miSet.add("200");
        miSet.add("400");
        miSet.add("100");
        miSet.add("200");
        
        imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap();
        
        miMapa.put("1", "Hola1");
        miMapa.put("2", "Hola");
        miMapa.put("5", "Hola5");
        miMapa.put("2", "Hola1");
        miMapa.put("1", "Hola2");
        
        imprimir(miMapa.keySet());
        
        imprimir(miMapa.values());
        
    }
    
    private static void imprimir(Collection<String> col) {
        
        for(String elemento: col) {
            System.out.println("Elemento: " + elemento);
        }
        System.out.println("");
    }
}
