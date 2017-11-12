package ch.hslu.SW07;

import ch.hslu.SW07.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

    @Override //Sortiert die Personen alphabetisch nach Nachname und Vorname
    public int compare(Person person1, Person person2) {
       int compare = person1.getNachname().compareTo(person2.getNachname());
       if (compare == 0) {
           compare = person1.getVorname().compareTo(person2.getVorname());
       }
       return compare;
    }
}
