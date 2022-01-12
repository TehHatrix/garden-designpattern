package Garden;

import Garden.animalDecorator.AnimalsDecorator;
import Garden.animalDecorator.DarkBlackStripes;
import Garden.animalDecorator.WhiteStripes;
import Garden.animalStrategy.*;
import Garden.seasonsFactory.*;
import javafx.scene.image.Image;

public class GardenFacade {

    private Animal animal;
    private SeasonFactory seasonFactory;
    private String season;

    public GardenFacade(String season) {
        switch (season) {
            case "Spring":
                seasonFactory = new SpringFactory();
                break;
            case "Summer":
                seasonFactory = new SummerFactory();
                break;
            case "Autumn":
                seasonFactory = new AutumnFactory();
                break;
            case "Winter":
                seasonFactory = new WinterFactory();
                break;
        }
    }

    public Image showTree() {
        return this.seasonFactory.createTree().showTree();
    }

    public Image showGround() {
        return this.seasonFactory.createGround().showGround();
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setAnimal_(String chosenAnimal) {
        Animal cat = new Cats();
        Animal bird = new Birds();

        switch (chosenAnimal) {
            case "Cat" -> setAnimal(cat);
            case "Bird" -> setAnimal(bird);
        }
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimalMovingBehavior(MoveBehaviour moveBehaviour) {
        animal.setMoveBehaviour(moveBehaviour);
    }

    public void setAnimalMovingBehavior_(String moveBehaviour) {
        switch (moveBehaviour) {
            case "Sit" -> setAnimalMovingBehavior(new Sit());
            case "Walk" -> setAnimalMovingBehavior(new Walk());
            case "Fly" -> setAnimalMovingBehavior(new Fly());
        }
    }

    public void setAnimalDecorator(Animal animaldecorator){
        this.animal = animaldecorator;
    }

    public void decorateAnimal_(String decorator) {
        switch (decorator) {
            case "Black" -> setAnimalDecorator(new DarkBlackStripes(animal));
            case "White" -> setAnimalDecorator(new WhiteStripes(animal));
        }


    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }


}
