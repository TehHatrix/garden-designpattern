package Garden;

public class Cats extends Animal {
    public Cats(){
        description = "Cats";
        setMoveBehaviour(new Walk());
    }
    @Override
    public String color() {
        return null;
    }
}
