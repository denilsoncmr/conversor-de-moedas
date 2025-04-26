package com.coin.model;

import java.util.HashMap;
import java.util.Map;

public class CoinsList {
    private Map<String, String> currencies = new HashMap<>();

    public Map<String, String> getMapCurrencies(){
        currencies.put("Brazilian Real", "BRL");
        currencies.put("US Dollar", "USD");
        currencies.put("Euro", "EUR");
        currencies.put("Pound Sterling", "GBP");
        currencies.put("Japanese Yen", "JPY");
        currencies.put("Swiss Franc", "CHF");
        currencies.put("Canadian Dollar", "CAD");
        currencies.put("Russian Ruble", "RUB");
        currencies.put("Chinese Yuan", "CNY");
        return currencies;
    }
    public String getKeyByValue(String value) {
        for (Map.Entry<String, String> entry : getMapCurrencies().entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
