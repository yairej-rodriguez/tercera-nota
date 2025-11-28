package arrays;

import java.util.Random; 

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int[] vector_numeros = new int[10];
        int v = vector_numeros.length;
        
        Random vector = new Random();
        
        for (int i = 0; i < v; i++) {
            vector_numeros[i] = vector.nextInt(10) + 1; 
        }
        
        System.out.println("Elemento | Cuadrado | Cubo");
        System.out.println("---------------------------");
        for (int i = 0; i < vector_numeros.length; i++) {
            int numero = vector_numeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.printf("%8d | %8d | %4d%n", numero, cuadrado, cubo);
        }
    }
}

