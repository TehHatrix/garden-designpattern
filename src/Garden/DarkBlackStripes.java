package Garden;
import javafx.scene.image.Image;

public class DarkBlackStripes extends AnimalsDecorator {
    public DarkBlackStripes(Animal animals){
        this.animals = animals;
    }
    @Override
    public String getDescription() {
        return animals.getDescription() + " with " + color();
    }

    @Override
    public String color() {
        return animals.color() + " color and Dark Black Stripes";
    }

    public Image showStripe() {
        return new Image(getClass().getResourceAsStream("animals/blackstripe/black-stripe.png"));
    }

}
