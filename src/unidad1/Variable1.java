package unidad1;

import java.util.Scanner; 

public class Variable1 {
    public static void main(String[] args) {
        int edad;
        double altura;
        char inicialNombre;
        boolean esMayorDeEdad;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        edad = scanner.nextInt();

        System.out.print("Ingresa tu altura en metros (ejemplo: 1.75): ");
        altura = scanner.nextDouble();

        System.out.print("Ingresa la inicial de tu nombre (una sola letra): ");
        inicialNombre = scanner.next().charAt(0); 

        esMayorDeEdad = (edad >= 18);

        scanner.close();

        System.out.println(" Valores asignados: ");
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Inicial del nombre: " + inicialNombre);
        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
    }
}
