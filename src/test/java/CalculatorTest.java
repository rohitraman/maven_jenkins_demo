import org.example.Calculator;
import org.junit.Assert;
import org.junit.Test;

import org.junit.Assert.*;
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive() {
        Assert.assertEquals("Finding factorial of true positive", 120, calculator.fact(5));
    }
    @Test
    public void factorialFalsePositive() {
        Assert.assertNotEquals("Finding factorial of true positive", 120, calculator.fact(4));
    }
}
