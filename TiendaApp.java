import java.util.Scanner;

public class TiendaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== REGISTRO DE PRODUCTOS ===");

        // 1. Array para almacenar dos objetos Producto
        Producto[] productos = new Producto[2];
        double totalGeneral = 0;

        // 2. Bucle para registrar la información de dos productos
        for (int i = 0; i < 2; i++) {
            System.out.println("\nProducto #" + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Precio: ");
            double precio = sc.nextDouble();

            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();

            // Limpia el buffer de entrada para evitar problemas con nextLine() en el siguiente ciclo
            sc.nextLine();

            // 3. Crea un nuevo objeto Producto (instanciación) y lo asigna al array
            productos[i] = new Producto(nombre, precio, cantidad);
        }

        System.out.println("\n=== RESUMEN DE INVENTARIO ===");

        // 4. Bucle para recorrer los productos, mostrar info y calcular el total general
        for (Producto p : productos) {
            p.mostrarInfo(); // Llama al método del objeto para mostrar su info
            totalGeneral += p.calcularTotal(); // Acumula el total individual al general
        }

        // 5. Muestra el total final
        System.out.println("\nTOTAL GENERAL DEL INVENTARIO: $" + totalGeneral);
    }
}