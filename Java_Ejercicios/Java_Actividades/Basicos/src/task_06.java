import java.util.Scanner;

/**Lee un número por teclado e indica si es divisible entre 2
 * (resto = 0). Si no lo es, también debemos indicarlo.*/

public class task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Indica un numero: ");
        double numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.printf("El numero " +  numero + " es divisile entre dos");
        } else {
            System.out.printf("El numero " +  numero + " NO es divisile entre dos");
        }
    }
}
