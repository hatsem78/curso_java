package com.ar.mundopc;

/**
 *
 * @author octavio
 */
public class Computadora {

    private int IdComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado tecaldo;
    private Raton raton;
    private static int contadorComputadoras;

    private Computadora() {
        this.IdComputadora = ++contadorComputadoras;
    }

    public Computadora(
            String nombre,
            Monitor monitor,
            Teclado teclado,
            Raton raton
    ) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.tecaldo = teclado;
        this.raton = raton;
    }

    public int getIdComputadora() {
        return IdComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTecaldo() {
        return tecaldo;
    }

    public void setTecaldo(Teclado tecaldo) {
        this.tecaldo = tecaldo;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }

    @Override
    public String toString() {
        return "Computadora{" 
                + "IdComputadora=" + IdComputadora 
                + ", nombre=" + nombre 
                + ", monitor=" + monitor 
                + ", tecaldo=" + tecaldo
                + ", raton=" + raton 
                + '}';
    }
    
    
}
