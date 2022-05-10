import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("captmidn.txt");
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());
    }
}
