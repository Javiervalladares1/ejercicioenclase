import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class LectorArchivos {
    public static List<String> readCsvFile(String filePath) throws IOException {
        List<String> palabras = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(filePath))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] wordsArray = linea.split(",");
                for (String palabra : wordsArray) {
                    palabras.add(palabra.trim());
                }
            }
        }
        return palabras;
    }
}