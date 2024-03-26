public class Passenger extends User {
    private int age;
    private boolean isDisabled;
    private boolean isMilitary;

    Passenger(String username, String password, String email, boolean isUserLoggedIn) {
        super(username, password, email, isUserLoggedIn);
        // this.age = age;
        // this.isDisabled = isDisabled;
        // this.isMilitary = isMilitary;
    }

    Ticket bookTicket(Train train, CoachType coachtype) {

    }

}
