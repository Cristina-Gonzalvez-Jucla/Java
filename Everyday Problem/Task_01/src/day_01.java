import java.util.Scanner;

/**
 Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

 For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */

public class day_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica de quina llargada vols que sigui l'array");
        int llargadaArray = scanner.nextInt();
        int[] array = new int[llargadaArray];

        for (int i = 1; i <= llargadaArray; i++) {
            System.out.println("Indica el valor del numero " + i);
            int valor = scanner.nextInt();
            array[i] = valor;
            System.out.println(array[i]);
        }
    }
}
