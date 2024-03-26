public class Passenger extends User {
    private int age;
    private boolean isDisabled;
    private boolean isMilitary;

    Passenger(String firstName, String lastName, String email, String password, boolean isUserLoggedIn, int age,
            boolean isDisabled, boolean isMilitary) {
        super(firstName, lastName, email, password, isUserLoggedIn);
        this.age = age;
        this.isDisabled = isDisabled;
        this.isMilitary = isMilitary;
    }

    public boolean login(String username, String password) {
        // file handling logic

        return true;
    }

    public void logout() {
    }

    Ticket bookTicket(Train train, CoachType coachtype) {
        Ticket foo = new Ticket();
        return foo;
    }

    boolean cancelTicket(Ticket ticket) {
        return true;
    }
}
