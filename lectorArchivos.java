import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lectorArchivos {
    private String inputFile;
    private String outputFile;

    public lectorArchivos(String string, String string2) {
    }

    public void lectorCSV(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }
//esto lo agregamos 
    public void leerCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//Se agregó esto
    public void CSVnuevo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        lectorArchivos csvFileManager = new lectorArchivos("input.csv", "output.csv");
        
        System.out.println("Leyendo archivo CSV");
        csvFileManager.leerCSV();

        System.out.println("\nCreando nuevo CSV");
        csvFileManager.CSVnuevo();
    }
}
