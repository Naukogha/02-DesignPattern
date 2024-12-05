package org.example.Exo2CurrencyConverter;

public class CurrencyConverter {
    public double convertToUSD (String currency, double amount) {
        if (currency.equals("EUR")){
            return amount * 1.1;
        } else if (currency.equals("GBP")) {
            return amount * 1.3;
        };
        return amount;
    }

    public double convertFromUSD(String currency,double amount) {
        if (currency.equals("EUR")){
            return amount / 1.1;
        } else if (currency.equals("GBP")) {
            return amount / 1.3;
        };
        return amount;

    }
}
