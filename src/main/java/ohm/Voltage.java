package ohm;

/**
 * Created by josef on 8/18/17.
 */
public final class Voltage {
    private Voltage() {
    }

    public static double calculateVoltage(double current, double resistance) {
        return current * resistance;
    }

    public static double calculateVoltagePowerCurrent(double power, double current) {
        return power / current;
    }

    public static double calculateVoltagePowerResitance(double power, double resistance) {
        return Math.sqrt(power * resistance);
    }

}
