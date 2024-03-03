package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.VirtualPet;
import controller.VirtualPetController;
    public class VirtualPetView extends Application{
        private VirtualPetController controller;
        private Canvas canvas;
        private Image petImage;

        public VirtualPetView(Canvas canvas, VirtualPetController controller) {
            this.canvas = canvas;
            this.controller = controller;
            this.petImage = new Image("resources/petphoto.png");
        }
        @Override
        public void start(Stage primaryStage) {
            StackPane root = new StackPane();
            root.getChildren().add(canvas);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        public void draw() {
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            gc.drawImage(petImage, controller.getX(), controller.getY());
            updatePetPosition(controller.getX(), controller.getY());
        }
}
