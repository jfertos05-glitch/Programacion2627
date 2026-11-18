package Funciones;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNum = new int[5];
        int contador = 0;
        int contadorRepetido =0;

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = sc.nextInt();

            for (int j = 0; j < i; j++) {
                if (arrayNum[i] == arrayNum[j]) {
                   contadorRepetido++;
                }
            }
        }

        int[] arrayNum2 = new int[arrayNum.length - contadorRepetido];

        for (int i = 0; i < arrayNum.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (arrayNum[i] == arrayNum[j]) {
                    repetido = true;
                }
            }

            if (!repetido) {
                arrayNum2[contador] = arrayNum[i];
                contador++;
            }
        }

        for (int i = 0; i < arrayNum2.length; i++) {
            System.out.print(arrayNum2[i] + " ");
        }

    }
}
