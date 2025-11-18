class Producto {
    // Atributos (Encapsulamiento: 'private' para proteger los datos)
    private String nombre;//final
    private double precio;//final
    private int cantidad;//final

    // Constructor: Se usa para inicializar un objeto Producto
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método que calcula el valor total del inventario de este producto
    public double calcularTotal() {
        return precio * cantidad;
    }

    // Método que muestra toda la información del producto
    public void mostrarInfo() {
        System.out.println("\nProducto: " + nombre);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        // Llama al método calcularTotal() para obtener el total
        System.out.println("Total: $" + calcularTotal());
    }
}