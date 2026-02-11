package org.example;

import java.util.ArrayList;
import java.util.List;

// Clase que representa un pedido de compra
public class Pedido {

    // Número identificador del pedido
    private int numeroPedido;

    // Lista de productos que pertenecen al pedido
    // Representa la relación de composición:
    // El pedido está formado por productos
    private List<Producto> productos;

    // Constructor:
    // Inicializa el número del pedido y crea la lista vacía
    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.productos = new ArrayList<>();
    }

    // Método para agregar un producto al pedido
    public void agregarProducto(String nombre, double precio) {

        // Se crea un nuevo producto y se agrega a la lista
        productos.add(new Producto(nombre, precio));
    }

    // Método que calcula el total del pedido
    public double calcularTotal() {

        double total = 0;

        // Recorre todos los productos del pedido
        for (Producto p : productos) {
            total += p.getPrecio(); // suma cada precio
        }

        return total;
    }
}
