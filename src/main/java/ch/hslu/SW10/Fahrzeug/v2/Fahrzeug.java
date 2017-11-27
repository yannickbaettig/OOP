package ch.hslu.SW10.Fahrzeug.v2;

import ch.hslu.SW10.Fahrzeug.Licht;
import ch.hslu.SW10.Fahrzeug.Motor;
import ch.hslu.SW10.Fahrzeug.Switchable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Fahrzeug implements Switchable {
    private static final Logger LOG = LogManager.getLogger(Fahrzeug.class);
    private Motor motor;
    private Licht licht;
    private List<Switchable> components = new ArrayList<>();

    public Fahrzeug() {
        this.motor = new Motor();
        this.licht = new Licht();

        this.motor.addPropertyChangeListener(evt -> handleMotorEvent(evt));
        this.licht.addPropertyChangeListener(evt -> handleLichtEvent(evt));

        components.add(motor);
        components.add(licht);

    }

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

    private void handleMotorEvent(PropertyChangeEvent evt){
        LOG.info("Motor: " + evt.getNewValue());
    }

    private void handleLichtEvent(PropertyChangeEvent evt){
        LOG.info("Licht: " + evt.getNewValue());
    }
}
