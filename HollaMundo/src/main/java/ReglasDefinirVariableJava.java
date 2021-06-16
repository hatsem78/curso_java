/**
 *
 * @author octavio
 * pvsm es un atajo para crear el metodo main 
 * sout atajo para crear System.out.print
 * la pabra reservada var solo esta disponible a partir de la versiòn 10.
 */
public class ReglasDefinirVariableJava {
    public static void main(String args[]){
        /*variable no empiesa en mayuscula*/
        var saludar = "hola";
        
        /* identificador con varias palabras se utiliza camello ya que contiene altas y bajas*/
        var saludosDesdeJava = "Saludos desde Javas";
        
        System.out.println(saludar);
        
        System.out.println(saludosDesdeJava);
        
        
        /*cuando utilizamos la variable reservada VAR devemos si o si asignar un valor*/
        var valorInt = 1;
        var valorFloat = 1.0; 
        var valorString = "hola Java";
        
        System.out.println(valorInt);
        System.out.println(valorFloat);
        System.out.println(valorString);
        
    }
}