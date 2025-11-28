package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();
        
        Scanner clase = new Scanner(System.in);
        
        while (true) {
            System.out.print("Ingresa el nombre del alumno: ");
            String nombre = clase.nextLine();
            
            if (nombre.equals("*")) {
                break; 
            }
            
            System.out.print("Ingresa la edad de " + nombre + ": ");
            int edad = clase.nextInt();
            clase.nextLine(); 
            
            nombres.add(nombre);
            edades.add(edad);
        }
        
        if (nombres.isEmpty()) {
            System.out.println("No se introdujeron nombres de alumnos.");
            clase.close();
            return;
        }
        
        System.out.println("Alumnos mayores de edad:");
        boolean hayMayores = false;
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println("- " + nombres.get(i) + " (" + edades.get(i) + " años)");
                hayMayores = true;
            }
        }
        if (!hayMayores) {
            System.out.println("No hay alumnos mayores de edad.");
        }
        
        int edadMaxima = edades.get(0);
        for (int i = 1; i < edades.size(); i++) {
            if (edades.get(i) > edadMaxima) {
                edadMaxima = edades.get(i);
            }
        }
        
        System.out.println("Alumnos con la mayor edad dentro del curso :");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) == edadMaxima) {
                System.out.println("- " + nombres.get(i) + " (" + edades.get(i) + " años)");
            }
        }
        
        clase.close();
    }
}
