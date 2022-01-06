package Garden;

import Garden.animalDecorator.AnimalsDecorator;
import Garden.animalStrategy.Animal;
import Garden.animalStrategy.MoveBehaviour;
import Garden.seasonsFactory.*;
import javafx.scene.image.Image;

public class GardenFacade {

    private Animal animal;
    private SeasonFactory seasonFactory;
    private String season;

    public GardenFacade(String season) {
        switch (season){
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

    public Image showTree(){
        return this.seasonFactory.createTree().showTree();
    }

    public Image showGround(){
        return this.seasonFactory.createGround().showGround();
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setAnimalMovingBehavior(MoveBehaviour moveBehaviour){
        animal.setMoveBehaviour(moveBehaviour);
    }

    public void decorateAnimal(AnimalsDecorator animalsDecorator){

    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }



}