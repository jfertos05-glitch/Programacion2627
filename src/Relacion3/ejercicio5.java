package Relacion3;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esprimo = true;
        System.out.print("Dime el número: ");
        int num = sc.nextInt();

        for (int i = 2; i < num-1; i++) {
            if (num % i == 0) {
                esprimo = false;
            }
        }

        if (esprimo || num == 2 || num == 3) {
            System.out.print("El número era primo");
        } else {
            System.out.print("El número no era primo");
        }
    }
}
