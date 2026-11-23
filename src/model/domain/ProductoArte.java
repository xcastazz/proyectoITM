package model.domain;

public class ProductoArte extends Producto {
    private static final double RECARGO = 0.12;
    private String tipoMaterial;

    public ProductoArte(String codigo, String nombre, double precio, int cantidadStock, String tipoMaterial) {
        super(codigo, nombre, precio, cantidadStock);
        if (tipoMaterial == null || tipoMaterial.isBlank()) {
            throw new IllegalArgumentException("El tipo de material no puede estar vacío");
        }
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * (1 + RECARGO);
    }

    public String getTipoMaterial() { return tipoMaterial; }
}
