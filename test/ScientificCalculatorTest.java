import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {
    ScientificCalculator sc;

    @BeforeEach
    public void setUp() {
        sc = new ScientificCalculator();
        sc.setNumbers(2, 6);
    }

    @Test
    void power() {
        assertEquals(64, sc.power());
    }
}