
package cz.receiptgenerator;

import java.util.Scanner;

public class Konzole {

    public Nakup nactiNakup(Scanner scanner) {

        Nakup nakup = new Nakup();

        System.out.println("Vítejte v ReceiptGenerator v1.0.0!");
        System.out.println("----------------------------");
        System.out.println("Pro ukončení zadávání napište 'konec'.");

        while (true) {

            // Název produktu
            String nazev;

            while (true) {
                System.out.print("Zadejte název produktu: ");
                nazev = scanner.nextLine().trim();

                if (nazev.equalsIgnoreCase("konec")) {
                    return nakup;
                }

                if (!nazev.isEmpty()) {
                    break;
                }

                System.out.println("Název nesmí být prázdný.");
            }

            // Cena produktu
            double cena;

            while (true) {
                System.out.print("Zadejte cenu za kus: ");

                try {
                    cena = Double.parseDouble(
                            scanner.nextLine().trim().replace(',', '.')
                    );

                    if (!Double.isFinite(cena) || cena < 0) {
                        System.out.println("Cena musí být platné nezáporné číslo.");
                        continue;
                    }

                    break;

                } catch (NumberFormatException e) {
                    System.out.println("Neplatná cena. Zadejte číslo.");
                }
            }

            // Počet kusů
            int pocet;

            while (true) {
                System.out.print("Zadejte počet kusů: ");

                try {
                    pocet = Integer.parseInt(scanner.nextLine().trim());

                    if (pocet <= 0) {
                        System.out.println("Počet kusů musí být větší než 0.");
                        continue;
                    }

                    break;

                } catch (NumberFormatException e) {
                    System.out.println("Neplatný počet kusů. Zadejte celé číslo.");
                }
            }

            // Vytvoření a přidání produktu
            Produkt produkt = new Produkt(nazev, cena, pocet);
            nakup.pridatProdukt(produkt);

            System.out.println("Produkt přidán: " + nazev);
            System.out.println();
        }
    }
}
