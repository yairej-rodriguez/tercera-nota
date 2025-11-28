package Videojuego;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos para el personaje del usuario
        System.out.println("Ingresa el nombre de tu personaje:");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Elige el bando de tu personaje:");
        System.out.println("1. Heroe");
        System.out.println("2. Villano");
        int bandoUsuario = scanner.nextInt();
        scanner.nextLine(); // Consumir el newline

        System.out.println("Ingresa la fuerza de tu personaje (valor positivo):");
        int fuerzaUsuario = scanner.nextInt();
        if (fuerzaUsuario < 0) fuerzaUsuario = 10; // Valor por defecto si es negativo

        System.out.println("Ingresa la velocidad de tu personaje (valor positivo):");
        int velocidadUsuario = scanner.nextInt();
        if (velocidadUsuario < 0) velocidadUsuario = 10;

        System.out.println("Ingresa la resistencia de tu personaje (valor positivo):");
        int resistenciaUsuario = scanner.nextInt();
        if (resistenciaUsuario < 0) resistenciaUsuario = 50;
        scanner.nextLine(); // Consumir el newline

        Personaje personajeUsuario;
        if (bandoUsuario == 1) {
            personajeUsuario = new Hero(nombreUsuario, fuerzaUsuario, velocidadUsuario, resistenciaUsuario);
        } else {
            personajeUsuario = new Villano(nombreUsuario, fuerzaUsuario, velocidadUsuario, resistenciaUsuario);
        }

        // Pedir datos para el oponente
        System.out.println("Ingresa el nombre del oponente:");
        String nombreOponente = scanner.nextLine();

        System.out.println("Elige el bando del oponente:");
        System.out.println("1. Heroe");
        System.out.println("2. Villano");
        int bandoOponente = scanner.nextInt();
        scanner.nextLine(); // Consumir el newline

        System.out.println("Ingresa la fuerza del oponente (valor positivo):");
        int fuerzaOponente = scanner.nextInt();
        if (fuerzaOponente < 0) fuerzaOponente = 10;

        System.out.println("Ingresa la velocidad del oponente (valor positivo):");
        int velocidadOponente = scanner.nextInt();
        if (velocidadOponente < 0) velocidadOponente = 10;

        System.out.println("Ingresa la resistencia del oponente (valor positivo):");
        int resistenciaOponente = scanner.nextInt();
        if (resistenciaOponente < 0) resistenciaOponente = 50;
        scanner.nextLine(); // Consumir el newline

        Personaje oponente;
        if (bandoOponente == 1) {
            oponente = new Hero(nombreOponente, fuerzaOponente, velocidadOponente, resistenciaOponente);
        } else {
            oponente = new Villano(nombreOponente, fuerzaOponente, velocidadOponente, resistenciaOponente);
        }

        // Mostrar estadísticas iniciales
        personajeUsuario.mostrarEstadisticas();
        oponente.mostrarEstadisticas();

        int opcion;

        do {
            System.out.println("Elige una acción:");
            System.out.println("1. Tu personaje ataca al oponente");
            System.out.println("2. Tu personaje usa ataque especial (si es Heroe) o hace trampa (si es Villano)");
            System.out.println("3. El oponente ataca a tu personaje");
            System.out.println("4. El oponente usa ataque especial (si es Heroe) o hace trampa (si es Villano)");
            System.out.println("5. Tu personaje se recupera");
            System.out.println("6. El oponente se recupera");
            System.out.println("7. Tu personaje usa golpe preciso (si es Heroe) o engaña (si es Villano)");
            System.out.println("8. Tu personaje se inspira (si es Heroe) o usa ataque masivo (si es Villano)");
            System.out.println("9. Mostrar estadísticas");
            System.out.println("10. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el newline para evitar problemas con el buffer

            switch (opcion) {
                case 1:
                    personajeUsuario.atacar(oponente);
                    break;
                case 2:
                    if (personajeUsuario instanceof Hero) {
                        ((Hero) personajeUsuario).ataqueEspecial(oponente);
                    } else {
                        ((Villano) personajeUsuario).hacerTrampa(oponente);
                    }
                    break;
                case 3:
                    oponente.atacar(personajeUsuario);
                    break;
                case 4:
                    if (oponente instanceof Hero) {
                        ((Hero) oponente).ataqueEspecial(personajeUsuario);
                    } else {
                        ((Villano) oponente).hacerTrampa(personajeUsuario);
                    }
                    break;
                case 5:
                    personajeUsuario.recuperarse();
                    break;
                case 6:
                    oponente.recuperarse();
                    break;
                case 7:
                    if (personajeUsuario instanceof Hero) {
                        ((Hero) personajeUsuario).golpePreciso(oponente);
                    } else {
                        ((Villano) personajeUsuario).enganar(oponente);
                    }
                    break;
                case 8:
                    if (personajeUsuario instanceof Hero) {
                        ((Hero) personajeUsuario).inspirar();
                    } else {
                        ((Villano) personajeUsuario).ataqueMasivo(oponente);
                    }
                    break;
                case 9:
                    System.out.println("Mostrando estadísticas..."); // Mensaje de debug
                    personajeUsuario.mostrarEstadisticas();
                    oponente.mostrarEstadisticas();
                    break;
                case 10:
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 10);

        scanner.close();
    }
}