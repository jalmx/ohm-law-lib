package ohm;

/**
 * Created by josef on 8/18/17.
 */
public class Voltage {
    private Voltage() {
    }

    public static double calculateVoltage(double current, double resistance) {
        return current * resistance;
    }
}
