package model.domain;

public interface Vendible {
    void vender(int cantidad);
    double calcularPrecioFinal();
}
