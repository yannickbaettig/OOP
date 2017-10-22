package ch.hslu.SW05.Switchable;

import java.util.ArrayList;
import java.util.List;

public class Fahrzeug implements CountingSwitchable, Named {
    private Motor motor = new Motor();
    private Licht licht = new Licht();
    private long switchCount;
    private String name;

    private List<Switchable> components = new ArrayList<Switchable>(){
        {
            add(motor);
            add(licht);
        }
    };

    @Override
    public void switchOn() {
        components.forEach(component-> component.switchOn());
        switchCount ++;
    }

    @Override
    public void switchOff() {
        components.forEach(component-> component.switchOff());
        switchCount ++;
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


    @Override
    public long getSwitchCount() {
        return switchCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
