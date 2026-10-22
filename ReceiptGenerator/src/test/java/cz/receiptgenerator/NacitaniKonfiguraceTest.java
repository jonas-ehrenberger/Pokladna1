package cz.receiptgenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NacitaniKonfiguraceTest {

    @Test
    public void testNacitaniKonfigurace() {
        Obchod obchod = NacitaniKonfigurace.nactiZSouboru("obchod.properties");
        assertNotNull(obchod);
        assertNotNull(obchod.getNazev());
        assertNotNull(obchod.getAdresa());
        assertNotNull(obchod.getIco());
    }
}
