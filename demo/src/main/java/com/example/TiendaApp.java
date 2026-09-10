package com.example;

import java.util.Scanner;

/**
 * El nombre de las variables p1, c1 y v1 son ambiguos, as[i ue se cambiaron por nombres mas claros y representativos de los objetos
 * Las x, y, z no tiene uso real en la lógica del programa, por lo que conviene eliminarlas.
 * Existe una constante PI que no tienen ningún uso en el programa, por lo que conviene eliminarla.
 * La estructura para el registro de los datos para productos, clientes y ventas podria modificarse con un constructor
 * Ciertos atributos de los objetos son hardcodeados en vez de registrados por el usuario
 * No hace uso de validaciones para casos como que la cantidad del producto a comprar sea menor o igual al stock disponible
 */
public class TiendaApp 
{

    public static Producto crearProducto(Scanner scanner) {
        System.out.println("Codigo del producto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nombre del producto: ");
        String nombreProducto = scanner.nextLine();
        System.out.println("Precio del producto: ");
        double precioProducto = scanner.nextDouble();
        System.out.println("Stock disponible: ");
        int stock = scanner.nextInt();

        return new Producto(codigo, nombreProducto, precioProducto, stock, stock > 0);
    }

    public static Cliente crearCliente(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.println("Edad del cliente: ");
        int edadCliente = scanner.nextInt();

        return new Cliente(nombreCliente, edadCliente, false);
    }

    public static Venta crearVenta(Scanner scanner, Producto producto, Cliente cliente) {
        System.out.println("Cantidad a comprar: ");
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
