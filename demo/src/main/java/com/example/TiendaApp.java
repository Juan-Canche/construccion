package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class TiendaApp 
{

    public static Producto crearProducto(Scanner scanner) {
        System.out.println("codigo del producto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("nombre del producto: ");
        String nombreProducto = scanner.nextLine();
        System.out.println("preecio del producto: ");
        double precioProducto = scanner.nextDouble();
        System.out.println("stock disponible: ");
        int stock = scanner.nextInt();

        return new Producto(codigo, nombreProducto, precioProducto, stock, stock > 0);
    }

    public static Cliente crearCliente(Scanner scanner) {
        scanner.nextLine();
        System.out.println("nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.println("edad del cliente: ");
        int edadCliente = scanner.nextInt();

        return new Cliente(nombreCliente, edadCliente, false);
    }

    public static Venta crearVenta(Scanner scanner, Producto producto, Cliente cliente) {
        System.out.println("cantidad a comprar: ");
        int cantidad = scanner.nextInt();
        if (cantidad <= 0 || cantidad > producto.getStock()) {
            throw new IllegalArgumentException("La cantidad debe estar entre 1 y el stock disponible.");
        }

        producto.setStock(producto.getStock() - cantidad);
        producto.setDisponible(producto.getStock() > 0);
        return new Venta(producto, cliente, cantidad);
    }

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        Producto producto = crearProducto(scanner);
        Cliente cliente = crearCliente(scanner);
        Venta venta = crearVenta(scanner, producto, cliente);

        venta.imprimirTicket();

        scanner.close();

    }
}
