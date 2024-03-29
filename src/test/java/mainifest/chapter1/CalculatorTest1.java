package mainifest.chapter1;

import service.Calculator;

/**
 * <p></p>
 *
 * @author Jazin
 * @version 1.0
 * @date 2024/3/10 22:24 by miaojz
 */
public class CalculatorTest1 {
    private int nbErrors = 0;

    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        if (result != 60) {
            throw new IllegalStateException("Bad result: " + result);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CalculatorTest1 test = new CalculatorTest1();
        try {
            test.testAdd();
        } catch (Exception e) {
            test.nbErrors++;
            e.printStackTrace();
        }
        if (test.nbErrors > 0) {
            throw new IllegalStateException("There were " + test.nbErrors + "error(s)");
        }
        // while (test.nbErrors > 0) {
        //     TimeUnit.SECONDS.sleep(1);
        //     System.out.println("1");
        // }
    }
}
