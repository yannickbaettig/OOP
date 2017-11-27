package ch.hslu.SW10.Fahrzeug;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Motor implements Switchable {
    private int rpm;
    private State state = State.OFF;
    // Datenstruktur zur Speicherung aller Listener.
    private final List<PropertyChangeListener> changeListeners = new ArrayList<>();

    @Override
    public void switchOn() {
        if (isSwitchedOff()){
            state = State.ON;
            PropertyChangeEvent event = new PropertyChangeEvent(this, "state", State.OFF, State.ON);
            firePropertyChangeEvent(event);
        }
    }

    @Override
    public void switchOff() {
        if (isSwitchedOn()){
            state = State.OFF;
            PropertyChangeEvent event = new PropertyChangeEvent(this, "state", State.ON, State.OFF);
            firePropertyChangeEvent(event);
        }
    }

    @Override
    public boolean isSwitchedOn() {
       return this.state == State.ON;
    }

    @Override
    public boolean isSwitchedOff() {
        return this.state == State.OFF;
    }

    public int getRpm() {
        return rpm;
    }


    /**
     * Registriert einen PropertyChangeListener.
     * @param listener PropertyChangeListener.
     */
    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        if (listener != null) {
            this.changeListeners.add(listener);
        }
    }
    /**
     * Deregistriert einen PropertyChangeListener.
     * @param listener PropertyChangeListener.
     */
    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        if (listener != null){
            this.changeListeners.remove(listener);
        }

    }

    private void firePropertyChangeEvent(PropertyChangeEvent event) {
        for (PropertyChangeListener listener : changeListeners) {
            listener.propertyChange(event);
        }
    }

}
