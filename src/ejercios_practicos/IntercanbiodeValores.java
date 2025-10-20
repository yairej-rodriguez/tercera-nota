package Ejercios_practicos ;

public class IntercanbiodeValores {
      public static void intercambiar (int a, int b) {
        int c = a;
        a = b;
        b = c;
       System.out.println(" valor de a y b dentro del metodo: " +a  + " y " +b);
       
    }
    public static void main (String[] arg){
        int a = 5;
        int b =7;
        System.out.println(" valor de a antes del metodo: " +a);
        System.out.println(" valor de b antes del metodo: " +b);
        intercambiar (a,b);
        System.out.println(" valor de a despues del metodo: " +a);
        System.out.println(" valor de b despues del metodo: " +b);
    }

    
    
}

     