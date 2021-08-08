package utileria;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 *
 * @author octavio
 */
public class Archivo {
    
    public static void crearArchivo(String file) {
    
        File archivo = new File(file);
        try {
            PrintWriter salida = new PrintWriter(file);
            salida.close();
            System.out.println("El archivo se acreado correctamente");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        }
    }
    
    public static void escribirArchivo(String file) {
        
        File archivo = new File(file);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            String contenido = "Contenido a escribir en el archivo";
            salida.println(contenido);
            salida.println("");
            salida.println("Fin de escritura");
            System.out.println("Se ha escrito correctamente el archivo");
            salida.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        }
    
    }
    
    public static void leerArchivo(String file) {
    
        File archivo = new File(file);
        try {
            BufferedReader leer = new BufferedReader( new FileReader(archivo));
            String lectura = leer.readLine();
            while (lectura != null) {
                System.out.println(lectura);
                lectura = leer.readLine();
            }
            
            leer.close();
            
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            // Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        }
        
        
    }
    
    
    public static void anexarArvhivo(String file) { 
    
        File archivo = new File(file);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            String contenido = "Anexando informacion al archivo";
            salida.println(contenido);
            salida.println();
            System.out.println("Se anezo informacion al archivo");
            salida.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            //Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        }
    }
    
    
    public static Map<String, String> leerXml(String xml) {

        /* lista de propiedades */
        Map<String, String> linkedXmlMap = new LinkedHashMap<String, String>();
        linkedXmlMap.put("transactionControlNumber", "-1");
        linkedXmlMap.put("dni", "");
        linkedXmlMap.put("dni_numero", "");
        linkedXmlMap.put("fecha_nacimiento", "0");
        linkedXmlMap.put("nombre", "");
        linkedXmlMap.put("apellido", "");
        

        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            try {

                Document docs = builder.parse(new ByteArrayInputStream(xml.getBytes()));

                docs.getDocumentElement().normalize();
                System.out.println("Root element: " + docs.getDocumentElement().getNodeName());
                NodeList nodeList = docs.getElementsByTagName("salida");

                // nodeList is not iterable, so we are using for loop
                for (int itr = 0; itr < nodeList.getLength(); itr++)
                {
                    org.w3c.dom.Node node = nodeList.item(itr);
                    System.out.println("\nNode Name :" + node.getNodeName());
                    if (node.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE)
                    {
                        Element eElement = (Element) node;
                        
                        System.out.println("dni: "+ eElement.getElementsByTagName("dni").item(0).getTextContent());
                        linkedXmlMap.put("dni", eElement.getElementsByTagName("dni").item(0).getTextContent());

                        System.out.println("dni_numero: "+ eElement.getElementsByTagName("dni_numero").item(0).getTextContent());
                        linkedXmlMap.put("dni_numero", eElement.getElementsByTagName("dni_numero").item(0).getTextContent());

                        System.out.println("fecha_nacimiento: "+ eElement.getElementsByTagName("fecha_nacimiento").item(0).getTextContent());
                        linkedXmlMap.put("fecha_nacimiento", eElement.getElementsByTagName("fecha_nacimiento").item(0).getTextContent());

                        System.out.println("nombre: "+ eElement.getElementsByTagName("nombre").item(0).getTextContent());
                        linkedXmlMap.put("nombre", eElement.getElementsByTagName("nombre").item(0).getTextContent());

                        System.out.println("apellido: "+ eElement.getElementsByTagName("apellido").item(0).getTextContent());
                        linkedXmlMap.put("apellido", eElement.getElementsByTagName("apellido").item(0).getTextContent());

                    }
                }
            } catch (IOException e) {
                //logger.error("TouchIdService - IOException error no sabemos", e);
                e.printStackTrace(System.out);
            }catch (SAXException e) {
                //logger.error("TouchIdService - SAXException error no sabemos", e);
                e.printStackTrace(System.out);
            }
            //Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (ParserConfigurationException e) {
            //logger.error("TouchIdService - ParserConfigurationException error no sabemos", e);
            e.printStackTrace(System.out);
        }
        return linkedXmlMap;
    }
    
}
