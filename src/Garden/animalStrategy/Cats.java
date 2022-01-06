package Garden.animalStrategy;

import javafx.scene.image.Image;

public class Cats extends Animal {
    public Cats(){
        description = "Cats";
        setMoveBehaviour(new Walk());
    }
    @Override
    public String color() {
        return "Orange";
    }

    public Image Image() {
        return new Image(getClass().getResourceAsStream("animals/bird/cat-walk.png"));
    }
}
