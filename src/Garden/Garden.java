package Garden;

import Garden.AbstractFactory.*;

public class Garden {

    private Animal animal;
    private SeasonFactory seasonFactory;

    public Garden(SeasonFactory seasonFactory) {
        this.seasonFactory = seasonFactory;
    }

    public void showTree(){
        System.out.println(this.seasonFactory.createTree().showTree());
    }

    public void showGround(){
        System.out.println(this.seasonFactory.createGround().showGround());
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setAnimalMovingBehavior(MoveBehaviour moveBehaviour){
        animal.setMoveBehaviour(moveBehaviour);
    }

    public void decorateAnimal(AnimalsDecorator animalsDecorator){

    }
}
