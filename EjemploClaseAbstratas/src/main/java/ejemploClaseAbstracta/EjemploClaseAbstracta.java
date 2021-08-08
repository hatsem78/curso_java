package ejemploClaseAbstracta;

import abstrato.domain.*;

/**
 *
 * @author octavio
 */
public class EjemploClaseAbstracta {
    public static void main(String[] args) {
        //No se puede crear o instanciar una clase abstrata;
        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        System.out.println(rectangulo);
        rectangulo.dibujar();
        
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        System.out.println(triangulo);
        triangulo.dibujar();
        
        
        FiguraGeometrica circulo = new Circulo("Circulo");
        System.out.println(circulo);
        circulo.dibujar();
    }
}
