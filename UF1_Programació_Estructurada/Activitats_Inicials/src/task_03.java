import java.util.Scanner;

/**
 * Et dediques a vendre figures Otaku comprades a Tokio per wallapop. Si estan en bon
 * estat les pots revendre per un +25%, si no, per +10%. Implementa l’algoritme.
 */
public class task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el preu de la figura que desitxes vendre: ");
        float preu = scanner.nextFloat();

        System.out.println("Si la figureta esta en bon estat escriu true: ");
        boolean estatFigureta = scanner.nextBoolean();

        if (estatFigureta) {
            float calculPreuBonEstat = (25 * preu) / 100;
            float preuFinalFiguretaBonEstat = calculPreuBonEstat + preu;
            System.out.println("El preu final de la figureta en bon estat tindra un increment d'un 25%," +
                    "el preu final de la figureta amb un preu de " + preu + " sera de: " + preuFinalFiguretaBonEstat +
                    "€");
        } else {
            float calculPreuMalEstat = (10 * preu) / 100;
            float preuFinalFiguretaMalEstat = preu - calculPreuMalEstat;
            System.out.println("El preu final de la figureta en mal estat tindra una disminucio d'un 10%," +
                    "el preu final de la figureta amb un preu de " + preu + " sera de: " + preuFinalFiguretaMalEstat +
                    "€");
        }
    }
}
