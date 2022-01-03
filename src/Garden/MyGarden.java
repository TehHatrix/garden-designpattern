package Garden;

import Garden.controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyGarden extends Application {

    private FXMLLoader loader;

    public static void main(String[] args) {



        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root;
        try {
            loader = new FXMLLoader(getClass().getResource("assets/main.fxml"));
            loader.setController(new MainController());
            root = loader.load();
            primaryStage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("Garden Simulator");
        primaryStage.show();
    }
}
