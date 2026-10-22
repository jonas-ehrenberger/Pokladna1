# ReceiptGenerator

Jednoduchá konzolová aplikace v Javě pro vytváření nákupních účtenek.

## Autoři

- **Člověk 1:** Jonáš Ehrenberger
- **Člověk 2:** František Včelička
- **Člověk 3:** Ondřej Korecký 
- **Člověk 4:** Kevin Nguyen

## Požadavky

- Java 17 nebo novější
- Maven (pro sestavení projektu)

## Sestavení a spuštění

V terminálu otevřete složku projektu obsahující soubor `pom.xml`.

**1. Sestavení aplikace:**

```bash
mvn clean package
```

**2. Spuštění aplikace:**

```bash
java -jar target/receipt-generator-0.1.0-SNAPSHOT.jar
```

Program umožňuje zadávat produkty a po ukončení nákupu vytiskne účtenku.

Aplikaci lze spustit přímo z terminálu bez IntelliJ IDEA. Pro spuštění již sestaveného JAR souboru stačí nainstalovaná Java, Maven není potřeba.
