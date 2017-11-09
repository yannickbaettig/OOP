package ch.hslu.SW07.Temperatur;

public class Quecksilber extends Element {

    public Quecksilber() {
        super("Hg", 357f, -38f);
    }

    @Override
    public String toString() {
        return super.toString() + ", Achtung Giftig";
    }


}
