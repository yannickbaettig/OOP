package ch.hslu.SW07;

import java.util.Objects;

public class Person implements Comparable<Person>{

    private final long id;
    private String nachname;
    private String vorname;


    public Person(long id, String nachname, String vorname) {
        this.id = id;
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public long getId() {
        return id;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", nachname='" + nachname + '\'' +
                ", vorname='" + vorname + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Person person = (Person) o;

        return (id == person.id && Objects.equals(this.nachname, person.nachname) && Objects.equals(this.vorname,person.vorname) );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,nachname,vorname);
    }


    @Override
    public int compareTo(Person other) {
        int compare = Long.compare(this.id, other.id);
        if (compare == 0) {
            compare = vorname.compareTo(other.vorname);
        }
        if (compare == 0) {
            compare = nachname.compareTo(other.nachname);
        }
        return compare;
    }
}
