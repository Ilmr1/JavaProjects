package application;

import dao.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class CurrencyApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        CurrencyDao currencyDao = new CurrencyDao();

        Button addCurrencyButton = new Button("Add Currency");
        addCurrencyButton.setOnAction(e -> {
            Stage newStage = new Stage();
            VBox vbox = new VBox();

            // add controls for entering currency information

            Scene scene = new Scene(vbox);
            newStage.setScene(scene);
            newStage.showAndWait();

            // update currency information in the main stage
        });

        VBox vbox = new VBox(addCurrencyButton);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}