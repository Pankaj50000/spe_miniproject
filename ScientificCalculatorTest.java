// ScientificCalculatorTest.java
import org.junit.Test;
import static org.junit.Assert.*;

public class ScientificCalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(5.0, ScientificCalculator.squareRoot(25), 0.001);
        assertEquals(3.0, ScientificCalculator.squareRoot(9), 0.001);
        assertEquals(4.0, ScientificCalculator.squareRoot(16), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, ScientificCalculator.factorial(5));
        assertEquals(1, ScientificCalculator.factorial(0));
        assertEquals(1, ScientificCalculator.factorial(1));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(2.302, ScientificCalculator.naturalLog(10), 0.001);
        assertEquals(1.609, ScientificCalculator.naturalLog(5), 0.001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, ScientificCalculator.power(2, 3), 0.001);
        assertEquals(27.0, ScientificCalculator.power(3, 3), 0.001);
        assertEquals(1.0, ScientificCalculator.power(5, 0), 0.001);
    }
}
