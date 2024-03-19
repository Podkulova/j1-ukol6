package cz.czechitas.ukol06.svatky;

import java.time.MonthDay;

public class Svatek {
    private MonthDay den;
    private String jmeno;

    public MonthDay getDen() {
        return den;
    }

    public void setDen(MonthDay den) {
        this.den = den;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
}
