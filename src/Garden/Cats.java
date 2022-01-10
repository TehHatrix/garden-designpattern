package Garden;

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
        return new Image(getClass().getResourceAsStream("/Garden/controllers/animals/bird/orange-cat.png"));
    }


}
