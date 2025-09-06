import java.util.Scanner;
public class ListaConFor {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // Preguntar cuántos elementos quiere ingresar el usuario
        System.out.print("¿Cuántos elementos deseas ingresar en la lista?: ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar el buffer

        // Crear el arreglo para guardar los elementos
        String[] lista = new String[n];

        // Usar un for para pedir los datos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el elemento #" + (i + 1) + ": ");
            lista[i] = sc.nextLine();
        }

        // Imprimir la lista
        System.out.println("\n--- Tu lista completa ---");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + lista[i]);
        }

        sc.close();
    }
}
