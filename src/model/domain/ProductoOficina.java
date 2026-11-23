package model.domain;

public class ProductoOficina extends Producto {
    private static final double RECARGO = 0.08;
    private String categoria;

    public ProductoOficina(String codigo, String nombre, double precio, int cantidadStock, String categoria) {
        super(codigo, nombre, precio, cantidadStock);
        this.categoria = categoria;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * (1 + RECARGO);
    }

    public String getCategoria() { return categoria; }
}
