import io.veronicacrowe.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by veronicacrowe on 5/17/16.
 */
public class CalculatorSpec {
    @Test
    public void addTest() {
        int expectedValue = 4;
        int actualValue = Calculator.add(2, 2);
        assertEquals("Adding two numbers together the value should be 4", expectedValue, actualValue);

    }

    @Test
    public void differenceTest() {
        int expectedValue = 4;
        int actualValue = Calculator.subtract(6, 2);
        assertEquals("Subtracting two numbers and the value should be 4", expectedValue, actualValue);

    }

    @Test
    public void productTest() {
        int expectedValue = 4;
        int actualValue = Calculator.multiply(2, 2);
        assertEquals("Multiplying two numbers together the value should be 4", expectedValue, actualValue);
    }

    @Test
    public void divideTest() {
        int expectedValue = 3;
        int actualValue = Calculator.divide(6, 2);
        assertEquals("Dividing two numbers together the value should be 3", expectedValue, actualValue);
    }
}
