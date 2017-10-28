package ch.hslu.SW06;

import org.junit.*;

import static org.junit.Assert.*;

public class SelektionTest {
    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Before All Tests");
    }

    @Before
    public void before() throws Exception {
        System.out.println("Before Each Test");
    }

    @After
    public void after() throws Exception {
        System.out.println("After Each Test");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("After All Tests");
    }

    @Test @Ignore
    public void min() throws Exception {
    }

    @Test
    public void testMaxAGreaterThanB() throws Exception {
        int a = 10;
        int b = -5;

        Selektion selektion = new Selektion();
        assertEquals(10,selektion.max(a,b));

    }

    @Test
    public void testMaxALessThanB() throws Exception {
        int a = 10;
        int b = 15;

        Selektion selektion = new Selektion();
        assertEquals(15,selektion.max(a,b));
    }

    @Test
    public void testMaxAEqualsB() throws Exception {
        int a = 10;
        int b = 10;

        Selektion selektion = new Selektion();
        assertEquals(10,selektion.max(a,b));
    }

}