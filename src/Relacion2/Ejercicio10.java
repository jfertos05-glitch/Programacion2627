package Relacion2;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        int num = 0;
        int factorial = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un número positivo: ");
            num = sc.nextInt();
            factorial = num;
        } while (num < 0);

        for (int i = num-1; i > 0; i--) {
            System.out.print("Factorial" + " = " + factorial);
            factorial = factorial * i;
            System.out.println(" * " + i + " = " + factorial);
        }

        System.out.print("El factoria de " + num + " es " + factorial);
    }
}
