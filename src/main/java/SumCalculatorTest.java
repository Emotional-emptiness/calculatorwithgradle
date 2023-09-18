import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    public void testSumWithPositiveInput() {
        assertEquals(1, calculator.sum(1));
        assertEquals(6, calculator.sum(3));
    }

    @Test
    public void testSumWithZeroInput() {
        assertEquals(0, calculator.sum(0));
    }

    @Test
    public void testSumWithNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(-1));
    }
}
