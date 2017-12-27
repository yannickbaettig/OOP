package ch.hslu.SW12.Motor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MotorApplication extends Application {


    @Override
    public void start(Stage primaryStage) {
        Motor model = new Motor();
        MotorView view = new MotorView(model);
        MotorController controller = new MotorController(view, model);

        Scene scene = new Scene(view.asParent(), 400, 400);
        primaryStage.setTitle("Switch Motor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    /**
     * main-Methode startet die JavaFX-Application.
     * @param args nicht verwendet.
     */
    public static void main(final String[] args) {
        launch(MotorApplication.class, args);
    }

}