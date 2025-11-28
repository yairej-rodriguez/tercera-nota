package arrays;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] precios = new double[5];
        int[][] cantidades = new int[5][4];
        
        System.out.println("Ingrese los precios de los 5 artículos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Precio del artículo " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }
        
        System.out.println("\nIngrese las cantidades vendidas:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Cantidad del artículo " + (i + 1) + " en sucursal " + (j + 1) + ": ");
                cantidades[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nCantidades totales de cada artículo:");
        for (int i = 0; i < 5; i++) {
            int totalArticulo = 0;
            for (int j = 0; j < 4; j++) {
                totalArticulo += cantidades[i][j];
            }
            System.out.println("Artículo " + (i + 1) + ": " + totalArticulo);
        }
        
        int totalSucursal2 = 0;
        for (int i = 0; i < 5; i++) {
            totalSucursal2 += cantidades[i][1]; 
        }
        System.out.println("\nCantidad total de artículos en la sucursal 2: " + totalSucursal2);
        
        int cantidadArt3Suc1 = cantidades[2][0]; 
        System.out.println("Cantidad del artículo 3 en la sucursal 1: " + cantidadArt3Suc1);
        
        double[] recaudacionSucursales = new double[4];
        for (int j = 0; j < 4; j++) {
            double recaudacion = 0;
            for (int i = 0; i < 5; i++) {
                recaudacion += precios[i] * cantidades[i][j];
            }
            recaudacionSucursales[j] = recaudacion;
            System.out.println("Recaudación de la sucursal " + (j + 1) + ": " + recaudacion);
        }
        
        double recaudacionTotal = 0;
        for (double rec : recaudacionSucursales) {
            recaudacionTotal += rec;
        }
        System.out.println("\nRecaudación total de la empresa: " + recaudacionTotal);
        
        int sucursalMayor = 0;
        double maxRecaudacion = recaudacionSucursales[0];
        for (int j = 1; j < 4; j++) {
            if (recaudacionSucursales[j] > maxRecaudacion) {
                maxRecaudacion = recaudacionSucursales[j];
                sucursalMayor = j;
            }
        }
        System.out.println("Sucursal de mayor recaudación: Sucursal " + (sucursalMayor + 1) + " con " + maxRecaudacion);
        
        scanner.close();
    }
}
