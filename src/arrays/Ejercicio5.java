package arrays;

import java.util.Scanner; 
import java.util.Random; 

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner orden = new Scanner(System.in);
        
        int capacidad;
        do {
            System.out.print("Cuantos valores desea guardar en el vector: ");
            capacidad = orden.nextInt();

        } while (capacidad <= 0);
        
        int[] vector = new int[capacidad];
        Random numbers = new Random();
        
        for (int i = 0; i < capacidad; i++) {
            vector[i] = numbers.nextInt(100) + 1; 
        }
        
        System.out.println("Numeros generados y guardados en el vector:");
        for (int i = 0; i < capacidad; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < capacidad - 1; i++) {
            for (int j = 0; j < capacidad - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int Posición = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = Posición;
                }
            }
        }
        
        System.out.println("Vector con los números ordenados de menor a mayor:");
        for (int i = 0; i < capacidad; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        
        orden.close();
    }
}
