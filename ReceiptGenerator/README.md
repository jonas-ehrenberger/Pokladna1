# ReceiptGenerator

**Verze:** `0.1.0-SNAPSHOT` (společná kostra). Cílová verze hotového projektu: `1.0.0`.

Týmový Java nástroj, který po dokončení načte údaje o obchodě ze souboru,
vyžádá si nákup v příkazové řádce a vytiskne účtenku.

> ⚠️ Tohle je **startovací kostra, nikoli hotová aplikace**. TODO metody úmyslně hází
> `UnsupportedOperationException`. Zatím lze spustit jen uvítací zprávu.

## Autoři

- Člověk 1: **DOPLNIT JMÉNO** – produkty a výpočty
- Člověk 2: **DOPLNIT JMÉNO** – konfigurace obchodu
- Člověk 3: **DOPLNIT JMÉNO** – tisk účtenky
- Člověk 4: **DOPLNIT JMÉNO** – vstup z konzole, propojení a build

## Požadavky

- JDK 17 nebo novější (například JDK 21)
- Maven 3.9+ (nebo Maven integrovaný v IntelliJ IDEA)

## Otevření v IntelliJ IDEA

1. Rozbalte ZIP, v IntelliJ zvolte **File → Open** a vyberte složku `ReceiptGenerator`.
2. Pokud se IntelliJ zeptá, načtěte Maven projekt podle `pom.xml`.
3. Nechte stáhnout JUnit závislosti. Spusťte třídu `cz.receiptgenerator.Main`.

## Sestavení, testy a spuštění

```bash
mvn clean test
mvn package
java -jar target/receipt-generator-0.1.0-SNAPSHOT.jar
```

Aktuální spustitelný JAR vypíše jen uvítání. Závislost JUnit je pouze pro testy,
proto pro běh JAR nepotřebujete další knihovny (potřebujete však Javu).

### Vytvoření další verze

1. Po spojení všech větví ověřte `mvn clean test` a `mvn package`.
2. Změňte `<version>` v `pom.xml` (například na `1.0.0`).
3. Aktualizujte informace o verzi v `Main.java` a README.
4. Vytvořte commit, Git tag `v1.0.0` a push tagu do GitHubu.
5. Spusťte nové JAR podle názvu v `target/`.

## Kdo na čem pracuje

| Člověk | Větev | Odpovědnost |
| --- | --- | --- |
| 1 | `feature/produkty` | `Produkt.java`, `Nakup.java`, `ProduktTest.java` |
| 2 | `feature/konfigurace` | `Obchod.java`, `NacitaniKonfigurace.java`, `obchod.properties`, `NacitaniKonfiguraceTest.java` |
| 3 | `feature/uctenka` | `TiskUctenky.java`, `TiskUctenkyTest.java` |
| 4 | `feature/konzole` | `Konzole.java`, `Main.java`, `KonzoleTest.java`, `pom.xml`, README |

Každý člen vytvoří vlastní commit a Pull Request do `main`.

### Dohodnuté veřejné metody

- `new Produkt(String nazev, BigDecimal cena, int pocet)`
- `Produkt.vypocitejCenu(): BigDecimal`
- `Nakup.pridejProdukt(Produkt): void`
- `Nakup.getProdukty(): List<Produkt>`
- `Nakup.vypocitejCelkem(): BigDecimal`
- `NacitaniKonfigurace.nactiObchod(): Obchod` (může vyhodit `IOException`)
- `Konzole.nactiNakup(Scanner): Nakup`
- `TiskUctenky.vytvorUctenku(Obchod, Nakup): String`

**Neměňte bez domluvy signatury těchto metod.** Používejte `BigDecimal` na ceny,
žádné `double` pro měnu. Pro účtenku stačí textový výpis v Kč.

## GitHub – společný začátek

První člen nahraje obsah rozbalené složky do **prázdného** GitHub repozitáře:

```bash
git init
git add .
git commit -m "Initial Maven project skeleton"
git branch -M main
git remote add origin https://github.com/UZIVATEL/REPOZITAR.git
git push -u origin main
```

Pokud už repozitář obsahuje commity (např. README), **nepoužívejte tento postup
naslepo**; nejprve repozitář naklonujte a soubory přidejte do něj.

Ostatní členové:

```bash
git clone https://github.com/UZIVATEL/REPOZITAR.git
cd REPOZITAR
git switch -c feature/produkty  # každý zvolí vlastní větev
git add .
git commit -m "Implement product model"
git push -u origin feature/produkty
```

Následně na GitHubu otevřou Pull Request do `main`.
