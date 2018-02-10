package ohm;

/**
 * Created by josef on 8/18/17.
 */
public class Power {

    private Power() {
    }

    public static double powerForVoltage(double current, double resistance){
        return  Math.pow(current,2) * resistance;
    }

    public static double powerForCurrent(double voltage, double resistance){
        return  Math.pow(voltage,2) / resistance;
    }

    public static double powerForResistance(double voltage, double current){
        return  voltage * current;
    }
}
