
package cz.receiptgenerator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TiskUctenkyTest {

    @Test
    void uctenkaObsahujeSpravneUdaje() {

        Obchod obchod = new Obchod(
                "Testovací obchod",
                "Praha",
                "12345678",
                "Děkujeme za nákup!"
        );

        Nakup nakup = new Nakup();
        nakup.pridatProdukt(new Produkt("Rohlík", 5.50, 3));
        nakup.pridatProdukt(new Produkt("Mléko", 29.90, 2));

        TiskUctenky tisk = new TiskUctenky();
        String uctenka = tisk.vytvorUctenku(obchod, nakup);

        assertAll(
                () -> assertTrue(uctenka.contains("Testovací obchod")),
                () -> assertTrue(uctenka.contains("Praha")),
                () -> assertTrue(uctenka.contains("12345678")),
                () -> assertTrue(uctenka.contains("Rohlík")),
                () -> assertTrue(uctenka.contains("3 x 5.50 Kč = 16.50 Kč")),
                () -> assertTrue(uctenka.contains("2 x 29.90 Kč = 59.80 Kč")),
                () -> assertTrue(uctenka.contains("CELKEM: 76.30 Kč")),
                () -> assertTrue(uctenka.contains("Děkujeme za nákup!"))
        );
    }

    @Test
    void prazdnyNakupMaNulovouCenu() {

        Obchod obchod = new Obchod(
                "Testovací obchod",
                "Praha",
                "12345678",
                "Děkujeme!"
        );

        Nakup nakup = new Nakup();

        String uctenka = new TiskUctenky()
                .vytvorUctenku(obchod, nakup);

        assertTrue(uctenka.contains("CELKEM: 0.00 Kč"));
    }
}
