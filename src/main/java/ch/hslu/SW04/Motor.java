package ch.hslu.SW04;

public class Motor implements Switchable {
    private int rpm = 0;
    private final int RPM_LEERLAUF = 1500;

    @Override
    public void switchOn() {
        if (isSwitchedOff()){
            rpm = RPM_LEERLAUF;
        }
    }

    @Override
    public void switchOff() {
        if (isSwitchedOn()){
            rpm = 0;
        }
    }

    @Override
    public boolean isSwitchedOn() {
       return rpm > 0 ? true : false;
    }

    @Override
    public boolean isSwitchedOff() {
        return rpm <= 0 ? true : false;
    }

    public int getRpm() {
        return rpm;
    }
}
