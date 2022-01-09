package Garden.animalStrategy;

import javafx.scene.image.Image;

public abstract class Animal {
    String description = "Unknown Animals";
    MoveBehaviour moveBehaviour;
    Image image;

    public String getDescription(){
        return description;
    }

    public abstract String color();

    public void setMoveBehaviour(MoveBehaviour mb) {
        moveBehaviour = mb;
    }

    public Image getImage() {
        return image;
    }
}
