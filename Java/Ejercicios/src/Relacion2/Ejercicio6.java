package Relacion2;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduce un número: ");
        int num1 = sc.nextInt();
        System.out.print("Por favor, introduce otro número: ");
        int num2 = sc.nextInt();
        int numMayor = 0;
        int numMenor = 0;
        int resultado = 0;

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

        for (int i = 0; i < numMayor; i++) {

            resultado = resultado + numMenor;

        }

        System.out.print("La multiplicación es " + resultado);

    }
}
