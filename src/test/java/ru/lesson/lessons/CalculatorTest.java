package ru.lesson.lessons;


import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
    @Test
    public void testSum() throws Exception {
        Calculator calculator = new Calculator();
        calculator.sum(3, 5);
        Assert.assertEquals(calculator.getResult(), 8);

    }

    @Test
    public void testSubtraction() throws Exception {
        Calculator calculator = new Calculator();
        calculator.subtraction(3, 5);
        Assert.assertEquals(calculator.getResult(), -2);
    }

    @Test
    public void testMultiplication() throws Exception {
        Calculator calculator = new Calculator();
        calculator.multiplication(4, 5);
        Assert.assertEquals(calculator.getResult(), 20);
    }

    @Test
    public void testDivide() throws Exception {
        Calculator calculator = new Calculator();
        calculator.divide(10, 5);
        Assert.assertEquals(calculator.getResult(), 2);
    }
}
