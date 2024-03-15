package mx.com.gm.ventas;

public class Orden {
    private final static int MAX_PRODUCTS = 10;
    private int idOrden;
    private Producto productos[] = new Producto[MAX_PRODUCTS];
    private static int contadorOrdenes;
    private int contadorListaProductos = 0;

    public static int getMaxProducts() {
        return MAX_PRODUCTS;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public static int getContadorOrdenes() {
        return contadorOrdenes;
    }

    public static void setContadorOrdenes(int contadorOrdenes) {
        Orden.contadorOrdenes = contadorOrdenes;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
    }

    public int getContadorListaProductos() {
        return contadorListaProductos;
    }

    public void setContadorListaProductos(int contadorListaProductos) {
        this.contadorListaProductos = contadorListaProductos;
    }

    public void agregarProducto(Producto producto){
        if (this.contadorListaProductos < Orden.MAX_PRODUCTS){
            productos[contadorListaProductos++] = producto;
            System.out.println("Producto agregado exitosamente");
        }
        else{
            System.out.println("No se pueden agregar más productos " + Orden.MAX_PRODUCTS);
        }
    }

    public double calcularTotal(){
        double total = 0.0;
        for (int i = 0; i < this.contadorListaProductos; i++) {
            if(productos[i] != null)
                total += productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.printf("Orden Nº%d\n",idOrden);
        System.out.println("ID      Producto        Precio");
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null)
                System.out.printf("%s\n",productos[i].toString());
        }
        
        System.out.printf("Total %.2f",calcularTotal());
    }

}
