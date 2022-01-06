package Garden.controllers;

import Garden.AbstractFactory.AutumnFactory;
import Garden.AbstractFactory.SeasonFactory;
import Garden.AbstractFactory.SpringFactory;
import Garden.AbstractFactory.WinterFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class MainController {

    @FXML
    private Button settingsButton;
    @FXML
    private StackPane stackPane;
    @FXML
    private ImageView background;
    @FXML
    private ImageView ground;
    @FXML
    private ImageView tree;
    @FXML
    private ImageView cat;
    @FXML
    private ImageView bird;

    public MainController() {
    }

    @FXML
    public void initialize() {
        // Load default images

        SeasonFactory seasonFactory = null;
        seasonFactory =
                new AutumnFactory();
//                new WinterFactory();


        Image backgroundImg = new Image(getClass().getResourceAsStream("seasons/background.jpg"));
        Image treeImg = seasonFactory.createTree().showTree();
        Image groundImg = seasonFactory.createGround().showGround();

        background.setImage(backgroundImg);
        tree.setImage(treeImg);
        ground.setImage(groundImg);

        settingsButton.setOnAction((actionEvent -> {
            Stage settingsWindow = new Stage();
            settingsWindow.setTitle("Settings");
            settingsWindow.show();
        }));
    }
}
