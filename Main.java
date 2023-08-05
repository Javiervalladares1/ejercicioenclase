
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




//Esto fue agregado para establecer las variables inputfile y outputfile
public class Main {
    public static void main(String[] args) {
        String inputFile = "Book1.csv";
        String outputFile = "Book2.csv";

        try {
            List<String> words = LectorArchivos.readCsvFile(inputFile);
            List<String> palindromes = new ArrayList<>();

            for (String word : words) {
                if (DetectorPalindromo.isPalindrome(word)) {
                    palindromes.add(word);
                }
            }

            EscribirCSV.returnNewCSVfile(outputFile, palindromes);

            System.out.println("Palindromes have been written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
