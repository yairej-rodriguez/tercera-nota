package unidad1;

import java.util.Scanner;

public class menuInteractivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elige una opción (1-5): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    recomendarComida();
                    break;
                case 2:
                    recomendarPelicula();
                    break;
                case 3:
                    recomendarLibro();
                    break;
                case 4:
                    recomendarActividad();
                    break;
                case 5:
                    System.out.println("¡Gracias por usar el sistema de recomendaciones!");
                    break;
                default:
                    System.out.println("⚠️ Opción no válida. Por favor, intenta de nuevo.");
            }

            System.out.println(); // Salto de línea
        } while (opcion != 5);

        scanner.close();
    }

    // Método para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("===== MENÚ DE RECOMENDACIONES =====");
        System.out.println("1. Recomendar comida 🍕");
        System.out.println("2. Recomendar película 🎬");
        System.out.println("3. Recomendar libro 📚");
        System.out.println("4. Recomendar actividad 🎯");
        System.out.println("5. Salir 🚪");
    }

    // Recomendaciones simples
    public static void recomendarComida() {
        String[] comidas = {"Pizza", "Sushi", "Tacos", "Pasta", "Hamburguesa"};
        int index = (int)(Math.random() * comidas.length);
        System.out.println("🍽️ Te recomendamos probar: " + comidas[index]);
    }

    public static void recomendarPelicula() {
        String[] peliculas = {"Inception", "El viaje de Chihiro", "Interstellar", "Coco", "Matrix"};
        int index = (int)(Math.random() * peliculas.length);
        System.out.println("🎥 Hoy podrías ver: " + peliculas[index]);
    }

    public static void recomendarLibro() {
        String[] libros = {"1984 - George Orwell", "Cien años de soledad - Gabriel García Márquez", 
                           "El Alquimista - Paulo Coelho", "Sapiens - Yuval Noah Harari", "Harry Potter - J.K. Rowling"};
        int index = (int)(Math.random() * libros.length);
        System.out.println("📖 Una buena lectura sería: " + libros[index]);
    }

    public static void recomendarActividad() {
        String[] actividades = {"Salir a caminar", "Escuchar música", "Meditar", "Aprender algo nuevo en YouTube", "Hacer ejercicio"};
        int index = (int)(Math.random() * actividades.length);
        System.out.println("🎯 Te sugerimos: " + actividades[index]);
    }
}
