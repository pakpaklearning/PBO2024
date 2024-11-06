import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        String filePath = "example.txt";

        // Try-with-resources yang benar
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Menangani eksepsi jika terjadi kesalahan I/O
            System.err.println("Error Reading File: " + e.getMessage());
        }
    }
}
