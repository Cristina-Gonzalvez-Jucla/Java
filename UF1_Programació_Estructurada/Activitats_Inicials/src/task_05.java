import java.util.Scanner;

/**
 * The price of a Volkswagen Grand California is €73,490, which is a great
 * investment, in volem calculate the market value per if one day volem will sell it second
 * ma You know that you lose 0.00001% of value for every kilometer you travel.
 * <p>
 * Extra: If the Volkswagen is the Camper Full Equip version, it is worth €20,000 month. Modify the
 * You have an algorithm for such that it allows the calculation with the two options.
 */
public class task_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculate the Price of your used Volkswagen car");
        System.out.println("Indicate the model number you have");
        System.out.println("1. Volkswagen Grand California");
        System.out.println("2. Camper Full Equip");
        int chosenModel = 0;
        while (chosenModel != 1 && chosenModel != 2) {
            System.out.println("You can only enter the number 1 or 2");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: You cannot enter letters, only the numbers 1 or 2.");
                scanner.next();
            }
            chosenModel = scanner.nextInt();
        }

        switch (chosenModel) {
            case 1:
                System.out.println("Option 1 - Volkswagen Grand California");
                System.out.println("New car price -> 73.490€");
                System.out.println("Indicate how many kilometres your car currently has");
                long currentKilometers;
                while (!scanner.hasNextLong()) {
                    System.out.println("Error");
                    scanner.next();
                }
                currentKilometers = scanner.nextLong();

                double percentatgeTotalVGC = currentKilometers * 0.00001;
                double calculoPorcentajeVGC = (percentatgeTotalVGC * 73.490) / 100;
                double precioFinalSegundaManoVGC = 73.490 - calculoPorcentajeVGC;

                System.out.println("El precio final de tu coche Volkswagen Grand California si lo vendes de " +
                        "segunda mano con " + currentKilometers + " Kilometros, sera de: " + precioFinalSegundaManoVGC + " €");
                break;

            case 2:
                System.out.println("Option 2 - Volkswagen Camper Full Equip");
                System.out.println("New car price -> 93.490€");
                System.out.println("Indicate how many kilometres your car currently has");

                long currentKilometersVCFE;
                while (!scanner.hasNextLong()) {
                    System.out.println("Error");
                    scanner.next();
                }
                currentKilometersVCFE = scanner.nextLong();

                double percentatgeTotalVCFE = currentKilometersVCFE * 0.00001;
                double calculoPorcentajeVCFE = (percentatgeTotalVCFE * 93.490) / 100;
                double precioFinalSegundaManoVCFE = 93.490 - calculoPorcentajeVCFE;

                System.out.println("El precio final de tu coche Volkswagen Camper Full Equip si lo vendes de segunda " +
                        "mano con " + currentKilometersVCFE + " Kilometros, sera de: " + precioFinalSegundaManoVCFE + " €");

                break;
        }
    }
}
