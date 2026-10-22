package cz.receiptgenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** Člověk 3: doplňte test obsahu a formátování účtenky. */
class TiskUctenkyTest {
    @Test
    void vytvorenaInstanceExistuje() {
        assertNotNull(new TiskUctenky());
    }
    // TODO: test řádků účtenky a celkové ceny.
}
