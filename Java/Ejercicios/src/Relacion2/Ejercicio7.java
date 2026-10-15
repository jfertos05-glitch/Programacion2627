package Relacion2;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int media = 0;
        int contador = 0;

        System.out.print("¿Cuantos numero quieres pedir?: ");
        int numCantidad = sc.nextInt();

        for (int i = 0; i < numCantidad; i++) {

            numero = sc.nextInt();
            media = media + numero;
            contador++;

        }

        System.out.print("La media es " + media/contador);

    }
}
