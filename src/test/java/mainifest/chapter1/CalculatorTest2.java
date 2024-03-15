package mainifest.chapter1;

import org.junit.jupiter.api.Test;
import service.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <p></p>
 *
 * @author Jazin
 * @version 1.0
 * @date 2024/3/10 22:22 by miaojz
 */
public class CalculatorTest2 {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(60,result);
    }
}
