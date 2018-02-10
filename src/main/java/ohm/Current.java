package ohm;

/**
 * Created by josef on 8/18/17.
 */
public class Current {

    private Current() {
    }

    public static double calculateCurrent(double voltage, double resistance) {
        return voltage /resistance;
    }
}
