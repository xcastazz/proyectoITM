# Papelería — Proyecto de aula (Estructuras de datos)

Sistema de consola en Java: inventario, ventas y pedidos a proveedores.

## Arquitectura

View -> Service -> Model

- `src/model/domain/`: entidades del dominio (Producto y subtipos, Venta, ItemVenta, Proveedor, Pedido)
- `src/model/structures/`: estructuras de datos propias (sin `java.util`)
- `src/service/`: lógica de negocio y persistencia
- `src/view/`: menús de consola
- `src/util/`: utilidades (ConsoleUtils)
- `data/`: archivos de texto de persistencia
