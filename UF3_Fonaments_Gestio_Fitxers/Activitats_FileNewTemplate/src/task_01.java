import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class task_01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("newFile.txt");
        DataOutputStream output = new DataOutputStream(fileOut);
        for (int i = 0; i < 5; i++) {
            output.writeInt(i);
        }
        output.close();
        fileOut.close();
    }
}
