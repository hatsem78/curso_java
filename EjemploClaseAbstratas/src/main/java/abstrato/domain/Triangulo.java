package abstrato.domain;

/**
 *
 * @author octavio
 */
public class Triangulo extends FiguraGeometrica {

    public Triangulo(String tipoFigura) {
        super(tipoFigura = tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Aquì deberia dibujar: " + this.getClass().getCanonicalName());
    }
}
