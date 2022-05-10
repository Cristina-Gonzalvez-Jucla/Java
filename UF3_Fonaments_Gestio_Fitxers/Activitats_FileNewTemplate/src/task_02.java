import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class task_02 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileIn = new FileInputStream("newFile2.txt");
        DataInputStream input = new DataInputStream(fileIn);
    }
}
