package es.ulpgc;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void should_evaluate_operator_sum() {
        Calculator calculator = new Calculator();
        double result = calculator.add("3+2");
        Assert.assertEquals(5, result, 0.1);
    }

    @Test
    public void should_evaluate_operator_subtract() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract("3-2");
        Assert.assertEquals(1, result, 0.1);
    }

    @Test
    public void should_evaluate_operator_multiply() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply("3*2");
        Assert.assertEquals(6, result, 0.1);
    }

    @Test
    public void should_evaluate_operator_divide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide("6/2");
        Assert.assertEquals(3, result, 0.1);
    }

}
