package com.coin.controller;

import com.coin.model.CoinExchangerateAPI;
import com.coin.model.CoinModel;
import com.coin.model.CoinsList;
import com.coin.view.CoinView;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

public class ControllerCoins {

    private CoinModel model;
    private CoinView view;

    public ControllerCoins(CoinView coinView, CoinModel coinModel) {
        this.model = coinModel;
        this.view = coinView;
    }

    public void start() throws IOException, InterruptedException {

        CoinsList coinsList = new CoinsList();

        String fromValue = view.convertFrom();

        String json = model.getCoinValue(coinsList.getMapCurrencies().get(fromValue));

        Gson gson = new GsonBuilder().
                setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).
                create();;

        CoinExchangerateAPI fromAPI = gson.fromJson(json, CoinExchangerateAPI.class);
        CoinModel coinModel = new CoinModel(fromAPI);

        String toValue = view.convertTo();

        toValue = (coinsList.getMapCurrencies().get(toValue));

        double valueToConvert = view.valueToConvert();

        double result = coinModel.convert(valueToConvert, coinModel.getMap().get(toValue));

        view.result(valueToConvert, result, fromValue, coinsList.getKeyByValue(toValue));

        while(view.continueOrStop() != 1){
            start();
            break;
        }
    }
}
