import java.util.Arrays;

public class PolynomialPod extends Pod {
    public PolynomialPod(String name, Double[] polynomial) {
        super(name, t -> polynomial[(int) Math.round(t)] * (Math.pow(t,
                Arrays.asList(polynomial[(int) Math.round(t)]).indexOf(polynomial[(int) Math.round(t)]))));
        return;
    }

    public double distanceTraveled(double startTime, double endTime) {
        return (endTime - startTime) * (v(startTime) + v(endTime)) / 2.0;

    }

}
