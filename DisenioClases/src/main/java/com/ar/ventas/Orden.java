package com.ar.ventas;

/**
 *
 * @author octavio
 */
public class Orden {
    
    private int IdOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    public Orden() {
        this.IdOrden = ++contadorOrdenes;
        /* inicialisamos el arreglo*/
        this.productos = new Producto[MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        if (this.contadorProductos <= 10) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos:" + MAX_PRODUCTOS);
        }
        
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i=0; i< this.contadorProductos; i++){
            Producto producto = this.productos[i];
            total += producto.getPrecio();
            
        }
        return total;
    }
    
    public void mostrarOrden() {
    
        System.out.println("Orden ·:" + this.IdOrden);
        System.out.println("Total de la Orden @" + this.calcularTotal());
        System.out.println("Productos de la Orden");
        
        for (int i=0; i< this.contadorProductos; i++){
            System.out.println(this.productos[i]);
        }
    }
}
