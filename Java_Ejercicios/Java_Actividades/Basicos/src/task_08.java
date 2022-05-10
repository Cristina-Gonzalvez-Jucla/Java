import java.util.Scanner;

/**Modifica el ejercicio anterior,
 * para que en lugar de pedir un número,
 * pida un carácter (char) y muestre su código en la tabla ASCII.*/

public class task_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un caracter y te mostrare a que numero ASCII pertenece");
        String caracterTexto = scanner.next();
        char caracter = caracterTexto.charAt(0);

        int valorAscii = caracter;

        System.out.printf("El valor ASCII del numero introducido: " + caracter + " es el de " + valorAscii);
    }
}