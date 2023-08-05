
import java.io.IOException;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
//este se hizo en una clase diferente para poderlo implementar de una mejor manera
public class EscribirCSV {
    public static void returnNewCSVfile(String filePath, List<String> palindromes) throws IOException {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(filePath))) {
            for (String palindrome : palindromes) {
                escritor.write(palindrome);
                escritor.newLine();
            }
        }
    }
}

