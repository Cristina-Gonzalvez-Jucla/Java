import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroFilas = 0;
        int numeroColumnes = 0;

        System.out.println("Indica el nombre de files de la taula");
        while (!scan.hasNextInt()) {
            System.out.println("Dades Erronies");
            System.out.println("Indica el nombre de filess de la taula");
            scan.next();
        }

        numeroFilas = scan.nextInt();

        System.out.println("Indica el nombre de columnes de la taula");
        while (!scan.hasNextInt()) {
            System.out.println("Dades Erronies");
            System.out.println("Indica el nombre de columnes de la taula");
            scan.next();
        }
        numeroColumnes = scan.nextInt();
        int[][] matri = new int[numeroFilas][numeroColumnes];
        for (int fila = 0; fila < numeroFilas; fila++) {

        }
    }
}
