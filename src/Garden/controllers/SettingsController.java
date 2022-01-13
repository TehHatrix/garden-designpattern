package Garden.controllers;

import Garden.SettingsSingleton;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;

public class SettingsController {

    private MainController mainController;

    @FXML
    private ChoiceBox seasonDropdown, animalDropdown, animalStripeDropdown, animalBehaviorDropdown;

    @FXML
    private CheckBox treeCheckBox, animalCheckBox;

    @FXML
    private Button saveButton, resetButton;

    @FXML
    private VBox animalSettingsContainer;

    private SettingsSingleton settings;

    private boolean animalSettingsVisibility = false;

    public SettingsController(MainController c) {
        mainController = c;
        // Get settings instance
        settings = SettingsSingleton.getInstance();
    }

    @FXML
    public void initialize() {
        treeCheckBox.setIndeterminate(false);
        animalCheckBox.setIndeterminate(false);

        // Initialize all chosen/default values
        seasonDropdown.setValue(settings.getChosenSeason());
        animalDropdown.setValue(settings.getChosenAnimal());
        animalStripeDropdown.setValue(settings.getChosenAnimalStripe());
        treeCheckBox.setSelected(settings.isDisplayTree());
        animalCheckBox.setSelected(settings.isDisplayAnimal());
        animalBehaviorDropdown.setValue(settings.getDefaultAnimalBehavior());

        // Initialize animal visibility
        animalSettingsContainer.setVisible(animalCheckBox.isSelected());

        // Set all settings item
        seasonDropdown.setItems(FXCollections.observableArrayList(settings.seasons));
        animalDropdown.setItems(FXCollections.observableArrayList(settings.animals));
        animalStripeDropdown.setItems(FXCollections.observableArrayList(settings.animalStripe));
        animalBehaviorDropdown.setItems(FXCollections.observableArrayList(settings.animalBehavior));

        if(animalDropdown.getValue() == "Cat"){
            animalBehaviorDropdown.setItems(FXCollections.observableArrayList(settings.animalBehavior));
            animalBehaviorDropdown.getItems().remove("Fly");
            animalBehaviorDropdown.setValue("Sit");
        } else if(animalDropdown.getValue() == "Bird"){
            animalBehaviorDropdown.setItems(FXCollections.observableArrayList(settings.animalBehavior));
            animalBehaviorDropdown.getItems().remove("Walk");
            animalBehaviorDropdown.setValue("Sit");
        }

        animalCheckBox.setOnAction(actionEvent -> {
            animalSettingsContainer.setVisible(animalCheckBox.isSelected());
        });


        animalDropdown.setOnAction(event -> {
            if(animalDropdown.getValue() == "Cat"){
                animalBehaviorDropdown.setItems(FXCollections.observableArrayList(settings.animalBehavior));
                animalBehaviorDropdown.getItems().remove("Fly");
                animalBehaviorDropdown.setValue("Sit");
            } else if(animalDropdown.getValue() == "Bird"){
                animalBehaviorDropdown.setItems(FXCollections.observableArrayList(settings.animalBehavior));
                animalBehaviorDropdown.getItems().remove("Walk");
                animalBehaviorDropdown.setValue("Sit");
            }
        });

        // Buttons
        resetButton.setOnAction(actionEvent -> {
            seasonDropdown.setValue(settings.getDefaultSeason());
            animalDropdown.setValue(settings.getDefaultAnimal());
            animalStripeDropdown.setValue(settings.getDefaultAnimalStripe());
            treeCheckBox.setSelected(settings.isDefaultDisplayTree());
            animalCheckBox.setSelected(settings.isDefaultDisplayAnimal());

        });

        saveButton.setOnAction(actionEvent -> {
//            System.out.println("Season : " + seasonDropdown.getValue());
//            System.out.println("Animal : " + animalDropdown.getValue());
//            System.out.println("AnimalStripe : " + animalStripeDropdown.getValue());
//            System.out.println("Show tree? : " + treeCheckBox.isSelected());
//            System.out.println("Show animal? : " + animalCheckBox.isSelected());

            settings.setChosenSeason((String) seasonDropdown.getValue());
            settings.setChosenAnimal((String) animalDropdown.getValue());
            settings.setChosenAnimalStripe((String) animalStripeDropdown.getValue());
            settings.setDisplayTree(treeCheckBox.isSelected());
            settings.setDisplayAnimal(animalCheckBox.isSelected());
            settings.setChosenAnimalBehavior((String) animalBehaviorDropdown.getValue());

            mainController.updateViews();
        });
    }
}
