package ch.hslu.SW01.Aufgabe4;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Quittung {

    private static BigDecimal MWST  = new BigDecimal(8);
    private ArrayList<Produkt> produkte;
    private Filiale filiale;
    private BigDecimal total;
    private BigDecimal mwst;
    private BigDecimal bezahlt;
    private BigDecimal rückgeld;


    public BigDecimal calculateMWST(BigDecimal total) {
        BigDecimal mwst;
        return mwst = total.multiply(MWST).divide(new BigDecimal(100));
    }


    public void setRückgeld(BigDecimal bezahlt, BigDecimal total) {
        this.rückgeld = total.subtract(bezahlt);
    }
}


