/**
 *
 * @author octavio
 * pvsm es un atajo para crear el metodo main 
 * sout atajo para crear System.out.print
 */
public class HolaMundo {
    public static void main(String args[]){
        var usuario = "juan";
        var hola = "Hola";
        
        System.out.println(hola + " " + usuario);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j);
        
        /* encuentra un string con lo cual realiza una conatenaciòn */
        System.out.println(hola + i + j);
        
        /* si encuentra un tipo entero o flotante realiza la suma y despueès concatena*/
        System.out.println(i + j + hola);
        
    }
}