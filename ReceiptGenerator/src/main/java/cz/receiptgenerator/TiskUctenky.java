package cz.receiptgenerator;

/** Člověk 3: převod údajů o obchodě a nákupu na čitelnou účtenku. */

public class TiskUctenky {

    public String vytvorUctenku(Obchod obchod, Nakup nakup) {

        StringBuilder uctenka = new StringBuilder();

        uctenka.append("============================\n");
        uctenka.append(obchod.getNazev()).append("\n");
        uctenka.append(obchod.getAdresa()).append("\n");
        uctenka.append("ICO: ").append(obchod.getIco()).append("\n");
        uctenka.append("============================\n");

        for (Produkt produkt : nakup.getProdukty()) {

            String nazev = produkt.getNazev();
            int pocet = produkt.getPocet();
            String cena = produkt.getCena().toPlainString();
            String celkovaCena = produkt.vypocitejCenu().toPlainString();

            uctenka.append(nazev)
                    .append(" | ")
                    .append(pocet)
                    .append(" x ")
                    .append(cena)
                    .append(" Kč = ")
                    .append(celkovaCena)
                    .append(" Kč\n");
        }

        uctenka.append("----------------------------\n");

        uctenka.append("CELKEM: ")
                .append(nakup.vypocitejCelkem().toPlainString())
                .append(" Kč\n");

        uctenka.append("============================\n");

        uctenka.append(obchod.getPodekovani()).append("\n");

        uctenka.append("============================\n");


        return uctenka.toString();
    }
}

