import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

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

    public static void JsonFileAppender(String filePath, String[] arr) {
        // String filePath = "user-info/confidential.json";
        JSONObject newUser = new JSONObject();

        newUser.put("firstname", arr[0]);
        newUser.put("lastname", arr[1]);
        newUser.put("email", arr[2]);
        newUser.put("password", arr[3]);

        try {
            // Check if the file exists; if not, create a new JSON array
            File file = new File(filePath);
            JSONArray users;
            if (file.exists()) {
                String content = new String(Files.readAllBytes(Paths.get(filePath)));
                users = new JSONArray(content);
            } else {
                users = new JSONArray();
            }

            boolean emailExists = false;
            for (int i = 0; i < users.length(); i++) {
                JSONObject user = users.getJSONObject(i);
                if (user.getString("email").equals(arr[2])) {
                    emailExists = true;
                    break;
                }
            }

            if (!emailExists) {
                users.put(newUser);
                Files.write(Paths.get(filePath), users.toString().getBytes(), StandardOpenOption.CREATE,
                        StandardOpenOption.WRITE);
                System.out.println("New user added successfully.");
            } else {
                System.out.println("A user with this email already exists.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
