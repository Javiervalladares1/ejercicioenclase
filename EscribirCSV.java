
import java.io.IOException;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class EscribirCSV {
    public static void writeCsvFile(String filePath, List<String> palindromes) throws IOException {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(filePath))) {
            for (String palindrome : palindromes) {
                escritor.write(palindrome);
                escritor.newLine();
            }
        }
    }
}

