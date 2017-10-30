package ch.hslu.SW06.Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculableTest {

    @Test
    public void testAdd() throws Exception {
        Calculable calculator = new Calculator();

        int expected = 8;
        int firstNumber = 3;
        int secondNumber = 5;

        assertEquals(expected,calculator.add(firstNumber,secondNumber));

    }

    @Test
    public void testAddWithNegative() throws Exception {
        Calculable calculator = new Calculator();

        int expected = -2;
        int firstNumber = 1;
        int secondNumber = -3;

        assertEquals(expected,calculator.add(firstNumber,secondNumber));

    }

    @Test
    public void testAddNegativeWithNegative() throws Exception {
        Calculable calculator = new Calculator();

        int expected = -11;
        int firstNumber = -10;
        int secondNumber = -1;

        assertEquals(expected,calculator.add(firstNumber,secondNumber));

    }

    @Test
    public void testAddWithZero() throws Exception {
        Calculable calculator = new Calculator();

        int expected = -5;
        int firstNumber = -5;
        int secondNumber = 0;

        assertEquals(expected,calculator.add(firstNumber,secondNumber));

    }

    @Test(expected = ArithmeticException.class)
    public void testAddOverflow() throws Exception {
        Calculable calculator = new Calculator();

        int firstNumber = Integer.MAX_VALUE;
        int secondNumber = 1;

        calculator.add(firstNumber,secondNumber);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddUnderflow() throws Exception {
        Calculable calculator = new Calculator();

        int firstNumber = Integer.MIN_VALUE;
        int secondNumber = -1;

        calculator.add(firstNumber,secondNumber);

    }

}