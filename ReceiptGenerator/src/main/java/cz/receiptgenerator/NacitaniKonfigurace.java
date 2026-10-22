
package cz.receiptgenerator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class NacitaniKonfigurace {

    public static Obchod nactiZSouboru(String nazevSouboru) {

        Properties properties = new Properties();

        try (InputStream input = NacitaniKonfigurace.class
                .getClassLoader()
                .getResourceAsStream(nazevSouboru)) {

            if (input == null) {
                try (FileInputStream fileInput =
                             new FileInputStream(nazevSouboru)) {

                    properties.load(new InputStreamReader(
                            fileInput, StandardCharsets.UTF_8
                    ));
                }
            } else {
                properties.load(new InputStreamReader(
                        input, StandardCharsets.UTF_8
                ));
            }

        } catch (IOException e) {

            System.err.println(
                    "Nepodařilo se načíst konfiguraci. "
                            + "Použijí se výchozí hodnoty."
            );

            return new Obchod(
                    "Neznámý obchod",
                    "Neznámá adresa",
                    "00000000",
                    "Děkujeme za nákup!"
            );
        }

        String nazev = properties.getProperty(
                "nazev", "Standardní obchod"
        );

        String adresa = properties.getProperty(
                "adresa", "Neznámá adresa"
        );

        String ico = properties.getProperty(
                "ico", "00000000"
        );

        String podekovani = properties.getProperty(
                "podekovani", "Děkujeme za nákup!"
        );

        return new Obchod(nazev, adresa, ico, podekovani);
    }
}
