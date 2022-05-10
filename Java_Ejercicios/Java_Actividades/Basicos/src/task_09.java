import java.util.Scanner;

/**Lee un número por teclado que pida el precio de un producto
 * (puede tener decimales) y calcule el precio final con IVA.
 * El IVA sera una constante que sera del 21%.*/

public class task_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Introduce un numero: ");
        float precio = scanner.nextFloat();

        float Iva = (precio * 21) / 100;
        float preciIva = Iva + precio;

        System.out.println("EL precio final del profucto con el 21% de IVA es de: " + preciIva);
    }
}
