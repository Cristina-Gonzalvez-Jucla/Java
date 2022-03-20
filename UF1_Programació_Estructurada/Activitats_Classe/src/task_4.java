import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menuEscollit = 0;
            System.out.println("----------------------");
            System.out.println("      Benbingut");
            System.out.println("----------------------");
            System.out.println("        Menu");

            while (menuEscollit > 4 || menuEscollit < 1) {
                System.out.println("Escull el metode desitjat, introdueix un numero del 1 al 4\n\t 1 Cafe \n\t 2 Tallat \n\t 3 Cafe amb llet \n\t 4 Sortir");

                menuEscollit = comprobarIntegro(scan, "Escull el metode desitjat, introdueix un numero del 1 al 4\n\t 1 Cafe \n\t 2 Tallat \n\t 3 Cafe amb llet \n\t 4 Sortir");
            }
            switch (menuEscollit) {
                case 1:
                    System.out.println("Has escollit Cafe");
                    break;
                case 2:
                    System.out.println("Has ecollit Tallar");
                    break;
                case 3:
                    System.out.println("Has escollit Cafe amb llet");
                    break;
                case 4:
                    System.out.println("Has escollit sortir del progrma");
                    System.exit(0);
            }
        }

    public static int comprobarIntegro(Scanner scan, String mensajeError) {
        while (!scan.hasNextInt()) {
            System.out.println("Dades erroneas ");
            System.out.println(mensajeError);
            scan.next();
        }
        return scan.nextInt();
    }
}

