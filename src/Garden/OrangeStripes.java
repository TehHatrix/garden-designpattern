package Garden;

public class OrangeStripes extends AnimalsDecorator {
    public OrangeStripes(Animal animals){
        this.animals = animals;
    }
    @Override
    public String getDescription() {
        return animals.getDescription() + " with " + color();
    }

    @Override
    public String color() {
        return "Orange Stripes";
    }
}
