package com.ar.mundopc;

/**
 *
 * @author octavio
 */
public class Teclado extends DispositivoEntrada {
    
    private int idTeclado;
    private static int contadorTecaldos;
    
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = contadorTecaldos;
    }

    @Override
    public String toString() {
        return "Teclado{" 
                + "idTeclado=" + idTeclado 
                + "," + super.toString()
                + '}';
    }
}
