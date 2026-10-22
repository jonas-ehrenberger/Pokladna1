#!/bin/zsh
cd "$(dirname "$0")"
java -jar target/receipt-generator-0.1.0-SNAPSHOT.jar
echo ""
read "?Stiskni Enter pro ukončení..."
