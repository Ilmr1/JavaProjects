package dao;

import datasource.MariaDbConnection;
import entity.Currency;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CurrencyDAO {


    public Currency getCurrencyById(int id) {
        Currency currency = null;
        try {
            Connection connection = MariaDbConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM currency WHERE id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");
                double rate = resultSet.getDouble("rate");
                currency = new Currency(name, rate);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return currency;
    }

    public void addCurrency(Currency currency) {
        try {
            Connection connection = MariaDbConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO currency (name, rate) VALUES (?, ?)");
            statement.setString(1, currency.getName());
            statement.setDouble(2, currency.getRate());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Currency> getAllCurrencies() {
        List<Currency> currencies = new ArrayList<>();
        try {
            Connection connection = MariaDbConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM currency");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                double rate = resultSet.getDouble("rate");
                Currency currency = new Currency(name, rate);
                currencies.add(currency);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return currencies;
    }
}