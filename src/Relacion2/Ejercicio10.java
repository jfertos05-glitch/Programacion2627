package Relacion2;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 0;

        for (int i = num-1; i > 0; i--) {
            factorial = factorial + (num*i);
            System.out.println("Factorial" + " = " + num + " * " + i + " = " + (num*i));
        }

        System.out.print("El factoria de " + num + " es " + factorial);
    }
}
