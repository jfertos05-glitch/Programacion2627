package Relacion1;

import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        int num1 = Integer.parseInt(teclado.nextLine()); // otra manera sería teclado.nextInt, hay un tipo de next para cada tipo de dato.
        System.out.print("Por favor, introduzca otro número: ");
        int num2 = Integer.parseInt(teclado.nextLine());

        System.out.println("Su suma es " + (num1 + num2) + " ,su resta es " + (num1 - num2) + " ,su multiplicacion es " + (num1 * num2) + " y su division es " + (num1/num2));
    }
}