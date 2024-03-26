import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
    public static String[] FileReader(String path) {
        String filePath = path; // Replace with your file's path
        String[] recdInfo = new String[4];

        // Check if the file exists
        File file = new File(filePath);
        if (file.exists() && !file.isDirectory()) {
            // File exists and is not a directory
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    // Process each line
                    recdInfo[i++] = line;
                }
            } catch (IOException e) {
                System.err.println("An error occurred while reading the file.");
                e.printStackTrace();
            }
        } else {
            // File does not exist or is a directory
            System.out.println("File does not exist or is a directory.");
        }
        return recdInfo;
    }

    public static void WritingDataInFile(String filePath, String... arr) {
        // String filePath = "confidential.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String element : arr) {
                writer.write(element);
                writer.newLine(); // This writes a newline character to the file, placing each string on a new
                                  // line
            }
            // System.out.println("Array has been successfully written to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
