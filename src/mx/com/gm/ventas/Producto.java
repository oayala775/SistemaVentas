package mx.com.gm.ventas;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public static void setContadorProductos(int contadorProductos) {
        Producto.contadorProductos = contadorProductos;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public Producto() {
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.idProducto = ++Producto.contadorProductos;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(idProducto).append("\t").append(nombre).append("\t\t").append(precio);
        return sb.toString();

    }

}
