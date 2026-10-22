# ReceiptGenerator

A simple Java console application for generating shopping receipts.

## Authors

- **Person 1:** Jonáš Ehrenberger
- **Person 2:** František Včelička
- **Person 3:** Ondřej Korecký
- **Person 4:** Kevin Nguyen

## Requirements

- Java 17 or newer
- Maven (for building the project)

## Build and Run

Open a terminal in the project directory containing the `pom.xml` file.

**1. Build the application:**

```bash
mvn -f ReceiptGenerator/pom.xml clean package
```

**2. Run the application:**

```bash
java -jar ReceiptGenerator/target/receipt-generator-0.1.0-SNAPSHOT.jar
```

## How to Use

1. Enter the product name.
2. Enter the price per unit.
3. Enter the quantity.
4. Repeat to add more products.
5. Type `konec` as the product name to finish and generate the receipt.

The application can run directly from the terminal without IntelliJ IDEA.

Once the JAR file has been built, only Java is required to run it. Maven is not needed.