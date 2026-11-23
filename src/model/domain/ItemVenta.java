package model.domain;

public class ItemVenta {
    private int cantidad;
    // Asociacion: el producto existe independientemente de la venta
    private Producto producto;

    public ItemVenta(Producto producto, int cantidad) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.calcularPrecioFinal() * cantidad;
    }

    public int getCantidad() { return cantidad; }
    public Producto getProducto() { return producto; }
}
