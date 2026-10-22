package cz.receiptgenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NakupTest {

    @Test
    void testCelkovaCenaNakupu() {
        Nakup nakup = new Nakup();
        nakup.pridatProdukt(new Produkt("Mléko", 25.0, 2));  // 50.0 Kč
        nakup.pridatProdukt(new Produkt("Rohlík", 3.50, 10)); // 35.0 Kč

        assertEquals(85.0, nakup.getCelkovaCena(), 0.001);
    }

    @Test
    void testPrazdnyNakupVraciNulu() {
        Nakup nakup = new Nakup();
        assertTrue(nakup.jePrazdny());
        assertEquals(0.0, nakup.getCelkovaCena(), 0.001);
    }
}