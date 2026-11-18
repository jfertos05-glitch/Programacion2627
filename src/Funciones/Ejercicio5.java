package Funciones;

public class Ejercicio5 {
    public static int[] crearArray (int tamaño) {
        int[] arrayInt = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            arrayInt[i] = (int)(Math.random()*1000);
            System.out.print(arrayInt[i] + " ");
        }

        return arrayInt;
    }

    public static boolean estaEnArrayInt(int numArray[], int numElegido) {
        for (int i = 0; i < numArray.length; i++) {
            if (numElegido == numArray[i]) {
                return true;
            }
        }

        return false;
    }


}
