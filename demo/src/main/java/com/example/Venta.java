package com.example;

/**
 * Venta
 * - El nombre de la clase venta usa camelcase en vez de camel case
 * - El nombre de las variables Producto1, Cliente1 estan usando pascal case en lugar de camel case
 * - El contadorVentas no deberia ser static porque el contador
 * - El total no deria se un int, ya que se va ser uso de decimales
 * - En el calculo del total se hace el uso de un numero magico 0.16 y eso se podria hacer una constante para tener mas contexto
 * - Casteo innecesario de la varible total
 */
public class Venta {
    static int contadorVenta = 0;
    private Producto producto;
    private int cantidad;
    private int total;
    static final IVA = 0.16;

    public Venta(contadorVenta, cliente, cantidad) {
        this.contadorVenta = contadorVenta;
        this.cliente = cliente;
        this.cantidad = cantidad;
    }

    public int getContadorVenta() {
        return contadorVenta;
    }

    public void setContadorVenta(int contadorVenta) {
        this.contadorVenta = contadorVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void calcularTotal() {
        contadorVenta += 1;
        double subtotal = producto.getPrecio() * this.cantidad();
        double = subtotal + (subtotal + IVA)
    }
}