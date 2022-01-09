package Garden.animalDecorator;
import Garden.animalStrategy.Animal;
import javafx.scene.image.Image;

public class WhiteStripes extends AnimalsDecorator {
    public WhiteStripes(Animal animals){
        this.animals = animals;
    }
    @Override
    public String getDescription() {
        return animals.getDescription() + " with " + color();
    }

    @Override
    public String color() {
        return animals.color() + " color and White Stripes";
    }

    public Image image() {
        return null;
    }
}
