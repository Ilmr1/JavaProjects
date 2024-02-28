package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import controller.converterController;
import model.currency;

public class converterView extends Application {
    private converterController controller;

    public converterView() {
        this.controller = new converterController(new currency(), this);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        TextField inputField = new TextField();
        ComboBox<String> fromCurrencyField = new ComboBox<>();
        fromCurrencyField.getItems().addAll(controller.getModel().getValuutat());
        ComboBox<String> toCurrencyField = new ComboBox<>();
        toCurrencyField.getItems().addAll(controller.getModel().getValuutat());
        Button convertButton = new Button("Convert");
        Label resultLabel = new Label();


        convertButton.setOnAction(e -> {
            String input = inputField.getText();
            double amount = Double.parseDouble(input);
            String fromCurrency = fromCurrencyField.getValue();
            String toCurrency = toCurrencyField.getValue();
            double convertedAmount = controller.convert(amount, fromCurrency, toCurrency);
            resultLabel.setText(Double.toString(convertedAmount));
        });

        grid.add(new Label("Amount:"), 0, 0);
        grid.add(inputField, 0, 1);
        grid.add(new Label("From:"), 1, 0);
        grid.add(fromCurrencyField, 1, 1);
        grid.add(new Label("To:"), 2, 0);
        grid.add(toCurrencyField, 2, 1);
        grid.add(convertButton, 3, 1);
        grid.add(resultLabel, 0, 3);


        Scene scene = new Scene(grid, 450, 200);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}