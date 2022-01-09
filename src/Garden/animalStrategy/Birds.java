package Garden.animalStrategy;

import javafx.scene.image.Image;

public class Birds extends Animal {

    /**
     * I am passing the
     * @param mb in GardenFacade class method setAnimal()
     */
    public Birds(String mb) {
        description = "Birds";
        setMb(mb); /* This used to set manually in the previous code version */
        image = Image(moveBehaviour.move());
    }

    @Override
    public String color() {
        return "Orange";
    }

    public void setMb(String mb) {
        if (mb == "Sit"){
            setMoveBehaviour(new Sit());
        } else {
            setMoveBehaviour(new Fly());
        }
    }

    public Image Image(String mb) {
        if (mb == "Sit") {
            return new Image(getClass().getResourceAsStream("/Garden/controllers/animals/bird/bird-sit.png"));
        }
        return new Image(getClass().getResourceAsStream("/Garden/controllers/animals/bird/bird-fly.png"));
    }

}
