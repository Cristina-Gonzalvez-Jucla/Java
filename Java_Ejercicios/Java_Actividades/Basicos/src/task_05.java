import java.util.Scanner;

/**Haz una aplicación que calcule el área de un círculo(pi*R2).
 * El radio se pedirá por teclado (recuerda pasar de String a
 * double con Double.parseDouble). Usa la constante PI y el método pow de Math.
 */
public class task_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Itroduce el área de un círculo: ");
        double area = scanner.nextInt();

        double calculoArea = Math.pow(area, 2)* Math.PI;

        System.out.printf("El area del círculo es de: " + calculoArea);
    }
}
