package arrays;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de conductores: ");
        int numConductores = scanner.nextInt();
        scanner.nextLine(); 

        String[] nombre = new String[numConductores];
        double[][] kms = new double[numConductores][7];
        
        for (int i = 0; i < numConductores; i++) {
            System.out.print("Ingrese el nombre del conductor " + (i + 1) + ": ");
            nombre[i] = scanner.nextLine();
            
            System.out.println("Ingrese los kilómetros para cada día de la semana (Lunes a Domingo):");
            for (int j = 0; j < 7; j++) {
                String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
                System.out.print(dias[j] + ": ");
                kms[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); 
        }

        double[] total_kms = new double[numConductores];
        for (int i = 0; i < numConductores; i++) {
            double suma = 0;
            for (int j = 0; j < 7; j++) {
                suma += kms[i][j];
            }
            total_kms[i] = suma;
        }
        
        System.out.println("\nLista de conductores y kilómetros totales:");
        for (int i = 0; i < numConductores; i++) {
            System.out.println("Conductor: " + nombre[i] + " - Kilómetros totales: " + total_kms[i]);
        }
        
        scanner.close();
    }
}

