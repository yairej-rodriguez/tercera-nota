package sistema_biblioteca.app;

import sistema_biblioteca.servicios.Gestionar_biblio;

public class Biblioteca {
    public static void main(String[] args) {
        Gestionar_biblio gb = new Gestionar_biblio();
        gb.agregarUsuario();
        gb.agregarLibro();
        gb.mostrarUsuarios();
        gb.mostrarLibros();
    }
}