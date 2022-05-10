import java.util.Scanner;

/**Modifica la aplicación anterior, para que nos pida
 * el nombre que queremos introducir (recuerda usar JOptionPane).*/

public class task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Indica tu nombre: ");
        String nombre = scanner.next();

        System.out.printf("Bienbenido " + nombre);
    }
}
