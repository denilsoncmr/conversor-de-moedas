package com.coin;

import com.coin.controller.ControllerCoins;
import com.coin.model.CoinModel;
import com.coin.view.CoinView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        CoinView coinView = new CoinView();
        CoinModel coinModel = new CoinModel();
        ControllerCoins controllerCoins = new ControllerCoins(coinView, coinModel);

        controllerCoins.start();
    }
}
