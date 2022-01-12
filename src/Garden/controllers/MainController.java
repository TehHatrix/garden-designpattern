package Garden.controllers;

import Garden.GardenFacade;
import Garden.SettingsSingleton;
import Garden.animalStrategy.*;
import Garden.animalDecorator.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

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
    private ImageView animalGround;
    @FXML
    private ImageView animalFly;

    // Settings layout vars
    private FXMLLoader layoutLoader;

    // Settings instance
    private SettingsSingleton settings;

    private GardenFacade gardenFacade;

    public MainController() {
        settings = SettingsSingleton.getInstance();
    }

    @FXML
    public void initialize() {
        // Load default images
        Image backgroundImg = new Image(getClass().getResourceAsStream("seasons/background.jpg"));
        Image treeImg = new Image(getClass().getResourceAsStream("seasons/autumn/tree.png"));
        Image groundImg = new Image(getClass().getResourceAsStream("seasons/autumn/ground.png"));

        background.setImage(backgroundImg);
        tree.setImage(treeImg);
        ground.setImage(groundImg);

//        Animal animal1 = new Birds();
//        animal1.setMoveBehaviour(new Sit());
//        animal1 = new DarkBlackStripes(animal1);
//        animal1.setImage();
//        animalGround.setImage(animal1.getImage());

        settingsButton.setOnAction((actionEvent -> {
            Stage settingsWindow = new Stage();
            try {
                layoutLoader = new FXMLLoader(getClass().getResource("/Garden/assets/settings.fxml"));
                layoutLoader.setController(new SettingsController(this));
                settingsWindow.setScene(new Scene(layoutLoader.load()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            settingsWindow.setTitle("Settings");
            settingsWindow.show();
        }));
    }

    public void updateViews() {
        System.out.println("Season : " + settings.getChosenSeason());
        System.out.println("Animal : " + settings.getChosenAnimal());
        System.out.println("AnimalStripe : " + settings.getChosenAnimalStripe());
        System.out.println("AnimalBehavior : " + settings.getChosenAnimalBehavior());
        System.out.println("Show tree? : " + settings.isDisplayTree());
        System.out.println("Show animal? : " + settings.isDisplayAnimal());

        // Call facade to collect all the images
        gardenFacade = new GardenFacade(settings.getChosenSeason());

        // Use images
        if(settings.isDisplayTree()) {
            tree.setImage(gardenFacade.showTree());
            tree.setVisible(true);
        } else {
            tree.setVisible(false);
        }
        ground.setImage(gardenFacade.showGround());

        // TODO: Pras
        if(settings.isDisplayAnimal()) {

            gardenFacade.setAnimal_(settings.getChosenAnimal());
            gardenFacade.setAnimalMovingBehavior_(settings.getChosenAnimalBehavior());
            gardenFacade.getAnimal().setImage();
            if(settings.getChosenAnimalBehavior().equalsIgnoreCase("fly")) {
                animalGround.setImage(null);
                animalFly.setImage(gardenFacade.getAnimal().getImage());
            } else {
                animalFly.setImage(null);
                animalGround.setImage(gardenFacade.getAnimal().getImage());
                animalGround.setVisible(true);
            }



        } else {
            animalGround.setVisible(false);
        }

    }
}
