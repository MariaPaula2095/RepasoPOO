package org.example;

// Clase que representa un producto dentro del sistema
public class Producto {

    // Atributo privado: nombre del producto
    // Se usa private para aplicar encapsulamiento
    private String nombre;

    // Atributo privado: precio del producto
    private double precio;

    // Constructor:
    // Se ejecuta cuando se crea un nuevo objeto Producto
    // Inicializa los atributos con los valores recibidos
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método getter para obtener el precio
    // Permite acceder al atributo privado sin modificarlo directamente
    public double getPrecio() {
        return precio;
    }

    // Método getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }
}

