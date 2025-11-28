package arrays;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final int notas_semestre = 5;
        double[] notas = new double[notas_semestre];
        
        Scanner notes = new Scanner(System.in);
        for (int i = 0; i < notas_semestre; i++) {
            double nota;
            do {
                System.out.print("Ingresa la nota " + (i + 1) + " (entre 0 y 10): ");
                nota = notes.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. Debe estar entre 0 y 10.");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }
        
        System.out.println("Notas del estudiantes:");
        for (int i = 0; i < notas_semestre; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        
        double suma = 0;
        for (int i = 0; i < notas_semestre; i++) {
            suma += notas[i];
        }
        double media = suma / notas_semestre;
        
        double maxima = notas[0];
        double minima = notas[0];
        for (int i = 1; i < notas_semestre; i++) {
            if (notas[i] > maxima) {
                maxima = notas[i];
            }
            if (notas[i] < minima) {
                minima = notas[i];
            }
        }
        
        System.out.println("\nNota media: " + media);
        System.out.println("Nota más alta: " + maxima);
        System.out.println("Nota más baja: " + minima);
        notes.close();
    }
}
