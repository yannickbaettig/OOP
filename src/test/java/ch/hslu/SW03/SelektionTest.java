package ch.hslu.SW03;

import ch.hslu.SW02.Temperatur;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SelektionTest {

    @Test
    public void testMax2(){
        int maxEquals = 30;
        Selektion selektion = new Selektion();
        int max = selektion.max2(10,20,30);
        assertEquals(max,maxEquals);
    }

    @Test
    public void testMax3(){
        int maxEquals = 50;
        Selektion selektion = new Selektion();
        int max = selektion.max3(10,20,30,40,50);
        assertEquals(max,maxEquals);
    }
}

