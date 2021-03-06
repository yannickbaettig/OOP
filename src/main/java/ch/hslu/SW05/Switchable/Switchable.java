package ch.hslu.SW05.Switchable;

/**
 * Ein und ausschalten
 */
public interface Switchable {

    /**
     * Einschalten des Fahrzeugs.
     */
    void switchOn();

    /**
     * Ausschalten des Fahrzeugs.
     */
    void switchOff();

    /**
     * überürufen ob eingeschaltet.
     * @return
     */
    boolean isSwitchedOn();

    /**
     * überprüfen ob ausgeschaltet.
     * @return
     */
    boolean isSwitchedOff();

}
