public class SinePod extends Pod {
    public SinePod(String name, Double a, Double b, Double c) {
        super(name, t -> a * Math.sin(b * t) + c);
        return;
    }

    public double distanceTraveled(double startTime, double endTime) {
        return (endTime - startTime) * (v(startTime) + v(endTime)) / 2.0;

    }
}