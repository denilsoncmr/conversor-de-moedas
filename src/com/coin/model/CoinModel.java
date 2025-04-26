package com.coin.model;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class CoinModel {
    private Map<String, Double> map;

    public CoinModel() {

    }
    public CoinModel(CoinExchangerateAPI coinExchangerateAPI) {
        this.map = coinExchangerateAPI.conversionRates();
    }

    public Map<String, Double> getMap() {
        return map;
    }
    public double convert(double fromValue, double toValue) {
        return toValue * fromValue;
    }
    public String getCoinValue(String fromValue) throws IOException, InterruptedException {
        String token = "a41daeb0c414d4eccdb05e40";
        String endereco = "https://v6.exchangerate-api.com/v6/"+token+"/latest/"+fromValue;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
