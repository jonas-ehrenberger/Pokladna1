package cz.receiptgenerator;

/** Člověk 2: neměnné údaje o obchodě načítané z konfigurace. */
public class Obchod {
    private final String nazev;
    private final String adresa;
    private final String ico;
    private final String podekovani;

    public Obchod(String nazev, String adresa, String ico, String podekovani) {
        this.nazev = nazev;
        this.adresa = adresa;
        this.ico = ico;
        this.podekovani = podekovani;
    }

    public String getNazev() { return nazev; }
    public String getAdresa() { return adresa; }
    public String getIco() { return ico; }
    public String getPodekovani() { return podekovani; }
}
