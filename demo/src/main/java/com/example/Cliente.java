package com.example;

/**
 * Cliente
 * - El nombre de clase no usa la convección Pascal case, porque empieza por minúscula
 * - La variable Edad, Vip no siguen la convección camal Case para el nombre de los atributos
 * - La variable telefono no se usa en toda la ejecución
 * - El tipo de la variable edad es erronea, ya que usa string en lugar de int.
 * - El tipo de la varible vip es erronea, ya que usa char en lugar de boolean
 * - La clase carece de un constructor y esto hace que sea dificil de crear cuando hay varios objetos
 * - Los atributos de la clase usan de anera incorrecta los modificadores de acceso, ya que deberian ser private
 * 
 */
public class Cliente {
    private String nombreCliente;
    private int edad;
    private boolean vip;

    public Cliente(String nombreCliente, int edad, boolean vip){
        this.nombreCliente = nombreCliente;
        this.edad = edad;
        this.vip = vip;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isVip() {
        return vip;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public void mostrarCliente() {
        System.out.println("Cliente: " + this.getNombreCliente()
                + " Edad: " + this.getEdad()
                + " VIP: " + this.isVip());
    }
}