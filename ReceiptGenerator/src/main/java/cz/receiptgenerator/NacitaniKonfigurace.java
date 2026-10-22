package cz.receiptgenerator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class NacitaniKonfigurace {

    public static Obchod nactiZSouboru(String nazevSouboru) {
        Properties properties = new Properties();

        try (InputStream input = NacitaniKonfigurace.class.getClassLoader().getResourceAsStream(nazevSouboru)) {
            if (input == null) {
                try (FileInputStream fileInput = new FileInputStream(nazevSouboru)) {
                    properties.load(fileInput);
                }
            } else {
                properties.load(input);
            }
        } catch (IOException e) {
            System.err.println("Chyba: Nepodařilo se načíst konfigurační soubor '" + nazevSouboru + "'. Použijí se výchozí hodnoty.");
            return new Obchod("Neznámý obchod", "Neznámá adresa", "00000000");
        }

        String nazev = properties.getProperty("nazev", "Standardní obchod");
        String adresa = properties.getProperty("adresa", "Neznámá adresa");
        String ico = properties.getProperty("ico", "00000000");

        return new Obchod(nazev, adresa, ico);
    }
}