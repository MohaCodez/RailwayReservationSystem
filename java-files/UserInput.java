import java.util.Scanner;

public class UserInput {
    public static String GetUserInput(String message) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
        System.out.println(message);

        String inputString = scanner.nextLine(); // Read user input
        scanner.close(); // Close the scanner
        return inputString;
    }
}
