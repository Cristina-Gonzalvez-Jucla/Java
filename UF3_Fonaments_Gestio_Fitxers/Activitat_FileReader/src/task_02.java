import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("captmidn.txt");
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
