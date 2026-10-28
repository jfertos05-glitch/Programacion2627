package matematicas;

import java.util.Scanner;

public class funcionesVarias {
    static Scanner sc = new Scanner(System.in);

    public static int leerEnteroPositivo(String mensaje) {

        int enteroPositivo;

        do {
            System.out.print("Dame un número positivo: ");
            enteroPositivo = Integer.parseInt(sc.nextLine());
        } while (enteroPositivo > 0);

        return enteroPositivo;
    }

    public static double leerDouble(String mensaje) {

        double numeroDouble = Double.parseDouble(sc.nextLine());

        return numeroDouble;
    }

    public static char leerCaracter(String mensaje) {

        char caracter = sc.nextLine().charAt(0);

        return caracter;
    }

    public static boolean leerSioNo (String mensaje) {

        String siONo = sc.nextLine();
        if (siONo == "si") {
            return true;
        } else {
            return false;
        }
    }





}
