package Garden.animalDecorator;
import Garden.animalStrategy.Animal;
import javafx.scene.image.Image;

public class WhiteStripes extends AnimalsDecorator {
    String decoratorName = "whitestripe";
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

    @Override
    public Image getImage() {
        return this.animals.getImage();
    }

    @Override
    public void setImage() {
        String imagePath = this.getImgPath() + this.animals.getDescription() + "/" + this.animals.getDescription() + "-" + this.animals.getMoveBehaviour().move() + "-" + this.decoratorName;
        this.animals.setImgPath(imagePath);
    }

    @Override
    public String getImgPath(){
        return this.animals.getImgPath();
    }
}
