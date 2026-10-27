package Relacion3;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 2 números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int numMayor;
        int numMenor;
        int EuclidesCabron = 0;
        boolean EuclidesMeagaCabron = true;

        if (num1 > num2) {
            numMayor = num1;
            numMenor = num2;
        } else if (num2 > num1) {
            numMayor = num2;
            numMenor = num1;
        } else {
            numMayor = num1;
            numMenor = num2;
        }

        while (EuclidesMeagaCabron) {
            int resto = numMayor % numMenor;
            if (resto == 0) {
                EuclidesCabron = numMenor;
                EuclidesMeagaCabron = false; // Rompe el bucle
            } else {
                numMayor = numMenor;
                numMenor = resto; // Actualizamos con el resto correcto
                EuclidesMeagaCabron = true;
            }
        }

        System.out.println("El MDC es " );

    }
}
