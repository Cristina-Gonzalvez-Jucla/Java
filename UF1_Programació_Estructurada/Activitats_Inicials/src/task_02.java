import java.util.Scanner;

/**
 * A la botiga The bike house es fa un descompte del 20% als clients que son VIP i també
 * als clients que facin una compra de més de 200 €. Pensa un algoritme que implementi
 * aquesta lògica.
 */

public class task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el preu del producte comprat: ");
        float preuProducte = scanner.nextFloat();

        System.out.println("Si ets client VIP introdueix true");
        boolean clientVIP = scanner.nextBoolean();

        if (clientVIP || preuProducte > 200) {
            float descompte = (20 * preuProducte) / 100;
            float preuVip = preuProducte - descompte;
            System.out.println("El preu final del prodcute es de: " + preuVip);
        } else {
            System.out.println("El preu final del producte es de:" + preuProducte);
        }
    }
}
