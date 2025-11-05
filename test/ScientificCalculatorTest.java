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

@Test
void conversionNum() {
    String j;
    for (int i =-1000; i<1000; i++) {
        j = Integer.toString(i, 2);
        sc.setNumbers(i, 2);
        assertEquals(j, sc.conversionNum());

        j = Integer.toString(i, 8);
        sc.setNumbers(i, 8);
        assertEquals(j, sc.conversionNum());

        j = Integer.toString(i, 16);
        sc.setNumbers(i, 16);
        assertEquals(j, sc.conversionNum());
    }
}
}
