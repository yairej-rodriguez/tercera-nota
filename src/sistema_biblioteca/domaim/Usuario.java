package sistema_biblioteca.domaim;

public class Usuario {
    String nombre;
    String id;
    Libro libroPrestado;  // Solo un libro a la vez

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.libroPrestado = null;  // No tiene libros al inicio
    }

    public void prestarLibro(Libro libro) {
        // Verificar si ya tiene un libro
        if (this.libroPrestado != null) {
            System.out.println("El usuario " + nombre + " ya tiene un libro prestado: " 
                               + libroPrestado.titulo);
            return;
        }

        // Verificar si el libro está disponible
        if (!libro.estado) {
            System.out.println("El libro " + libro.titulo + " no está disponible.");
            return;
        }

        // Prestar
        libro.prestar();
        this.libroPrestado = libro;
        System.out.println("El usuario " + nombre + " ahora tiene prestado: " + libro.titulo);
    }

    public void devolverLibro() {
        if (this.libroPrestado == null) {
            System.out.println("El usuario " + nombre + " no tiene libros para devolver.");
            return;
        }

        // Devolver el libro
        libroPrestado.devolver();
        System.out.println("El usuario " + nombre + " ha devuelto el libro " 
                           + libroPrestado.titulo);

        this.libroPrestado = null; 
    }
}
