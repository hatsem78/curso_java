package enumeraciones;

/**
 *
 * @author octavio
 */
public enum Continentes {
    AFRICA(53),
    EUROPA(44),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    //Atributos de paises
    private final int paises;

    Continentes(int paises) {
        this.paises = paises;
    }
    
    public int getPaices() {
        return this.paises;
    }
}
