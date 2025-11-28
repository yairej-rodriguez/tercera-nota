package arrays;

import java.util.Scanner; 

public class Ejercicio7 {
    public static void main(String[] args) {
        final int capacidad = 5;
        int[] vector1 = new int[capacidad];
        int[] vector2 = new int[capacidad];
        int[] vector3 = new int[capacidad];
        
        Scanner vectores = new Scanner(System.in);
        
        System.out.println("Ingresa los valores para el vector 1:");
        for (int i = 0; i < capacidad; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector1[i] = vectores.nextInt();
        }
        
        System.out.println("Ingresa los valores para el vector 2:");
        for (int i = 0; i < capacidad; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = vectores.nextInt();
        }
        
        for (int i = 0; i < capacidad; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }
        
        System.out.println("Vector 1:");
        for (int i = 0; i < capacidad; i++) {
            System.out.print(vector1[i] + " ");
        }
        System.out.println();
        
        System.out.println("Vector 2:");
        for (int i = 0; i < capacidad; i++) {
            System.out.print(vector2[i] + " ");
        }
        System.out.println();
        
        System.out.println("Vector 3:");
        for (int i = 0; i < capacidad; i++) {
            System.out.print(vector3[i] + " ");
        }
        System.out.println();
        
        vectores.close();
    }
}
