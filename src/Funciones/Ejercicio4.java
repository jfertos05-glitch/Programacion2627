package Funciones;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] arrayNumeros = new int[6000];
        int[] terminaEn = new int[10];
        int media = 0;
        int contadorMedia = 0;

        for (int i = 0; i < 6000; i++) {
            arrayNumeros[i] = (int)(Math.random()*100);
            media = media + arrayNumeros[i];
            contadorMedia++;

            int posicionUltimoDigito = Varias.digitos(arrayNumeros[i]) - 1;
            int ultimoDigito = Varias.digitoN(arrayNumeros[i], posicionUltimoDigito);

            terminaEn[ultimoDigito]++ ;

        }

        System.out.println("La media es: " + media/6000);

        for (int i = 0; i < 10; i++) {
            double porcentaje = (terminaEn[i] * 100.0) / 6000;
            System.out.println("El número " + i + " a aparecido " + terminaEn[i] + " veces, esto equivale a " + porcentaje + "%");
        }
    }
}
