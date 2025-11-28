package arrays;

import java.util.Scanner; 

public class Ejercicio2 {
    public static void main(String[] args) {
        final int capacidad = 5;
        
        String[] vectorOriginal = new String[capacidad];
        
        Scanner vector = new Scanner(System.in);
        
        System.out.println("Ingresa " + capacidad + " cadenas de caracteres:");
        for (int i = 0; i < capacidad; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vectorOriginal[i] = vector.nextLine();
        }
        
        String[] vectorInvertido = new String[capacidad];
        
        for (int i = 0; i < capacidad; i++) {
            vectorInvertido[i] = vectorOriginal[capacidad - 1 - i];
        }
        
        System.out.println("Vector invertido:");
        for (int i = 0; i < capacidad; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vectorInvertido[i]);
        }
        
        vector.close();
    }
}

