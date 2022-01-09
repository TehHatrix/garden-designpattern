package Garden;

import Garden.animalDecorator.AnimalsDecorator;
import Garden.animalStrategy.Animal;
import Garden.animalStrategy.Birds;
import Garden.animalStrategy.Cats;
import Garden.animalStrategy.MoveBehaviour;
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

    /**
     * Initially I thought of overloading the Garden facade constructor
     * but went with the set Animal method
     */
    public GardenFacade(Animal animal, MoveBehaviour moveBehaviour) {
        this.animal = animal;
        setAnimalMovingBehavior(moveBehaviour);
    }

    public Image showTree() {
        return this.seasonFactory.createTree().showTree();
    }

    public Image showGround() {
        return this.seasonFactory.createGround().showGround();
    }

    /**
     * @param animalChoice --> set in Main controller
     * @param mb --> move behaviour string set by user
     */
    public void setAnimal(String animalChoice, String mb) {

        /**
         * when I make it like
         * Animal cat = new Cat(), setting the behavior setMoveBehaviour() giving null
         * maybe I am missing something :(
         */
        Cats cat = new Cats(mb);
        Birds bird = new Birds(mb);

        switch (animalChoice) {
            case "Cat" -> this.animal = cat;
            case "Bird" -> this.animal = bird;
        }
        System.out.println(animal);
    }

    /**
     * This method wasn't working as I expected
     * I thought I had to tweak the Cat/Bird class a bit
     * Please have a look at the Cat/Bird classes
     *
     * Please do let know if I am missing something and doing
     * it wrongly. Thanks
     */
    public void setAnimalMovingBehavior(MoveBehaviour moveBehaviour) {
        this.animal.setMoveBehaviour(moveBehaviour);
    }


    public Animal getAnimal() {
        return animal;
    }

    public void decorateAnimal(AnimalsDecorator animalsDecorator) {

    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }


}
