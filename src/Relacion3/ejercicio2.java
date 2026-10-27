package Relacion3;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int base = 0;
        int exponente = 0;
        int resultado = 0;

        do {
            System.out.print("Dime la base: ");
            base = sc.nextInt();
            System.out.print("Dime el exponente: ");
            exponente = sc.nextInt();
            resultado = base;
        } while (base < 0 || exponente < 0);



        for (int i = 1; i < exponente; i++) {
            resultado = resultado * base;
        }
        System.out.print("El resultado es: " + resultado);
    }
}
