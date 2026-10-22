package cz.receiptgenerator;

import java.math.BigDecimal;

/** Člověk 1: jedna položka nákupu. */
public class Produkt {
    private final String nazev;
    private final BigDecimal cena;
    private final int pocet;

    public Produkt(String nazev, BigDecimal cena, int pocet) {
        // TODO (člověk 1): validujte vstupy (neprázdný název, cena >= 0, počet > 0).
        this.nazev = nazev;
        this.cena = cena;
        this.pocet = pocet;
    }

    public String getNazev() { return nazev; }
    public BigDecimal getCena() { return cena; }
    public int getPocet() { return pocet; }

    public BigDecimal vypocitejCenu() {
        // TODO (člověk 1): cena * počet.
        throw new UnsupportedOperationException("TODO: Produkt.vypocitejCenu");
    }
}
