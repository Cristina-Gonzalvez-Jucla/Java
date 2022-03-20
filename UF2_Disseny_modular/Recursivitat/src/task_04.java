import java.util.Scanner;

/*
 * Programar un algoritmo recursivo que permita multiplicar los
 * elementos de un vector
 */
public class task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica quants nombres vols introduir");
        int llargadaVector = scanner.nextInt();
        int[] vector = new int[llargadaVector];

        for (int i = 0; i < llargadaVector; i++) {
            System.out.println("indica el valor de la posicio " + i);
            vector[i] = scanner.nextInt();
            System.out.println("El valor de la posicio " + i + " es igual a: " + vector[i]);
        }
        System.out.println("El valor de la multiplicacio dels valors del vector es de: " + sumaElementosVector(vector, llargadaVector - 1));
    }

    public static int sumaElementosVector(int[] array, int posicio) {
        if (posicio == 0) {
            return array[posicio];
        } else {
            return array[posicio - 1] *= sumaElementosVector(array, posicio - 1);
        }
    }
}
