package arrays;

import java.util.Scanner; 

public class Ejercicio6 {
    public static void main(String[] args) {
        String[] Meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        
        int[] dias = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        
        Scanner calendario = new Scanner(System.in);
        
        int numeroMes;
        do {
            System.out.print("Ingrese el número del mes (debe que ser del 1 al 12) ");
            numeroMes = calendario.nextInt();
            if (numeroMes < 1 || numeroMes > 12) {
                System.out.println("Número inválido. Debe estar entre 1 y 12.");
            }
        } while (numeroMes < 1 || numeroMes > 12);
        
        System.out.println("Mes: " + Meses[numeroMes - 1]);
        System.out.println("Días: " + dias[numeroMes - 1]);
        
        calendario.close();
    }
}
