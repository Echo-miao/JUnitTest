package mainifest;

/**
 * <p></p>
 *
 * @author Jazin
 * @version 1.0
 * @date 2024/3/10 22:24 by miaojz
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        if (result != 60) {
            System.out.println("Bad result: " + result);
        }
    }
}
