package Garden.animalStrategy;

import javafx.scene.image.Image;

public class Cats extends Animal {

    /**
     * I am passing the
     * @param mb in GardenFacade class method setAnimal()
     */

    public Cats(String mb) {
        description = "Cats";
        setMb(mb); /* This used to set manually in the previous code version */
        image = Image(moveBehaviour.move());
    }

    @Override
    public String color() {
        return "Orange";
    }

    public void setMb(String mb) {
        if (mb == "Sit") {
            setMoveBehaviour(new Sit());
        } else {
            setMoveBehaviour(new Walk());
        }
    }

    public Image Image(String mb) {
        if (mb == "Sit") {
            return new Image(getClass().getResourceAsStream("/Garden/controllers/animals/cat/cat-sit.png"));
        } else {
            return new Image(getClass().getResourceAsStream("/Garden/controllers/animals/cat/cat-walk.png"));
        }
    }

}
