package Funciones;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNum = new int[20];
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        boolean listo = false;

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = (int)(Math.random()*100);
            System.out.print(arrayNum[i] + " ");
        }
        for (int p = 0; p < arrayNum.length; p++) {
            for (int i = 0; i < arrayNum.length; i++) {
                if (i >= 1) {
                    var1 = arrayNum[i-1];
                    var2 = arrayNum[i];
                    for (int j = 0; j < i; j++) {
                        if (arrayNum[i] < arrayNum[i-1]) {
                            arrayNum[i-1] = var2;
                            arrayNum[i] = var1;
                        }
                    }
                }
            }
        }


        System.out.println();

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + " ");
        }
    }
}
