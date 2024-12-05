package org.example.Exo2CurrencyConverter;

public class CurrencyAdapterImpl implements CurrencyAdapter {
    private final CurrencyConverter converter;

    public CurrencyAdapterImpl(CurrencyConverter converter) {
        this.converter = converter;
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("USD")) {
            converter.convertToUSD(toCurrency, amount);

        } else if (toCurrency.equals("USD")) {
            converter.convertFromUSD(fromCurrency, amount);

        } else {
            throw new IllegalArgumentException("Conversion non prise en charge: " + fromCurrency + " vers " + toCurrency);
        }
        return 0;
    }

}
