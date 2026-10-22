package cz.receiptgenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Třída uchovává seznam zakoupených produktů a počítá celkovou cenu nákupu.
 */
public class Nakup {
    private final List<Produkt> produkty = new ArrayList<>();

    public void pridatProdukt(Produkt produkt) {
        if (produkt == null) {
            throw new IllegalArgumentException("Vkládaný produkt nesmí být null.");
        }
        produkty.add(produkt);
    }

    public List<Produkt> getProdukty() {
        return Collections.unmodifiableList(produkty);
    }

    /**
     * Spočítá celkovou sumu za všechny položky v nákupu.
     */
    public double getCelkovaCena() {
        double celkem = 0.0;
        for (Produkt produkt : produkty) {
            celkem += produkt.getCelkovaCenaPolozky();
        }
        return celkem;
    }

    public boolean jePrazdny() {
        return produkty.isEmpty();
    }
}