package ch.hslu.SW12.Motor;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class MotorView {
    private BorderPane view;
    private Button btnOn;
    private Button btnOff;
    private Button btnAdd;
    private Button btnSubtract;
    private Label label;
    private Alert alert;

    private Motor model;

    public MotorView( Motor model) {

        this.model = model ;

        initial();
        createAndConfigurePane();
    }

    private void initial() {
        btnOn = new Button("On");
        btnOff = new Button("Off");
        btnOff.setDisable(true);
        label = new Label("The Motor is OFF.");
        btnAdd = new Button("+");
        btnSubtract = new Button("-");
        alert = new Alert(Alert.AlertType.ERROR, "RPM is too high" + model.getRpm(), ButtonType.CANCEL);

    }

    public Parent asParent() {
        return view ;
    }


    private void createAndConfigurePane(){
        view = new BorderPane();
        view.setTop(btnOn);
        view.setCenter(label);
        view.setBottom(btnOff);
        view.setRight(btnAdd);
        view.setLeft(btnSubtract);

    }


    public BorderPane getView() {
        return view;
    }

    public Button getBtnOn() {
        return btnOn;
    }

    public Button getBtnOff() {
        return btnOff;
    }

    public Label getLabel() {
        return label;
    }

    public Motor getModel() {
        return model;
    }

    public Button getBtnAdd() {
        return btnAdd;
    }

    public Button getBtnSubtract() {
        return btnSubtract;
    }

    public Alert getAlert() {
        return alert;
    }
}
