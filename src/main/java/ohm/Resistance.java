package ohm;

/**
 * Created by josef on 8/18/17.
 */
public class Resistance {

    private Resistance() {
    }

    public static double calculateResistance(double voltage, double current) {
        return voltage / current;
    }
}
