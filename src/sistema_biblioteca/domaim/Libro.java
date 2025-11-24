package sistema_biblioteca.domaim;

public class Libro {
    String titulo;
    String autor;
    String isbn;
    boolean estado; 
    // true = disponible, false = prestado

    public Libro(String titulo, String autor, String isbn, boolean estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = estado;
    }

    public void devolver() {
        if (!this.estado) {  // si está prestado
            this.estado = true;
            System.out.println("El libro \"" + titulo + "\" de " + autor + " ha sido devuelto.");
        } else {
            System.out.println("El libro \"" + titulo + "\" de " + autor + " ya está disponible.");
        }
    }

    public void prestar() {
        if (this.estado) { // si está disponible
            this.estado = false;
            System.out.println("El libro \"" + titulo + "\" de " + autor + " ha sido prestado.");
        } else {
            System.out.println("El libro \"" + titulo + "\" de " + autor + " ya está prestado.");
        }
    }
}
