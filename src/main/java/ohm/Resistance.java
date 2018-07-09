package ohm;

/**
 * Created by josef on 8/18/17.
 */
public final class Resistance {

    private Resistance() {
    }

    public static double calculateResistance(double voltage, double current) {
        return voltage / current;
    }

    public static double calculateResitancePowerCurrent(double power, double current) {
        return power / Math.pow(current, 2);
    }

    public static double calculateResitancePowerVoltage(double power, double voltage) {
        return Math.pow(voltage, 2) / power;
    }

}
