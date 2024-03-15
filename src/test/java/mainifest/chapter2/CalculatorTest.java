package mainifest.chapter2;

import org.junit.jupiter.api.Test;
import service.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <p></p>
 *
 * @author Jazin
 * @version 1.0
 * @date 2024/3/13 20:17 by miaojz
 */
public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
    }
}
