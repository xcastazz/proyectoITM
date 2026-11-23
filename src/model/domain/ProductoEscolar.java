package model.domain;

public class ProductoEscolar extends Producto {
    private static final double DESCUENTO_PRIMARIA = 0.10;
    private String nivelEscolar;

    public ProductoEscolar(String codigo, String nombre, double precio, int cantidadStock, String nivelEscolar) {
        super(codigo, nombre, precio, cantidadStock);
        this.nivelEscolar = nivelEscolar;
    }

    @Override
    public double calcularPrecioFinal() {
        if ("primaria".equalsIgnoreCase(nivelEscolar)) {
            return getPrecio() * (1 - DESCUENTO_PRIMARIA);
        }
        return getPrecio();
    }

    public String getNivelEscolar() { return nivelEscolar; }
}
