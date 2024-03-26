abstract class User {
    private String username;
    private String password;
    private String email;
    public boolean isUserLoggedIn;

    // constructor
    User(String username, String password, String email, boolean isUserLoggedIn){
        this.username = username;
        this.password = password;
        this.email = email;
        this.isUserLoggedIn = false;
    }

    // getters and setters for the user's attributes
    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }

    // other methods
    public boolean login() {
        this.isUserLoggedIn = true;
        return true;
    }

    public void logout() {
        this.isUserLoggedIn = false;
    }

}
