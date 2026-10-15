package Relacion2;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = -1;
        int numero;

        do {
            System.out.print("Por favor, introduzca un número negativo para terminar: ");
            numero = sc.nextInt();
            contador++;
        } while (numero >= 0);

        System.out.print("Has escrito " + contador + (" numero positivos"));
    }
}
