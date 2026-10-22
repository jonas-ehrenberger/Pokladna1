package cz.receiptgenerator;

/**
 * Třída reprezentuje jednotlivou položku nákupu.
 */
public class Produkt {
    private final String nazev;
    private final double cena;
    private final int pocetKusu;

    public Produkt(String nazev, double cena, int pocetKusu) {
        if (nazev == null || nazev.trim().isEmpty()) {
            throw new IllegalArgumentException("Název produktu nesmí být prázdný.");
        }
        if (cena < 0) {
            throw new IllegalArgumentException("Cena produktu nesmí být záporná.");
        }
        if (pocetKusu <= 0) {
            throw new IllegalArgumentException("Počet kusů musí být větší než 0.");
        }
        this.nazev = nazev.trim();
        this.cena = cena;
        this.pocetKusu = pocetKusu;
    }

    public String getNazev() {
        return nazev;
    }

    public double getCena() {
        return cena;
    }

    public int getPocetKusu() {
        return pocetKusu;
    }

    /**
     * Vypočítá celkovou cenu za tuto položku (cena * počet kusů).
     */
    public double getCelkovaCenaPolozky() {
        return cena * pocetKusu;
    }
}