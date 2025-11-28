package arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        final int elementos = 10;
        int[] vector = new int[elementos];
        
        Scanner numeros = new Scanner(System.in);
        int registro = 0;
        
        while (registro < elementos) {
            System.out.print("Introduzca un número de su preferencia: ");
            int number = numeros.nextInt();
            
            if (number < 0) {
                break; 
            }
            
            vector[registro] = number;
            registro++;
        }
        
        System.out.println("Elementos que han sido almacendados al vector:");
        if (registro == 0) {
            System.out.println("No se introdujeron elementos.");
        } else {
            for (int i = 0; i < registro; i++) {
                System.out.println("Posición " + i + ": " + vector[i]);
            }
        }
        
        numeros.close();
    }
}
