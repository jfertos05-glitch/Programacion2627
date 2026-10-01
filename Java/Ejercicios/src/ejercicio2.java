import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        int num1 = teclado.nextInt();
        System.out.print("Por favor, introduzca otro número: ");
        int num2 = teclado.nextInt();

        if (num1 == num2) {

            System.out.print("Los números son iguales");

        } else if (num1 > num2) {

            System.out.print("El primer número es mayor");

        } else {

            System.out.print("El segundo número es mayor");

        }
    }
}
