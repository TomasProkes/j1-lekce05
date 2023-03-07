package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Adresa {
    private String ulice;
    private String castObce;
    private String obec;
    private String psc;

    /**
     * Vrací název ulice (pokud existuje) a domovní čísla.
     */
    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        Objects.requireNonNull(ulice);
        if (ulice.isBlank()) {
            System.err.println("Řádek ulice a čísla domů nemůže být prázdný.");
            return;
        }
        this.ulice = ulice;
    }

    public String getCastObce() {
        return castObce;
    }

    public void setCastObce(String castObce) {
        this.castObce = castObce;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        Objects.requireNonNull(obec);
        if (obec.isBlank()) {
            System.err.println("Obec nemůže být prázdná.");
            return;
        }
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        Objects.requireNonNull(psc);
        if (psc.isBlank()) {
            System.err.println("PSČ nemůže být prázdné.");
            return;
        }
        if (psc.length() != 5) {
            System.err.println("PSČ musí mít 5 znaků.");
            return;
        }
        this.psc = psc;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(ulice);
        builder.append(", ");
        if (castObce != null) {
            builder.append(castObce);
            builder.append(", ");
        }
        builder.append(psc);
        builder.append(" ");
        builder.append(obec);
        return builder.toString();
    }
}
