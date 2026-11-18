package Funciones;
import java.util.Arrays;

public class maticesEj3 {
    public static void leerMatriz(int[][] arrayEntrada) {

        for (int fila = 0; fila < arrayEntrada.length; fila++) {
            for (int columna = 0; columna < arrayEntrada[fila].length; columna++) {
                System.out.print(arrayEntrada[fila][columna] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] arrayBi = new int[6][6];

        for (int fila = 0; fila < arrayBi.length; fila++) {
            for (int columna = 0; columna < arrayBi[fila].length; columna++) {
                arrayBi[fila][columna] = (int)(Math.random()*100);
            }
        }

        leerMatriz(arrayBi);

    }
}
