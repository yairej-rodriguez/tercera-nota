package arrays;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[][] marco = new int[5][15];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 14) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }
        
        System.out.println("Contenido de la matriz 'marco':");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(marco[i][j]);
            }
            System.out.println(); 
        }
    }
}

