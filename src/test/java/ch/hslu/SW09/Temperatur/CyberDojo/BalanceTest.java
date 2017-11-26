package ch.hslu.SW09.Temperatur.CyberDojo;

import ch.hslu.SW09.CyberDojo.Balance;
import org.junit.*;
import static org.junit.Assert.*;

public class BalanceTest {

    @Test
    public void testunbalancedParentheses() {
        String parentheses = "{{)(}}";
        Balance balance = new Balance();

        boolean expected = false;
        boolean actual = balance.isBalanced(parentheses);

        assertEquals(expected, actual);
    }

    @Test
    public void testunbalancedParentheses2() {
        String parentheses = "({)}";
        Balance balance = new Balance();

        boolean expected = false;
        boolean actual = balance.isBalanced(parentheses);

        assertEquals(expected, actual);
    }

    @Test
    public void testParentheses() {
        String parentheses = "[({})]";
        Balance balance = new Balance();

        boolean expected = true;
        boolean actual = balance.isBalanced(parentheses);

        assertEquals(expected, actual);
    }

    @Test
    public void testParentheses1() {
        String parentheses = "{}([])";
        Balance balance = new Balance();

        boolean expected = true;
        boolean actual = balance.isBalanced(parentheses);

        assertEquals(expected, actual);
    }

    @Test
    public void testParentheses2() {
        String parentheses = "{()}[[{}]]";
        Balance balance = new Balance();

        boolean expected = true;
        boolean actual = balance.isBalanced(parentheses);

        assertEquals(expected, actual);
    }


}
