import java.util.Scanner;

/**Lee un número por teclado y muestra por consola,
 * el carácter al que pertenece en la tabla ASCII.
 * Por ejemplo: si introduzco un 97, me muestre una a.
 */

public class task_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero y te mostrare a que caracter ASCII pertenece");
        int numero = scanner.nextInt();

        char valorAscii = (char) numero;

        System.out.printf("El valor ASCII del numero introducido: " + numero + " es el de " + valorAscii);
    }
}
