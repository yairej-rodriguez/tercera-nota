package unidad1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int modulo = numero1 % numero2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

    sc.close(); 
    }
}

