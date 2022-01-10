package Garden.animalStrategy;

import javafx.scene.image.Image;

public class Cats extends Animal {
    public Cats(){
        description = "cat";
    }
    @Override
    public String color() {
        return "Orange";
    }

    @Override
    public void setImage() {
        if(moveBehaviour != null) {
            System.out.println(pattern);
            imgPath = imgPath + description + "/" + description + "-" + moveBehaviour.move() + pattern ;
        }

    }
}
