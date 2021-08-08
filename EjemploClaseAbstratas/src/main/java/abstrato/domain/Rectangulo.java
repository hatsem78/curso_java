package abstrato.domain;

/**
 *
 * @author octavio
 */
public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(String tipoFigura) {
        super(tipoFigura = tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Aquì deberia dibujar: " + this.getClass().getCanonicalName());
    }
}
