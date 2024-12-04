package org.example.Exo2CurrencyConverter;

public class CurrencyAdapterImpl implements CurrencyAdapter {
    private final CurrencyConverter converter;

    public CurrencyAdapterImpl(CurrencyConverter converter) {
        this.converter = converter;
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equalsIgnoreCase("USD")) {
            if (toCurrency.equalsIgnoreCase("EUR")) {
                converter.convertToUSD("EUR", amount);
            }else {
                converter.convertToUSD("GBP", amount);
            }
        } else if (toCurrency.equalsIgnoreCase("USD")) {
            if (fromCurrency.equalsIgnoreCase("EUR")) {
                converter.convertFromUSD("EUR", amount);
            }else {
                converter.convertFromUSD("GBP", amount);
            }
        } else {
            throw new IllegalArgumentException("Conversion non prise en charge: " + fromCurrency + " vers " + toCurrency);
        }
        return amount;
    }

}
