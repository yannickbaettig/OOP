package ch.hslu.SW07;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PersonTest {


    @Test
    public void testConstructor() throws Exception {
        Person person = new Person(1,"hans", "ruedi");
        long expected = 1;

        assertEquals(expected,person.getId());
    }

    @Test
    public void testPerson() throws Exception {
        EqualsVerifier.forClass(Person.class).suppress(Warning.NONFINAL_FIELDS).suppress(Warning.ALL_FIELDS_SHOULD_BE_USED).usingGetClass().verify();
    }

    @Test
    public void testEquals1() throws Exception {
        Person person1 = new Person(1,"hans", "ruedi");
        Person person2 = new Person(1,"hans", "ruedi");
        assertTrue(person1.equals(person2));
        assertEquals(person1.hashCode(), person2.hashCode());
    }

    @Test
    public void testEquals2() throws Exception {
        Person person1 = new Person(1,"hans", "ruedi");
        Person person2 = person1;
        assertTrue(person1.equals(person2));
        assertEquals(person1.hashCode(), person2.hashCode());
    }

    @Test
    public void testNotEquals() throws Exception {
        Person person1 = new Person(1,"hans", "ruedi");
        Person person2 = new Person(2,"hansi", "hinterseher");

        assertFalse(person1.equals(person2));
        assertNotEquals(person1.hashCode(), person2.hashCode());
    }

    @Test
    public void testCompareTo() throws Exception {
        Person [] persons = new Person[4];
        Person person1 = new Person(12, "hansi", "dj");
        Person person2 = new Person(1, "hans", "asdf");
        Person person3 = new Person(4, "otto", "ruedi");
        Person person4 = new Person(8, "hans", "ruedi");
        persons[0] = person1;
        persons[1] = person2;
        persons[2] = person3;
        persons[3] = person4;


        Person[] personsExpected = new Person[4];
        personsExpected[0] = person2;
        personsExpected[1] = person3;
        personsExpected[2] = person4;
        personsExpected[3] = person1;


        Arrays.sort(persons);


        for(Person temp: persons){
            System.out.println(temp);
        }

        assertArrayEquals(persons,personsExpected);

    }

    @Test
    public void testComparator() throws Exception {
        Person [] persons = new Person[4];
        Person person1 = new Person(12, "ahans", "aruedi");
        Person person2 = new Person(1, "bhans", "aruedi");
        Person person3 = new Person(4, "bhans", "bruedi");
        Person person4 = new Person(8, "chans", "bruedi");
        persons[0] = person2;
        persons[1] = person3;
        persons[2] = person4;
        persons[3] = person1;


        Person[] personsExpected = new Person[4];
        personsExpected[0] = person1;
        personsExpected[1] = person2;
        personsExpected[2] = person3;
        personsExpected[3] = person4;

        Arrays.sort(persons, new PersonNameComparator());

        for(Person temp: persons){
            System.out.println(temp);
        }

        assertArrayEquals(persons,personsExpected);
    }

}