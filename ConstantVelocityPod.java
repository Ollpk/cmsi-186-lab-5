public class ConstantVelocityPod extends Pod {
    public ConstantVelocityPod(String name, double velocity) {
        super(name, t -> velocity);
        return;
    }
    
    public double distanceTRaveled(double startTime, double endTime) {
        return (endTime - startTime) * (v(startTime)+v(endTime))/2.0;
        )
    }
}
