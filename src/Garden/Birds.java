package Garden;

import javafx.scene.image.Image;

public class Birds extends Animal{
    public Birds(){
        description = "Birds";
        setMoveBehaviour(new Fly());
    }
    @Override
    public String color() {
        return "Orange";
    }

    public Image Image() {
        return new Image(getClass().getResourceAsStream("animals/bird/bird-fly.png"));
    }

}
