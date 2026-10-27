package Relacion3;

import java.util.Scanner;

public class ejercicio3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.print("Dame un número: ");
        int num = sc.nextInt();

        while (num > 0) {
            num = num/10;
            contador++;
        }

        System.out.print("El número tiene " + contador + " cifras");
    }
}
