package controller;

import model.currency;
import view.converterView;
import java.util.ArrayList;
public class converterController {
    private currency model;
    private converterView view;

    public converterController(currency model, converterView view) {
        this.model = model;
        this.view = view;
    }
    public currency getModel() {
        return model;
    }
    public double getConversionRate(Double maara, String valuutta, String toConvert) {
        ArrayList<String> valuutat = currency.getValuutat();
        if (valuutat.contains(valuutta)) {
            if (valuutat.contains(toConvert)) {
                if (valuutta.equals("EUR")) {
                    if (toConvert.equals("USD")) {
                        return 1 / 0.92;
                    } else if (toConvert.equals("GBP")) {
                        return 0.93 / 1.1;
                    }
                } else if (valuutta.equals("USD")) {
                    if (toConvert.equals("EUR")) {
                        return 0.92;
                    } else if (toConvert.equals("GBP")) {
                        return 0.79;
                    }
                } else if (valuutta.equals("GBP")) {
                    if (toConvert.equals("EUR")) {
                        return 0.92 / 0.79;
                    } else if (toConvert.equals("USD")) {
                        return 1.1 / 0.87;
                    }
                }
            }
        }
        return 0;
    }
    public double convert(Double amount, String fromCurrency, String toCurrency) {
        double conversionRate = getConversionRate(amount, fromCurrency, toCurrency);
        return amount * conversionRate;
    }
        public static void main(String[] args) {
            converterView.launch(converterView.class, args);
    }


}
