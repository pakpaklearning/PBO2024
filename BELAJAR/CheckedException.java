import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileReader fr = new FileReader(file);  // FileNotFoundException harus ditangani
        } catch (IOException e) {
            e.printStackTrace();  // Menangani pengecualian
        }
    }
}
