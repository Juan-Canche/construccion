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
    private int contadorVenta = 0;
    private Producto producto;
    private int cantidad;
    private int total;
    
}