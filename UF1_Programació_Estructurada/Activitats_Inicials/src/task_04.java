import java.util.Scanner;

/**
 * El Departament d’Ensenyament de la Generalitat vol saber el percentatge nois i noies
 * que hi ha a les aules. Dissenya un algoritme que pregunti quantes noies i nois hi ha a
 * l’aula i aleshores en mostri els percentatges.
 */

public class task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica quantes nenes hi ha a l'alula: ");
        int nombreNenes = scanner.nextInt();

        System.out.println("Indica quants nens hi han a l'aula: ");
        int nombreNens = scanner.nextInt();

        int nombreAlumnesTotals = nombreNenes + nombreNens;
        int percentatgeNenesAula;
    }
}
