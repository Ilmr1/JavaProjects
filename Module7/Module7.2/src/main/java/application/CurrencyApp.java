package application;

import dao.CurrencyDAO;
import entity.Currency;
import java.util.List;

public class CurrencyApp {

    public static void main(String[] args) {

        CurrencyDAO currencyDao = new CurrencyDAO();

        List<Currency> currencies = currencyDao.getAllCurrencies();
        for (Currency currency : currencies) {
            System.out.println(currency.getName());
        }

        Currency currency = currencyDao.getCurrencyById(2);
        if (currency != null) {
            System.out.println(currency.getName());
        }

        currencyDao.addCurrency(new Currency("JPY", 0.0091));
        currencyDao.addCurrency(new Currency("USD", 1.12));
        currencyDao.addCurrency(new Currency("EUR", 1.0));
        currencyDao.addCurrency(new Currency("GBP", 0.85));

        datasource.MariaDbConnection.terminate();
    }
}