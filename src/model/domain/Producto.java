package model.domain;

public abstract class Producto implements Vendible {
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidadStock;

    public Producto(String codigo, String nombre, double precio, int cantidadStock) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que 0");
        }
        if (cantidadStock < 0) {
            throw new IllegalArgumentException("La cantidad en stock no puede ser negativa");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    @Override
    public void vender(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a vender debe ser positiva");
        }
        if (cantidad > cantidadStock) {
            throw new IllegalStateException("Stock insuficiente: disponible " + cantidadStock + ", solicitado " + cantidad);
        }
        cantidadStock -= cantidad;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidadStock() { return cantidadStock; }
}
