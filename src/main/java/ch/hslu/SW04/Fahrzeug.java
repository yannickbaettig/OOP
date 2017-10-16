package ch.hslu.SW04;

import java.util.ArrayList;
import java.util.List;

public class Fahrzeug implements Switchable {
    private Motor motor = new Motor();
    private Licht licht = new Licht();

    private List<Switchable> components = new ArrayList<Switchable>(){
        {
            add(motor);
            add(licht);
        }
    };

    @Override
    public void switchOn() {
        components.forEach(component-> component.switchOn());
    }

    @Override
    public void switchOff() {
        components.forEach(component-> component.switchOff());
    }

    @Override
    public boolean isSwitchedOn() {
        Switchable c = components.stream().filter(component -> (!component.isSwitchedOn())).findAny().orElse(null);
        return c == null;
    }

    @Override
    public boolean isSwitchedOff() {
        Switchable c = components.stream().filter(component -> (!component.isSwitchedOff())).findAny().orElse(null);
        return c == null;
    }

    public Motor getMotor() {
        return motor;
    }

    public Licht getLicht() {
        return licht;
    }

}
