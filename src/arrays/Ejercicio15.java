package arrays;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] equipos = new String[15][2];
        int[][] resultados = new int[15][2];
        
        System.out.println("Ingrese los datos de los 15 partidos:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Partido " + (i + 1) + ":");
            System.out.print("Nombre del equipo local: ");
            equipos[i][0] = scanner.nextLine();
            System.out.print("Nombre del equipo visitante: ");
            equipos[i][1] = scanner.nextLine();
            System.out.print("Goles del equipo local: ");
            resultados[i][0] = scanner.nextInt();
            System.out.print("Goles del equipo visitante: ");
            resultados[i][1] = scanner.nextInt();
            scanner.nextLine(); 
        }
        
        System.out.println("\nResultados de la quiniela:");
        for (int i = 0; i < 15; i++) {
            String equipoLocal = equipos[i][0];
            String equipoVisitante = equipos[i][1];
            int golesLocal = resultados[i][0];
            int golesVisitante = resultados[i][1];
            
            System.out.print("Partido " + (i + 1) + ": " + equipoLocal + " " + golesLocal + " - " + golesVisitante + " " + equipoVisitante);
            
            if (golesLocal > golesVisitante) {
                System.out.println(" -> Gana " + equipoLocal);
            } else if (golesLocal < golesVisitante) {
                System.out.println(" -> Gana " + equipoVisitante);
            } else {
                System.out.println(" -> Empate");
            }
        }
        
        scanner.close();
    }
}
