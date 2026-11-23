package model.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venta {
    // Composicion: los items se crean dentro de la Venta y no existen fuera de ella (1 a 1..*)
    private final List<ItemVenta> items = new ArrayList<>();

    public Venta(Producto producto, int cantidad) {
        agregarItem(producto, cantidad);
    }

    public void agregarItem(Producto producto, int cantidad) {
        ItemVenta item = new ItemVenta(producto, cantidad);
        producto.vender(cantidad);
        items.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemVenta item : items) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public List<ItemVenta> getItems() { return Collections.unmodifiableList(items); }
}
