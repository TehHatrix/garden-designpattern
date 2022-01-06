package Garden.animalStrategy;

public abstract class Animal {
    String description = "Unknown Animals";
    MoveBehaviour moveBehaviour;
    public String getDescription(){
        return description;
    }
    public abstract String color();

    public void setMoveBehaviour(MoveBehaviour mb) {
        moveBehaviour = mb;
    }
}
