package unidad1;
import java.util.Scanner;

public class Namecosas {

  public static void main (String[] args ) {
    int plus;
     Scanner sc = new Scanner(System.in);
    System.out.println (" quiere ingresar otro item ");
    plus = sc.nextInt ();
      sc.nextLine();
    String[] lista = new String[plus];
    for(int i = 1; i == plus ; i++ ) {
      System.out.println (" ingrese un item a la lista. ");  
       lista[i] = sc.nextLine();
    }
    System.out.println("\n--- Tu lista completa ---");
        for (int i = 0; i < plus; i++) {
            System.out.println((i + 1) + ". " + lista[i]);
  }
  sc.close();
 }
}