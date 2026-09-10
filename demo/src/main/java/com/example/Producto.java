package com.example;

/**
 * Producto
 * -Elnombre de clase no usa la convección Pascal case, porque empieza por minúscula
 * - La variable Codigo, Stock, categoria no siguen la conveccion de camel case ya que empiezan con mayúcula
 * - La varible Nombre_Producto hace uso de la convección snake case en vez de camel case
 * - El atributo codigo no deberia ser static
 * - El tipo de dato de la variable disponible es int en lugar de boolean
 * - La variable Categoria no se usa en ningún momento en la ejecución del programa
 */
public class Producto {
    private int codigo;
    private String nombreProducto;
    private double precio;
    private  int stock;
    private boolean disponible;

    public Producto(int codigo, String nombreProducto, double precio, int stock, boolean disponible) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
        this.disponible = disponible;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void mostrarProducto() {
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Nombre: " + this.getNombreProducto());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Stock: " + this.getStock());
    }
}