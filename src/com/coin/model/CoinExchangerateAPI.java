package com.coin.model;

import java.util.Map;

public record CoinExchangerateAPI(Map<String, Double> conversionRates) {
}
