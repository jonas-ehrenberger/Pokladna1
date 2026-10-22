package cz.receiptgenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

/** Člověk 1: doplňte test výpočtu ceny a neplatných vstupů. */
class ProduktTest {
    @Test
    void produktUchovavaZadaneUdaje() {
        Produkt p = new Produkt("Rohlík", new BigDecimal("3.50"), 5);
        assertEquals("Rohlík", p.getNazev());
        assertEquals(5, p.getPocet());
    }
    // TODO: test vypocitejCenu a Nakup.vypocitejCelkem.
}
