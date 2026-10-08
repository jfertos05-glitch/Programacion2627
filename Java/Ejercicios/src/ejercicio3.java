import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        int num = sc.nextInt();
        int contador = 2;

        while (num % contador != 0) {

            contador++;

        }

        System.out.print("El divisor es " + contador);
    }
}
