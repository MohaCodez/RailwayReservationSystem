import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi! Welcome to the Railway Reservation System!");
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input

        System.out.println("Press:\n[1] to Login\n[2] to Sign-up");
        String input = scanner.next();

        if (input.equals("1")) {

            System.out.println("Enter your email: ");
            String enteredUsername = scanner.next(); // Read user input

            System.out.println("Enter your password: ");
            String enteredPassword = scanner.next(); // Read user input

            User.login(enteredUsername, enteredPassword); // call the login method

        } else if (input.equals("2")) {
            System.out.println("Enter your first name: ");
            String enteredFName = scanner.next(); // Read user input

            System.out.println("Enter your last name: ");
            String enteredLName = scanner.next(); // Read user input

            System.out.println("Enter your email: ");
            String enteredEmail = scanner.next(); // Read user input

            System.out.println("Enter your password: ");
            String enteredPassword = scanner.next(); // Read user input

            System.out.println("Confirm your password: ");
            String enteredConfirmPassword = scanner.next(); // Read user input

            User.signUp(enteredFName, enteredLName, enteredEmail, enteredPassword, enteredConfirmPassword, false);

        } else {
            System.out.println("Invalid Input!");
        }

        if (User.getUserLoginStatus()) {
            System.out.println("\nWelcome to the main menu of the application!");

            while (User.getUserLoginStatus()) {
                System.out.println("Press:\n[1] - Book Ticket\n[2] - Cancel Ticket\n[3] - Logout");
                int menuInput = Integer.parseInt(scanner.next());

                switch (menuInput) {
                    case 1:
                        // insert code here
                        break;

                    case 2:
                        // insert code here
                        break;

                    case 3:
                        User.logout();
                        break;
                }
            }
        }

        scanner.close();

    }
}