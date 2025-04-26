package com.coin.view;

import com.coin.model.CoinsList;
import javax.swing.*;
import java.util.*;

public class CoinView {

    private List<String> options;

    public String convertFrom() {
        CoinsList coins = new CoinsList();
        options = new ArrayList<>(coins.getMapCurrencies().keySet());
        Collections.sort(options);
        String fromValue = (String) JOptionPane.showInputDialog(null,
                "From: ", "Coin Conversor",
                JOptionPane.INFORMATION_MESSAGE, null,
                options.toArray(), options.toArray()[0]);
        options.remove(fromValue);
        return fromValue;
    }
    public String convertTo() {
        String toValue = (String) JOptionPane.showInputDialog(null,
                "To: ", "Coin Conversor",
                JOptionPane.INFORMATION_MESSAGE, null,
                options.toArray(), options.toArray()[0]);
        return toValue;
    }
    public double valueToConvert() {
        String value = (String) JOptionPane.showInputDialog("Input the value to convert");
        if (value.contains(",")) {
            value = value.replace(",", ".");
            return Double.parseDouble(value);
        }
        return Double.parseDouble(value);
    }
    public void result(double valueToConvert,double result, String coinNameFrom, String coinNameTo) {
        JOptionPane.showMessageDialog(null, "The value of %.2f in %s is equal to %.2f in %s".formatted(valueToConvert,coinNameFrom, result, coinNameTo));
    }

    public int continueOrStop(){
        String[] options = {"Yes", "No"};
        return JOptionPane.showOptionDialog(null,
                "Do you want to make a new conversion??",
                "Choose an option.", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
    }
}
