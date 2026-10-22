package cz.receiptgenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProduktTest {

    @Test
    void testVypocetCelkoveCenyPolozky() {
        Produkt p = new Produkt("Chléb", 35.50, 2);
        assertEquals(71.00, p.getCelkovaCenaPolozky(), 0.001);
    }

    @Test
    void testZapornaCenaVyhodiVyjimku() {
        assertThrows(IllegalArgumentException.class, () -> new Produkt("Mléko", -10.0, 1));
    }

    @Test
    void testNulovyPocetKusuVyhodiVyjimku() {
        assertThrows(IllegalArgumentException.class, () -> new Produkt("Mléko", 25.0, 0));
    }

    @Test
    void testPrazdnyNazevVyhodiVyjimku() {
        assertThrows(IllegalArgumentException.class, () -> new Produkt("  ", 25.0, 1));
    }
}