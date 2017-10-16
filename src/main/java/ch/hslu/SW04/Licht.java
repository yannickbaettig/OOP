package ch.hslu.SW04;

public class Licht implements Switchable {
    private int lumen = 0;
    private final int LUMEN_MAX = 1200;

    @Override
    public void switchOn() {
        if (isSwitchedOff()){
            lumen = LUMEN_MAX;
        }
    }

    @Override
    public void switchOff() {
        if (isSwitchedOn()){
            lumen = 0;
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return lumen > 0 ? true : false;
    }

    @Override
    public boolean isSwitchedOff() {
        return lumen <= 0 ? true : false;
    }
}