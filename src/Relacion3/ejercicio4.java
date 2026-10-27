package Relacion3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 5;
        int numeroSecreto = (int)(Math.random()*100)+1;

        while (contador > 0) {
            System.out.print("Intenta adivinar el número: ");
            int numIntento = sc.nextInt();
            if (numeroSecreto == numIntento) {
                System.out.print("!Has acertado¡");
                contador = 0;
            } else if (numeroSecreto > numIntento) {
                System.out.println("El número era más grande que tu intento");
                contador--;
            } else if (numeroSecreto < numIntento) {
                System.out.println("El número era más pequeño que tu intento");
                contador--;
            }
        }

        System.out.println("El número era " + numeroSecreto);

    }
}
