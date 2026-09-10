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
    private static int contadorVenta = 0;
    private Producto producto;
    private Cliente cliente;
    private int cantidad;
    private double total;
    private static final double IVA = 0.16;

    public Venta(Producto producto, Cliente cliente, int cantidad) {
        this.producto = producto;
        this.cliente = cliente;
        this.cantidad = cantidad;
        contadorVenta += 1;
        calcularTotal();
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void calcularTotal() {
        double subtotal = producto.getPrecio() * this.cantidad;
        this.total = subtotal + (subtotal * IVA);
    }

    public void imprimirTicket() {
        System.out.println("Venta N: " + this.getContadorVenta());
        System.out.println("Cliente: " + cliente.getNombreCliente())
        System.out.println("Producto: " + producto.getNombreProducto());
        System.out.println("Cantidad: " + this.getCantidad());
        System.out.println("Total: " + this.getTotal());
    }
}