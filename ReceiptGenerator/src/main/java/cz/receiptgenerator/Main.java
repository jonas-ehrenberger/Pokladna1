
package cz.receiptgenerator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Načtení informací o obchodě
        Obchod obchod = NacitaniKonfigurace.nactiZSouboru(
                "obchod.properties"
        );

        // Vytvoření konzole a načtení nákupu
        Konzole konzole = new Konzole();

        try (Scanner scanner = new Scanner(System.in)) {

            Nakup nakup = konzole.nactiNakup(scanner);

            // Vytvoření účtenky
            TiskUctenky tiskUctenky = new TiskUctenky();

            String uctenka = tiskUctenky.vytvorUctenku(
                    obchod, nakup
            );

            // Výpis účtenky
            System.out.println();
            System.out.println(uctenka);

            // Čekání před ukončením aplikace
            System.out.println();
            System.out.print("Stiskněte Enter pro ukončení...");
            scanner.nextLine();
        }
    }
}
