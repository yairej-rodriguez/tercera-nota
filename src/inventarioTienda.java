import java.util.Scanner;

public class InventarioTienda {

    // Arrays para almacenar información de los productos
    static String[] nombres;      // Nombres de los productos
    static int[] cantidades;      // Cantidades en inventario
    static double[] precios;      // Precio por unidad
    static double[] totales;      // Valor total por producto (cantidad * precio)

    // Matriz para clasificar productos en categorías (ejemplo: Alimentos, Limpieza, Bebidas)
    static int[][] categorias;

    static int numProductos = 0;  // Número actual de productos registrados
    static int capacidad = 5;     // Capacidad inicial de los arrays

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inicializar arrays con la capacidad inicial
        nombres = new String[capacidad];
        cantidades = new int[capacidad];
        precios = new double[capacidad];
        totales = new double[capacidad];

        // Inicializar matriz de categorías con -1 para indicar posiciones vacías
        categorias = new int[3][10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                categorias[i][j] = -1;
            }
        }

        System.out.println("Bienvenido al sistema de inventario de la tienda");

        // Solicitar al usuario ingresar al menos 5 productos inicialmente
        for (int i = 0; i < 5; i++) {
            agregarProducto(sc);
        }

        // Menú principal para interactuar con el sistema
        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar nuevo producto");
            System.out.println("2. Actualizar cantidad de un producto");
            System.out.println("3. Mostrar reporte final");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer después de leer número

            switch (opcion) {
                case 1:
                    agregarProducto(sc);  // Llamar método para agregar producto
                    break;
                case 2:
                    actualizarCantidad(sc); // Llamar método para actualizar cantidad
                    break;
                case 3:
                    generarReporte(); // Mostrar reporte final con inventario y totales
                    break;
                case 4:
                    continuar = false; // Salir del programa
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }

        sc.close(); // Cerrar scanner para liberar recursos
    }

    // Método para agregar un nuevo producto al inventario
    public static void agregarProducto(Scanner sc) {
        // Si se alcanza la capacidad máxima, ampliar los arrays
        if (numProductos == capacidad) {
            ampliarCapacidad();
        }

        // Solicitar nombre del producto
        System.out.print("Ingrese el nombre del producto " + (numProductos + 1) + ": ");
        String nombre = sc.nextLine();

        // Solicitar cantidad en inventario
        System.out.print("Ingrese la cantidad en inventario: ");
        int cantidad = sc.nextInt();

        // Solicitar precio por unidad
        System.out.print("Precio por unidad: ");
        double precio = sc.nextDouble();

        sc.nextLine(); // Limpiar buffer

        // Guardar los datos en los arrays correspondientes
        nombres[numProductos] = nombre;
        cantidades[numProductos] = cantidad;
        precios[numProductos] = precio;

        // Calcular y guardar el total para este producto
        totales[numProductos] = cantidad * precio;

        // Solicitar categoría del producto para almacenarlo en la matriz
        System.out.println("Seleccione la categoría del producto:");
        System.out.println("1 - Alimentos");
        System.out.println("2 - Limpieza");
        System.out.println("3 - Bebidas");
        System.out.print("Categoría: ");
        int cat = sc.nextInt();
        sc.nextLine();

        // Guardar el índice del producto en la primera posición vacía de la categoría
        for (int i = 0; i < categorias[cat].length; i++) {
            if (categorias[cat][i] == -1) {
                categorias[cat][i] = numProductos;
                break;
            }
        }

        numProductos++; // Incrementar contador de productos
        System.out.println("Producto agregado correctamente.");
    }

    // Método para ampliar la capacidad de los arrays cuando se llenan
    public static void ampliarCapacidad() {
        capacidad *= 2; // Duplicar la capacidad

        // Crear nuevos arrays con la nueva capacidad
        String[] nuevosNombres = new String[capacidad];
        int[] nuevasCantidades = new int[capacidad];
        double[] nuevosPrecios = new double[capacidad];
        double[] nuevosTotales = new double[capacidad];

        // Copiar datos antiguos a los nuevos arrays
        for (int i = 0; i < numProductos; i++) {
            nuevosNombres[i] = nombres[i];
            nuevasCantidades[i] = cantidades[i];
            nuevosPrecios[i] = precios[i];
            nuevosTotales[i] = totales[i];
        }

        // Reasignar referencias a los nuevos arrays
        nombres = nuevosNombres;
        cantidades = nuevasCantidades;
        precios = nuevosPrecios;
        totales = nuevosTotales;

        System.out.println("Capacidad ampliada a " + capacidad + " productos.");
    }

    // Método para actualizar la cantidad de un producto existente
    public static void actualizarCantidad(Scanner sc) {
        System.out.print("Ingrese el nombre del producto a actualizar: ");
        String nombreBuscado = sc.nextLine();

        int indice = -1;
        // Buscar el índice del producto por nombre (ignora mayúsculas/minúsculas)
        for (int i = 0; i < numProductos; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            System.out.println("Producto no encontrado.");
            return; // Salir si no se encuentra el producto
        }

        System.out.print("Ingrese la cantidad adicional que llegó: ");
        int cantidadAdicional = sc.nextInt();
        sc.nextLine();

        // Actualizar la cantidad sumando la cantidad adicional
        cantidades[indice] += cantidadAdicional;

        // Actualizar el total del producto con la nueva cantidad
        totales[indice] = cantidades[indice] * precios[indice];

        System.out.println("Cantidad actualizada. Nueva cantidad: " + cantidades[indice]);
    }

    // Método para generar y mostrar el reporte final del inventario
    public static void generarReporte() {
        double valorTotalInventario = 0; // Acumulador para el valor total del inventario

        System.out.println("\n--- Inventario de la tienda ---");
        // Recorrer todos los productos registrados
        for (int i = 0; i < numProductos; i++) {
            // Mostrar detalles de cada producto
            System.out.println("Producto: " + nombres[i] +
                    " | Cantidad: " + cantidades[i] +
                    " | Precio: " + precios[i] +
                    " | Total: " + totales[i]);
            valorTotalInventario += totales[i]; // Sumar al total general
        }
        // Mostrar el valor total acumulado del inventario
        System.out.println("Valor total del inventario: " + valorTotalInventario);
    }
}