package sistema_biblioteca.servicios;
import java.util.Scanner;

public class Gestionar_biblio {

    String[] usuarios;
    String[] libros;
    String[] librosPrestadosA;

    int contadorUsuarios = 0;
    int contadorLibros = 0;

    Scanner scanner = new Scanner(System.in);

    public Gestionar_biblio() {
        usuarios = new String[100];
        libros = new String[100];
        librosPrestadosA = new String[100];
    }

    public void agregarUsuario() {
        System.out.println("Ingrese el nombre del usuario:");
        String nombre = scanner.nextLine();

        usuarios[contadorUsuarios] = nombre;
        contadorUsuarios++;

        System.out.println("Usuario agregado: " + nombre);
    }

    public void agregarLibro() {
        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();

        libros[contadorLibros] = titulo;
        librosPrestadosA[contadorLibros] = null;
        contadorLibros++;

        System.out.println("Libro agregado: " + titulo);
    }

    public void mostrarUsuarios() {
        System.out.println("Lista de usuarios:");
        for (int i = 0; i < contadorUsuarios; i++) {
            System.out.println((i + 1) + ". " + usuarios[i]);
        }
    }

    public void mostrarLibros() {
        System.out.println("Lista de libros:");
        for (int i = 0; i < contadorLibros; i++) {
            if (librosPrestadosA[i] == null) {
                System.out.println((i + 1) + ". " + libros[i] + " (Disponible)");
            } else {
                System.out.println((i + 1) + ". " + libros[i] + " — Prestado a: " + librosPrestadosA[i]);
            }
        }
    }

    public void prestarLibro(String usuario, String libro) {

        // Verificar si el usuario existe
        if (!existeUsuario(usuario)) {
            System.out.println("El usuario no está registrado.");
            return;
        }

        int indexLibro = buscarLibro(libro);

        if (indexLibro == -1) {
            System.out.println("El libro no existe.");
            return;
        }

        if (librosPrestadosA[indexLibro] != null) {
            System.out.println("Este libro ya está prestado a " + librosPrestadosA[indexLibro]);
            return;
        }

        librosPrestadosA[indexLibro] = usuario;

        System.out.println("El libro '" + libro + "' ha sido prestado a " + usuario + ".");
    }

    public void devolverLibro(String libro) {

        int indexLibro = buscarLibro(libro);

        if (indexLibro == -1) {
            System.out.println("El libro no existe.");
            return;
        }

        if (librosPrestadosA[indexLibro] == null) {
            System.out.println("El libro no está prestado.");
            return;
        }

        System.out.println("El libro '" + libro + "' ha sido devuelto por " + librosPrestadosA[indexLibro]);
        librosPrestadosA[indexLibro] = null;
    }

    private int buscarLibro(String libro) {
        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i].equalsIgnoreCase(libro)) {
                return i;
            }
        }
        return -1;
    }

    private boolean existeUsuario(String usuario) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i].equalsIgnoreCase(usuario)) {
                return true;
            }
        }
        return false;
    }
}
