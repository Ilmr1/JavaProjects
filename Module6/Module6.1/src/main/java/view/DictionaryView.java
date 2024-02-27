
package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {
    private DictionaryController controller = new DictionaryController();

    @Override
    public void start(Stage primaryStage) {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setVgap(10);
        pane.setHgap(10);

        TextField wordInput = new TextField();
        Button searchButton = new Button("Search");
        TextArea meaningDisplay = new TextArea();
        meaningDisplay.setEditable(false);

        searchButton.setOnAction(e -> {
            String meaning = controller.search(wordInput.getText());
            meaningDisplay.setText(meaning);
        });

        pane.getChildren().addAll(new Label("Enter word:"), wordInput, searchButton, meaningDisplay);

        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setTitle("Dictionary");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
