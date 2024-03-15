package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Orden orden1 = new Orden();
        Producto leche = new Producto("Leche", 25);
        Producto limon = new Producto("Limon", 15);
        Producto galletas = new Producto("Galletas", 12);
        orden1.agregarProducto(leche);
        orden1.agregarProducto(limon);
        orden1.agregarProducto(galletas);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        Producto guayaba = new Producto("Guayaba", 18.56);
        orden2.agregarProducto(guayaba);
        orden2.agregarProducto(galletas);
        orden2.mostrarOrden();
    }
}
