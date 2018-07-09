package ohm;

/**
 * Created by josef on 8/18/17.
 */
public final class Current {

    private Current() {
    }

    public static double calculateCurrent(double voltage, double resistance) {
        return voltage / resistance;
    }

    public static double calculateCurrentPowerResistance(double power, double resistance) {
        return Math.sqrt(power * resistance);
    }

    public static double calculateCurrentPowerVoltage(double power, double voltage) {
        return power / voltage;
    }
}
