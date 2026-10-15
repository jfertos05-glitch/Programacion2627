package Relacion2;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean afirmacion = true;
        int numero;
        String pregunta;

        while (afirmacion) {

            System.out.print("Por favor, introduzca un número: ");
            numero = sc.nextInt();

            System.out.print("¿Desea introducir más números (S/N): ");
            pregunta = sc.nextLine(); //Despues de un nextInt el nextLine se buguea y su valor siempre es enter, por eso debes escribirlo 2 veces.
            pregunta = sc.nextLine();

            if (pregunta.equals("S")) {

                afirmacion = true;

            } else {

                afirmacion = false;

            }

        }

    }
}
