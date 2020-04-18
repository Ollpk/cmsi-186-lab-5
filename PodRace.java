import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class PodRace {
    public static Set<Pod> race(double distance, Set<Pod> racers, double timeSlice, double timeLimit) {
        var positions = new HashMap<Pod, Double>();
        var winners = new HashSet<Pod>();

        if (distance < 0) {
            throw new IllegalArgumentException("Distance must be greater than 0");

        }
        if (timeSlice < 0) {
            throw new IllegalArgumentException("Time Slice must be greater than 0");
        }

        for (double t = 0.0; t < timeLimit; t += timeSlice) {
            var hasWon = false;
            for (var pod : racers) {

                if (positions.containsKey(pod)) {
                    positions.put(pod, pod.v(t) + positions.get(pod));
                } else {
                    positions.put(pod, pod.v(t));
                }

                if (positions.get(pod) >= distance) {
                    winners.add(pod);
                    hasWon = true;

                }

            }
            if (hasWon == true) {
                break;
            }
        }

        return winners;
    }

}
