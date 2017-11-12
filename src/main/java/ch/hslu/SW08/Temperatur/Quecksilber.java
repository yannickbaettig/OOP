package ch.hslu.SW08.Temperatur;

public class Quecksilber extends Element {

    public Quecksilber() {
        super("Hg", new Temperatur(357f), new Temperatur(-38f));
    }

    @Override
    public String toString() {
        return super.toString() + ", Achtung Giftig";
    }


}
