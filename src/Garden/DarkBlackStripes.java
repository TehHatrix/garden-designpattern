package Garden;

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
        return "Dark Black Stripes";
    }

}
