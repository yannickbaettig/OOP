package ch.hslu.SW07;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {


    @Test
    public void testConstructor() throws Exception {
        Person person = new Person(1,"hans", "ruedi");
        long expected = 1;

        assertEquals(expected,person.getId());
    }


    @Test
    public void testPerson() throws Exception {
        EqualsVerifier.forClass(Person.class).usingGetClass().verify();
    }

    @Test
    public void testEquals1() throws Exception {
        Person person1 = new Person(1,"hans", "ruedi");
        Person person2 = new Person(1,"hans", "ruedi");
        assertTrue(person1.equals(person2));
    }

    @Test
    public void testEquals2() throws Exception {
        Person person1 = new Person(1,"hans", "ruedi");
        Person person2 = person1;
        assertTrue(person1.equals(person2));
    }

    @Test
    public void testCompareTo1() throws Exception {
        Person person1 = new Person(1,"hans", "ruedi");
        Person person2 = new Person(2,"hans", "ruedi");
        int expected = -1;
        assertEquals(expected, person1.compareTo(person2));
    }

    @Test
    public void testCompareTo2() throws Exception {
        Person person1 = new Person(1,"hans", "ruedi");
        Person person2 = new Person(1,"hans", "ruedi");
        int expected = 0;
        assertEquals(expected, person1.compareTo(person2));
    }

    @Test
    public void testCompareTo3() throws Exception {
        Person person1 = new Person(1,"hans", "ruedi");
        Person person2 = new Person(0,"hans", "ruedi");
        int expected = 1;
        assertEquals(expected, person1.compareTo(person2));
    }

    @Test
    public void testCompareTo4() throws Exception {
        Person person1 = new Person(1,"ahans", "ruedi");
        Person person2 = new Person(1,"hans", "ruedi");
        int expected = 0;

        assertTrue(person1.compareTo(person2) < expected);
    }

}