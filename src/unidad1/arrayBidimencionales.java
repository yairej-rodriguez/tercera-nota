package unidad1;

public class arrayBidimencionales {
    public static void main (String [] args) {
int[][] tablero = {
    {1, 0, 1},
    {0, 1, 0},
    {1, 0, 1}
};
  int largo = tablero.length;
  int ancho = tablero[0].length;
for (int i = 0; i < largo; i++) {
    for (int j = 0; j < ancho; j++) {
        System.out.print(tablero[i][j] + " ");
    }
    System.out.println();
    }
 }
    
}
