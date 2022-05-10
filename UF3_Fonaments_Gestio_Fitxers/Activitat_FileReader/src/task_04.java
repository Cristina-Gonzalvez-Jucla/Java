import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task_04 {
    public static void main(String[] args) throws IOException {
        File file = new File("captmidn.txt");
        Scanner scanner = new Scanner(file);

        String fileContent = "THIS IS A NEW FILE MADE BY ME";
        while (scanner.hasNextLine()) {
            fileContent = fileContent.concat(scanner.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("newFile2.txt");
        writer.write(fileContent);
        writer.close();
    }
}
