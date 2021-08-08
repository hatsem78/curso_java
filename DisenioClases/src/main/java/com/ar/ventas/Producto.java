package com.ar.ventas;

/**
 *
 * @author octavio
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;
    
    private Producto() {
        this.idProducto = ++contadorProducto;
    }
    
    /* Contrusctor sobrecargado dos argumento*/
    public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProducto() {
        return contadorProducto;
    }

    @Override
    public String toString() {
        return "Producto \n{" 
                + "idProducto=" + idProducto 
                + ", nombre=" + nombre 
                + ", precio=" + precio 
                + "\n}";
    }

    
    
    
    
}
