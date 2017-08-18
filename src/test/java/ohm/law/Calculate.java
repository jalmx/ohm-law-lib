package ohm.law;

import ohm.Current;
import ohm.Power;
import ohm.Resistance;
import ohm.Voltage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by josef on 8/18/17.
 */
public class Calculate {

    @Test
    public void calculateVoltageTest() {
        double expected = 100;

        double current = 1;
        double resistance = 100;

        double actual = Voltage.calculateVoltage(current, resistance);

        assertEquals("Fail to calculate voltage", expected, actual, 1);
    }

    @Test
    public void calculateCurrentTest() {
        double expected = .1;

        double voltage = 10;
        double resistance = 100;

        double actual = Current.calculateCurrent(voltage, resistance);

        assertEquals("Fail to calculate current", expected, actual, 1);
    }

    @Test
    public void calculateResistanceTest() {
        double expected = 1000;

        double voltage = 10;
        double current = .01;

        double actual = Resistance.calculateResistance(voltage, current);

        assertEquals("Fail to calculate resistance", expected, actual, 1);
    }

    @Test
    public void calculatePowerTest() {
        double expectedVoltage = 100;
        double expectedCurrent = 1;
        double expectedResistance = 10;

        double current = 1;
        double resistance = 100;
        double voltage = 10;

        double actualVoltage = Power.powerForVoltage(current,resistance);
        double actualCurrent = Power.powerForCurrent(voltage, resistance);
        double actualResistance = Power.powerForResistance(voltage,current);

        assertEquals("Fail to calculate power without voltage ", expectedVoltage, actualVoltage, 1);
        assertEquals("Fail to calculate power without current", expectedCurrent, actualCurrent, 1);
        assertEquals("Fail to calculate power without resistance", expectedResistance, actualResistance, 1);
    }
}
