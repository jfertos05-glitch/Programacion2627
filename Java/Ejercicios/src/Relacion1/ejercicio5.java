package Relacion1;

import  java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int contraseña = 12345; //final impide que cambies la variable
        int intentoContraseña = 0;

        do {

            System.out.print("Por favor dime la contraseña: ");
            intentoContraseña = sc.nextInt();

        } while (intentoContraseña != 12345);
    }
}
