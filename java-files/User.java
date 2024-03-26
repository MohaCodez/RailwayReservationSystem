public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private static boolean isUserLoggedIn;

    // constructor
    User(String firstName, String lastName, String email, String password, boolean isUserLoggedIn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        isUserLoggedIn = false;
    }

    // getters and setters for the user's attributes
    public String getEmail() {
        return this.email;
    }

    public boolean getUserLoginStatus() {
        return isUserLoggedIn;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void setUserLoggedIn() {
        isUserLoggedIn = true;
    }

    public static boolean login(String enteredUsername, String enteredPassword) {

        // file handling logic
        String[] userData = new String[4];
        userData = FileHandling.FileReader("user-data/confidential.txt");
        if (userData != null && userData.length != 0) {
            if (userData[2].equals(enteredUsername)) {
                if (userData[3].equals(enteredPassword)) {
                    User onlineUser = new User(userData[0], userData[1], userData[2], userData[3], true);
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Invalid Password!");
                }

            } else {
                System.out.println("Invalid Username!");
            }

        } else {
            System.out.println("ERROR! User does not exist!");
        }

        return true;
    }

    public static void signUp(String firstName, String lastName, String email, String password, String confirm_password,
            boolean isUserLoggedIn) {

        if (password.equals(confirm_password)) {
            FileHandling.WritingDataInFile("user-data/confidential.txt", firstName, lastName, email, password);
            User onlineUser = new User(firstName, lastName, email, password, true);
            System.out.println("Your account has been successfully created!");
        } else {
            System.err.println("Passwords do not match!");
        }

    }

    public void logout() {
    }
}
