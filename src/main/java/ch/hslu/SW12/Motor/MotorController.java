package ch.hslu.SW12.Motor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ButtonType;

public class MotorController {
    MotorView view;
    Motor motor;

    public MotorController(MotorView view, Motor motor) {
        this.view = view;
        this.motor = motor;

        setupControllers();
    }

    private void setupControllers(){
        view.getBtnOn().setOnAction(event -> {
            motor.switchOn();
            view.getBtnOn().setDisable(true);
            view.getBtnOff().setDisable(false);
            view.getLabel().setText("The motor is ON." + motor.getRpm());
            view.getLabel().setStyle("-fx-background-color: lightgreen;");
        });

        view.getBtnOff().setOnAction(event -> reset());

        view.getBtnAdd().setOnAction(event -> {
            if (motor.isSwitchedOff()){
                motor.switchOn();
            } else {
                motor.setRpm(motor.getRpm() + 10);

                if(motor.getRpm() >= 100) {
                    view.getAlert().setContentText("RPM is too high" + motor.getRpm());
                    view.getAlert().showAndWait();

                    if (view.getAlert().getResult() == ButtonType.CANCEL) {
                        reset();
                        return;
                    }
                }
            }
            view.getBtnOn().setDisable(true);
            view.getBtnOff().setDisable(false);
            view.getLabel().setText("The motor is ON." + motor.getRpm());
            view.getLabel().setStyle("-fx-background-color: lightgreen;");
        });

        view.getBtnSubtract().setOnAction(event -> {
            if (motor.isSwitchedOn()){
                motor.setRpm(motor.getRpm() - 10);
                view.getLabel().setText("The motor is ON." + motor.getRpm());
                view.getLabel().setStyle("-fx-background-color: lightgreen;");
                if (motor.getRpm() <= 0){
                    reset();
                }
            }
        });
    }

    private void reset(){
        motor.switchOff();
        view.getBtnOn().setDisable(false);
        view.getBtnOff().setDisable(true);
        view.getLabel().setText("The motor is OFF.");
        view.getLabel().setStyle("-fx-background-color: red;");

    }
}




