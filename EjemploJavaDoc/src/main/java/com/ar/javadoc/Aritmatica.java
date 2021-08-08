package com.ar.javadoc;

/**
 * Esta clase permite realizar operciones de aritmetica como sumar, restar, etc
 *
 * @author Hatsembiller Octavio
 * @version 1.0
 */
public class Aritmatica {
    
    /**
     * Primer operando
    */
    int operandoA;
    
    /**
     * Segundo operando
    */
    int operandoB;

    
    /**
    * Constructor clase basia
    */
    public Aritmatica() {
        
    }
    
    /**
    * Constructor con dos argumentos
    * @param operandoA es el primer operando tipo int
    * * @param operandoB es el segundo operando tipo int
    */
    public Aritmatica(int operandoA, int operandoB) {
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }
    
    /**
     * Este metodo realiza de dos operandos enteros
     * @return int resultado de la suma
     */
    public int sumar(){
        
        return this.operandoA + this.operandoB;
    }
    
}
