package Relacion2;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esPositivo = false;

        while (!esPositivo) {

            System.out.print("Por favor, introduzca un número: ");
            int num1 = sc.nextInt();
            int num2 = 0;

            if (num1 > 0) {
                esPositivo = true;

                for (int i = 1; i <= num1/2; i++) {

                    if (num1 % i == 0) {

                        num2 = num2 + i;

                    }

                }

                if (num1 == num2) {

                    System.out.print("El número es perfecto porque ");

                    for (int i = 1; i <= num1; i++) {
                        if (num1 % i == 0) {
                            System.out.print(i);

                            if (i < num1/2) {
                                System.out.print(" + ");
                            } else if (i == num1/2){
                                System.out.print(" = ");
                            }
                        }
                    }
                } else {

                    System.out.print("El número no es perfecto porque  ");

                    for (int i = 1; i <= num1; i++) {
                        if (num1 % i == 0) {
                            System.out.print(i);

                            if (i < num1/2) {
                                System.out.print(" + ");
                            } else if (i == num1/2){
                                System.out.print(" != ");
                            } else if (num1%2 != 0) {
                                System.out.print(" != " + num1);
                            }
                        }
                    }

                }

            } else {

                System.out.println("El número debe ser mayor a cero");

            }

        }
    }
}
