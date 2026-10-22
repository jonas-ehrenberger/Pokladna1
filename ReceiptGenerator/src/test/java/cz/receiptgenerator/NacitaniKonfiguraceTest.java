package cz.receiptgenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** Člověk 2: doplňte test načtení konfigurace. */
class NacitaniKonfiguraceTest {
    @Test
    void obchodUchovavaUdaje() {
        Obchod obchod = new Obchod("Obchod", "Praha", "12345678", "Díky!");
        assertEquals("Obchod", obchod.getNazev());
    }
    // TODO: otestujte NacitaniKonfigurace.nactiObchod.
}
