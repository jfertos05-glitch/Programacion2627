package Funciones;

public class matricesEj4 {
    public static void leerMatriz(int[][] arrayEntrada) {

        for (int columna = 0; columna < arrayEntrada[0].length; columna++) {
            for (int fila = 0; fila < arrayEntrada.length; columna++) {
                System.out.print(arrayEntrada[fila][columna] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] arrayBi = new int[6][6];

        for (int fila = 0; fila < arrayBi.length; fila++) {
            for (int columna = 0; columna < arrayBi[fila].length; columna++) {
                arrayBi[fila][columna] = (int)(Math.random()*100);
                System.out.print(arrayBi[columna][fila] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        leerMatriz(arrayBi);

    }
}
