package Garden.animalDecorator;

import Garden.animalStrategy.Animal;

public abstract class AnimalsDecorator extends Animal {
    Animal animals;
    public abstract String getDescription();
}
