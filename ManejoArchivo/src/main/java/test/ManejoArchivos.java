package test;

import java.util.Iterator;
import java.util.Map;
import static utileria.Archivo.*;

/**
 *
 * @author octavio
 */
public class ManejoArchivos {

    public static void main(String[] args) {
        String nombreArchivo = "/tmp/archivo_prueba_java.txt";
        
        /* Creamos un archivo */
        crearArchivo(nombreArchivo);
        
        /* escribimos el archivo creado*/
        escribirArchivo(nombreArchivo);
        
        System.out.println("=================================================s");
        /*anxesamos informacion archivo*/
        anexarArvhivo(nombreArchivo);
        
        
        System.out.println("=================================================s");
        /*lectura del archivo*/
        leerArchivo(nombreArchivo);
        
        
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><SOAP-ENV:Envelope SOAP-ENV:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:SOAP-ENC=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:tns=\"urn:mininteriorwsdl\">   <SOAP-ENV:Body>      <ns1:consuoltaPersonaNResponse xmlns:ns1=\"https://ejemplo:13443/\">         <salida xsi:type=\"tns:salida\">            <dni xsi:type=\"xsd:string\">dni</dni>			<dni_numero xsi:type=\"xsd:string\">dni</dni_numero>            <fecha_nacimiento xsi:type=\"xsd:string\">2021-04-12</fecha_nacimiento>            <nombre xsi:type=\"xsd:string\">Pedro</nombre>            <apellido xsi:type=\"xsd:string\">Lopez</apellido>         </salida>      </ns1:consuoltaPersonaNResponse>   </SOAP-ENV:Body></SOAP-ENV:Envelope>";
        
        Map<String, String> resultado = leerXml(xml);
        
        for (Map.Entry<String, String> entry : resultado.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
