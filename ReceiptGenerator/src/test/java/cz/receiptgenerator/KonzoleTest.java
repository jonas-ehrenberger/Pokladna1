
package cz.receiptgenerator;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class KonzoleTest {

    @Test
    void nacteniViceProduktu() {

        String vstup = String.join("\n",
                "Rohlík",
                "5.50",
                "3",
                "ano",
                "Mléko",
                "29.90",
                "2",
                "ne"
        );

        try (Scanner scanner = new Scanner(vstup)) {

            Konzole konzole = new Konzole();
            Nakup nakup = konzole.nactiNakup(scanner);

            assertEquals(2, nakup.getProdukty().size());
            assertEquals("Rohlík", nakup.getProdukty().get(0).getNazev());
            assertEquals("Mléko", nakup.getProdukty().get(1).getNazev());
            assertEquals(76.30, nakup.getCelkovaCena(), 0.001);
        }
    }

    @Test
    void chybnyVstupSeZadaZnovu() {

        String vstup = String.join("\n",
                "",
                "Rohlík",
                "abc",
                "-5",
                "10",
                "0",
                "xyz",
                "2",
                "ne"
        );

        try (Scanner scanner = new Scanner(vstup)) {

            Konzole konzole = new Konzole();
            Nakup nakup = konzole.nactiNakup(scanner);

            assertEquals(1, nakup.getProdukty().size());
            assertEquals("Rohlík", nakup.getProdukty().get(0).getNazev());
            assertEquals(2, nakup.getProdukty().get(0).getPocetKusu());
            assertEquals(20.00, nakup.getCelkovaCena(), 0.001);
        }
    }
}
