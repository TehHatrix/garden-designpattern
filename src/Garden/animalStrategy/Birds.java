package Garden.animalStrategy;

import javafx.scene.image.Image;

public class Birds extends Animal{
    public Birds(){
        description = "bird";
    }
    @Override
    public String color() {
        return "Orange";
    }

    @Override
    public void setImage() {

        if(moveBehaviour != null) {
            imgPath = imgPath + description + "/" + description + "-" + moveBehaviour.move() + pattern ;
        }

    }
}
