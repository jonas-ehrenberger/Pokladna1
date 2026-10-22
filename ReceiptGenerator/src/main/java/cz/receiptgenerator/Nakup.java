package cz.receiptgenerator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Člověk 1: seznam zakoupených produktů a součet. */
public class Nakup {
    private final List<Produkt> produkty = new ArrayList<>();

    public void pridejProdukt(Produkt produkt) {
        // TODO (člověk 1): ověřte nenulový produkt a přidejte do seznamu.
        throw new UnsupportedOperationException("TODO: Nakup.pridejProdukt");
    }

    public List<Produkt> getProdukty() {
        return Collections.unmodifiableList(produkty);
    }

    public BigDecimal vypocitejCelkem() {
        // TODO (člověk 1): sečtěte ceny položek; prázdný nákup = 0.
        throw new UnsupportedOperationException("TODO: Nakup.vypocitejCelkem");
    }
}
