package abstrato.domain;

/**
 *
 * @author octavio
 */
public class Circulo extends FiguraGeometrica{

    public Circulo(String tipoFigura) {
        super(tipoFigura = tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Aquì deberia dibujar: " + this.getClass().getCanonicalName());
    }
    
    
    
}
