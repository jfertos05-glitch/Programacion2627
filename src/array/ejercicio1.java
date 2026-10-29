package array;

import java.util.Scanner;

public class ejercicio1 {

    public static int sumaArrayPar(int[] num) {
        int suma = 0;

        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) {
                suma = suma + num[i];
            }
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNum = new int[5];

        System.out.println("Introduce los valores: ");

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = sc.nextInt();
        }

        System.out.print(sumaArrayPar(arrayNum));
    }
}
