package Relacion3;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        do {
            System.out.print("Dime un número: ");
            num1 = sc.nextInt();
            System.out.print("Dime otro número: ");
            num2 = sc.nextInt();
        } while (num1 < 0 || num2 < 0);



    }
}
