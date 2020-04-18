import java.util.function.Function;

public class Pod {
    private String name;
    private Function<Double, Double> velocityFunction;

    public Pod(String name, Function<Double, Double> velocityFunction) {
        this.name = name;
        this.velocityFunction = velocityFunction;
    }

    public String getName() {
        return name;
    }

    public double v(double t) {
        return velocityFunction.apply(t);
    }

    public double distanceTraveled(double startTime, double endTime, int slices) {
        if (slices < 1) {
            throw new IllegalArgumentException("At least one slice required");
        }

        double timeSlice = (endTime - startTime) / slices;

        double estimation = 0;
        for (double t = startTime; t < endTime; t += timeSlice) {
            estimation += v(t) * timeSlice;
        }

        return estimation;
    }
}
