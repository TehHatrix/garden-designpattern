package Garden;

import Garden.AbstractFactory.*;

public class Garden {

    private Animal animal;
    private SeasonFactory seasonFactory;

    public Garden(SeasonFactory seasonFactory) {
        this.seasonFactory = seasonFactory;
    }


    // --- Prasanth ---
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setAnimalMovingBehavior(MoveBehaviour moveBehaviour) {
        this.animal.setMoveBehaviour(moveBehaviour);
    }

    public void decorateAnimal(AnimalsDecorator animalsDecorator) {
        this.animal.getDescription();
    }

    public void showTree() {
        seasonFactory.createTree();
    }

    public void showGround() {
        seasonFactory.createGround();
    }

}
