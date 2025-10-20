package unidad1;

public class Pares1Al100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int esPar = i % 2;
            if (esPar == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }
        }
    }
}
