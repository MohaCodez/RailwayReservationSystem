public abstract class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean isUserLoggedIn;

    // constructor
    User(String firstName, String lastName, String email, String password, boolean isUserLoggedIn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.isUserLoggedIn = false;
    }

    // getters and setters for the user's attributes
    public String getEmail() {
        return this.email;
    }

    public boolean getUserLoginStatus() {
        return this.isUserLoggedIn;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // other methods
    abstract boolean login(String username, String password);

    abstract void logout();
}
