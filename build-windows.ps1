$ErrorActionPreference = "Stop"

# Go to the repository root
Set-Location $PSScriptRoot

# Build the project and run tests
mvn -f ReceiptGenerator/pom.xml clean package

if ($LASTEXITCODE -ne 0) {
    throw "Maven build failed."
}

# Remove previous generated application, if present
if (Test-Path "dist\ReceiptGenerator") {
    Remove-Item "dist\ReceiptGenerator" -Recurse -Force
}

# Package Windows application with Java runtime
jpackage `
    --type app-image `
    --name ReceiptGenerator `
    --input ReceiptGenerator/target `
    --main-jar receipt-generator-0.1.0-SNAPSHOT.jar `
    --main-class cz.receiptgenerator.Main `
    --win-console `
    --dest dist

if ($LASTEXITCODE -ne 0) {
    throw "jpackage failed."
}

Write-Host ""
Write-Host "BUILD SUCCESS!"
Write-Host "Application: dist\ReceiptGenerator\ReceiptGenerator.exe"
