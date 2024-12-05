package org.example.Exo2CurrencyConverter;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        CurrencyAdapter adapter = new CurrencyAdapterImpl(converter);

        // Tests de conversion
        double usdToEur = adapter.convert("USD", "EUR", 100.);
        System.out.println("100 USD en EUR : " + usdToEur);

        double eurToUsd = adapter.convert("EUR", "USD", 100.);
        System.out.println("100 EUR en USD : " + eurToUsd);

        double usdToGbp = adapter.convert("USD", "GBP", 100.);
        System.out.println("100 USD en GBP : " + usdToGbp);

        double gbpToUsd = adapter.convert("GBP", "USD", 100.);
        System.out.println("100 GBP en USD : " + gbpToUsd);

        // Cas non pris en charge
        try {
            adapter.convert("EUR", "GBP", 100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
