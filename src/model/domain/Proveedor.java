package model.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Proveedor {
    private String nombre;
    private String telefono;
    private String categoriaProductos;
    // Asociacion (1 a 0..*): los pedidos existen independientemente del proveedor
    private final List<Pedido> pedidos = new ArrayList<>();

    public Proveedor(String nombre, String telefono, String categoriaProductos) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.categoriaProductos = categoriaProductos;
    }

    public void agregarPedido(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("El pedido no puede ser nulo");
        }
        pedidos.add(pedido);
    }

    public boolean quitarPedido(Pedido pedido) {
        return pedidos.remove(pedido);
    }

    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getCategoriaProductos() { return categoriaProductos; }
    public List<Pedido> getPedidos() { return Collections.unmodifiableList(pedidos); }
}
