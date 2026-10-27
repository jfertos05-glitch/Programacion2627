package Relacion3;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime 3 números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        for (int i = 0; i < 3; i++) {

            if (num1 > num2 && num1 > num3) {
                System.out.print(num1 + " ");
                num1 = 0;
            } else if (num2 > num1 && num2 > num3) {
                System.out.print(num2 + " ");
                num2 = 0;
            } else if (num3 > num1 && num3 > num2) {
                System.out.print(num3 + " ");
                num3 = 0;
            }

        }
    }
}
