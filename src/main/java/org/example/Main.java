package org.example;


// Clase principal para ejecutar el programa
public class Main {

    public static void main(String[] args) {

        // Se crea un pedido con número 101
        Pedido pedido = new Pedido(101);

        // Se agregan productos al pedido
        pedido.agregarProducto("Teclado", 80000);
        pedido.agregarProducto("Mouse", 40000);

        // Se imprime el total calculado
        System.out.println("Total del pedido: " + pedido.calcularTotal());
    }
}
