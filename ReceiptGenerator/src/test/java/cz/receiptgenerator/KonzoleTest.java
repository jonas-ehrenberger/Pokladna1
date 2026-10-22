package cz.receiptgenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** Člověk 4: doplňte test s připraveným vstupem přes Scanner. */
class KonzoleTest {
    @Test
    void konzoleLzeVytvorit() {
        assertNotNull(new Konzole());
    }
    // TODO: použijte Scanner(new StringReader(...)) nebo Scanner(String).
}
