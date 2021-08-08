package com.ar.mundopc;

import java.util.Arrays;

/**
 *
 * @author octavio
 */
public class Orden {
    
    private final int idOrden;
    private final Computadora computadoras[];
    private int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    
    public Orden() {
        this.idOrden = ++contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        
        if (contadorComputadoras <= MAX_COMPUTADORAS ) {
            computadoras[contadorComputadoras++] = computadora;
        } else {
            contadorComputadoras++;
        }        
    }
    
    public void mostrarOrden() {
        
        System.out.println("Orden #:" + this.idOrden);
        System.out.println("Computadoras de la orden #" + this.idOrden + ":");
        for (int i=0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    
    }

    @Override
    public String toString() {
        return "Orden{" 
                + "IdOrden=" + idOrden 
                + ", computadoras=" + Arrays.toString(computadoras) 
                + ", contadorOrdenes=" + contadorOrdenes 
                + ", contadorComputadoras=" 
                + contadorComputadoras + '}';
    }
    
    
}
