package application;

import dao.*;
import entity.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.ListView;

public class CurrencyApp extends Application {

    private CurrencyDao currencyDao = new CurrencyDao();
    private ListView<Currency> currencyListView = new ListView<>();

    @Override
    public void start(Stage primaryStage) {

        Button addCurrencyButton = new Button("Add Currency");
        addCurrencyButton.setOnAction(e -> {
            Stage newStage = new Stage();
            VBox vbox = new VBox();

            TextField currencyNameField = new TextField();
            TextField currencyRateField = new TextField();
            Button insertButton = new Button("Insert Currency");
            insertButton.setOnAction(ev -> {
                String name = currencyNameField.getText();
                double rate = Double.parseDouble(currencyRateField.getText());
                Currency currency = new Currency(name, rate);
                currencyDao.persist(currency);
                newStage.close();
            });

            vbox.getChildren().addAll(currencyNameField, currencyRateField, insertButton);

            Scene scene = new Scene(vbox);
            newStage.setScene(scene);
            newStage.showAndWait();

            updateCurrencyDisplay();
        });

        VBox vbox = new VBox(addCurrencyButton, currencyListView);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
        updateCurrencyDisplay();
    }

    private void updateCurrencyDisplay() {
        currencyListView.getItems().setAll(currencyDao.getAllCurrencies());
    }

    public static void main(String[] args) {
        launch(args);
    }
}