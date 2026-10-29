package array;
import java.util.Scanner;

public class ejercicio0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNum = new int[5];

        System.out.println("Introduce los valores: ");

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = sc.nextInt();
        }

        System.out.print("Los valores son: ");

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + " ");
        }
    }
}
