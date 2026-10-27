package Relacion2;
import java.util.Scanner;

public class numeroInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = num1;
        int num3 = 0;
        int contador = 0;

        while (num2 > 0) {
            num2 = num2 / 10;
            contador++;
        }

        num2 = num1;

        for (int i = 0; i < contador; i++) {

           if (i == 0) {
               num3 = num3 + (num2%10);
               num2 = num2/10;
           } else if (i > 0) {

               num3 = num3*10 + (num2%10);
               num2 = num2/10;

           }

        }

        System.out.println(num3);
    }
}
