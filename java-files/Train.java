import java.util.Map;
import java.util.HashMap;

public class Train {
    private String trainNumber;
    private TrainRoute route;
    private Map<CoachType, Integer> seatsAvailable
    private Map<CoachType, Double> fare;
    
    public Train(String trainNumber, TrainRoute route) {
        this.trainNumber = trainNumber;
        this.route = route;
        this.seatsAvailable = new HashMap<>();
        this.fare = new HashMap<>();
    }

    boolean checkAvailability(CoachType coachType) {
        if (seatsAvailable.containsKey(coachType)) {
            return seatsAvailable.get(coachType) > 0;
        } else {
            return false;
        }
    }

}
