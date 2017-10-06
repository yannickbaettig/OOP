package ch.hslu.SW03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IterationTest {

    @Test
    public void testLoop(){
        Iteration iteration = new Iteration();
        iteration.countToTen();
        iteration.addToFloat();
    }

    @Test
    public void printBox(){
        Iteration iteration = new Iteration();
        iteration.printBox(8,10);
    }
}
