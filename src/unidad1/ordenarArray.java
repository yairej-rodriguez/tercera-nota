package unidad1;
 import java.util.Arrays;

public class ordenarArray {
    public static void main (String [] args) {
int[] numeros = {5, 3, 8, 1, 9};
Arrays.sort(numeros);

System.out.println("Array ordenado: " + Arrays.toString(numeros));
    } 
}
