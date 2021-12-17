package Garden.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Button settingsButton;

    public MainController() {
    }

    @FXML
    public void initialize() {
        settingsButton.setOnAction((actionEvent -> {
            Stage settingsWindow = new Stage();

            settingsWindow.setTitle("Settings");
            settingsWindow.show();
        }));
    }
}
