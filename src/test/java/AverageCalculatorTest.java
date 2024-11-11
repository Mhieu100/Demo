import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.test.AverageCalculator;

public class AverageCalculatorTest {

    @Test
    public void testNoValidNumbers() {
        int[] value = {-999};
        int minimum = 0;
        int maximum = 100;
        assertEquals(-999, AverageCalculator.average(value, minimum, maximum));
    }

    @Test
    public void testSingleValidNumber() {
        int[] value = {50, -999};
        int minimum = 0;
        int maximum = 100;
        assertEquals(50, AverageCalculator.average(value, minimum, maximum));
    }

    @Test
    public void testSingleInvalidNumber() {
        int[] value = {150, -999};
        int minimum = 0;
        int maximum = 100;
        assertEquals(-999, AverageCalculator.average(value, minimum, maximum));
    }

    @Test
    public void testValidAndInvalidNumber() {
        int[] value = {50, 150, -999};
        int minimum = 0;
        int maximum = 100;
        assertEquals(50, AverageCalculator.average(value, minimum, maximum));
    }
}
