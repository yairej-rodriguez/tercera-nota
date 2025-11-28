package arrays;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] minTemp = new double[5];
        double[] maxTemp = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la temperatura mínima del día " + (i + 1) + ": ");
            minTemp[i] = scanner.nextDouble();
            System.out.print("Ingrese la temperatura máxima del día " + (i + 1) + ": ");
            maxTemp[i] = scanner.nextDouble();
        }
        
        System.out.println("\nTemperaturas medias de cada día:");
        for (int i = 0; i < 5; i++) {
            double media = (minTemp[i] + maxTemp[i]) / 2;
            System.out.println("Día " + (i + 1) + ": " + media + "°C");
        }
        
        double minMinima = minTemp[0];
        for (int i = 1; i < 5; i++) {
            if (minTemp[i] < minMinima) {
                minMinima = minTemp[i];
            }
        }
        
        System.out.println("\nDías con la menor temperatura mínima (" + minMinima + "°C):");
        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            if (minTemp[i] == minMinima) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron días.");
        }
        
        System.out.print("\nIngrese una temperatura para buscar días con máxima coincidente: ");
        double tempBuscada = scanner.nextDouble();
        
        System.out.println("Días cuya temperatura máxima coincide con " + tempBuscada + "°C:");
        encontrado = false;
        for (int i = 0; i < 5; i++) {
            if (maxTemp[i] == tempBuscada) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No existe ningún día con esa temperatura máxima.");
        }
        
        scanner.close();
    }
}

