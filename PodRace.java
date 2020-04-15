import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class PodRace {
    public static Set<Pod> race(double distance, Set<Pod> racers, double timeSlice, double timeLimit) {
        // IMPLEMENT THIS METHOD
        var positions = new HashMap<Pod, Double>();
        var winners = new HashSet<Pod>();

        if (distance < 0) {
            throw new IllegalArgumentException("Distance must be greater than 0");

        }
        if (timeSlice < 0) {
            throw new IllegalArgumentException("Time Slice must be greater than 0");
        }

        for (double t = 0.0; t < timeLimit; t += timeSlice) {
            for (var pod : racers) {
                positions.put(pod, pod.v(t));

                if (positions.get(pod) > distance) {
                    winners.add(pod);
                    System.out.print(winners);
                }

            }

        }

        // find out where pod is at that time t+timeslice
        // means update the map with the new positions

        // if that position is greater than the distance of the race, return the racer
        // as a winner (however there may/will be more than 1)
        // add that to the set of winners

        return winners;
    }

}
